#include <stdint.h>
#include <Arduino.h>
/*****************************************************************************
 * Headers for type : TemperaturePSM
 *****************************************************************************/


// BEGIN: Code from the c_header annotation TemperaturePSM
#include <dht.h>
// END: Code from the c_header annotation TemperaturePSM

// Definition of the instance struct:
struct TemperaturePSM_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_temperaturePort;
// Variables for the current instance state
int TemperaturePSM_temperatureSensorBehavior_State;
// Variables for the properties of the instance
uint32_t TemperaturePSM_pin_var;
uint32_t TemperaturePSM_sampling_var;
dht TemperaturePSM_dht_var;

};
// Declaration of prototypes outgoing messages :
void TemperaturePSM_temperatureSensorBehavior_OnEntry(int state, struct TemperaturePSM_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_TemperaturePSM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePSM_Instance *, uint32_t));
void register_external_TemperaturePSM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePSM_Instance *, uint32_t));

// Definition of the states:
#define TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE 0
#define TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_STATE 1
#define TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE 2
#define TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SETUP_STATE 3


/*****************************************************************************
 * Headers for type : TemperaturePIM
 *****************************************************************************/

// Definition of the instance struct:
struct TemperaturePIM_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_temperaturePort;
// Variables for the current instance state
int TemperaturePIM_pimBehaviour_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void TemperaturePIM_pimBehaviour_OnEntry(int state, struct TemperaturePIM_Instance *_instance);
void TemperaturePIM_handle_temperaturePort_temperatureMessage(struct TemperaturePIM_Instance *_instance, uint32_t TemperatureData);
// Declaration of callbacks for incoming messages:
void register_TemperaturePIM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePIM_Instance *, uint32_t));
void register_external_TemperaturePIM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePIM_Instance *, uint32_t));

