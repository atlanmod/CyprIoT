#ifndef MQTT_PosixMQTT_Client_h
#define  MQTT_PosixMQTT_Client_h

#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <ctype.h>
#include <stdint.h>
#include <math.h>
#include <time.h>
#include <mosquitto.h>

#include "Temperature.h"


struct MQTT_Instance {
    uint16_t listener_id;
    /*INSTANCE_INFORMATION*/
};

void MQTT_setup(struct MQTT_Instance *_instance);

void MQTT_start_receiver_thread();
void MQTT_loop_poll();

// Forwarding of messages MQTT::Temperature::temperaturePort::temperatureMessage
void forward_MQTT_Temperature_send_temperaturePort_temperatureMessage(struct Temperature_Instance *_instance, int TemperatureData);


#endif
