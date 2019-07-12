// Role Declaration
role sensor
role actuator
role actor

// Devices declaration
thing Thing1 
	assigned sensor,actuator
	import "thing1.thingml"

thing Thing2
	assigned sensor,actuator
	import "thing2.thingml"
	
channel:pubsub Broker {
	topic topic1 
	topic light subtopicOf topic1
}

network twoThingsCom {
	instanceThing thing1:Thing1 platform POSIX
	instanceThing thing2:Thing2 platform JAVA
	instancePubsub CentralMqtt:Broker platform MQTT
	bind thing1.command => CentralMqtt{light}
	bind thing2.command <= CentralMqtt{light}
}