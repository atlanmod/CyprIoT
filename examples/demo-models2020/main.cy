thing temperatureSensor import "temperatureSensor.thingml"
thing airConditioner import "airConditioner.thingml"

user bob
user alice

channel mqttChannel {
	path samplePath
}

network smartNetwork {
	domain org.atlanmod.mynetwork
	instance myTS:temperatureSensor platform POSIX owner alice
	instance myAC:airConditioner platform POSIX owner bob
	instance myMQTT:mqttChannel protocol MQTT(server="mqtt.eclipse.org:1883")
	bind myTS.sendingTemperaturePort => myMQTT{samplePath}
	bind myAC.receivingTemperaturePort <= myMQTT{samplePath}
}