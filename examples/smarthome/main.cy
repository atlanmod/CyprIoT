thing smartCar import "smartCar.thingml"
thing motionDetector import "motionDetector.thingml"
thing temperatureSensor import "temperatureSensor.thingml" 
thing airConditionner import "airConditionner.thingml"
thing smartLock import "smartLock.thingml"
thing smartFridge import "smartFridge.thingml"
thing smokeDetector import "smokeDetector.thingml"
thing smartHeather import "smartHeather.thingml"
thing centralMonitor import "centralMonitor.thingml"

user alice:"alicePass"
user bob:"bobPass"

policy myPolicy {
	rule temperatureSensor->state:isHigh trigger:goToState airConditionner->state:isOn
}

channel pubsub1 {
	path topic1 = "Mytopic"(m:JSON)
	path topic2(m:JSON)
}

network helloNetwork {
	domain org.hello
	enforce myPolicy
	instance mydevice1:temperatureSensor platform POSIX owner alice
	instance mydevice2:airConditionner platform POSIX owner bob
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind mydevice2.myport <= myPubsub1{topic1}
	bind mydevice1.myport => myPubsub1{topic1,topic2}

}