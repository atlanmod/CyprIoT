thing device1 import "device1.thingml"
thing device2 import "device2.thingml"

policy myPolicy {
	rule device1 deny:send pubsub1
	rule device1 allow:send device2
}

channel pubsub1 {
	path topic1(m:JSON)
	path topic2(m:JSON)
}

network helloNetwork {
	domain org.hello
	//enforce myPolicy
	instance mydevice1:device1 platform POSIX
	instance mydevice2:device2 platform POSIX
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice1.myport => myPubsub1{topic1}
	bind mydevice1.myport => myPubsub1{topic2}
	bind mydevice2.myport <= myPubsub1{topic1}
}