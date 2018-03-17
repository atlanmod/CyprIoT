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


// BEGIN: Code from the c_header annotation Temperature
#include <dht.h>
// END: Code from the c_header annotation Temperature

// Definition of the instance struct:
struct Temperature_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_temperaturePort;
uint16_t id_temperaturePort2;
// Variables for the current instance state
int Temperature_temperatureSensorBehavior_State;
// Variables for the properties of the instance
dht Temperature_dht_var;
uint8_t Temperature_pin_var;

};
// Declaration of prototypes outgoing messages :
void Temperature_temperatureSensorBehavior_OnEntry(int state, struct Temperature_Instance *_instance);
// Declaration of callbacks for incoming messages:
void register_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, int));
void register_external_Temperature_send_temperaturePort_temperatureMessage_listener(void (*_listener)(struct Temperature_Instance *, int));
void register_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, int));
void register_external_Temperature_send_temperaturePort2_temperatureMessage2_listener(void (*_listener)(struct Temperature_Instance *, int));

// Definition of the states:
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_STATE 0
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SAMPLINGRATE_STATE 1
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_COLLECT_STATE 2
#define TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE 3



#ifdef __cplusplus
}
#endif

#endif //Temperature_H_
