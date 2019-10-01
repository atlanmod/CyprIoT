thing device1 import "device1.thingml"
thing device2 import "device2.thingml"

policy myPolicy {
	rule device1 deny:send device2
	rule device1 allow:receive device2
}

channel:pubsub pubsub1 {
	topic topic1(m:JSON)
}

network helloNetwork {
	domain org.hello
	instance mydevice1:device1 platform POSIX
	instance mydevice2:device2 platform POSIX
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice2.myport <= myPubsub1{topic1}
	bind mydevice1.myport => myPubsub1{topic1}
}