// Definition of the states:
#define TEMPERATUREPIM_PIMBEHAVIOUR_STATE 0
#define TEMPERATUREPIM_PIMBEHAVIOUR_SHOWTEMPERATURE_STATE 1



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
/*****************************************************************************
 * Implementation for type : TemperaturePSM
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void TemperaturePSM_temperatureSensorBehavior_OnExit(int state, struct TemperaturePSM_Instance *_instance);
//Prototypes: Message Sending
void TemperaturePSM_send_temperaturePort_temperatureMessage(struct TemperaturePSM_Instance *_instance, uint32_t TemperatureData);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void TemperaturePSM_temperatureSensorBehavior_OnEntry(int state, struct TemperaturePSM_Instance *_instance) {
switch(state) {
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_STATE:{
_instance->TemperaturePSM_temperatureSensorBehavior_State = TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SETUP_STATE;
TemperaturePSM_temperatureSensorBehavior_OnEntry(_instance->TemperaturePSM_temperatureSensorBehavior_State, _instance);
break;
}
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE:{
delay(_instance->TemperaturePSM_sampling_var);
break;
}
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE:{
Serial.println(_instance->TemperaturePSM_dht_var.temperature);
TemperaturePSM_send_temperaturePort_temperatureMessage(_instance, (uint32_t)_instance->TemperaturePSM_dht_var.temperature);
break;
}
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SETUP_STATE:{
// PRINT: "initialization..."
Serial.begin(9600);
			_instance->TemperaturePSM_dht_var.read11(_instance->TemperaturePSM_pin_var);
break;
}
default: break;
}
}

// On Exit Actions:
void TemperaturePSM_temperatureSensorBehavior_OnExit(int state, struct TemperaturePSM_Instance *_instance) {
switch(state) {
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_STATE:{
TemperaturePSM_temperatureSensorBehavior_OnExit(_instance->TemperaturePSM_temperatureSensorBehavior_State, _instance);
break;}
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE:{
break;}
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE:{
break;}
case TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SETUP_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
int TemperaturePSM_handle_empty_event(struct TemperaturePSM_Instance *_instance) {
 uint8_t empty_event_consumed = 0;
if(!(_instance->active)) return 0;
//Region temperatureSensorBehavior
if (_instance->TemperaturePSM_temperatureSensorBehavior_State == TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SETUP_STATE) {
if (1) {
TemperaturePSM_temperatureSensorBehavior_OnExit(TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SETUP_STATE, _instance);
_instance->TemperaturePSM_temperatureSensorBehavior_State = TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE;
TemperaturePSM_temperatureSensorBehavior_OnEntry(TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE, _instance);
return 1;
}
}
else if (_instance->TemperaturePSM_temperatureSensorBehavior_State == TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE) {
if (1) {
TemperaturePSM_temperatureSensorBehavior_OnExit(TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE, _instance);
_instance->TemperaturePSM_temperatureSensorBehavior_State = TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE;
TemperaturePSM_temperatureSensorBehavior_OnEntry(TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE, _instance);
return 1;
}
}
else if (_instance->TemperaturePSM_temperatureSensorBehavior_State == TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE) {
if (1) {
TemperaturePSM_temperatureSensorBehavior_OnExit(TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE, _instance);
_instance->TemperaturePSM_temperatureSensorBehavior_State = TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE;
TemperaturePSM_temperatureSensorBehavior_OnEntry(TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE, _instance);
return 1;
}
}
//begin dispatchEmptyToSession
//end dispatchEmptyToSession
return empty_event_consumed;
}

// Observers for outgoing messages:
void (*external_TemperaturePSM_send_temperaturePort_temperatureMessage_listener)(struct TemperaturePSM_Instance *, uint32_t)= 0x0;
void (*TemperaturePSM_send_temperaturePort_temperatureMessage_listener)(struct TemperaturePSM_Instance *, uint32_t)= 0x0;
void register_external_TemperaturePSM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePSM_Instance *, uint32_t)){
external_TemperaturePSM_send_temperaturePort_temperatureMessage_listener = _listener;
}
void register_TemperaturePSM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePSM_Instance *, uint32_t)){
TemperaturePSM_send_temperaturePort_temperatureMessage_listener = _listener;
}
void TemperaturePSM_send_temperaturePort_temperatureMessage(struct TemperaturePSM_Instance *_instance, uint32_t TemperatureData){
if (TemperaturePSM_send_temperaturePort_temperatureMessage_listener != 0x0) TemperaturePSM_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
if (external_TemperaturePSM_send_temperaturePort_temperatureMessage_listener != 0x0) external_TemperaturePSM_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
;
}




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
 * Implementation for type : TemperaturePIM
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void TemperaturePIM_pimBehaviour_OnExit(int state, struct TemperaturePIM_Instance *_instance);
//Prototypes: Message Sending
void TemperaturePIM_send_temperaturePort_temperatureMessage(struct TemperaturePIM_Instance *_instance, uint32_t TemperatureData);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void TemperaturePIM_pimBehaviour_OnEntry(int state, struct TemperaturePIM_Instance *_instance) {
switch(state) {
case TEMPERATUREPIM_PIMBEHAVIOUR_STATE:{
_instance->TemperaturePIM_pimBehaviour_State = TEMPERATUREPIM_PIMBEHAVIOUR_SHOWTEMPERATURE_STATE;
TemperaturePIM_pimBehaviour_OnEntry(_instance->TemperaturePIM_pimBehaviour_State, _instance);
break;
}
case TEMPERATUREPIM_PIMBEHAVIOUR_SHOWTEMPERATURE_STATE:{
break;
}
default: break;
}
}

// On Exit Actions:
void TemperaturePIM_pimBehaviour_OnExit(int state, struct TemperaturePIM_Instance *_instance) {
switch(state) {
case TEMPERATUREPIM_PIMBEHAVIOUR_STATE:{
TemperaturePIM_pimBehaviour_OnExit(_instance->TemperaturePIM_pimBehaviour_State, _instance);
break;}
case TEMPERATUREPIM_PIMBEHAVIOUR_SHOWTEMPERATURE_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
void TemperaturePIM_handle_temperaturePort_temperatureMessage(struct TemperaturePIM_Instance *_instance, uint32_t TemperatureData) {
if(!(_instance->active)) return;
//Region pimBehaviour
uint8_t TemperaturePIM_pimBehaviour_State_event_consumed = 0;
if (_instance->TemperaturePIM_pimBehaviour_State == TEMPERATUREPIM_PIMBEHAVIOUR_SHOWTEMPERATURE_STATE) {
if (TemperaturePIM_pimBehaviour_State_event_consumed == 0 && 1) {
// PRINT: TemperatureData
TemperaturePIM_send_temperaturePort_temperatureMessage(_instance, TemperatureData);
TemperaturePIM_pimBehaviour_State_event_consumed = 1;
}
}
//End Region pimBehaviour
//End dsregion pimBehaviour
//Session list: 
}

// Observers for outgoing messages:
void (*external_TemperaturePIM_send_temperaturePort_temperatureMessage_listener)(struct TemperaturePIM_Instance *, uint32_t)= 0x0;
void (*TemperaturePIM_send_temperaturePort_temperatureMessage_listener)(struct TemperaturePIM_Instance *, uint32_t)= 0x0;
void register_external_TemperaturePIM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePIM_Instance *, uint32_t)){
external_TemperaturePIM_send_temperaturePort_temperatureMessage_listener = _listener;
}
void register_TemperaturePIM_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct TemperaturePIM_Instance *, uint32_t)){
TemperaturePIM_send_temperaturePort_temperatureMessage_listener = _listener;
}
void TemperaturePIM_send_temperaturePort_temperatureMessage(struct TemperaturePIM_Instance *_instance, uint32_t TemperatureData){
if (TemperaturePIM_send_temperaturePort_temperatureMessage_listener != 0x0) TemperaturePIM_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
if (external_TemperaturePIM_send_temperaturePort_temperatureMessage_listener != 0x0) external_TemperaturePIM_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
;
}






/*****************************************************************************
 * Definitions for configuration : temperatureCfg
 *****************************************************************************/

