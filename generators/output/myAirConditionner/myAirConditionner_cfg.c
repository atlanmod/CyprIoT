/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *      Implementation for Application myAirConditionner
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
#include "AirConditionner.h"





/*****************************************************************************
 * Definitions for configuration : myAirConditionner
 *****************************************************************************/

//Declaration of instance variables
//Instance temp
// Variables for the properties of the instance
struct AirConditionner_Instance temp_var;
// Variables for the sessions of the instance




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


//external Message enqueue

void initialize_configuration_myAirConditionner() {
// Initialize connectors


// Network Initialization
// End Network Initialization

// Init the ID, state variables and properties for instance temp
temp_var.active = true;
temp_var.id_HW = add_instance( (void*) &temp_var);
temp_var.AirConditionner_Temperature_State = AIRCONDITIONNER_TEMPERATURE_GREETINGS_STATE;

AirConditionner_Temperature_OnEntry(AIRCONDITIONNER_TEMPERATURE_STATE, &temp_var);
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
    
    initialize_configuration_myAirConditionner();

    while (1) {
        
// Network Listener// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
emptyEventConsumed += AirConditionner_handle_empty_event(&temp_var);
}

        processMessageQueue();
  }
}