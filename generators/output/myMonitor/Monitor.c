/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *        Implementation for Thing Monitor
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#include "Monitor.h"

/*****************************************************************************
 * Implementation for type : Monitor
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void Monitor_Monitor_OnExit(int state, struct Monitor_Instance *_instance);
//Prototypes: Message Sending
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
fprintf(stdout, "Bye.\n");
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
fprintf(stdout, "Hello World!\n");
Monitor_Monitor_OnEntry(MONITOR_MONITOR_BYE_STATE, _instance);
return 1;
}
}
//begin dispatchEmptyToSession
//end dispatchEmptyToSession
return empty_event_consumed;
}

// Observers for outgoing messages:



