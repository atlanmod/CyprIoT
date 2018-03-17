#include "MQTT.h"

const char *MQTT_topics[3] = {
    "fr/imt/dapi/roomA246/room1",
    "fr/imt/dapi/roomA246/room2",
    "ThingML"
};
int MQTT_topics_subscribed[3];

const int MQTT_qos = 1;

struct mosquitto *MQTT_mosq = NULL;

// Callback declarations
void MQTT_log_callback(struct mosquitto *, void *, int , const char *);
void MQTT_connect_callback(struct mosquitto *, void *, int);
void MQTT_subscribe_callback(struct mosquitto *, void *, int , int , const int *);
void MQTT_message_callback(struct mosquitto *, void *, const struct mosquitto_message *);

// Setup
void MQTT_setup(struct MQTT_Instance *_instance)
{
    const char *host = "localhost";
    int port = 1883;
    const char *client_id = "fr.imt.dapi.roomA246.5665464";
    const char *username = "fr.imt.dapi.roomA246.5665464";
    const char *password = "instanceTemp123";
    const char *will_topic = NULL;
    const char *will_string = NULL;

    // Initialise
    //printf("[MQTT] Initialising MQTT at %s:%i\n", host, port);
    mosquitto_lib_init();
    MQTT_mosq = mosquitto_new(client_id, true, _instance);
    if (!MQTT_mosq) {
        perror("[MQTT] mosquitto_new failed ");
        exit(1); // Exit in case of error
        return;
    }

    // Set username and password
    if (password && !username) fprintf(stderr, "[MQTT] Warning: Not using password since username is not set.\n");
    if (username && !password) fprintf(stderr, "[MQTT] Warning: Not using username since password is not set.\n");
    if (username && password && mosquitto_username_pw_set(MQTT_mosq, username, password)) {
        fprintf(stderr, "[MQTT] mosquitto_username_pw_set failed\n");
        exit(1); // Exit in case of error
        return;
    }

    // Set callbacks
    mosquitto_log_callback_set(MQTT_mosq, MQTT_log_callback);
    mosquitto_connect_callback_set(MQTT_mosq, MQTT_connect_callback);
    mosquitto_subscribe_callback_set(MQTT_mosq, MQTT_subscribe_callback);
    mosquitto_message_callback_set(MQTT_mosq, MQTT_message_callback);

    // Set will
    if (will_string && !will_topic) fprintf(stderr, "[MQTT] Warning: Not setting will since will_topic is not set.\n");
    if (will_string && will_topic && mosquitto_will_set(MQTT_mosq, will_topic, strlen(will_string), will_string, MQTT_qos, false)) {
        fprintf(stderr, "[MQTT] mosquitto_will_set failed\n");
        exit(1); // Exit in case of error
        return;
    }

    // Connect to broker
    int result = mosquitto_connect(MQTT_mosq, host, port, 10);
    if (result == MOSQ_ERR_ERRNO) {
        perror("[MQTT] mosquitto_connect failed ");
        exit(1); // Exit in case of error
    }
    else if (result) {
        fprintf(stderr, "[MQTT] mosquitto_connect failed : %s\n", mosquitto_strerror(result));
        exit(1); // Exit in case of error    
    }

    if (result) MQTT_mosq = NULL;
}

// Threaded execution and polling functions
void MQTT_start_receiver_thread() {
    int result = mosquitto_loop_forever(MQTT_mosq, -1, 1);

    if (result == MOSQ_ERR_ERRNO) {
        perror("[MQTT] mosquitto_loop_forever_failed ");
    }
    else if (result) {
        fprintf(stderr, "[MQTT] mosquitto_connect failed : %s\n", mosquitto_strerror(result));
    }

	mosquitto_destroy(MQTT_mosq);
	MQTT_mosq = NULL;
	mosquitto_lib_cleanup();
    exit(1); // Exit in case of error
}

void MQTT_loop_poll() {
	if (MQTT_mosq) {
        int result = mosquitto_loop(MQTT_mosq, 0, 1);

        if (result == MOSQ_ERR_ERRNO) {
            perror("[MQTT] mosquitto_loop_forever_failed ");
        }
        else if (result) {
            fprintf(stderr, "[MQTT] mosquitto_connect failed : %s\n", mosquitto_strerror(result));
        }

        if (result) {
            mosquitto_destroy(MQTT_mosq);
            MQTT_mosq = NULL;
            mosquitto_lib_cleanup();
            exit(1); // Exit in case of error
        }
    }
}

