thing hello import "device1.thingml" 

channel:pubsub pubsub1 {
	topic topic1(m:JSON)
	topic topic2(m:JSON)
}

network helloNetwork {
	domain org.hello.world
	instance helloInstance:hello platform POSIX
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind helloInstance.myport => myPubsub1{topic1,topic2}
}