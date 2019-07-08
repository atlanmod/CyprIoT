thing server import "thing1.thingml"
thing thing2 import "thing2.thingml"

channel:pubsub openHabBroker {
	topic topic1
}

network openhabNetwork {
	domain ca.levio.cilstack.openhab
	instance myThing1:server platform JAVA
	instance myThing2:thing2 platform CPOSIX
	instance broker1:openHabBroker platform MQTT
	bind myThing1.portProduce => broker1{topic1}
	bind myThing2.portConsume <= broker1{topic1}
}