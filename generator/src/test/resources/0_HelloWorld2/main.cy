thing hello import "device1.thingml"

channel:pubsub pubsub1 {
	topic topic1
}

network helloNetwork {
	domain org.hello
	instance helloInst:hello platform CPOSIX
	instance myPubsub1:pubsub1 protocol MQTT
	bind helloInst.myport <= myPubsub1{topic1}
}