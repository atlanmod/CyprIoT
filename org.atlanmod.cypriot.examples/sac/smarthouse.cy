// Role Declaration
role sensor
role actuator
role actor

// Users declaration
user Daughter
	assigned actor,actuator

user Mother
	assigned actor

// Devices declaration

thing homeGateway
	assigned sensor, actuator
	import "homeGateway.thingml"
	
thing temperatureSensor
	assigned sensor
	import "temperatureSensor.thingml"

thing smartLock
	assigned sensor, actuator
	import "smartLock.ino"

thing smartHeather
	assigned actuator
	import "smartHeather.thingml"

thing smartFridge
	assigned sensor, actuator
	import "smartFridge.thingml"

thing smartGlove
	assigned sensor
	import "smartGlove.thingml"

thing phone
	assigned sensor, actuator
	import "daughterPhone.thingml"

// Channels declaration	
channel:ptp zigbeeHomeNodes {
	ConnectionPoint temperature
	ConnectionPoint lock
	ConnectionPoint heater
	ConnectionPoint fridge
}

channel:ptp manufacturer {
	ConnectionPoint smartHomeState
}

channel:ptp foodStore {
	ConnectionPoint isFoodMissing
}

channel:ptp zwaveHomeNodes {
	ConnectionPoint gloveSensor
}

channel:ptp upnpHomeNodes {
	ConnectionPoint anyUpnpDevice
}

channel:pubsub broker {
	topic smarthome
	topic temperatureTopic subtopicOf smarthome
	topic lockTopic subtopicOf smarthome
	topic heaterTopic subtopicOf smarthome
	topic fridgeTopic subtopicOf smarthome
}


// Policy declaration
policy cityPolicy {
	
}

policy homePolicy {
	
}

policy manufacturerPolicy {
	
}

//Smarthome Network Configuration
network smarthomeNetwork {
	// Domain of the network
	domain fr.nantes.sarahSmarthome
	
	// Enforcing all policies
	enforce cityPolicy, homePolicy, manufacturerPolicy

	// Instantiating things
	instance gateway: homeGateway owner Daughter platform PYTHON
	instance ts: temperatureSensor owner Daughter platform CPOSIX
	instance sl: smartLock owner Daughter platform ARDUINO
	instance sh: smartHeather owner Daughter platform JAVA
	instance sf: smartFridge owner Daughter platform CPOSIX
	instance sg: smartGlove owner Mother platform CPOSIX
	instance sarahPhone: phone owner Daughter platform JAVA
	
	// Instantiating channels
	instance privateBroker: broker platform MQTT
	instance zigbeeHomeNodes:zigbeeHomeNodes platform ZIGBEE
	instance zwaveHomeNodes:zwaveHomeNodes platform ZWAVE
	instance upnpHomeNodes:upnpHomeNodes platform UPNP
	
	// Binding sensors and actuators to their ConnectionPoint in the smarthome
	bind ts.sensedData => zigbeeHomeNodes.temperature
	bind sl.sensedData => zigbeeHomeNodes.lock
	bind sh.sensedData => zigbeeHomeNodes.heater
	bind sf.sensedData => zigbeeHomeNodes.fridge
	bind sg.sensedData => zwaveHomeNodes.gloveSensor
	
	// Binding all ConnectionPoint to the gateway in a star fashion
	bind gateway.ZigbeeData <= zigbeeHomeNodes.*
	bind gateway.ZwaveData <= zwaveHomeNodes.gloveSensor
	bind gateway.upnp <= zwaveHomeNodes.anyUpnpDevice
	
	// Monitoring the Smarthome from Sarah's phone
	bind sarahPhone.fridgeData <= privateBroker{fridgeTopic}
	bind sarahPhone.heaterData <= privateBroker{heaterTopic}
	bind sarahPhone.lockData <= privateBroker{lockTopic}
	bind sarahPhone.temperatureData <= privateBroker{temperatureTopic}
	
	// Bridging data from the gateway to the private broker
	bridge lock to privateBroker{lockTopic}
	bridge fridge to privateBroker{fridgeTopic}
	bridge heater to privateBroker{heaterTopic}
	bridge temperature to privateBroker{temperatureTopic}
}