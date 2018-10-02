#include <stdint.h>
#include <Arduino.h>
/*****************************************************************************
 * Headers for type : Thing1
 *****************************************************************************/

// Definition of the instance struct:
struct Thing1_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_dataEntryPoint;
// Variables for the current instance state
int Thing1_thing1_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void Thing1_thing1_OnEntry(int state, struct Thing1_Instance *_instance);
void Thing1_handle_dataEntryPoint_rawData(struct Thing1_Instance *_instance, uint32_t data);
// Declaration of callbacks for incoming messages:

// Definition of the states:
#define THING1_THING1_STATE1_STATE 0
#define THING1_THING1_STATE 1


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

/*FORWARDERS*/
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
externalMessageEnqueue((uint8_t *) msg, size, MQTT_instance.listener_id);
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
}


void MQTT_read() {
  if (!MQTT_client.connected()) {
    MQTT_reconnect();
  }
  MQTT_client.loop();
}/*****************************************************************************
 * Implementation for type : Thing1
 *****************************************************************************/


// BEGIN: Code from the c_global annotation Thing1
#include <SoftwareSerial.h>
SoftwareSerial XBee(2, 3);
// END: Code from the c_global annotation Thing1

// Declaration of prototypes:
//Prototypes: State Machine
void Thing1_thing1_OnExit(int state, struct Thing1_Instance *_instance);
//Prototypes: Message Sending
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void Thing1_thing1_OnEntry(int state, struct Thing1_Instance *_instance) {
switch(state) {
case THING1_THING1_STATE:{
_instance->Thing1_thing1_State = THING1_THING1_STATE1_STATE;
Thing1_thing1_OnEntry(_instance->Thing1_thing1_State, _instance);
break;
}
case THING1_THING1_STATE1_STATE:{
break;
}
default: break;
}
}

// On Exit Actions:
void Thing1_thing1_OnExit(int state, struct Thing1_Instance *_instance) {
switch(state) {
case THING1_THING1_STATE:{
Thing1_thing1_OnExit(_instance->Thing1_thing1_State, _instance);
break;}
case THING1_THING1_STATE1_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
void Thing1_handle_dataEntryPoint_rawData(struct Thing1_Instance *_instance, uint32_t data) {
if(!(_instance->active)) return;
//Region thing1
uint8_t Thing1_thing1_State_event_consumed = 0;
if (_instance->Thing1_thing1_State == THING1_THING1_STATE1_STATE) {
if (Thing1_thing1_State_event_consumed == 0 && 1) {
			
			XBee.begin(9600);
			Serial.begin(9600);			
			while(true) {
				if (XBee.available()) { // If data comes in from XBee, send it out to serial monitor
					Serial.write(data
);
				}
			}
			
Thing1_thing1_State_event_consumed = 1;
}
}
//End Region thing1
//End dsregion thing1
//Session list: 
}

// Observers for outgoing messages:






/*****************************************************************************
 * Definitions for configuration : thing2Exec
 *****************************************************************************/

//Declaration of instance variables
//Instance thing1
// Variables for the properties of the instance
struct Thing1_Instance thing1_var;
// Variables for the sessions of the instance




//New dispatcher for messages
void dispatch_rawData(uint16_t sender, uint32_t param_data) {
if (sender == MQTT_instance.listener_id) {
Thing1_handle_dataEntryPoint_rawData(&thing1_var, param_data);

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
byte mbuf[8 - 2];
while (mbufi < (8 - 2)) mbuf[mbufi++] = fifo_dequeue();
uint8_t mbufi_rawData = 2;
union u_rawData_data_t {
uint32_t p;
byte bytebuffer[4];
} u_rawData_data;
u_rawData_data.bytebuffer[0] = mbuf[mbufi_rawData + 0];
u_rawData_data.bytebuffer[1] = mbuf[mbufi_rawData + 1];
u_rawData_data.bytebuffer[2] = mbuf[mbufi_rawData + 2];
u_rawData_data.bytebuffer[3] = mbuf[mbufi_rawData + 3];
mbufi_rawData += 4;
dispatch_rawData((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_rawData_data.p /* data */ );
break;
}
}
return 1;
}


//external Message enqueue
void externalMessageEnqueue(uint8_t * msg, uint8_t msgSize, uint16_t listener_id) {
if ((msgSize >= 2) && (msg != NULL)) {
uint8_t msgSizeOK = 0;
switch(msg[0] * 256 + msg[1]) {
case 1:
if(msgSize == 6) {
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

void initialize_configuration_thing2Exec() {
// Initialize connectors

// Init the ID, state variables and properties for external connector MQTT

// Network Initialization

MQTT_instance.listener_id = add_instance(&MQTT_instance);

MQTT_setup();

// End Network Initialization

// Init the ID, state variables and properties for instance thing1
thing1_var.active = true;
thing1_var.id_dataEntryPoint = add_instance( (void*) &thing1_var);
thing1_var.Thing1_thing1_State = THING1_THING1_STATE1_STATE;

Thing1_thing1_OnEntry(THING1_THING1_STATE, &thing1_var);
}




void setup() {
initialize_configuration_thing2Exec();

}

void loop() {

// Network Listener
MQTT_read();
// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
}

    processMessageQueue();
}
