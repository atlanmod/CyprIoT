/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *           Header for Thing myTS
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#ifndef myTS_H_
#define myTS_H_

#ifdef __cplusplus
extern "C" {
#endif

#include "thingml_typedefs.h"

/*****************************************************************************
 * Headers for type : myTS
 *****************************************************************************/

// Definition of the instance struct:
struct myTS_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_sendingTemperaturePort;
uint16_t id_manufacturerLogsPort;
// Variables for the current instance state
int myTS_temperatureSensorBehavior_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void myTS_temperatureSensorBehavior_OnEntry(int state, struct myTS_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));
void register_external_myTS_send_sendingTemperaturePort_temperatureSensorMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));
void register_myTS_send_manufacturerLogsPort_logsMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));
void register_external_myTS_send_manufacturerLogsPort_logsMessage_listener(void (*_listener)(struct myTS_Instance *, uint8_t));

// Definition of the states:
#define MYTS_TEMPERATURESENSORBEHAVIOR_ISHIGH_STATE 0
#define MYTS_TEMPERATURESENSORBEHAVIOR_STATE 1
#define MYTS_TEMPERATURESENSORBEHAVIOR_ISSENSING_STATE 2



#ifdef __cplusplus
}
#endif

#endif //myTS_H_