//Declaration of instance variables
//Instance temppsm
// Variables for the properties of the instance
struct TemperaturePSM_Instance temppsm_var;
// Variables for the sessions of the instance
//Instance temppim
// Variables for the properties of the instance
struct TemperaturePIM_Instance temppim_var;
// Variables for the sessions of the instance


// Enqueue of messages TemperaturePSM::temperaturePort::temperatureMessage
void enqueue_TemperaturePSM_send_temperaturePort_temperatureMessage(struct TemperaturePSM_Instance *_instance, uint32_t TemperatureData){
if ( fifo_byte_available() > 8 ) {

_fifo_enqueue( (1 >> 8) & 0xFF );
_fifo_enqueue( 1 & 0xFF );

// ID of the source port of the instance
_fifo_enqueue( (_instance->id_temperaturePort >> 8) & 0xFF );
_fifo_enqueue( _instance->id_temperaturePort & 0xFF );

// parameter TemperatureData
union u_TemperatureData_t {
uint32_t p;
byte bytebuffer[4];
} u_TemperatureData;
u_TemperatureData.p = TemperatureData;
_fifo_enqueue(u_TemperatureData.bytebuffer[3] & 0xFF );
_fifo_enqueue(u_TemperatureData.bytebuffer[2] & 0xFF );
_fifo_enqueue(u_TemperatureData.bytebuffer[1] & 0xFF );
_fifo_enqueue(u_TemperatureData.bytebuffer[0] & 0xFF );
}
}
// Enqueue of messages TemperaturePIM::temperaturePort::temperatureMessage
void enqueue_TemperaturePIM_send_temperaturePort_temperatureMessage(struct TemperaturePIM_Instance *_instance, uint32_t TemperatureData){
if ( fifo_byte_available() > 8 ) {

_fifo_enqueue( (1 >> 8) & 0xFF );
_fifo_enqueue( 1 & 0xFF );

// ID of the source port of the instance
_fifo_enqueue( (_instance->id_temperaturePort >> 8) & 0xFF );
_fifo_enqueue( _instance->id_temperaturePort & 0xFF );

// parameter TemperatureData
union u_TemperatureData_t {
uint32_t p;
byte bytebuffer[4];
} u_TemperatureData;
u_TemperatureData.p = TemperatureData;
_fifo_enqueue(u_TemperatureData.bytebuffer[3] & 0xFF );
_fifo_enqueue(u_TemperatureData.bytebuffer[2] & 0xFF );
_fifo_enqueue(u_TemperatureData.bytebuffer[1] & 0xFF );
_fifo_enqueue(u_TemperatureData.bytebuffer[0] & 0xFF );
}
}


