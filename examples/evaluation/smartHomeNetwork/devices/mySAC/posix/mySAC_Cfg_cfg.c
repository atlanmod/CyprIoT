/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *      Implementation for Application mySAC_Cfg
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <math.h>
#include <signal.h>
#include <pthread.h>
#include "thingml_typedefs.h"
#include "runtime.h"
#include "mySAC.h"

#include "MQTT.h"




/*****************************************************************************
 * Definitions for configuration : mySAC_Cfg
 *****************************************************************************/

//Declaration of instance variables
//Instance mySAC
// Variables for the properties of the instance
struct mySAC_Instance mySAC_var;
// Variables for the sessions of the instance

//Instance MQTT for network plugin PosixMQTTPlugin
struct MQTT_Instance MQTT_instance;



//New dispatcher for messages
void dispatch_temperatureSensorMessage(uint16_t sender, uint8_t param_temperatureValue) {
if (sender == MQTT_instance.listener_id) {
mySAC_handle_receivingTemperaturePort_temperatureSensorMessage(&mySAC_var, param_temperatureValue);

}

}


//New dispatcher for messages
void dispatch_turnTemperatureTo(uint16_t sender) {
if (sender == MQTT_instance.listener_id) {

}

}


int processMessageQueue() {
fifo_lock();
while (fifo_empty()) fifo_wait();
uint8_t mbufi = 0;

// Read the code of the next port/message in the queue
uint16_t code = fifo_dequeue() << 8;

code += fifo_dequeue();

// Switch to call the appropriate handler
switch(code) {
case 1:{
byte mbuf[5 - 2];
while (mbufi < (5 - 2)) mbuf[mbufi++] = fifo_dequeue();
fifo_unlock();
uint8_t mbufi_temperatureSensorMessage = 2;
union u_temperatureSensorMessage_temperatureValue_t {
uint8_t p;
byte bytebuffer[1];
} u_temperatureSensorMessage_temperatureValue;
u_temperatureSensorMessage_temperatureValue.bytebuffer[0] = mbuf[mbufi_temperatureSensorMessage + 0];
mbufi_temperatureSensorMessage += 1;
dispatch_temperatureSensorMessage((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_temperatureSensorMessage_temperatureValue.p /* temperatureValue */ );
break;
}
case 2:{
byte mbuf[4 - 2];
while (mbufi < (4 - 2)) mbuf[mbufi++] = fifo_dequeue();
fifo_unlock();
uint8_t mbufi_turnTemperatureTo = 2;
dispatch_turnTemperatureTo((mbuf[0] << 8) + mbuf[1] /* instance port*/);
break;
}
}
return 1;
}


//external Message enqueue
void externalMessageEnqueue(uint8_t * msg, uint8_t msgSize, uint16_t listener_id) {
if ((msgSize >= 2) && (msg != NULL)) {
uint8_t msgSizeOK = 0;
switch(msg[0] * 256 + msg[1]) {
case 1:
if(msgSize == 3) {
msgSizeOK = 1;}
break;
case 2:
if(msgSize == 2) {
msgSizeOK = 1;}
break;
}

if(msgSizeOK == 1) {
fifo_lock();
if ( fifo_byte_available() > (msgSize + 2) ) {
	uint8_t i;
	for (i = 0; i < 2; i++) {
		_fifo_enqueue(msg[i]);
	}
	_fifo_enqueue((listener_id >> 8) & 0xFF);
	_fifo_enqueue(listener_id & 0xFF);
	for (i = 2; i < msgSize; i++) {
		_fifo_enqueue(msg[i]);
	}
}
fifo_unlock_and_notify();
}
}
}

void initialize_configuration_mySAC_Cfg() {
// Initialize connectors

// Init the ID, state variables and properties for external connector MQTT

// Network Initialization
// Initialise MQTT:
MQTT_instance.listener_id = add_instance(&MQTT_instance);
MQTT_setup(&MQTT_instance);
pthread_t thread_MQTT;
pthread_create( &thread_MQTT, NULL, MQTT_start_receiver_thread, NULL);

// End Network Initialization

// Init the ID, state variables and properties for instance mySAC
mySAC_var.active = true;
mySAC_var.id_receivingTemperaturePort = add_instance( (void*) &mySAC_var);
mySAC_var.mySAC_heaterBehavior_State = MYSAC_HEATERBEHAVIOR_ISOFF_STATE;

mySAC_heaterBehavior_OnEntry(MYSAC_HEATERBEHAVIOR_STATE, &mySAC_var);
}




void term(int signum)
{
    

    fflush(stdout);
    fflush(stderr);
    exit(signum);
}


int main(int argc, char *argv[]) {
    struct sigaction action;
    memset(&action, 0, sizeof(struct sigaction));
    action.sa_handler = term;
    sigaction(SIGINT, &action, NULL);
    sigaction(SIGTERM, &action, NULL);

    init_runtime();
    
    initialize_configuration_mySAC_Cfg();

    while (1) {
        
// Network Listener// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
}

        processMessageQueue();
  }
}