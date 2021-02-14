thing temperatureSensor import "temperatureSensor.thingml" assigned sensor
thing airConditioner import "airConditioner.thingml" assigned actuator
thing remoteDisplay import "remoteDisplay.thingml"
thing securityCamera import "securityCamera.thingml" assigned sensitive
thing lightSensor import "lightSensor.thingml"
thing smartLight import "smartLight.thingml"
thing gateway import "gateway.thingml"

role sensitive
role sensor
role actuator

policy myPolicy {
	rule temperatureSensor deny:send airConditioner              s
	rule temperatureSensor allow:send actuator                    s
}



	//rule temperatureSensor->state:isHigh trigger:executeFunction airConditionner->function:turnTemperatureTo("20")
	//rule myTemperatureSensor deny:send myAirConditionner
	//rule temperatureSensor->state:isHigh trigger:goToState airConditionner->state:isOn
	//rule temperatureSensor->state:isHigh trigger:goToState car->state:isOff
	//rule temperatureSensor->state:isLow trigger:goToState airConditionner->state:isOff
	//rule myPubsub1->path:topic2 bridge:to pubsub1->path:topic1 // Ok when path are on the same channel not instance


policy commControlPolicy {
	rule myAirConditioner deny:send room1LightSensor	
}

channel temperatureChannel {
	path sensedTemperature (temperatureSensorMessage:JSON)
}

channel bridgeChannel {
	path sensedTemperature (temperatureSensorMessage:JSON)
	path rooms
	path sensedLightRoom1 (lightSensorMessage:JSON) subpathOf rooms
	path sensedLightRoom2 (lightSensorMessage:JSON) subpathOf rooms
	path logs = "logs"
}

channel lightChannel {
	path sensedLight (lightSensorMessage:JSON)
}

user user1

network smartHomeNetwork {
	domain org.atlanmod.smarthome
	instance myAirConditioner:airConditioner platform POSIX 
	instance myTemperature:temperatureSensor platform POSIX
	instance myGateway:gateway platform ARDUINO
	instance myRemoteDisplay:remoteDisplay platform JAVASCRIPT
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
	bind sensedTemperature : myGateway.temperaturePort <= myZigbeeChannel{sensedTemperature}
	bind room1LightSensor.sendingSensedLightPort => myLightChannel1{sensedLight}
	bind sensedLightInRoom1 : room1SmartLight.receivingSensedLightPort <= myLightChannel1{sensedLight}
	bind room2LightSensor.sendingSensedLightPort => myLightChannel2{sensedLight}
	bind sensedLightInRoom2 : room2SmartLight.receivingSensedLightPort <= myLightChannel2{sensedLight}
	forward sensedTemperature to myMQTTChannel{sensedTemperature,logs}
	forward sensedLightInRoom1 to myMQTTChannel{sensedLightRoom1,logs}
	forward sensedLightInRoom2 to myMQTTChannel{sensedLightRoom2,logs}
	bind myRemoteDisplay.receivingTemperaturePort <= myMQTTChannel{sensedTemperature}
	bind myRemoteDisplay.receivingSensedLightPort <= myMQTTChannel{sensedLightRoom1}
	bind myRemoteDisplay.receivingSensedLightPort <= myMQTTChannel{sensedLightRoom2}
}