//New dispatcher for messages
void dispatch_temperatureMessage(uint16_t sender, uint32_t param_TemperatureData) {
if (sender == temppsm_var.id_temperaturePort) {
TemperaturePIM_handle_temperaturePort_temperatureMessage(&temppim_var, param_TemperatureData);

}
if (sender == temppim_var.id_temperaturePort) {

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
uint8_t mbufi_temperatureMessage = 2;
union u_temperatureMessage_TemperatureData_t {
uint32_t p;
byte bytebuffer[4];
} u_temperatureMessage_TemperatureData;
u_temperatureMessage_TemperatureData.bytebuffer[3] = mbuf[mbufi_temperatureMessage + 0];
u_temperatureMessage_TemperatureData.bytebuffer[2] = mbuf[mbufi_temperatureMessage + 1];
u_temperatureMessage_TemperatureData.bytebuffer[1] = mbuf[mbufi_temperatureMessage + 2];
u_temperatureMessage_TemperatureData.bytebuffer[0] = mbuf[mbufi_temperatureMessage + 3];
mbufi_temperatureMessage += 4;
dispatch_temperatureMessage((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_temperatureMessage_TemperatureData.p /* TemperatureData */ );
break;
}
}
return 1;
}


//external Message enqueue

void initialize_configuration_temperatureCfg() {
// Initialize connectors
register_TemperaturePSM_send_temperaturePort_temperatureMessage_listener(&enqueue_TemperaturePSM_send_temperaturePort_temperatureMessage);
register_TemperaturePIM_send_temperaturePort_temperatureMessage_listener(&enqueue_TemperaturePIM_send_temperaturePort_temperatureMessage);


// Network Initialization
// End Network Initialization

// Init the ID, state variables and properties for instance temppsm
temppsm_var.active = true;
temppsm_var.id_temperaturePort = add_instance( (void*) &temppsm_var);
temppsm_var.TemperaturePSM_temperatureSensorBehavior_State = TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_SETUP_STATE;
temppsm_var.TemperaturePSM_pin_var = 8;
temppsm_var.TemperaturePSM_sampling_var = 5000;

TemperaturePSM_temperatureSensorBehavior_OnEntry(TEMPERATUREPSM_TEMPERATURESENSORBEHAVIOR_STATE, &temppsm_var);
// Init the ID, state variables and properties for instance temppim
temppim_var.active = true;
temppim_var.id_temperaturePort = add_instance( (void*) &temppim_var);
temppim_var.TemperaturePIM_pimBehaviour_State = TEMPERATUREPIM_PIMBEHAVIOUR_SHOWTEMPERATURE_STATE;

TemperaturePIM_pimBehaviour_OnEntry(TEMPERATUREPIM_PIMBEHAVIOUR_STATE, &temppim_var);
}




void setup() {
initialize_configuration_temperatureCfg();

}

void loop() {

// Network Listener// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
emptyEventConsumed += TemperaturePSM_handle_empty_event(&temppsm_var);
}

    processMessageQueue();
}
