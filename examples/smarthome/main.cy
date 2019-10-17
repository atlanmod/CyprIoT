thing smartCar import "smartCar.thingml"
thing motionDetector import "motionDetector.thingml"
thing temperatureSensor import "temperatureSensor.thingml" 
thing airConditionner import "airConditionner.thingml"
thing smartLock import "smartLock.thingml"
thing smartFridge import "smartFridge.thingml"
thing smokeDetector import "smokeDetector.thingml"
thing smartHeather import "smartHeather.thingml"
thing centralMonitor import "centralMonitor.thingml"

user myUser:"myPass"
user myUser2:"myPass2"

policy myPolicy {
	rule temperatureSensor->state:HelloState trigger:performTransition airConditionner // on entry device1.HelloState, action send message to device2 to go to device2.HelloState, using the default communication channel
}

channel pubsub1 {
	path topic1 = "Mytopic"(m:JSON)
	path topic2(m:JSON)
}

network helloNetwork {
	domain org.hello
	enforce myPolicy
	instance mydevice1:temperatureSensor platform POSIX owner myUser
	instance mydevice2:airConditionner platform POSIX owner myUser2
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice2.myport <= myPubsub1{topic1}
	bind mydevice1.myport => myPubsub1{topic1,topic2}

}