thing device1 import "device1.thingml"
thing device2 import "device2.thingml"

user myuser1
user myuser2
user myuser3

policy myPolicy {
	rule device1 deny:send device2
}

channel:pubsub pubsub1 {
	topic topic1
}

network helloNetwork {
	domain org.hello
	enforce myPolicy override-deny
	instance mydevice1:device1 platform CPOSIX owner myuser2
	instance mydevice2:device2 platform JS owner myuser3
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883", user=myuser1)
	bind mydevice1.myport => myPubsub1{topic1}
	bind mydevice2.myport <= myPubsub1{topic1}
}