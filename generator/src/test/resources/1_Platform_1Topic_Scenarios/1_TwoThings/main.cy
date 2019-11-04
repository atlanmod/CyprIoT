thing device1 assigned myRole import "device1.thingml" 
thing device2 assigned myRole2 import "device2.thingml"

role myRole
role myRole2

user myUser:"myPass"
user myUser2:"myPass"

policy myPolicy {
	rule device1->state:HelloState
		trigger:executeFunction device2->function:turnTemperatureTo("20")
	rule pubsub1->path:topic1 bridge:to pubsub1->path:topic2
	rule pubsub1->path:topic1 bridge:to pubsub2->path:topic2
}

channel pubsub1 {
	path topic1 = "Mytopic"(m:JSON)
	path topic2(m:JSON)
}

channel pubsub2 {
	path topic1 = "Mytopic"(m:JSON)
	path topic2(m:JSON)
}


network helloNetwork {
	domain org.hello
	enforce myPolicy
	instance mydevice1:device1 platform POSIX owner myUser
	instance mydevice2:device2 platform POSIX owner myUser2
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	instance myPubsub2:pubsub2 protocol ZIGBEE(server="mqtt.eclipse.org:1883")
	bind myBind: mydevice2.myport <= myPubsub1{topic1} // Add info in bind informing to name it in order to use it in bridge
	bind mydevice1.myport => myPubsub1{topic1,topic2}
	bridge myBind to myPubsub2{topic1,topic2} // Add send action to the transition
}