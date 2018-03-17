#include <stdint.h>
#include <Arduino.h>
/*****************************************************/
//                    MQTT
/*****************************************************/
struct MQTT_instance_type {
    uint16_t listener_id;
} MQTT_instance;

void MQTT_setup();

void MQTT_set_listener_id(uint16_t id);

void MQTT_forwardMessage(byte * msg, uint8_t size);

void MQTT_read();

/********************* FORWARDERS *********************/

/*FORWARDERS*/// Forwarding of messages MQTT::Temperature::temperaturePort::temperatureMessage
void forward_MQTT_Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, uint32_t TemperatureData);
/*****************************************************************************
 * Headers for type : Temperature
 *****************************************************************************/


// BEGIN: Code from the c_header annotation Temperature
#include <dht.h>
// END: Code from the c_header annotation Temperature

// Definition of the instance struct:
struct Temperature_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_temperaturePort;
uint16_t id_temperaturePort2;
// Variables for the current instance state
int Temperature_temperatureSensorBehavior_State;
// Variables for the properties of the instance
dht Temperature_dht_var;
uint8_t Temperature_pin_var;

};
// Declaration of prototypes outgoing messages :
void Temperature_temperatureSensorBehavior_OnEntry(int state, struct Temperature_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, uint32_t));
void register_external_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, uint32_t));
void register_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, uint32_t));
void register_external_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, uint32_t));

// Definition of the states:
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE 0
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_STATE 1
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE 2
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE 3



/* Adds and instance to the runtime and returns its id */
uint16_t add_instance(void * instance_struct);
/* Returns the instance with id */
void * instance_by_id(uint16_t id);

/* Returns the number of byte currently in the fifo */
int fifo_byte_length();
/* Returns the number of bytes currently available in the fifo */
int fifo_byte_available();
/* Returns true if the fifo is empty */
int fifo_empty();
/* Return true if the fifo is full */
int fifo_full();
/* Enqueue 1 byte in the fifo if there is space
   returns 1 for sucess and 0 if the fifo was full */
int fifo_enqueue(byte b);
/* Enqueue 1 byte in the fifo without checking for available space
   The caller should have checked that there is enough space */
int _fifo_enqueue(byte b);
/* Dequeue 1 byte in the fifo.
   The caller should check that the fifo is not empty */
byte fifo_dequeue();

#define MAX_INSTANCES 3
#define FIFO_SIZE 256

/*********************************
 * Instance IDs and lookup
 *********************************/

void * instances[MAX_INSTANCES];
uint16_t instances_count = 0;

void * instance_by_id(uint16_t id) {
  return instances[id];
}

uint16_t add_instance(void * instance_struct) {
  instances[instances_count] = instance_struct;
  return instances_count++;
}

/******************************************
 * Simple byte FIFO implementation
 ******************************************/

byte fifo[FIFO_SIZE];
int fifo_head = 0;
int fifo_tail = 0;

// Returns the number of byte currently in the fifo
int fifo_byte_length() {
  if (fifo_tail >= fifo_head)
    return fifo_tail - fifo_head;
  return fifo_tail + FIFO_SIZE - fifo_head;
}

// Returns the number of bytes currently available in the fifo
int fifo_byte_available() {
  return FIFO_SIZE - 1 - fifo_byte_length();
}

// Returns true if the fifo is empty
int fifo_empty() {
  return fifo_head == fifo_tail;
}

// Return true if the fifo is full
int fifo_full() {
  return fifo_head == ((fifo_tail + 1) % FIFO_SIZE);
}

// Enqueue 1 byte in the fifo if there is space
// returns 1 for sucess and 0 if the fifo was full
int fifo_enqueue(byte b) {
  int new_tail = (fifo_tail + 1) % FIFO_SIZE;
  if (new_tail == fifo_head) return 0; // the fifo is full
  fifo[fifo_tail] = b;
  fifo_tail = new_tail;
  return 1;
}

