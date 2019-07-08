thing thing1 import "thing1.thingml"
thing thing2 import "thing2.thingml"
thing thing3 import "thing3.thingml"
thing thing4 import "thing4.thingml"

channel:pubsub myChannel {
	topic topic1
	topic topic2 = "myCustomTopic"
}

network network1 {
	domain org.atlanmod.cypriot.example2
	instance myThing1:thing1 platform CPOSIX
	instance myThing2:thing2 platform CPOSIX
	instance myThing3:thing3 platform CPOSIX
	instance myThing4:thing4 platform CPOSIX
	instance mychannel1:myChannel platform MQTT
	bind myThing1.portProduce => mychannel1{topic1}
	bind myThing3.portConsume <= mychannel1{topic1}
	bind myThing4.portConsume <= mychannel1{topic1}
	bind myThing2.portConsume <= mychannel1{topic2}
}