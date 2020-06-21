#ifndef myTS_H_
#define myTS_H_
#ifdef __cplusplus
extern "C" {
#endif
#include "thingml_typedefs.h"
struct myTS_Instance {
bool active;
uint16_t id_sendingTemperaturePort;
uint16_t id_manufacturerLogsPort;
int myTS_temperatureSensorBehavior_State;
};
void myTS_temperatureSensorBehavior_OnEntry(int state, struct myTS_Instance *_instance);
void register_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));
void register_external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));
void register_myTS_send_manufacturerLogsPort_logsMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));
void register_external_myTS_send_manufacturerLogsPort_logsMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));
#define MYTS_TEMPERATURESENSORBEHAVIOR_ISHIGH_STATE 0
#define MYTS_TEMPERATURESENSORBEHAVIOR_STATE 1
#define MYTS_TEMPERATURESENSORBEHAVIOR_ISSENSING_STATE 2
#ifdef __cplusplus
}
#endif
#endif 
#include "myTS.h"
void myTS_temperatureSensorBehavior_OnExit(int state, struct myTS_Instance *_instance);
void myTS_send_sendingTemperaturePort_temperatureSensorMessage(struct myTS_Instance *_instance, uint8_t temperatureValue);
void myTS_send_manufacturerLogsPort_logsMessage(struct myTS_Instance *_instance, uint8_t temperatureValue);
void f_myTS_sense(struct myTS_Instance *_instance);
void f_myTS_sense(struct myTS_Instance *_instance) {
}
void myTS_temperatureSensorBehavior_OnEntry(int state, struct myTS_Instance *_instance) {
switch(state) {
case MYTS_TEMPERATURESENSORBEHAVIOR_STATE:{
_instance->myTS_temperatureSensorBehavior_State = MYTS_TEMPERATURESENSORBEHAVIOR_ISSENSING_STATE;
myTS_temperatureSensorBehavior_OnEntry(_instance->myTS_temperatureSensorBehavior_State, _instance);
break;
}
case MYTS_TEMPERATURESENSORBEHAVIOR_ISHIGH_STATE:{
fprintf(stdout, "idle");
fprintf(stdout, "\n");
break;
}
case MYTS_TEMPERATURESENSORBEHAVIOR_ISSENSING_STATE:{
fprintf(stdout, "isSensing");
fprintf(stdout, "\n");
break;
}
default: break;
}
}
void myTS_temperatureSensorBehavior_OnExit(int state, struct myTS_Instance *_instance) {
switch(state) {
case MYTS_TEMPERATURESENSORBEHAVIOR_STATE:{
myTS_temperatureSensorBehavior_OnExit(_instance->myTS_temperatureSensorBehavior_State, _instance);
break;}
case MYTS_TEMPERATURESENSORBEHAVIOR_ISHIGH_STATE:{
break;}
case MYTS_TEMPERATURESENSORBEHAVIOR_ISSENSING_STATE:{
break;}
default: break;
}
}
void (*external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener)(struct myTS_Instance *, uint8_t)= 0x0;
void (*myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener)(struct myTS_Instance *, uint8_t)= 0x0;
void register_external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t)){
external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener = _listener;
}
void register_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t)){
myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener = _listener;
}
void myTS_send_sendingTemperaturePort_temperatureSensorMessage(struct myTS_Instance *_instance, uint8_t temperatureValue){
if (myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener != 0x0) myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(_instance, temperatureValue);
if (external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener != 0x0) external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(_instance, temperatureValue);
;
}
void (*external_myTS_send_manufacturerLogsPort_logsMessage_listener)(struct myTS_Instance *, uint8_t)= 0x0;
void (*myTS_send_manufacturerLogsPort_logsMessage_listener)(struct myTS_Instance *, uint8_t)= 0x0;
void register_external_myTS_send_manufacturerLogsPort_logsMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t)){
external_myTS_send_manufacturerLogsPort_logsMessage_listener = _listener;
}
void register_myTS_send_manufacturerLogsPort_logsMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t)){
myTS_send_manufacturerLogsPort_logsMessage_listener = _listener;
}
void myTS_send_manufacturerLogsPort_logsMessage(struct myTS_Instance *_instance, uint8_t temperatureValue){
if (myTS_send_manufacturerLogsPort_logsMessage_listener != 0x0) myTS_send_manufacturerLogsPort_logsMessage_listener(_instance, temperatureValue);
if (external_myTS_send_manufacturerLogsPort_logsMessage_listener != 0x0) external_myTS_send_manufacturerLogsPort_logsMessage_listener(_instance, temperatureValue);
;
}
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <math.h>
#include <signal.h>
#include <pthread.h>
#include "runtime.h"
#define MAX_INSTANCES 3
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
static int parse_turnTemperatureTo(uint8_t *msg, int size, uint8_t *out_buffer) {
    uint8_t *ptr = msg;
    uint8_t *start = NULL;
    uint8_t *end = NULL;
    uint8_t *pstart = NULL;
    int index = 0;
    out_buffer[index+0] = (1 >> 8);
    out_buffer[index+1] = (1 & 0xFF);
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
    uint8_t enqueue_buffer[2];
    int result = -1;
    if (0) {}
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
    if (i < 2 && (i == 0)) {
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
void forward_MQTT_myTS_send_sendingTemperaturePort_temperatureSensorMessage(struct myTS_Instance *_instance, uint8_t temperatureValue){
    uint8_t buffer[55];
    int index = 0;
    int result;
    result = sprintf(&buffer[index], "%.*s", 55-index, "{\"temperatureSensorMessage\":{");
    if (result >= 0) { index += result; } else { return; }
    result = sprintf(&buffer[index], "%.*s", 55-index, "\"temperatureValue\":");
    if (result >= 0) { index += result; } else { return; }
    result = sprintf(&buffer[index], "%u", temperatureValue);
    if (result >= 0) { index += result; } else { return; }
    result = sprintf(&buffer[index], "%.*s", 55-index, "}}");
    if (result >= 0) { index += result; } else { return; }
    MQTT_send_message(buffer, index, 1);
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
# CC = 
LIBS = -lpthread -l mosquitto
CFLAGS = -O2 -w
SRCS = myTS.c myTS_Cfg_cfg.c MQTT.c runtime.c
OBJS = myTS.o myTS_Cfg_cfg.o MQTT.o runtime.o
all : myTS_Cfg
.c.o :
	${CC} ${CFLAGS} -c $< 
.cpp.o :
	${CC} ${CFLAGS} -c $< 
myTS_Cfg : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm
clean:
	rm -f *.o *~ myTS_Cfg
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
#include "myTS.h"
struct MQTT_Instance {
    uint16_t listener_id;
};
void MQTT_setup(struct MQTT_Instance *_instance);
void MQTT_start_receiver_thread();
void MQTT_loop_poll();
void forward_MQTT_myTS_send_sendingTemperaturePort_temperatureSensorMessage(struct myTS_Instance *_instance, uint8_t temperatureValue);
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
#include "myTS.h"
#include "MQTT.h"
struct myTS_Instance myTS_var;
struct MQTT_Instance MQTT_instance;
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
void forward_myTS_send_sendingTemperaturePort_temperatureSensorMessage(struct myTS_Instance *_instance, uint8_t temperatureValue){
if(_instance->id_sendingTemperaturePort == myTS_var.id_sendingTemperaturePort) {
forward_MQTT_myTS_send_sendingTemperaturePort_temperatureSensorMessage(_instance, temperatureValue);
}
}
void externalMessageEnqueue(uint8_t * msg, uint8_t msgSize, uint16_t listener_id) {
if ((msgSize >= 2) && (msg != NULL)) {
uint8_t msgSizeOK = 0;
switch(msg[0] * 256 + msg[1]) {
case 1:
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
void initialize_configuration_myTS_Cfg() {
register_external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(&forward_myTS_send_sendingTemperaturePort_temperatureSensorMessage);
MQTT_instance.listener_id = add_instance(&MQTT_instance);
MQTT_setup(&MQTT_instance);
pthread_t thread_MQTT;
pthread_create( &thread_MQTT, NULL, MQTT_start_receiver_thread, NULL);
myTS_var.active = true;
myTS_var.id_sendingTemperaturePort = add_instance( (void*) &myTS_var);
myTS_var.id_manufacturerLogsPort = add_instance( (void*) &myTS_var);
myTS_var.myTS_temperatureSensorBehavior_State = MYTS_TEMPERATURESENSORBEHAVIOR_ISSENSING_STATE;
myTS_temperatureSensorBehavior_OnEntry(MYTS_TEMPERATURESENSORBEHAVIOR_STATE, &myTS_var);
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
    initialize_configuration_myTS_Cfg();
    while (1) {
int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
}
        processMessageQueue();
  }
}