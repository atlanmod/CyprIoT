thing temperatureSensor import "temperatureSensor.thingml"
thing airConditioner import "airConditioner.thingml"
thing display import "display.thingml"
thing cloudService import "cloudService.thingml"
thing emergencyService import "emergencyService.thingml"

user bob
user alice
user firefighter

channel mqttChannel {
	path samplePath (temperatureSensorMessage:JSON)
}

network smartNetwork {
	domain org.atlanmod.mynetwork
	instance myTS:temperatureSensor platform POSIX owner alice
	instance myAC:airConditioner platform POSIX owner bob
	instance myDisplay:display platform POSIX owner bob
	instance myCloud:cloudService platform POSIX owner bob
	instance myEmergencyService:emergencyService platform POSIX owner firefighter
	instance myMQTT:mqttChannel protocol MQTT(server="mqtt.eclipse.org:1883")
	bind myTS.sendingTemperaturePort => myMQTT{samplePath}
	bind myAC.receivingTemperaturePort <= myMQTT{samplePath}
	bind myDisplay.receivingTemperaturePort <= myMQTT{samplePath}
	bind myCloud.receivingTemperaturePort <= myMQTT{samplePath}
	bind myEmergencyService.receivingTemperaturePort <= myMQTT{samplePath}
}