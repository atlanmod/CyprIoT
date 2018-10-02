// Role Declaration
role actuator

// Devices declaration
thing Thing1 
	assigned actuator
	import "thing1.thingml"
	
channel:pubsub Broker {
	topic topic1 
}

network concreteCodeConfig {
	domain org.name
	instance thing1:Thing1 platform CPOSIX
	instance CentralMqtt:Broker platform MQTT
	bind thing1.command => CentralMqtt{topic1}
}