// Enqueue 1 byte in the fifo without checking for available space
// The caller should have checked that there is enough space
int _fifo_enqueue(byte b) {
  fifo[fifo_tail] = b;
  fifo_tail = (fifo_tail + 1) % FIFO_SIZE;
  return 0; // Dummy added by steffend
}

// Dequeue 1 byte in the fifo.
// The caller should check that the fifo is not empty
byte fifo_dequeue() {
  if (!fifo_empty()) {
    byte result = fifo[fifo_head];
    fifo_head = (fifo_head + 1) % FIFO_SIZE;
    return result;
  }
  return 0;
}

/*****************************************************************************
 * Implementation for type : Temperature
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void Temperature_temperatureSensorBehavior_OnExit(int state, struct Temperature_Instance *_instance);
//Prototypes: Message Sending
void Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, uint32_t TemperatureData);
void Temperature_send_temperaturePort2_temperatureMessage2(struct Temperature_Instance *_instance, uint32_t TemperatureData);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void Temperature_temperatureSensorBehavior_OnEntry(int state, struct Temperature_Instance *_instance) {
switch(state) {
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_STATE:{
_instance->Temperature_temperatureSensorBehavior_State = TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE;
Temperature_temperatureSensorBehavior_OnEntry(_instance->Temperature_temperatureSensorBehavior_State, _instance);
break;
}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE:{
break;
}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE:{
// PRINT: "initialization..."
Serial.begin(9600);
			_instance->Temperature_dht_var.read11(_instance->Temperature_pin_var);
break;
}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE:{
Serial.println(_instance->Temperature_dht_var.temperature);
Temperature_send_temperaturePort_temperatureMessage(_instance, (uint32_t)_instance->Temperature_dht_var.temperature);
break;
}
default: break;
}
}

// On Exit Actions:
void Temperature_temperatureSensorBehavior_OnExit(int state, struct Temperature_Instance *_instance) {
switch(state) {
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_STATE:{
Temperature_temperatureSensorBehavior_OnExit(_instance->Temperature_temperatureSensorBehavior_State, _instance);
break;}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE:{
break;}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE:{
break;}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE:{
delay(1000);
break;}
default: break;
}
}

// Event Handlers for incoming messages:
int Temperature_handle_empty_event(struct Temperature_Instance *_instance) {
 uint8_t empty_event_consumed = 0;
if(!(_instance->active)) return 0;
//Region temperatureSensorBehavior
if (_instance->Temperature_temperatureSensorBehavior_State == TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE) {
if (1) {
Temperature_temperatureSensorBehavior_OnExit(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE, _instance);
_instance->Temperature_temperatureSensorBehavior_State = TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE;
Temperature_temperatureSensorBehavior_OnEntry(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE, _instance);
return 1;
}
}
else if (_instance->Temperature_temperatureSensorBehavior_State == TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE) {
if (1) {
Temperature_temperatureSensorBehavior_OnExit(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE, _instance);
_instance->Temperature_temperatureSensorBehavior_State = TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE;
Temperature_temperatureSensorBehavior_OnEntry(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE, _instance);
return 1;
}
}
else if (_instance->Temperature_temperatureSensorBehavior_State == TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE) {
if (1) {
Temperature_temperatureSensorBehavior_OnExit(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE, _instance);
_instance->Temperature_temperatureSensorBehavior_State = TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE;
Temperature_temperatureSensorBehavior_OnEntry(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE, _instance);
return 1;
}
}
//begin dispatchEmptyToSession
//end dispatchEmptyToSession
return empty_event_consumed;
}

// Observers for outgoing messages:
void (*external_Temperature_send_temperaturePort_temperatureMessage_listener)(struct Temperature_Instance *, uint32_t)= 0x0;
void (*Temperature_send_temperaturePort_temperatureMessage_listener)(struct Temperature_Instance *, uint32_t)= 0x0;
void register_external_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, uint32_t)){
external_Temperature_send_temperaturePort_temperatureMessage_listener = _listener;
}
void register_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, uint32_t)){
Temperature_send_temperaturePort_temperatureMessage_listener = _listener;
}
void Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, uint32_t TemperatureData){
if (Temperature_send_temperaturePort_temperatureMessage_listener != 0x0) Temperature_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
if (external_Temperature_send_temperaturePort_temperatureMessage_listener != 0x0) external_Temperature_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
;
}
void (*external_Temperature_send_temperaturePort2_temperatureMessage2_listener)(struct Temperature_Instance *, uint32_t)= 0x0;
void (*Temperature_send_temperaturePort2_temperatureMessage2_listener)(struct Temperature_Instance *, uint32_t)= 0x0;
void register_external_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, uint32_t)){
external_Temperature_send_temperaturePort2_temperatureMessage2_listener = _listener;
}
void register_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, uint32_t)){
Temperature_send_temperaturePort2_temperatureMessage2_listener = _listener;
}
void Temperature_send_temperaturePort2_temperatureMessage2(struct Temperature_Instance *_instance, uint32_t TemperatureData){
if (Temperature_send_temperaturePort2_temperatureMessage2_listener != 0x0) Temperature_send_temperaturePort2_temperatureMessage2_listener(_instance, TemperatureData);
if (external_Temperature_send_temperaturePort2_temperatureMessage2_listener != 0x0) external_Temperature_send_temperaturePort2_temperatureMessage2_listener(_instance, TemperatureData);
;
}



#include <ESP8266WiFi.h>
#include <PubSubClient.h>

#define MQTT_ssid "iPhone"
#define MQTT_password "project1927"
#define MQTT_broker_port 1883
#define MQTT_broker_address "127.0.0.1"
#define MQTT_ESCAPE_CHAR 125

WiFiClient MQTT_espClient;
PubSubClient MQTT_client(MQTT_espClient);

//Connector

void externalMessageEnqueue(uint8_t * msg, uint8_t msgSize, uint16_t listener_id);

void MQTT_setup_wifi() {

  delay(10);

  WiFi.begin(MQTT_ssid, MQTT_password);

  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
  }

  randomSeed(micros());
}

void MQTT_parser(byte * msg, uint16_t size) {
}


void MQTT_callback(char* topic, byte* payload, unsigned int length) {
       uint16_t size = length;
    uint16_t i = 0,j = 0;
    for(i = 0; i < size; i++) {
        if(payload[i] == MQTT_ESCAPE_CHAR) {
           size--;
           i++;
        }
    }
    uint8_t buf[size];
    for(i = 0; i < length; i++) {
        if(payload[i] == MQTT_ESCAPE_CHAR) {
           i++;
           if(payload[i] == 48) buf[j] = 0;
           else buf[j] = payload[i];
        } else {
           buf[j] = payload[i];
        }
        j++;
    }
     MQTT_parser(buf, size);
}

void MQTT_reconnect() {
  // Loop until we're reconnected
  while (!MQTT_client.connected()) {
    String clientId = "ESP8266Client-";
    clientId += String(random(0xffff), HEX);
    // Attempt to connect
    if (MQTT_client.connect(clientId.c_str())) {
      MQTT_client.subscribe("/*SUB_TOPIC*/");
    } else {
      delay(5000);
    }
  }
}

