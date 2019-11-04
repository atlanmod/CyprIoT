thing temperatureSensor import "device1.thingml"
thing nodered

user ok

time daily: * * * * * *

policy myPolicy {
	rule temperatureTemp deny:receive mydevice2
}

channel pubsub1 {
	path switchStateTopic(switchState:JSON)
}

network helloNetwork {
	domain ca.levio.cilstack
	instance temperatureTemp:temperatureSensor platform POSIX
	instance mydevice2:nodered platform NODERED
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind temperatureTemp.sendingPort => myPubsub1{switchStateTopic}
}