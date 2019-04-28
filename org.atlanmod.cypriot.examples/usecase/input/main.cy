role sensor

user bob

// Devices declaration

thing Gateway 
	import "gateway.thingml"

thing TemperatureSensor 
	import "temperature.thingml"

thing AirConditionnner
	import "airconditionner.thingml"
	
thing Heater 
	import "heater.thingml"

thing LightSwitch
	import "lightSwitch.thingml"

thing SmartLock 
	import "smartLock.thingml"

thing Interface
	import "interface.thingml"

thing SmokeSensor
	import "smokeSensor.thingml"

channel:pubsub MQTTBroker {
	topic measurements
	topic temperatureReading subtopicOf measurements
}

channel:ptp HTTPManufacturerPoint {
	ConnectionPoint maintenanceAlert
}

channel:ptp HTTPFoodStore {
	ConnectionPoint remainingMilk
}

channel:ptp CoAPFireFighter {
	ConnectionPoint alert
}

network smartHomeCfg {
	
	// Identifying the nerwork
	domain org.atlanmod.smarthome
	
	enforce myPolicy override-deny
	// Declaration of the gateway
	instance gateway:Gateway platform PYTHON
	
	// Declaration of things
	instance temperatureSensor[3]:TemperatureSensor platform CPOSIX
	instance airConditionnner:AirConditionnner platform JAVA
	instance heater:Heater platform JAVA
	instance lightSwitch:LightSwitch platform CPOSIX
	instance smartLock:SmartLock platform CPOSIX
	instance interface[5]:Interface platform JS
	
	// Declaration of channels
	instance mqttBroker:MQTTBroker platform MQTT
	instance manufacturerPoint:HTTPManufacturerPoint platform HTTP
	
	// Binding things' ports to channels
	bind temperatureSensor.SendingTemperaturePort => mqttBroker{temperatureReading}
	bind airConditionnner.ReceivingTemperaturePort <= mqttBroker{temperatureReading}
	bind heater.ReceivingTemperaturePort <= mqttBroker{temperatureReading}
	//bind interface.ReadingTemperaturePort <= mqttBroker{temperatureReading}
	
	// Bridging existing bindings elsewhere
	//bridge ACBinding to mqttBroker{temperatureReading}
}

network emergency {
	domain org.atlanmod.smarthome.emergency
	
	// Declaration of the firefighter point
	instance coapFirefighter:CoAPFireFighter platform COAP
	
	// Declaration of the smokeSensor
	instance smokeSensor:SmokeSensor platform CPOSIX
	
	// Binding the smokeSensor to the firefighter point
	bind smokeSensor.sendingEmergencyPort => coapFirefighter.alert
	
}

policy myPolicy {
	rule airConditionnner deny:receive AirConditionnner
//	rule Gateway->port:ReceivingTemperaturePort deny:send AirConditionnner->port:ReceivingTemperaturePort
//	rule AirConditionnner->state:idleAC deny:receive Gateway->state:idle
//	rule Gateway->port:ReceivingTemperaturePort deny:receive AirConditionnner when Gateway->currentState:idle and AirConditionnner->nextState:workAC
//	rule bob deny:send org.atlanmod.smarthome
//	rule Heater deny:send-receive org.atlanmod.smarthome.emergency
//	
//	rule LightSwitch->port:CommunicatingLightStatePort deny:send org.atlanmod.smarthome
//	rule AirConditionnner->port:ReceivingTemperaturePort allow:send Gateway->port:ReceivingTemperaturePort when AirConditionnner->currentState:idleAC
//	rule TemperatureSensor trigger:goToState AirConditionnner->state:idleAC  
//		when AirConditionnner->message:telemetryMessage.power="12" and AirConditionnner->property:modelAC="Brand"
//	// Any thing of type Heater is allowed to receive from the instance interface when its current State is work
//	rule Heater allow:receive interface when Heater->currentState:work
//	rule AirConditionnner->port:ReceivingTemperaturePort bridge:from manufacturerPoint
//	rule TemperatureSensor->port:SendingTemperaturePort bridge:to AirConditionnner->port:ReceivingTemperaturePort
}