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

policy myPolicy {
	//rule bob deny:receive org.atlanmod.* when 
}

network smartHomeCfg {
	
	// Identifying the nerwork
	domain org.atlanmod.smarthome
	
	// Declaration of the gateway
	instance gateway:Gateway platform PYTHON
	
	// Declaration of things
	instance temperatureSensor:TemperatureSensor platform CPOSIX
	instance airConditionnner:AirConditionnner platform JAVA
	instance heater:Heater platform JAVA
	instance lightSwitch:LightSwitch platform CPOSIX
	instance smartLock:SmartLock platform CPOSIX
	instance interface:Interface platform JS
	
	// Declaration of channels
	instance mqttBroker:MQTTBroker platform MQTT
	instance manufacturerPoint:HTTPManufacturerPoint platform HTTP
	
	// Binding things' ports to channels
	bind temperatureSensor.SendingTemperaturePort => mqttBroker{temperatureReading}
	bind airConditionnner.ReceivingTemperaturePort <= mqttBroker{temperatureReading}
	bind heater.ReceivingTemperaturePort <= mqttBroker{temperatureReading}
	bind interface.ReadingTemperaturePort <= mqttBroker{temperatureReading}
	
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