channel:pubsub Broker {
	topic smarthome
	topic temperatureTopic subtopicOf smarthome
	topic lockTopic subtopicOf smarthome
	topic heaterTopic subtopicOf smarthome
	topic fridgeTopic subtopicOf smarthome
}

// Channels declaration	
channel:ptp ZigbeeHomeNodes {
	ConnectionPoint temperature
	ConnectionPoint lock
	ConnectionPoint heater
	ConnectionPoint fridge
	ConnectionPoint all
}

channel:ptp Manufacturer {
	ConnectionPoint smartHomeState
}

channel:ptp FoodStore {
	ConnectionPoint isFoodMissing
}

channel:ptp ZwaveHomeNodes {
	ConnectionPoint gloveSensor
}

channel:ptp UpnpHomeNodes {
	ConnectionPoint anyUpnpDevice
}