thing temperatureSensor import "temperatureSensor.thingml"
thing airConditioner import "airConditioner.thingml"
thing remoteDisplay import "remoteDisplay.thingml"
thing securityCamera import "securityCamera.thingml"
thing lightSensor import "lightSensor.thingml"
thing smartLight import "smartLight.thingml"
thing gateway import "gateway.thingml"

policy smartPolicy {
	//rule temperatureSensor->state:isHigh trigger:executeFunction airConditionner->function:turnTemperatureTo("20")
	//rule myTemperatureSensor deny:send myAirConditionner
	//rule temperatureSensor->state:isHigh trigger:goToState airConditionner->state:isOn
	//rule temperatureSensor->state:isHigh trigger:goToState car->state:isOff
	//rule temperatureSensor->state:isLow trigger:goToState airConditionner->state:isOff
	//rule myPubsub1->path:topic2 bridge:to pubsub1->path:topic1 // Ok when path are on the same channel not instance
}

channel temperatureChannel {
	path sensedTemperature (temperatureSensorMessage:JSON)
}

channel bridgeChannel {
	path sensedTemperature (temperatureSensorMessage:JSON)
	path sensedLight (lightSensorMessage:JSON)
}

channel lightChannel {
	path sensedLight (lightSensorMessage:JSON)
}

network smartHomeNetwork {
	domain org.hello 
	instance myAirConditioner:airConditioner platform POSIX
	instance myTemperature:temperatureSensor platform POSIX
	instance myGateway:gateway platform POSIX
	instance myRemoteDisplay:remoteDisplay platform POSIX
	instance room1LightSensor:lightSensor platform POSIX
	instance room2LightSensor:lightSensor platform POSIX
	instance room1SmartLight:smartLight platform POSIX
	instance room2SmartLight:smartLight platform POSIX
	instance myZigbeeChannel:temperatureChannel protocol ZIGBEE
	instance myLightChannel1:lightChannel protocol ZIGBEE
	instance myLightChannel2:lightChannel protocol ZIGBEE
	instance myMQTTChannel:bridgeChannel protocol MQTT
	bind myTemperature.sendingTemperaturePort => myZigbeeChannel{sensedTemperature}
	bind myAirConditioner.receivingTemperaturePort <= myZigbeeChannel{sensedTemperature}
	bind sensedTemperature : myGateway.receivingTemperaturePort <= myZigbeeChannel{sensedTemperature}
	bind room1LightSensor.sendingSensedLightPort => myLightChannel1{sensedLight}
	bind sensedLightInRoom1 : room1SmartLight.receivingSensedLightPort <= myLightChannel1{sensedLight}
	bind room2LightSensor.sendingSensedLightPort => myLightChannel2{sensedLight}
	bind room2SmartLight.receivingSensedLightPort <= myLightChannel2{sensedLight}
	bridge sensedTemperature to myMQTTChannel{sensedTemperature}
	bridge sensedLightInRoom1 to myMQTTChannel{sensedLight}
	bind myRemoteDisplay.receivingTemperaturePort <= myMQTTChannel{sensedTemperature}
	bind myRemoteDisplay.receivingSensedLightPort <= myMQTTChannel{sensedLight}
}