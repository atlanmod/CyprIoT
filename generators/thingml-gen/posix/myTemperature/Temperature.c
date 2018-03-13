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
void Temperature_Temperature_OnExit(int state, struct Temperature_Instance *_instance);
//Prototypes: Message Sending
void Temperature_send_HW_sendTemp(struct Temperature_Instance *_instance);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void Temperature_Temperature_OnEntry(int state, struct Temperature_Instance *_instance) {
switch(state) {
case TEMPERATURE_TEMPERATURE_STATE:{
_instance->Temperature_Temperature_State = TEMPERATURE_TEMPERATURE_GREETINGS_STATE;
Temperature_Temperature_OnEntry(_instance->Temperature_Temperature_State, _instance);
break;
}
case TEMPERATURE_TEMPERATURE_BYE_STATE:{
fprintf(stdout, "Bye.\n");
break;
}
case TEMPERATURE_TEMPERATURE_GREETINGS_STATE:{
break;
}
default: break;
}
}

// On Exit Actions:
void Temperature_Temperature_OnExit(int state, struct Temperature_Instance *_instance) {
switch(state) {
case TEMPERATURE_TEMPERATURE_STATE:{
Temperature_Temperature_OnExit(_instance->Temperature_Temperature_State, _instance);
break;}
case TEMPERATURE_TEMPERATURE_BYE_STATE:{
break;}
case TEMPERATURE_TEMPERATURE_GREETINGS_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
int Temperature_handle_empty_event(struct Temperature_Instance *_instance) {
 uint8_t empty_event_consumed = 0;
if(!(_instance->active)) return 0;
//Region Temperature
if (_instance->Temperature_Temperature_State == TEMPERATURE_TEMPERATURE_GREETINGS_STATE) {
if (1) {
Temperature_Temperature_OnExit(TEMPERATURE_TEMPERATURE_GREETINGS_STATE, _instance);
_instance->Temperature_Temperature_State = TEMPERATURE_TEMPERATURE_BYE_STATE;
fprintf(stdout, "Hello World!\n");
Temperature_send_HW_sendTemp(_instance);
Temperature_Temperature_OnEntry(TEMPERATURE_TEMPERATURE_BYE_STATE, _instance);
return 1;
}
}
//begin dispatchEmptyToSession
//end dispatchEmptyToSession
return empty_event_consumed;
}

// Observers for outgoing messages:
void (*external_Temperature_send_HW_sendTemp_listener)(struct Temperature_Instance *)= 0x0;
void (*Temperature_send_HW_sendTemp_listener)(struct Temperature_Instance *)= 0x0;
void register_external_Temperature_send_HW_sendTemp_listener(void (*_listener)(struct Temperature_Instance *)){
external_Temperature_send_HW_sendTemp_listener = _listener;
}
void register_Temperature_send_HW_sendTemp_listener(void (*_listener)(struct Temperature_Instance *)){
Temperature_send_HW_sendTemp_listener = _listener;
}
void Temperature_send_HW_sendTemp(struct Temperature_Instance *_instance){
if (Temperature_send_HW_sendTemp_listener != 0x0) Temperature_send_HW_sendTemp_listener(_instance);
if (external_Temperature_send_HW_sendTemp_listener != 0x0) external_Temperature_send_HW_sendTemp_listener(_instance);
;
}



