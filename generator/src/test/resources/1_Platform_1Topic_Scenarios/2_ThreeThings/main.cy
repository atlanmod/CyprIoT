thing device1 import "device1.thingml"
thing device2 import "device2.thingml"
thing device3 import "device3.thingml"

channel:pubsub pubsub1 {
	topic topic1(m:JSON)
}

network helloNetwork {
	domain org.hello
	instance mydevice1:device1 platform POSIX
	instance mydevice2:device2 platform POSIX
	instance mydevice3:device3 platform POSIX
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice1.receiveInfo <= myPubsub1{topic1}
	bind mydevice2.sendInfo => myPubsub1{topic1}
	bind mydevice3.sendInfo => myPubsub1{topic1}
}