#ifndef mySAC_H_
#define mySAC_H_
#ifdef __cplusplus
extern "C" {
#endif
#include "thingml_typedefs.h"
struct mySAC_Instance {
bool active;
uint16_t id_receivingTemperaturePort;
int mySAC_heaterBehavior_State;
uint8_t mySAC_preferedTemperature_var;
};
void mySAC_heaterBehavior_OnEntry(int state, struct mySAC_Instance *_instance);
void mySAC_handle_receivingTemperaturePort_temperatureSensorMessage(struct mySAC_Instance *_instance, uint8_t temperatureValue);
#define MYSAC_HEATERBEHAVIOR_STATE 0
#define MYSAC_HEATERBEHAVIOR_ISON_STATE 1
#define MYSAC_HEATERBEHAVIOR_ISOFF_STATE 2
#ifdef __cplusplus
}
#endif
#endif 
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <math.h>
#include <signal.h>
#include <pthread.h>
#include "runtime.h"
#define MAX_INSTANCES 2
#define FIFO_SIZE 32768
void * instances[MAX_INSTANCES];
uint16_t instances_count = 0;
void * instance_by_id(uint16_t id) {
  return instances[id];
}
uint16_t add_instance(void * instance_struct) {
  instances[instances_count] = instance_struct;
  return instances_count++;
}
byte fifo[FIFO_SIZE];
int fifo_head = 0;
int fifo_tail = 0;
int fifo_byte_length() {
  if (fifo_tail >= fifo_head)
    return fifo_tail - fifo_head;
  return fifo_tail + FIFO_SIZE - fifo_head;
}
int fifo_byte_available() {
  return FIFO_SIZE - 1 - fifo_byte_length();
}
int fifo_empty() {
  return fifo_head == fifo_tail;
}
int fifo_full() {
  return fifo_head == ((fifo_tail + 1) % FIFO_SIZE);
}
int fifo_enqueue(byte b) {
  int new_tail = (fifo_tail + 1) % FIFO_SIZE;
  if (new_tail == fifo_head) return 0; 
  fifo[fifo_tail] = b;
  fifo_tail = new_tail;
  return 1;
}
int _fifo_enqueue(byte b) {
  fifo[fifo_tail] = b;
  fifo_tail = (fifo_tail + 1) % FIFO_SIZE;
  return 0; 
}
byte fifo_dequeue() {
  if (!fifo_empty()) {
    byte result = fifo[fifo_head];
    fifo_head = (fifo_head + 1) % FIFO_SIZE;
    return result;
  }
  return 0;
}
pthread_mutex_t fifo_mut;
pthread_cond_t fifo_cond;
void fifo_lock() {
  pthread_mutex_lock (&fifo_mut);
}
void fifo_unlock() {
  pthread_mutex_unlock (&fifo_mut);	  
}
void fifo_wait() {
  pthread_cond_wait (&fifo_cond, &fifo_mut);
}
void fifo_unlock_and_notify() {
  pthread_mutex_unlock (&fifo_mut);
  pthread_cond_signal (&fifo_cond);
}
void init_runtime() {
  pthread_mutex_init (&fifo_mut, NULL);
  pthread_cond_init (&fifo_cond, NULL);
}
#ifndef RUNTIME_H_
#define RUNTIME_H_
#ifdef __cplusplus
extern "C" {
#endif
#include <stdint.h>
typedef unsigned char byte;
#define PTR_MAX_SIZE 8  
typedef union {
   uint8_t buffer[PTR_MAX_SIZE];
   void* pointer;
} ptr_union_t;
uint16_t add_instance(void * instance_struct);
void * instance_by_id(uint16_t id);
int fifo_byte_length();
int fifo_byte_available();
int fifo_empty();
int fifo_full();
int fifo_enqueue(byte b);
int _fifo_enqueue(byte b);
byte fifo_dequeue();
void fifo_lock();
void fifo_unlock();
void fifo_wait();
void fifo_unlock_and_notify();
void init_runtime();
#ifdef __cplusplus
}
#endif
#endif 
#include "MQTT.h"
const char *MQTT_topics[2] = {
    "ThingML",
    "org/atlanmod/smarthome/myMQTT/testPath"
};
int MQTT_topics_subscribed[2];
const int MQTT_qos = 1;
struct mosquitto *MQTT_mosq = NULL;
void MQTT_log_callback(struct mosquitto *, void *, int , const char *);
void MQTT_connect_callback(struct mosquitto *, void *, int);
void MQTT_subscribe_callback(struct mosquitto *, void *, int , int , const int *);
void MQTT_message_callback(struct mosquitto *, void *, const struct mosquitto_message *);
void MQTT_setup(struct MQTT_Instance *_instance)
{
    const char *host = "mqtt.atlanmod.org";
    int port = 1883;
    const char *client_id = NULL;
    const char *username = NULL;
    const char *password = NULL;
    const char *will_topic = NULL;
    const char *will_string = NULL;
    mosquitto_lib_init();
    MQTT_mosq = mosquitto_new(client_id, true, _instance);
    if (!MQTT_mosq) {
        perror("[MQTT] mosquitto_new failed ");
        exit(1); 
        return;
    }
    if (password && !username) fprintf(stderr, "[MQTT] Warning: Not using password since username is not set.\n");
    if (username && !password) fprintf(stderr, "[MQTT] Warning: Not using username since password is not set.\n");
    if (username && password && mosquitto_username_pw_set(MQTT_mosq, username, password)) {
        fprintf(stderr, "[MQTT] mosquitto_username_pw_set failed\n");
        exit(1); 
        return;
    }
    mosquitto_log_callback_set(MQTT_mosq, MQTT_log_callback);
    mosquitto_connect_callback_set(MQTT_mosq, MQTT_connect_callback);
    mosquitto_subscribe_callback_set(MQTT_mosq, MQTT_subscribe_callback);
    mosquitto_message_callback_set(MQTT_mosq, MQTT_message_callback);
    if (will_string && !will_topic) fprintf(stderr, "[MQTT] Warning: Not setting will since will_topic is not set.\n");
    if (will_string && will_topic && mosquitto_will_set(MQTT_mosq, will_topic, strlen(will_string), will_string, MQTT_qos, false)) {
        fprintf(stderr, "[MQTT] mosquitto_will_set failed\n");
        exit(1); 
        return;
    }
    int result = mosquitto_connect(MQTT_mosq, host, port, 10);
    if (result == MOSQ_ERR_ERRNO) {
        perror("[MQTT] mosquitto_connect failed ");
        exit(1); 
    }
    else if (result) {
        fprintf(stderr, "[MQTT] mosquitto_connect failed : %s\n", mosquitto_strerror(result));
        exit(1); 
    }
    if (result) MQTT_mosq = NULL;
}
void MQTT_start_receiver_thread() {
    int result = mosquitto_loop_forever(MQTT_mosq, -1, 1);
    if (result == MOSQ_ERR_ERRNO) {
        perror("[MQTT] mosquitto_loop_forever_failed ");
    }
    else if (result) {
        fprintf(stderr, "[MQTT] mosquitto_connect failed : %s\n", mosquitto_strerror(result));
    }
	mosquitto_destroy(MQTT_mosq);
	MQTT_mosq = NULL;
	mosquitto_lib_cleanup();
    exit(1); 
}
void MQTT_loop_poll() {
	if (MQTT_mosq) {
        int result = mosquitto_loop(MQTT_mosq, 0, 1);
        if (result == MOSQ_ERR_ERRNO) {
            perror("[MQTT] mosquitto_loop_forever_failed ");
        }
        else if (result) {
            fprintf(stderr, "[MQTT] mosquitto_connect failed : %s\n", mosquitto_strerror(result));
        }
        if (result) {
            mosquitto_destroy(MQTT_mosq);
            MQTT_mosq = NULL;
            mosquitto_lib_cleanup();
            exit(1); 
        }
    }
}
void MQTT_log_callback(struct mosquitto *mosq, void *_instance, int level, const char *str)
{
}
void MQTT_connect_callback(struct mosquitto *mosq, void *_instance, int result)
{
    int ret, i;
    switch (result) {
        case 0:
            for (i = 0; i < 2; i++) {
                ret = mosquitto_subscribe(mosq, &MQTT_topics_subscribed[i], MQTT_topics[i], MQTT_qos);
                if (ret) {
                    fprintf(stderr, "[MQTT] mosquitto_subscribe failed for %s : %s\n", MQTT_topics[i], mosquitto_strerror(result));
                    exit(1); 
                }
            }
            break;
        case 1:
            exit(1); 
            break;
        case 2:
            exit(1); 
            break;
        case 3:
            exit(1); 
            break;
        default:
            exit(1); 
            break;
    }
}
void MQTT_subscribe_callback(struct mosquitto *mosq, void *_instance, int mid, int qos_count, const int *granted_qos)
{
    int print = false, i;
    if (print) {
        for (i = 0; i < 2; i++) {
            if (MQTT_topics_subscribed[i] == mid) break;
        }
        printf("[MQTT] Subscribed to topic '%s' - QoS levels ", MQTT_topics[i]);
        for (i = 0; i < qos_count; i++) printf("%i ",granted_qos[i]);
        printf("\n");
    }
    for (i = 0; i < qos_count; i++)
        if (granted_qos[i] == MQTT_qos) return;
    for (i = 0; i < 2; i++) {
        if (MQTT_topics_subscribed[i] == mid) break;
    }
}
static uint8_t *jump_to(uint8_t *msg, int len, uint8_t *ptr, uint8_t a, uint8_t b)
{
    if (!ptr) return NULL;
    while (ptr-msg <= len) {
        if(*ptr == a || *ptr == b) return ptr;
        ptr++;
    }
    return NULL;
}
static uint8_t *jump_space(uint8_t *msg, int len, uint8_t *ptr)
{
    if (!ptr) return NULL;
    while (ptr-msg <= len) {
        if (!isspace(*ptr)) return ptr;
        ptr++;
    }
    return NULL;
}
static int parse_temperatureSensorMessage(uint8_t *msg, int size, uint8_t *out_buffer) {
    uint8_t *ptr = msg;
    uint8_t *start = NULL;
    uint8_t *end = NULL;
    uint8_t *pstart = NULL;
    int index = 0;
    out_buffer[index+0] = (1 >> 8);
    out_buffer[index+1] = (1 & 0xFF);
    index += 2;
    int np;
    for (np = 0; np < 1; np++) {
        ptr = jump_space(msg, size, ptr);
        if (!ptr || *ptr != '"') return -2;
        start = ptr+1;
        ptr = jump_to(msg, size, start, '"', '"');
        if (!ptr) return -3;
        end = ptr;
        ptr = jump_to(msg, size, end, ':', ':');
        if (!ptr) return -4;
        ptr = jump_space(msg, size, ptr+1);
        if (!ptr) return -5;
        pstart = ptr;
        ptr = jump_to(msg, size, pstart, ',', '}');
        if (!ptr) return -6;
        if (ptr-pstart < 1) return -7;
        else if (strncmp("temperatureValue", start, end-start) == 0) {
            union u_temperatureValue_t { uint8_t temperatureValue; uint8_t bytebuffer[1]; } u_temperatureValue;
            u_temperatureValue.temperatureValue = strtoul(pstart, &ptr, 10);
            memcpy(&out_buffer[2], u_temperatureValue.bytebuffer, 1);
        }
        ptr = jump_to(msg, size, ptr, ',', '}');
        if (!ptr) return -8;
        ptr = ptr+1;
    }
    ptr = jump_space(msg, size, ptr);
    if (!ptr || *ptr != '}') return -9;
    return 3;
}
static int parse_turnTemperatureTo(uint8_t *msg, int size, uint8_t *out_buffer) {
    uint8_t *ptr = msg;
    uint8_t *start = NULL;
    uint8_t *end = NULL;
    uint8_t *pstart = NULL;
    int index = 0;
    out_buffer[index+0] = (2 >> 8);
    out_buffer[index+1] = (2 & 0xFF);
    index += 2;
    int np;
    for (np = 0; np < 0; np++) {
        ptr = jump_space(msg, size, ptr);
        if (!ptr || *ptr != '"') return -2;
        start = ptr+1;
        ptr = jump_to(msg, size, start, '"', '"');
        if (!ptr) return -3;
        end = ptr;
        ptr = jump_to(msg, size, end, ':', ':');
        if (!ptr) return -4;
        ptr = jump_space(msg, size, ptr+1);
        if (!ptr) return -5;
        pstart = ptr;
        ptr = jump_to(msg, size, pstart, ',', '}');
        if (!ptr) return -6;
        if (ptr-pstart < 1) return -7;
        ptr = jump_to(msg, size, ptr, ',', '}');
        if (!ptr) return -8;
        ptr = ptr+1;
    }
    ptr = jump_space(msg, size, ptr);
    if (!ptr || *ptr != '}') return -9;
    return 2;
}
void MQTT_parser(uint8_t *msg, int size, struct MQTT_Instance *_instance) {
    uint8_t *ptr = msg;
    uint8_t *start = NULL;
    uint8_t *end = NULL;
    ptr = jump_space(msg, size, ptr);
    if (!ptr || *ptr != '{') return;
    ptr = jump_space(msg, size, ptr+1);
    if (!ptr || *ptr != '"') return;
    start = ptr+1;
    ptr = jump_to(msg, size, start, '"', '"');
    if (!ptr) return;
    end = ptr;
    ptr = jump_space(msg, size, ptr+1);
    if (!ptr || *ptr != ':') return;
    ptr = jump_space(msg, size, ptr+1);
    if (!ptr || *ptr != '{') return;
    ptr++;
    uint8_t enqueue_buffer[3];
    int result = -1;
    if (0) {}
    else if (strncmp("temperatureSensorMessage", start, end-start) == 0) {
        result = parse_temperatureSensorMessage(ptr, size-(ptr-msg), enqueue_buffer);
    }
    else if (strncmp("turnTemperatureTo", start, end-start) == 0) {
        result = parse_turnTemperatureTo(ptr, size-(ptr-msg), enqueue_buffer);
    }
    if (result > 0) {
        externalMessageEnqueue(enqueue_buffer, result, _instance->listener_id);
    } else {
    }
}
void MQTT_message_callback(struct mosquitto *mosq, void *_instance, const struct mosquitto_message *msg)
{
    int i;
    for (i = 0; i < 2; i++)
        if (strcmp(msg->topic, MQTT_topics[i]) == 0) break;
    if (i < 2 && (i == 1)) {
        MQTT_parser(msg->payload, msg->payloadlen, (struct MQTT_Instance*)_instance);
    }
}
void MQTT_send_message(uint8_t *msg, int msglen, int topic)
{
    int ret;
    if (topic < 2) {
        ret = mosquitto_publish(MQTT_mosq, NULL, MQTT_topics[topic], msglen, msg, MQTT_qos, false);
        if (ret) {
            fprintf(stderr, "[MQTT] mosquitto_publish failed for %s : %s\n", MQTT_topics[topic], mosquitto_strerror(ret));
            exit(1); 
        }
    }
}
#ifndef THINGML_TYPEDEFS_H_
#define THINGML_TYPEDEFS_H_
#ifdef __cplusplus
extern "C" {
#endif
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <unistd.h>
#include <stdint.h>
#include <stdbool.h>
#ifdef __cplusplus
}
#endif
#endif 
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <math.h>
#include <signal.h>
#include <pthread.h>
#include "thingml_typedefs.h"
#include "runtime.h"
#include "mySAC.h"
#include "MQTT.h"
struct mySAC_Instance mySAC_var;
struct MQTT_Instance MQTT_instance;
void dispatch_temperatureSensorMessage(uint16_t sender, uint8_t param_temperatureValue) {
if (sender == MQTT_instance.listener_id) {
mySAC_handle_receivingTemperaturePort_temperatureSensorMessage(&mySAC_var, param_temperatureValue);
}
}
void dispatch_turnTemperatureTo(uint16_t sender) {
if (sender == MQTT_instance.listener_id) {
}
}
int processMessageQueue() {
fifo_lock();
while (fifo_empty()) fifo_wait();
uint8_t mbufi = 0;
uint16_t code = fifo_dequeue() << 8;
code += fifo_dequeue();
switch(code) {
case 1:{
byte mbuf[5 - 2];
while (mbufi < (5 - 2)) mbuf[mbufi++] = fifo_dequeue();
fifo_unlock();
uint8_t mbufi_temperatureSensorMessage = 2;
union u_temperatureSensorMessage_temperatureValue_t {
uint8_t p;
byte bytebuffer[1];
} u_temperatureSensorMessage_temperatureValue;
u_temperatureSensorMessage_temperatureValue.bytebuffer[0] = mbuf[mbufi_temperatureSensorMessage + 0];
mbufi_temperatureSensorMessage += 1;
dispatch_temperatureSensorMessage((mbuf[0] << 8) + mbuf[1] ,
 u_temperatureSensorMessage_temperatureValue.p  );
break;
}
case 2:{
byte mbuf[4 - 2];
while (mbufi < (4 - 2)) mbuf[mbufi++] = fifo_dequeue();
fifo_unlock();
uint8_t mbufi_turnTemperatureTo = 2;
dispatch_turnTemperatureTo((mbuf[0] << 8) + mbuf[1] );
break;
}
}
return 1;
}
void externalMessageEnqueue(uint8_t * msg, uint8_t msgSize, uint16_t listener_id) {
if ((msgSize >= 2) && (msg != NULL)) {
uint8_t msgSizeOK = 0;
switch(msg[0] * 256 + msg[1]) {
case 1:
if(msgSize == 3) {
msgSizeOK = 1;}
break;
case 2:
if(msgSize == 2) {
msgSizeOK = 1;}
break;
}
if(msgSizeOK == 1) {
fifo_lock();
if ( fifo_byte_available() > (msgSize + 2) ) {
	uint8_t i;
	for (i = 0; i < 2; i++) {
		_fifo_enqueue(msg[i]);
	}
	_fifo_enqueue((listener_id >> 8) & 0xFF);
	_fifo_enqueue(listener_id & 0xFF);
	for (i = 2; i < msgSize; i++) {
		_fifo_enqueue(msg[i]);
	}
}
fifo_unlock_and_notify();
}
}
}
void initialize_configuration_mySAC_Cfg() {
MQTT_instance.listener_id = add_instance(&MQTT_instance);
MQTT_setup(&MQTT_instance);
pthread_t thread_MQTT;
pthread_create( &thread_MQTT, NULL, MQTT_start_receiver_thread, NULL);
mySAC_var.active = true;
mySAC_var.id_receivingTemperaturePort = add_instance( (void*) &mySAC_var);
mySAC_var.mySAC_heaterBehavior_State = MYSAC_HEATERBEHAVIOR_ISOFF_STATE;
mySAC_heaterBehavior_OnEntry(MYSAC_HEATERBEHAVIOR_STATE, &mySAC_var);
}
void term(int signum)
{
    fflush(stdout);
    fflush(stderr);
    exit(signum);
}
int main(int argc, char *argv[]) {
    struct sigaction action;
    memset(&action, 0, sizeof(struct sigaction));
    action.sa_handler = term;
    sigaction(SIGINT, &action, NULL);
    sigaction(SIGTERM, &action, NULL);
    init_runtime();
    initialize_configuration_mySAC_Cfg();
    while (1) {
int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
}
        processMessageQueue();
  }
}
# CC = 
LIBS = -lpthread -l mosquitto
CFLAGS = -O2 -w
SRCS = mySAC.c mySAC_Cfg_cfg.c MQTT.c runtime.c
OBJS = mySAC.o mySAC_Cfg_cfg.o MQTT.o runtime.o
all : mySAC_Cfg
.c.o :
	${CC} ${CFLAGS} -c $< 
