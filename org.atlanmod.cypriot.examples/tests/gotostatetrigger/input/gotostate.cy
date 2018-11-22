import "policy.cy"

network twoThingsCom {
	domain org.atlanmod
	enforce GoToState
	instance thing1:Thing1 platform CPOSIX
	instance thing2:Thing2 platform JAVA
	instance CentralMqtt:Broker platform MQTT
	bind thing1.command <= CentralMqtt{topic2,topic3}
	bind thing2.command => CentralMqtt{topic2}
}
