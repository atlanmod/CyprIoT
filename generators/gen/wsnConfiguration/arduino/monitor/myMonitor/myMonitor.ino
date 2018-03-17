#include <stdint.h>
#include <Arduino.h>
/*****************************************************************************
 * Headers for type : Monitor
 *****************************************************************************/

// Definition of the instance struct:
struct Monitor_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_inout;
// Variables for the current instance state
int Monitor_Monitor_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void Monitor_Monitor_OnEntry(int state, struct Monitor_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_Monitor_send_inout_sendTemp_listener(void (*_listener)(struct Monitor_Instance *));
void register_external_Monitor_send_inout_sendTemp_listener(void (*_listener)(struct Monitor_Instance *));

// Definition of the states:
#define MONITOR_MONITOR_BYE_STATE 0
#define MONITOR_MONITOR_GREETINGS_STATE 1
#define MONITOR_MONITOR_STATE 2


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

/*FORWARDERS*/// Forwarding of messages MQTT::Monitor::inout::sendTemp
void forward_MQTT_Monitor_send_inout_sendTemp(struct Monitor_Instance *_instance);

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

#define MAX_INSTANCES 2
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
 * Implementation for type : Monitor
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void Monitor_Monitor_OnExit(int state, struct Monitor_Instance *_instance);
//Prototypes: Message Sending
void Monitor_send_inout_sendTemp(struct Monitor_Instance *_instance);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void Monitor_Monitor_OnEntry(int state, struct Monitor_Instance *_instance) {
switch(state) {
case MONITOR_MONITOR_STATE:{
_instance->Monitor_Monitor_State = MONITOR_MONITOR_GREETINGS_STATE;
Monitor_Monitor_OnEntry(_instance->Monitor_Monitor_State, _instance);
break;
}
case MONITOR_MONITOR_BYE_STATE:{
// PRINT: "Bye.\n"
break;
}
case MONITOR_MONITOR_GREETINGS_STATE:{
break;
}
default: break;
}
}

// On Exit Actions:
void Monitor_Monitor_OnExit(int state, struct Monitor_Instance *_instance) {
switch(state) {
case MONITOR_MONITOR_STATE:{
Monitor_Monitor_OnExit(_instance->Monitor_Monitor_State, _instance);
break;}
case MONITOR_MONITOR_BYE_STATE:{
break;}
case MONITOR_MONITOR_GREETINGS_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
int Monitor_handle_empty_event(struct Monitor_Instance *_instance) {
 uint8_t empty_event_consumed = 0;
if(!(_instance->active)) return 0;
//Region Monitor
if (_instance->Monitor_Monitor_State == MONITOR_MONITOR_GREETINGS_STATE) {
if (1) {
Monitor_Monitor_OnExit(MONITOR_MONITOR_GREETINGS_STATE, _instance);
_instance->Monitor_Monitor_State = MONITOR_MONITOR_BYE_STATE;
// PRINT: "Hello World!\n"
Monitor_Monitor_OnEntry(MONITOR_MONITOR_BYE_STATE, _instance);
return 1;
}
}
//begin dispatchEmptyToSession
//end dispatchEmptyToSession
return empty_event_consumed;
}

// Observers for outgoing messages:
void (*external_Monitor_send_inout_sendTemp_listener)(struct Monitor_Instance *)= 0x0;
void (*Monitor_send_inout_sendTemp_listener)(struct Monitor_Instance *)= 0x0;
void register_external_Monitor_send_inout_sendTemp_listener(void (*_listener)(struct Monitor_Instance *)){
external_Monitor_send_inout_sendTemp_listener = _listener;
}
void register_Monitor_send_inout_sendTemp_listener(void (*_listener)(struct Monitor_Instance *)){
Monitor_send_inout_sendTemp_listener = _listener;
}
void Monitor_send_inout_sendTemp(struct Monitor_Instance *_instance){
if (Monitor_send_inout_sendTemp_listener != 0x0) Monitor_send_inout_sendTemp_listener(_instance);
if (external_Monitor_send_inout_sendTemp_listener != 0x0) external_Monitor_send_inout_sendTemp_listener(_instance);
;
}



#include <ESP8266WiFi.h>
#include <PubSubClient.h>

#define MQTT_ssid "WIFI_SSID"
#define MQTT_password "WIFI_PASSWORD"
#define MQTT_broker_port 1883
#define MQTT_broker_address "192.168.0.255"
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
CNoneSerializerPlugin() is a dummy serializer whos content not shall be used
}


void MQTT_callback(char* topic, byte* payload, unsigned int length) {
        MQTT_parser(payload, length);
}

void MQTT_reconnect() {
  // Loop until we're reconnected
  while (!MQTT_client.connected()) {
    String clientId = "ESP8266Client-";
    clientId += String(random(0xffff), HEX);
    // Attempt to connect
    if (MQTT_client.connect(clientId.c_str())) {
      MQTT_client.subscribe("ThingML");
      MQTT_client.subscribe("fr/imt/dapi/roomA246/room2");MQTT_client.subscribe("fr/imt/dapi/roomA246/room3");MQTT_client.subscribe("fr/imt/dapi/roomA246/room4");
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
          MQTT_client.publish("ThingML", msg, size);
     MQTT_client.publish("fr/imt/dapi/roomA246/room2", msg, size);
     MQTT_client.publish("fr/imt/dapi/roomA246/room3", msg, size);
     MQTT_client.publish("fr/imt/dapi/roomA246/room4", msg, size);
}


void MQTT_read() {
  if (!MQTT_client.connected()) {
    MQTT_reconnect();
  }
  MQTT_client.loop();
}
// Forwarding of messages MQTT::Monitor::inout::sendTemp
void forward_MQTT_Monitor_send_inout_sendTemp(struct Monitor_Instance *_instance){
CNoneSerializerPlugin() is a dummy serializer whos content not shall be used

//Forwarding with specified function 
MQTT_forwardMessage(forward_buf, Error);
}




/*****************************************************************************
 * Definitions for configuration : myMonitor
 *****************************************************************************/

//Declaration of instance variables
//Instance monitor
// Variables for the properties of the instance
struct Monitor_Instance monitor_var;
// Variables for the sessions of the instance




//New dispatcher for messages
void dispatch_recTemp(uint16_t sender) {
if (sender == MQTT_instance.listener_id) {

}

}


int processMessageQueue() {
if (fifo_empty()) return 0; // return 0 if there is nothing to do

uint8_t mbufi = 0;

// Read the code of the next port/message in the queue
uint16_t code = fifo_dequeue() << 8;

code += fifo_dequeue();

// Switch to call the appropriate handler
switch(code) {
case 1:{
byte mbuf[4 - 2];
while (mbufi < (4 - 2)) mbuf[mbufi++] = fifo_dequeue();
uint8_t mbufi_recTemp = 2;
dispatch_recTemp((mbuf[0] << 8) + mbuf[1] /* instance port*/);
break;
}
}
return 1;
}

void forward_Monitor_send_inout_sendTemp(struct Monitor_Instance *_instance){
if(_instance->id_inout == monitor_var.id_inout) {
forward_MQTT_Monitor_send_inout_sendTemp(_instance);
}
}

//external Message enqueue
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

void initialize_configuration_myMonitor() {
// Initialize connectors
register_external_Monitor_send_inout_sendTemp_listener(&forward_Monitor_send_inout_sendTemp);

// Init the ID, state variables and properties for external connector MQTT

// Network Initialization

MQTT_instance.listener_id = add_instance(&MQTT_instance);

MQTT_setup();

// End Network Initialization

// Init the ID, state variables and properties for instance monitor
monitor_var.active = true;
monitor_var.id_inout = add_instance( (void*) &monitor_var);
monitor_var.Monitor_Monitor_State = MONITOR_MONITOR_GREETINGS_STATE;

Monitor_Monitor_OnEntry(MONITOR_MONITOR_STATE, &monitor_var);
}




void setup() {
initialize_configuration_myMonitor();

}

void loop() {

// Network Listener
MQTT_read();
// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
emptyEventConsumed += Monitor_handle_empty_event(&monitor_var);
}

    processMessageQueue();
}
