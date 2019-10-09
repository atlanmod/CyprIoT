thing device1 import "device1.thingml"
thing device2 import "device2.thingml"

role myRole
user myUser:"myPass"

policy myPolicy {
	rule device1 deny:send pubsub1 // Simple
	rule device1 deny:send topic1 // Simple
	rule device1 deny:send device2 // First level : Check if device2 uses same topic than device1, Second level : check whether device2 sends to any device that sends to device1 
	rule device1 deny:receive mydevice2  // deny device to send only to the instance mydevice2 not the type device2
	rule device1->state:HelloState trigger:goToState device2->state:HelloState // on entry device1.HelloState, action send message to device2 to go to device2.HelloState, using the default communication channel
}

channel pubsub1 {
	path topic1(m:JSON)
	path topic2="myTopic"
}

network helloNetwork {
	domain org.hello
	enforce myPolicy
	instance mydevice1:device1 platform POSIX
	instance mydevice2:device2 platform POSIX
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice2.myport <= myPubsub1{topic1}
	bind mydevice1.myport => myPubsub1{topic2}
}