/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *      Implementation for Application myTemperature
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
#include "Temperature.h"

#include "MQTT.h"




/*****************************************************************************
 * Definitions for configuration : myTemperature
 *****************************************************************************/

//Declaration of instance variables
//Instance temp
// Variables for the properties of the instance
struct Temperature_Instance temp_var;
// Variables for the sessions of the instance

//Instance MQTT for network plugin PosixMQTTPlugin
struct MQTT_Instance MQTT_instance;



int processMessageQueue() {
fifo_lock();
while (fifo_empty()) fifo_wait();
uint8_t mbufi = 0;

// Read the code of the next port/message in the queue
uint16_t code = fifo_dequeue() << 8;

code += fifo_dequeue();

// Switch to call the appropriate handler
switch(code) {
}
return 1;
}

void forward_Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, int TemperatureData){
if(_instance->id_temperaturePort == temp_var.id_temperaturePort) {
forward_MQTT_Temperature_send_temperaturePort_temperatureMessage(_instance, TemperatureData);
}
}

//external Message enqueue
void externalMessageEnqueue(uint8_t * msg, uint8_t msgSize, uint16_t listener_id) {
if ((msgSize >= 2) && (msg != NULL)) {
uint8_t msgSizeOK = 0;
switch(msg[0] * 256 + msg[1]) {
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

void initialize_configuration_myTemperature() {
// Initialize connectors
register_external_Temperature_send_temperaturePort_temperatureMessage_listener(&forward_Temperature_send_temperaturePort_temperatureMessage);

// Init the ID, state variables and properties for external connector MQTT

// Network Initialization
// Initialise MQTT:
MQTT_instance.listener_id = add_instance(&MQTT_instance);
MQTT_setup(&MQTT_instance);
pthread_t thread_MQTT;
pthread_create( &thread_MQTT, NULL, MQTT_start_receiver_thread, NULL);

// End Network Initialization

// Init the ID, state variables and properties for instance temp
temp_var.active = true;
temp_var.id_temperaturePort = add_instance( (void*) &temp_var);
temp_var.id_temperaturePort2 = add_instance( (void*) &temp_var);
temp_var.Temperature_temperatureSensorBehavior_State = TEMPERATURE_TEMPERATURESENSORBEHAVIOR_SETUP_STATE;
temp_var.Temperature_pin_var = 8;

Temperature_temperatureSensorBehavior_OnEntry(TEMPERATURE_TEMPERATURESENSORBEHAVIOR_STATE, &temp_var);
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
    
    initialize_configuration_myTemperature();

    while (1) {
        
// Network Listener// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
emptyEventConsumed += Temperature_handle_empty_event(&temp_var);
}

        processMessageQueue();
  }
}