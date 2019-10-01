thing device1 import "device1.thingml"
thing device2 import "device2.thingml"

channel:pubsub pubsub1 {
	topic topic1(m:JSON) 
}

network helloNetwork {
	domain org.hello
	instance mydevice1:device1 platform POSIX
	instance mydevice2:device2 platform POSIX
	instance myPubsub1:pubsub1 protocol MQTT
	bind mydevice1.myport => myPubsub1{topic1} => mydevice2.myport
}