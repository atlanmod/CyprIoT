thing onePressButton import "onePressButton.thingml"
thing lightSensor import "lightSensor.thingml"
thing smartLight import "smartLight.thingml"
thing temperatureSensor import "temperatureSensor.thingml"
thing airConditioner import "airConditioner.thingml"
thing heater import "heater.thingml"
thing remoteDisplay import "remoteDisplay.thingml"
thing gateway import "gateway.thingml"

role sensitive
user manufacturer
user bob

// Policies
policy smartPolicy {
	rule roomLightSensor->state:isMedium trigger:goToState roomSmartLight->state:isOn
	rule roomLightSensor->state:isMedium 
			trigger:executeFunction roomSmartLight->function:setIntensity("50")
}

policy commControlPolicy {
	rule myAirConditioner deny:send roomLightSensor
	rule sensitive deny:send manufacturer
}

policy bridgeRule {
	rule temperatureChannel->path:sensedTemperature bridge:to remoteDisplayChannel->path:sensedTemperature
	rule lightChannel->path:sensedLight bridge:to remoteDisplayChannel->path:sensedLightRoom
}

// Channels
channel temperatureChannel {
  path bobSmartHome
  path sensedTemperature (temperatureSensorMessage:JSON) subpathOf bobSmartHome
}

channel lightChannel {
	path sensedLight (lightSensorMessage:JSON)
}

channel remoteDisplayChannel {
	path rooms
	path sensedTemperature (temperatureSensorMessage:JSON) subpathOf rooms
	path sensedLightRoom (lightSensorMessage:JSON) subpathOf rooms
	path logs = "logs"
}

channel manufacturerChannel {
	path maintenanceLogs (logsMessage:JSON)
}

network smartHomeNetwork {
	domain org.atlanmod.smarthome 
	
	// Medium Things
	instance myGateway:gateway platform ARDUINO owner bob
	instance myRemoteDisplay:remoteDisplay platform JAVASCRIPT owner bob
	
	// Sensors and actuators
	instance roomLightSensor:lightSensor platform POSIX owner bob
	instance roomSmartLight:smartLight platform POSIX owner bob
	instance myAirConditioner:airConditioner platform POSIX owner bob 
	instance myTemperature:temperatureSensor platform POSIX owner bob
	instance myHeater:heater platform POSIX owner bob
	
	// Channels
	instance temperatureZigbeeChannel:temperatureChannel protocol ZIGBEE
	instance heaterZigbeeChannel:temperatureChannel protocol ZWAVE
	instance sensedLightZigbeeChannel:lightChannel protocol ZIGBEE
	instance myZigbeeChanel:manufacturerChannel protocol ZIGBEE
	instance myMQTTChannel:remoteDisplayChannel protocol MQTT
	instance myAMQPChanel:manufacturerChannel protocol AMQP
	
	// Receiving sensed information in Gateway 
	bind sensedTemperature : myGateway.temperaturePort <= temperatureZigbeeChannel{sensedTemperature}
	bind logsForManufacturer : myGateway.manufacturerLogsPort <= myZigbeeChanel{maintenanceLogs}
	bind sensedLight : myGateway.sensedLightPort <= sensedLightZigbeeChannel{sensedLight}
	
	// Sending Sensed Light to Smart Light
	bind roomLightSensor.sendingSensedLightPort => sensedLightZigbeeChannel{sensedLight}
	bind roomSmartLight.receivingSensedLightPort <= sensedLightZigbeeChannel{sensedLight}
	
	// Sending Sensed Temperature to Air Conditioner
	bind myTemperature.sendingTemperaturePort => temperatureZigbeeChannel{sensedTemperature}
//	bind myTemperature.manufacturerLogsPort => myZigbeeChanel{maintenanceLogs}
	bind myAirConditioner.receivingTemperaturePort <= temperatureZigbeeChannel{sensedTemperature}
	
	// Receive temperature in Zwave channel
	forward sensedTemperature to heaterZigbeeChannel{sensedTemperature}
	
	// Bridge received sensed temperature in Gateway to an MQTT channel
	forward sensedLight to myMQTTChannel{sensedLightRoom,logs}
	
	// Bridge received sensed light in Gateway to an MQTT channel
	forward sensedTemperature to myMQTTChannel{sensedTemperature,logs}
	
	// Bridge received logs in Gateway to an AMQP channel (Manufacturer)
	forward logsForManufacturer to myAMQPChanel{maintenanceLogs}
	
	// Receiving Sensed Light in Monitor 
	bind myRemoteDisplay.receivingSensedLightPort <= myMQTTChannel{sensedLightRoom}
	
	// Receiving Sensed Temperature in Monitor 
	bind myRemoteDisplay.receivingTemperaturePort <= myMQTTChannel{sensedTemperature}
}