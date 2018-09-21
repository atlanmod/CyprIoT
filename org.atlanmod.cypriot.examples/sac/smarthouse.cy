// Role Declaration
role sensor
role actuator
role actor

// Users declaration
user Sarah
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

thing sarahPhone
	assigned sensor, actuator
	import "sarahPhone.thingml"

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
	topic sarahSmarthome
	topic temperatureTopic subtopicOf sarahSmarthome
	topic lockTopic subtopicOf sarahSmarthome
	topic heaterTopic subtopicOf sarahSmarthome
	topic fridgeTopic subtopicOf sarahSmarthome
}

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
	
	// Enforfing all policies
	enforce cityPolicy, homePolicy, manufacturerPolicy

	// Instanciating things
	instance homeGateway:gateway owner Sarah platform PYTHON
	instance temperatureSensor:ts owner Sarah platform CPOSIX
	instance smartLock:sl owner Sarah platform ARDUINO
	instance smartHeather:sh owner Sarah platform JAVA
	instance smartFridge:sf owner Sarah platform CPOSIX
	instance smartGlove:sg owner Mother platform CPOSIX
	instance sarahPhone:sp owner Sarah platform JAVA
	
	// Instanciating channels
	instance broker:privateBroker platform MQTT
	instance zigbeeHomeNodes:zigbeeHomeNodes platform ZIGBEE
	instance zwaveHomeNodes:zwaveHomeNodes platform ZWAVE
	instance zwaveHomeNodes:zwaveHomeNodes platform UPNP
	
	// Binding sensors and actuators to their ConnectionPoint in the smarthome
	bind ts.sensedData => zigbeeHomeNodes.temperature
	bind sl.sensedData => zigbeeHomeNodes.lock
	bind sh.sensedData => zigbeeHomeNodes.heater
	bind sf.sensedData => zigbeeHomeNodes.fridge
	bind sg.sensedData => zigbeeHomeNodes.gloveSensor
	
	// Binding all ConnectionPoint to the gateway in a star fashion
	bind gateway.ZigbeeData <= zigbeeHomeNodes.*
	bind gateway.ZwaveData <= zwaveHomeNodes.gloveSensor
	bind gateway.upnp <= zwaveHomeNodes.anyUpnpDevice
	
	// Monitoring the smarthome from Sarah's phone
	bind sp.fridgeData <= privateBroker{fridgeTopic}
	bind sp.heaterData <= privateBroker{heaterTopic}
	bind sp.lockData <= privateBroker{lockTopic}
	bind sp.temperatureData <= privateBroker{temperatureTopic}
	
	// Bridging data from the gateway to the private broker
	bridge lock to privateBroker{lockTopic}
	bridge fridge to privateBroker{fridgeTopic}
	bridge heater to privateBroker{heaterTopic}
	bridge temperature to privateBroker{temperatureTopic}
	
}