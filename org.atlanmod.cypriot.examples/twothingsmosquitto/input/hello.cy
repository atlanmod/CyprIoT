// Devices declaration
thing Thing1 
	import "thing1.thingml"

thing Thing2
	import "thing2.thingml"
	
channel:pubsub Broker {
	topic topic1 
	topic topic2 subtopicOf topic1
	topic topic3 
}

network twoThingsCom {
	instanceThing Thing1:thing1 @posix
	instanceThing Thing2:thing2 @java
	instancePubsub Broker:CentralMqtt platform MQTT
	bindPubSub thing1.command <= CentralMqtt{topic2,topic3}
	bindPubSub thing2.command => CentralMqtt{topic1}
}
