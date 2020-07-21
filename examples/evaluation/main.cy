thing temperatureSensor import "temperatureSensor.thingml"
thing airConditioner import "airConditioner.thingml"

channel mqttChannel {
	path samplePath
}

network smartNetwork {
	domain org.atlanmod.mynetwork
	instance myTS:temperatureSensor platform POSIX
	instance myAC:airConditioner platform JAVA
	instance myMQTT:mqttChannel protocol MQTT
	bind myTS.sendingTemperaturePort => myMQTT{samplePath}
	bind myAC.receivingTemperaturePort <= myMQTT{samplePath}
}