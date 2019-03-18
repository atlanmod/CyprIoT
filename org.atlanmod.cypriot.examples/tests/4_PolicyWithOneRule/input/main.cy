role sensor

user bob

// Devices declaration
thing TemperatureSensor 
	import "temperature.thingml"

thing AirConditionnner
	import "airconditionner.thingml"
	
channel:pubsub Broker {
	topic topic1
	topic topic2 subtopicOf topic1
}

policy myPolicy {
	//rule bob deny:receive org.atlanmod.* when 
}

network twoThingsCom {
	domain org.atlanmod.smartheat
	instance thing1:TemperatureSensor platform CPOSIX
	instance thing2:AirConditionnner platform JAVA
	instance CentralMqtt:Broker platform MQTT
	bind thing1.SendingTemperaturePort => CentralMqtt{topic2}
	bind data thing2.ReceivingTemperaturePort <= CentralMqtt{topic2}
	bridge data to CentralMqtt{topic2}
}
