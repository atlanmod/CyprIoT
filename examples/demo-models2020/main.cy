thing temperatureSensor import "temperatureSensor.thingml"
thing airConditioner import "airConditioner.thingml"
//thing display import "display.thingml"
//thing cloudService import "cloudService.thingml"
//thing emergencyService import "emergencyService.thingml"

user bob
user alice
user firefighter

//policy myPolicy {
//	rule bob deny:send alice
//	rule airConditioner->state:recState trigger:goToState temperatureSensor->state:isSensing
//}

channel mqttChannel {
	path samplePath (temperatureSensorMessage:JSON)
}

network smartNetwork {
	domain org.atlanmod.mynetwork
	//enforce myPolicy
	instance myTS:temperatureSensor platform POSIX owner alice
	instance myAC:airConditioner platform POSIX owner bob
	//instance myDisplay:display platform POSIX owner bob
	//instance myCloud:cloudService platform POSIX owner bob
	//instance myEmergencyService:emergencyService platform POSIX owner firefighter
	instance myMQTT:mqttChannel protocol MQTT(server="broker.hivemq.com:1883")
	bind myTS.sendingTemperaturePort => myMQTT{samplePath}
	bind myAC.receivingTemperaturePort <= myMQTT{samplePath}
	//bind myDisplay.receivingTemperaturePort <= myMQTT{samplePath}
	//bind myEmergencyService.receivingTemperaturePort <= myMQTT{samplePath}
}