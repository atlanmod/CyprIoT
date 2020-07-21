thing temperatureSensor import "temperatureSensor.thingml"
thing airConditioner import "airConditioner.thingml"

channel mqttChannel {
	path testPath
}

channel mqttChannel2 {
	path forwardPath
}

policy smartPolicy {
	rule myTS->state:isHigh trigger:executeFunction mySAC->function:turnTemperatureTo("25")
	//rule myTS->state:isHigh trigger:goToState mySAC->state:isOn
}
network smartHomeNetwork {
	domain org.atlanmod.smarthome
	enforce smartPolicy
	instance myTS:temperatureSensor platform POSIX
	instance mySAC:airConditioner platform POSIX
	instance myMQTT:mqttChannel protocol MQTT(server="mqtt.atlanmod.org:1883")
	instance myMQTT2:mqttChannel2 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind myTS.sendingTemperaturePort => myMQTT{testPath}
	bind myBind : mySAC.receivingTemperaturePort <= myMQTT{testPath}
	forward myBind to myMQTT2{forwardPath}
}