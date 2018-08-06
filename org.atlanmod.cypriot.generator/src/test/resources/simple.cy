// Role Declaration
role:sensor
role:actuator
role:actor

// Devices declaration
thing:Thing1 
	assigned sensor,actuator
	import "thing1.thingml"

thing:Thing2
	assigned sensor,actuator
	import "thing2.thingml"
	
channel:pubsub Broker {
	topic topic1 
	topic light subtopicOf topic1
}

network twoThingsCom {
	instanceThing Thing1~thing1 @posix
	instanceThing Thing2~thing2 @posix
	instancePubsub Broker~CentralMqtt @mqtt
	bindPubSub thing1.command <= CentralMqtt{topic1}
	bindPubSub thing2.command <= CentralMqtt{topic1}
}