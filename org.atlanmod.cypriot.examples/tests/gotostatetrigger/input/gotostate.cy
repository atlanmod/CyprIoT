// Role Declaration
role sensor
role actuator

// Devices declaration
thing Thing1 
	assigned actuator
	import "thing1.thingml"

thing Thing2
	assigned sensor
	import "thing2.thingml"
	
channel:pubsub Broker {
	topic topic1 
	topic light subtopicOf topic1
}

policy GoToState {
	rule Thing1 trigger:goToState Thing2.state2 when currentState:Thing1.state2
}

network twoThingsCom {
	domain org.domainname
	enforce GoToState
	instance thing1:Thing1 platform CPOSIX
	instance thing2:Thing2 platform JAVA
	instance CentralMqtt:Broker platform MQTT
	bind thing1.command => CentralMqtt{light}
	bind thing2.command <= CentralMqtt{light}
}