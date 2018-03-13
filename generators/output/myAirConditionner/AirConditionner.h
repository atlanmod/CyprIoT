/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *           Header for Thing AirConditionner
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#ifndef AirConditionner_H_
#define AirConditionner_H_

#ifdef __cplusplus
extern "C" {
#endif

#include "thingml_typedefs.h"

/*****************************************************************************
 * Headers for type : AirConditionner
 *****************************************************************************/

// Definition of the instance struct:
struct AirConditionner_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_HW;
// Variables for the current instance state
int AirConditionner_Temperature_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void AirConditionner_Temperature_OnEntry(int state, struct AirConditionner_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_AirConditionner_send_HW_sendTemp_listener(void (*_listener)(struct AirConditionner_Instance *));
void register_external_AirConditionner_send_HW_sendTemp_listener(void (*_listener)(struct AirConditionner_Instance *));

// Definition of the states:
#define AIRCONDITIONNER_TEMPERATURE_STATE 0
#define AIRCONDITIONNER_TEMPERATURE_GREETINGS_STATE 1
#define AIRCONDITIONNER_TEMPERATURE_BYE_STATE 2



#ifdef __cplusplus
}
#endif

#endif //AirConditionner_H_
