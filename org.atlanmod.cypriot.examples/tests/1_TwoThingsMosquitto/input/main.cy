// Devices declaration
thing Thing1 
	import "thing1.thingml"

thing Thing2
	import "thing2.thingml"
	
channel:pubsub Broker {
	topic topic1
	topic topic2 subtopicOf topic1
}

network twoThingsCom {
	domain org.atlanmod
	instance thing1:Thing1 platform CPOSIX
	instance thing2:Thing2 platform JAVA
	instance CentralMqtt:Broker platform MQTT
	bind thing1.dataEntryPoint <= CentralMqtt{topic2}
	bind thing2.dataEntryPoint => CentralMqtt{topic1}
}