.cpp.o :
	${CC} ${CFLAGS} -c $< 
mySAC_Cfg : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm
clean:
	rm -f *.o *~ mySAC_Cfg
#ifndef MQTT_PosixMQTT_Client_h
#define  MQTT_PosixMQTT_Client_h
#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <ctype.h>
#include <stdint.h>
#include <math.h>
#include <time.h>
#include <mosquitto.h>
#include "mySAC.h"
struct MQTT_Instance {
    uint16_t listener_id;
};
void MQTT_setup(struct MQTT_Instance *_instance);
void MQTT_start_receiver_thread();
void MQTT_loop_poll();
#endif
#include "mySAC.h"
void mySAC_heaterBehavior_OnExit(int state, struct mySAC_Instance *_instance);
void f_mySAC_turnTemperatureTo(struct mySAC_Instance *_instance, uint8_t value);
void f_mySAC_turnTemperatureTo(struct mySAC_Instance *_instance, uint8_t value) {
_instance->mySAC_preferedTemperature_var = value;
}
void mySAC_heaterBehavior_OnEntry(int state, struct mySAC_Instance *_instance) {
switch(state) {
case MYSAC_HEATERBEHAVIOR_STATE:{
_instance->mySAC_heaterBehavior_State = MYSAC_HEATERBEHAVIOR_ISOFF_STATE;
mySAC_heaterBehavior_OnEntry(_instance->mySAC_heaterBehavior_State, _instance);
break;
}
case MYSAC_HEATERBEHAVIOR_ISON_STATE:{
fprintf(stdout, "isOn");
fprintf(stdout, "\n");
break;
}
case MYSAC_HEATERBEHAVIOR_ISOFF_STATE:{
fprintf(stdout, "isOff");
fprintf(stdout, "\n");
break;
}
default: break;
}
}
void mySAC_heaterBehavior_OnExit(int state, struct mySAC_Instance *_instance) {
switch(state) {
case MYSAC_HEATERBEHAVIOR_STATE:{
mySAC_heaterBehavior_OnExit(_instance->mySAC_heaterBehavior_State, _instance);
break;}
case MYSAC_HEATERBEHAVIOR_ISON_STATE:{
break;}
case MYSAC_HEATERBEHAVIOR_ISOFF_STATE:{
break;}
default: break;
}
}
void mySAC_handle_receivingTemperaturePort_temperatureSensorMessage(struct mySAC_Instance *_instance, uint8_t temperatureValue) {
if(!(_instance->active)) return;
uint8_t mySAC_heaterBehavior_State_event_consumed = 0;
if (_instance->mySAC_heaterBehavior_State == MYSAC_HEATERBEHAVIOR_ISOFF_STATE) {
if (mySAC_heaterBehavior_State_event_consumed == 0 && 1) {
mySAC_heaterBehavior_OnExit(MYSAC_HEATERBEHAVIOR_ISOFF_STATE, _instance);
_instance->mySAC_heaterBehavior_State = MYSAC_HEATERBEHAVIOR_ISON_STATE;
f_mySAC_turnTemperatureTo(_instance, temperatureValue);
mySAC_heaterBehavior_OnEntry(MYSAC_HEATERBEHAVIOR_ISON_STATE, _instance);
mySAC_heaterBehavior_State_event_consumed = 1;
}
}
}