void MQTT_setup() {
  MQTT_setup_wifi();
  MQTT_client.setServer(MQTT_broker_address, MQTT_broker_port);
  MQTT_client.setCallback(MQTT_callback);
}

void MQTT_forwardMessage(uint8_t * msg, int size) {
         uint16_t length = size;
    uint16_t i = 0,j = 0;
    for(i = 0; i < size; i++) {
       if((msg[i] == 0) || (msg[i] == MQTT_ESCAPE_CHAR)) length++;
    }
    uint8_t buf[length];
    for(i = 0; i < length; i++) {
        if(msg[j] == MQTT_ESCAPE_CHAR) {
           buf[i] = MQTT_ESCAPE_CHAR;
           i++;
           buf[i] = msg[j];
        } else if(msg[j] == 0) {
           buf[i] = MQTT_ESCAPE_CHAR;
           i++;
           buf[i] = 48;
        } else {
           buf[i] = msg[j];
        }
        j++;
    }
     MQTT_client.publish("ThingML", buf, length);
}


void MQTT_read() {
  if (!MQTT_client.connected()) {
    MQTT_reconnect();
  }
  MQTT_client.loop();
}// Forwarding of messages MQTT::Temperature::temperaturePort::temperatureMessage
void forward_MQTT_Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, uint32_t TemperatureData){
byte forward_buf[6];
forward_buf[0] = (1 >> 8) & 0xFF;
forward_buf[1] =  1 & 0xFF;


// parameter TemperatureData
union u_TemperatureData_t {
uint32_t p;
byte bytebuffer[4];
} u_TemperatureData;
u_TemperatureData.p = TemperatureData;
forward_buf[2] =  (u_TemperatureData.bytebuffer[3] & 0xFF);
forward_buf[3] =  (u_TemperatureData.bytebuffer[2] & 0xFF);
forward_buf[4] =  (u_TemperatureData.bytebuffer[1] & 0xFF);
forward_buf[5] =  (u_TemperatureData.bytebuffer[0] & 0xFF);

//Forwarding with specified function 
MQTT_forwardMessage(forward_buf, 6);
}




