thing device1 import "device1.thingml"
thing device2 import "device2.thingml"

user myuser

channel:pubsub pubsub1 {
	topic topic1(m:JSON)
	topic topic2(m:JSON)
}

policy myPolicy {
	rule enf: device2 deny:send pubsub1
}

policy myPolicy2 {
	rule enf: device2 allow:receive pubsub1
}

network helloNetwork {
	domain org.hello
	enforce myPolicy,myPolicy2
	instance mydevice1:device1 platform POSIX owner myuser
	instance mydevice2:device2 platform POSIX owner myuser
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice2.myport <= myPubsub1{topic1,topic2}
	bind mydevice1.myport => myPubsub1{topic1}
}