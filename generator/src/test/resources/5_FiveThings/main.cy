thing device1 import "device1.thingml"
thing device2 import "device2.thingml"
thing device3 import "device3.thingml"
thing device4 import "device4.thingml"
thing device5 import "device5.thingml"

channel:pubsub pubsub1 {
	topic topic1
	topic topic2
}

network helloNetwork {
	domain org.hello
	instance mydevice1:device1 platform CPOSIX
	instance mydevice2:device2 platform CPOSIX
	instance mydevice3:device3 platform CPOSIX
	instance mydevice4:device4 platform CPOSIX
	instance mydevice5:device5 platform CPOSIX
	instance myPubsub1:pubsub1 protocol MQTT
	bind mydevice1.myport => myPubsub1{topic1}
	bind mydevice2.myport <= myPubsub1{topic1}
	bind mydevice3.myport <= myPubsub1{topic1}
	bind mydevice4.myport <= myPubsub1{topic2}
	bind mydevice5.myport => myPubsub1{topic2}
}