/*****************************************************************************
 * Definitions for configuration : myTemperature
 *****************************************************************************/

//Declaration of instance variables
//Instance temp
// Variables for the properties of the instance
struct Temperature_Instance temp_var;
// Variables for the sessions of the instance




int processMessageQueue() {
if (fifo_empty()) return 0; // return 0 if there is nothing to do

uint8_t mbufi = 0;

// Read the code of the next port/message in the queue
uint16_t code = fifo_dequeue() << 8;

code += fifo_dequeue();

// Switch to call the appropriate handler
switch(code) {
}
return 1;
}

void forward_Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, uint32_t TemperatureData){
if(_instance->id_temperaturePort == temp_var.id_temperaturePort) {
forward_MQTT_Temperature_send_temperaturePort_temperatureMessage(_instance, TemperatureData);
}
}

//external Message enqueue
void externalMessageEnqueue(uint8_t * msg, uint8_t msgSize, uint16_t listener_id) {
if ((msgSize >= 2) && (msg != NULL)) {
uint8_t msgSizeOK = 0;
switch(msg[0] * 256 + msg[1]) {
}

if(msgSizeOK == 1) {
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
}
}
}

void initialize_configuration_myTemperature() {
// Initialize connectors
register_external_Temperature_send_temperaturePort_temperatureMessage_listener(&forward_Temperature_send_temperaturePort_temperatureMessage);

// Init the ID, state variables and properties for external connector MQTT

// Network Initialization

MQTT_instance.listener_id = add_instance(&MQTT_instance);

MQTT_setup();

// End Network Initialization

// Init the ID, state variables and properties for instance temp
temp_var.active = true;
temp_var.id_temperaturePort = add_instance( (void*) &temp_var);
temp_var.id_temperaturePort2 = add_instance( (void*) &temp_var);
temp_var.Temperature_temperatureSensorBehavior_State = TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE;
temp_var.Temperature_pin_var = 8;

Temperature_temperatureSensorBehavior_OnEntry(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_STATE, &temp_var);
}




void setup() {
initialize_configuration_myTemperature();

}

void loop() {

// Network Listener
MQTT_read();
// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
emptyEventConsumed += Temperature_handle_empty_event(&temp_var);
}

    processMessageQueue();
}
