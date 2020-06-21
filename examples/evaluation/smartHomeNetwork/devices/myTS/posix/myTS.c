/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *        Implementation for Thing myTS
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#include "myTS.h"

/*****************************************************************************
 * Implementation for type : myTS
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void myTS_temperatureSensorBehavior_OnExit(int state, struct myTS_Instance *_instance);
//Prototypes: Message Sending
void myTS_send_sendingTemperaturePort_temperatureSensorMessage(struct myTS_Instance *_instance, uint8_t temperatureValue);
void myTS_send_manufacturerLogsPort_logsMessage(struct myTS_Instance *_instance, uint8_t temperatureValue);
//Prototypes: Function
void f_myTS_sense(struct myTS_Instance *_instance);
// Declaration of functions:
// Definition of function sense
void f_myTS_sense(struct myTS_Instance *_instance) {
}

// Sessions functionss:


// On Entry Actions:
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
//Type Void is not handled in print action
fprintf(stdout, "\n");
break;
}
default: break;
}
}

// On Exit Actions:
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

// Event Handlers for incoming messages:

// Observers for outgoing messages:
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



