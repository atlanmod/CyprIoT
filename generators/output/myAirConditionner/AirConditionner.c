/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *        Implementation for Thing AirConditionner
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#include "AirConditionner.h"

/*****************************************************************************
 * Implementation for type : AirConditionner
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void AirConditionner_Temperature_OnExit(int state, struct AirConditionner_Instance *_instance);
//Prototypes: Message Sending
void AirConditionner_send_HW_sendTemp(struct AirConditionner_Instance *_instance);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void AirConditionner_Temperature_OnEntry(int state, struct AirConditionner_Instance *_instance) {
switch(state) {
case AIRCONDITIONNER_TEMPERATURE_STATE:{
_instance->AirConditionner_Temperature_State = AIRCONDITIONNER_TEMPERATURE_GREETINGS_STATE;
AirConditionner_Temperature_OnEntry(_instance->AirConditionner_Temperature_State, _instance);
break;
}
case AIRCONDITIONNER_TEMPERATURE_GREETINGS_STATE:{
break;
}
case AIRCONDITIONNER_TEMPERATURE_BYE_STATE:{
fprintf(stdout, "Bye.\n");
break;
}
default: break;
}
}

// On Exit Actions:
void AirConditionner_Temperature_OnExit(int state, struct AirConditionner_Instance *_instance) {
switch(state) {
case AIRCONDITIONNER_TEMPERATURE_STATE:{
AirConditionner_Temperature_OnExit(_instance->AirConditionner_Temperature_State, _instance);
break;}
case AIRCONDITIONNER_TEMPERATURE_GREETINGS_STATE:{
break;}
case AIRCONDITIONNER_TEMPERATURE_BYE_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
int AirConditionner_handle_empty_event(struct AirConditionner_Instance *_instance) {
 uint8_t empty_event_consumed = 0;
if(!(_instance->active)) return 0;
//Region Temperature
if (_instance->AirConditionner_Temperature_State == AIRCONDITIONNER_TEMPERATURE_GREETINGS_STATE) {
if (1) {
AirConditionner_Temperature_OnExit(AIRCONDITIONNER_TEMPERATURE_GREETINGS_STATE, _instance);
_instance->AirConditionner_Temperature_State = AIRCONDITIONNER_TEMPERATURE_BYE_STATE;
fprintf(stdout, "Hello World!\n");
AirConditionner_Temperature_OnEntry(AIRCONDITIONNER_TEMPERATURE_BYE_STATE, _instance);
return 1;
}
}
//begin dispatchEmptyToSession
//end dispatchEmptyToSession
return empty_event_consumed;
}

// Observers for outgoing messages:
void (*external_AirConditionner_send_HW_sendTemp_listener)(struct AirConditionner_Instance *)= 0x0;
void (*AirConditionner_send_HW_sendTemp_listener)(struct AirConditionner_Instance *)= 0x0;
void register_external_AirConditionner_send_HW_sendTemp_listener(void (*_listener)(struct AirConditionner_Instance *)){
external_AirConditionner_send_HW_sendTemp_listener = _listener;
}
void register_AirConditionner_send_HW_sendTemp_listener(void (*_listener)(struct AirConditionner_Instance *)){
AirConditionner_send_HW_sendTemp_listener = _listener;
}
void AirConditionner_send_HW_sendTemp(struct AirConditionner_Instance *_instance){
if (AirConditionner_send_HW_sendTemp_listener != 0x0) AirConditionner_send_HW_sendTemp_listener(_instance);
if (external_AirConditionner_send_HW_sendTemp_listener != 0x0) external_AirConditionner_send_HW_sendTemp_listener(_instance);
;
}



