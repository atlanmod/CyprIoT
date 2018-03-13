/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *           Header for Thing Temperature
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#ifndef Temperature_H_
#define Temperature_H_

#ifdef __cplusplus
extern "C" {
#endif

#include "thingml_typedefs.h"

/*****************************************************************************
 * Headers for type : Temperature
 *****************************************************************************/

// Definition of the instance struct:
struct Temperature_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_HW;
// Variables for the current instance state
int Temperature_Temperature_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void Temperature_Temperature_OnEntry(int state, struct Temperature_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_Temperature_send_HW_sendTemp_listener(void (*_listener)(struct Temperature_Instance *));
void register_external_Temperature_send_HW_sendTemp_listener(void (*_listener)(struct Temperature_Instance *));

// Definition of the states:
#define TEMPERATURE_TEMPERATURE_BYE_STATE 0
#define TEMPERATURE_TEMPERATURE_GREETINGS_STATE 1
#define TEMPERATURE_TEMPERATURE_STATE 2



#ifdef __cplusplus
}
#endif

#endif //Temperature_H_
