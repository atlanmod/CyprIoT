/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *        Implementation for Thing Temperature
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#include "Temperature.h"

/*****************************************************************************
 * Implementation for type : Temperature
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void Temperature_temperatureSensorBehavior_OnExit(int state, struct Temperature_Instance *_instance);
//Prototypes: Message Sending
void Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, int TemperatureData);
void Temperature_send_temperaturePort2_temperatureMessage2(struct Temperature_Instance *_instance, int TemperatureData);
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
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE:{
Serial.println(_instance->Temperature_dht_var.temperature);
Temperature_send_temperaturePort_temperatureMessage(_instance, (int) _instance->Temperature_dht_var.temperature);
break;
}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE:{
fprintf(stdout, "initialization...");
Serial.begin(9600);
			_instance->Temperature_dht_var.read11(_instance->Temperature_pin_var);
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
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE:{
delay(1000);
break;}
case TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE:{
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
void (*external_Temperature_send_temperaturePort_temperatureMessage_listener)(struct Temperature_Instance *, int)= 0x0;
void (*Temperature_send_temperaturePort_temperatureMessage_listener)(struct Temperature_Instance *, int)= 0x0;
void register_external_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, int)){
external_Temperature_send_temperaturePort_temperatureMessage_listener = _listener;
}
void register_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, int)){
Temperature_send_temperaturePort_temperatureMessage_listener = _listener;
}
void Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, int TemperatureData){
if (Temperature_send_temperaturePort_temperatureMessage_listener != 0x0) Temperature_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
if (external_Temperature_send_temperaturePort_temperatureMessage_listener != 0x0) external_Temperature_send_temperaturePort_temperatureMessage_listener(_instance, TemperatureData);
;
}
void (*external_Temperature_send_temperaturePort2_temperatureMessage2_listener)(struct Temperature_Instance *, int)= 0x0;
void (*Temperature_send_temperaturePort2_temperatureMessage2_listener)(struct Temperature_Instance *, int)= 0x0;
void register_external_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, int)){
external_Temperature_send_temperaturePort2_temperatureMessage2_listener = _listener;
}
void register_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, int)){
Temperature_send_temperaturePort2_temperatureMessage2_listener = _listener;
}
void Temperature_send_temperaturePort2_temperatureMessage2(struct Temperature_Instance *_instance, int TemperatureData){
if (Temperature_send_temperaturePort2_temperatureMessage2_listener != 0x0) Temperature_send_temperaturePort2_temperatureMessage2_listener(_instance, TemperatureData);
if (external_Temperature_send_temperaturePort2_temperatureMessage2_listener != 0x0) external_Temperature_send_temperaturePort2_temperatureMessage2_listener(_instance, TemperatureData);
;
}



