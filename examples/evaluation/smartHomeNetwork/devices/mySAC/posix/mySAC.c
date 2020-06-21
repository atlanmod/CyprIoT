/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *        Implementation for Thing mySAC
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#include "mySAC.h"

/*****************************************************************************
 * Implementation for type : mySAC
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void mySAC_heaterBehavior_OnExit(int state, struct mySAC_Instance *_instance);
//Prototypes: Message Sending
//Prototypes: Function
void f_mySAC_turnTemperatureTo(struct mySAC_Instance *_instance, uint8_t value);
// Declaration of functions:
// Definition of function turnTemperatureTo
void f_mySAC_turnTemperatureTo(struct mySAC_Instance *_instance, uint8_t value) {
_instance->mySAC_preferedTemperature_var = value;
}

// Sessions functionss:


// On Entry Actions:
void mySAC_heaterBehavior_OnEntry(int state, struct mySAC_Instance *_instance) {
switch(state) {
case MYSAC_HEATERBEHAVIOR_STATE:{
_instance->mySAC_heaterBehavior_State = MYSAC_HEATERBEHAVIOR_ISOFF_STATE;
mySAC_heaterBehavior_OnEntry(_instance->mySAC_heaterBehavior_State, _instance);
break;
}
case MYSAC_HEATERBEHAVIOR_ISON_STATE:{
fprintf(stdout, "isOn");
//Type Void is not handled in print action
fprintf(stdout, "\n");
break;
}
case MYSAC_HEATERBEHAVIOR_ISOFF_STATE:{
fprintf(stdout, "isOff");
fprintf(stdout, "\n");
break;
}
default: break;
}
}

// On Exit Actions:
void mySAC_heaterBehavior_OnExit(int state, struct mySAC_Instance *_instance) {
switch(state) {
case MYSAC_HEATERBEHAVIOR_STATE:{
mySAC_heaterBehavior_OnExit(_instance->mySAC_heaterBehavior_State, _instance);
break;}
case MYSAC_HEATERBEHAVIOR_ISON_STATE:{
break;}
case MYSAC_HEATERBEHAVIOR_ISOFF_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
void mySAC_handle_receivingTemperaturePort_temperatureSensorMessage(struct mySAC_Instance *_instance, uint8_t temperatureValue) {
if(!(_instance->active)) return;
//Region heaterBehavior
uint8_t mySAC_heaterBehavior_State_event_consumed = 0;
if (_instance->mySAC_heaterBehavior_State == MYSAC_HEATERBEHAVIOR_ISOFF_STATE) {
if (mySAC_heaterBehavior_State_event_consumed == 0 && 1) {
mySAC_heaterBehavior_OnExit(MYSAC_HEATERBEHAVIOR_ISOFF_STATE, _instance);
_instance->mySAC_heaterBehavior_State = MYSAC_HEATERBEHAVIOR_ISON_STATE;
f_mySAC_turnTemperatureTo(_instance, temperatureValue);
mySAC_heaterBehavior_OnEntry(MYSAC_HEATERBEHAVIOR_ISON_STATE, _instance);
mySAC_heaterBehavior_State_event_consumed = 1;
}
}
//End Region heaterBehavior
//End dsregion heaterBehavior
//Session list: 
}

// Observers for outgoing messages:



