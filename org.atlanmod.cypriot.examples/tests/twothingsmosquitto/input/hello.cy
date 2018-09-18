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
	instance Thing1:thing1 platform POSIX
	instance Thing2:thing2 platform JAVA
	instance Broker:CentralMqtt platform MQTT
	bind thing1.command <= CentralMqtt{topic2,topic3}
	bind thing2.command => CentralMqtt{topic1}
}
