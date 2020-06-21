/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *           Header for Thing mySAC
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#ifndef mySAC_H_
#define mySAC_H_

#ifdef __cplusplus
extern "C" {
#endif

#include "thingml_typedefs.h"

/*****************************************************************************
 * Headers for type : mySAC
 *****************************************************************************/

// Definition of the instance struct:
struct mySAC_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_receivingTemperaturePort;
// Variables for the current instance state
int mySAC_heaterBehavior_State;
// Variables for the properties of the instance
uint8_t mySAC_preferedTemperature_var;

};
// Declaration of prototypes outgoing messages :
void mySAC_heaterBehavior_OnEntry(int state, struct mySAC_Instance *_instance);
void mySAC_handle_receivingTemperaturePort_temperatureSensorMessage(struct mySAC_Instance *_instance, uint8_t temperatureValue);
// Declaration of callbacks for incoming messages:

// Definition of the states:
#define MYSAC_HEATERBEHAVIOR_STATE 0
#define MYSAC_HEATERBEHAVIOR_ISON_STATE 1
#define MYSAC_HEATERBEHAVIOR_ISOFF_STATE 2



#ifdef __cplusplus
}
#endif

#endif //mySAC_H_
