// Devices declaration
thing Thing1 
	import "thing1.thingml"

thing Thing2
	import "thing2.thingml"

thing Thing3
	import "thing3.thingml"
	
channel:pubsub Broker {
	topic topic1
	topic topic2 subtopicOf topic1
	topic topic3 subtopicOf topic1
}

network twoThingsCom {
	domain org.atlanmod
	instance thing1:Thing1 platform CPOSIX
	instance thing2:Thing2 platform JAVA
	instance thing3:Thing3 platform CPOSIX
	instance CentralMqtt:Broker platform MQTT
	bind thing1.command <= CentralMqtt{topic2,topic3}
	bind thing2.command => CentralMqtt{topic2}
	bind thing3.command => CentralMqtt{topic3}
}
