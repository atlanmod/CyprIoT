thing device1 import "device1.thingml"
thing device2 import "device2.thingml"
thing device3 import "device3.thingml"
thing device4 import "device4.thingml"
thing device5 import "device5.thingml"

user myuser1
user myuser2
user myuser3

channel:pubsub pubsub1 {
	topic topic1(m)
}

network helloNetwork {
	domain org.hello
	instance mydevice1:device1 platform CPOSIX owner myuser2
	instance mydevice2:device2 platform JS owner myuser3
	instance mydevice3:device3 platform ARDUINO owner myuser1
	instance mydevice4:device4 platform JAVA owner myuser1
	instance mydevice5:device5 platform CPOSIX owner myuser3
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883", user=myuser1)
	bind mydevice1.myport => myPubsub1{topic1}
	bind mydevice2.myport <= myPubsub1{topic1}
	bind mydevice3.myport <= myPubsub1{topic1}
	bind mydevice4.myport <= myPubsub1{topic1}
	bind mydevice5.myport => myPubsub1{topic1}
}