// Logging
void MQTT_log_callback(struct mosquitto *mosq, void *_instance, int level, const char *str)
{
    //printf("[MQTT] %s\n", str);
}

// On connected
void MQTT_connect_callback(struct mosquitto *mosq, void *_instance, int result)
{
    int ret, i;
    switch (result) {
        case 0:
            for (i = 0; i < 3; i++) {
                ret = mosquitto_subscribe(mosq, &MQTT_topics_subscribed[i], MQTT_topics[i], MQTT_qos);
                if (ret) {
                    fprintf(stderr, "[MQTT] mosquitto_subscribe failed for %s : %s\n", MQTT_topics[i], mosquitto_strerror(result));
                    exit(1); // Exit in case of error
                }
            }
            break;
        case 1:
            //fprintf(stderr, "[MQTT] Connection error : unacceptable protocol version\n");
            exit(1); // Exit in case of error
            break;
        case 2:
            //fprintf(stderr, "[MQTT] Connection error : identifier rejected\n");
            exit(1); // Exit in case of error
            break;
        case 3:
            //fprintf(stderr, "[MQTT] Connection error : broker unavailable\n");
            exit(1); // Exit in case of error
            break;
        default:
            //fprintf(stderr, "[MQTT] Connection error : unknown reason\n");
            exit(1); // Exit in case of error
            break;
    }
}

// On subscribed
void MQTT_subscribe_callback(struct mosquitto *mosq, void *_instance, int mid, int qos_count, const int *granted_qos)
{
    int print = false, i;
    //print = true;
    if (print) {
        // Find subscribed topic
        for (i = 0; i < 3; i++) {
            if (MQTT_topics_subscribed[i] == mid) break;
        }
        printf("[MQTT] Subscribed to topic '%s' - QoS levels ", MQTT_topics[i]);
        for (i = 0; i < qos_count; i++) printf("%i ",granted_qos[i]);
        printf("\n");
    }
    for (i = 0; i < qos_count; i++)
        if (granted_qos[i] == MQTT_qos) return;

    for (i = 0; i < 3; i++) {
        if (MQTT_topics_subscribed[i] == mid) break;
    }
    //fprintf(stderr, "[MQTT] Topic '%s' was not granted the specified QoS level\n", MQTT_topics[i]);
}

/* ---------- INCOMMING MESSAGES ----------*/
void MQTT_parser(uint8_t *msg, int size, struct MQTT_Instance *_instance) {
CNoneSerializerPlugin() is a dummy serializer whos content not shall be used

}

void MQTT_message_callback(struct mosquitto *mosq, void *_instance, const struct mosquitto_message *msg)
{
    //printf("[MQTT] Received message (%i bytes) on topic %s\n", msg->payloadlen, msg->topic);
    // Find the topic index of the message
    int i;
    for (i = 0; i < 3; i++)
        if (strcmp(msg->topic, MQTT_topics[i]) == 0) break;

    // Only parse and enqueue the message if we are listening for it on this topic
    if (i < 3 && (i == 2)) {
        MQTT_parser(msg->payload, msg->payloadlen, (struct MQTT_Instance*)_instance);
    }
}


/* ---------- FORWARDERS ----------*/
void MQTT_send_message(uint8_t *msg, int msglen, int topic)
{
    int ret;
    if (topic < 3) {
        //printf("[MQTT] Sending message (%i bytes) on topic %s\n", msglen, MQTT_topics[topic]);
        ret = mosquitto_publish(MQTT_mosq, NULL, MQTT_topics[topic], msglen, msg, MQTT_qos, false);
        if (ret) {
            fprintf(stderr, "[MQTT] mosquitto_publish failed for %s : %s\n", MQTT_topics[topic], mosquitto_strerror(ret));
            exit(1); // Exit in case of error
        }
    }
}

// Forwarding of messages MQTT::Temperature::inout::sendTemp
void forward_MQTT_Temperature_send_inout_sendTemp(struct Temperature_Instance *_instance, int mess){
CNoneSerializerPlugin() is a dummy serializer whos content not shall be used

    // Publish the serialized message
    MQTT_send_message(buffer, Error, 0);
    MQTT_send_message(buffer, Error, 1);
    MQTT_send_message(buffer, Error, 2);
}


