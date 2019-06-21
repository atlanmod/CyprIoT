thing hub import "hub.thingml"
thing temperatureSensor import "temperatureSensor.thingml"

channel:pubsub openHabBroker {
	topic temperatureTopic
}


network openhabNetwork {
	domain ca.levio.cilstack.openhab
	instance myHub:hub platform JAVA
	instance sensor:temperatureSensor platform CPOSIX
	instance broker1:openHabBroker platform MQTT
	bind sensor.temperatureData => broker1{temperatureTopic}
	bind myHub.temperaturePort <= broker1{temperatureTopic}
}