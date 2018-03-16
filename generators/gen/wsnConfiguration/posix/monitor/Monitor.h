/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *           Header for Thing Monitor
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#ifndef Monitor_H_
#define Monitor_H_

#ifdef __cplusplus
extern "C" {
#endif

#include "thingml_typedefs.h"

/*****************************************************************************
 * Headers for type : Monitor
 *****************************************************************************/

// Definition of the instance struct:
struct Monitor_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_inout;
// Variables for the current instance state
int Monitor_Monitor_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void Monitor_Monitor_OnEntry(int state, struct Monitor_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_Monitor_send_inout_sendTemp_listener(void (*_listener)(struct Monitor_Instance *));
void register_external_Monitor_send_inout_sendTemp_listener(void (*_listener)(struct Monitor_Instance *));

// Definition of the states:
#define MONITOR_MONITOR_GREETINGS_STATE 0
#define MONITOR_MONITOR_STATE 1
#define MONITOR_MONITOR_BYE_STATE 2



#ifdef __cplusplus
}
#endif

#endif //Monitor_H_
