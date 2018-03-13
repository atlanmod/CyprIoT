/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *      Implementation for Application myMonitor
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
#include "Monitor.h"





/*****************************************************************************
 * Definitions for configuration : myMonitor
 *****************************************************************************/

//Declaration of instance variables
//Instance monitor
// Variables for the properties of the instance
struct Monitor_Instance monitor_var;
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

void initialize_configuration_myMonitor() {
// Initialize connectors


// Network Initialization
// End Network Initialization

// Init the ID, state variables and properties for instance monitor
monitor_var.active = true;
monitor_var.id_HW = add_instance( (void*) &monitor_var);
monitor_var.Monitor_Monitor_State = MONITOR_MONITOR_GREETINGS_STATE;

Monitor_Monitor_OnEntry(MONITOR_MONITOR_STATE, &monitor_var);
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
    
    initialize_configuration_myMonitor();

    while (1) {
        
// Network Listener// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
emptyEventConsumed += Monitor_handle_empty_event(&monitor_var);
}

        processMessageQueue();
  }
}