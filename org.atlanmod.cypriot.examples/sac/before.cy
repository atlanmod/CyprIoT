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

thing HomeGateway
	assigned sensor, actuator
	import "homeGateway.thingml"
	
thing TemperatureSensor
	assigned sensor
	import "temperatureSensor.thingml"

thing SmartLock
	assigned sensor, actuator
	import "smartLock.ino"

thing SmartHeather
	assigned actuator
	import "smartHeather.thingml"

thing SmartFridge
	assigned sensor, actuator
	import "smartFridge.thingml"

thing SmartGlove
	assigned sensor
	import "smartGlove.thingml"

thing Phone
	assigned sensor, actuator
	import "daughterPhone.thingml"

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

// Policy declaration
policy CityPolicy {
	
}

policy HomePolicy {
	
}

policy ManufacturerPolicy {
	
}

//Smarthome Network Configuration
network SmarthomeNetwork {
	// Domain of the network
	domain fr.nantes.sarahSmarthome
	
	// Enforcing all policies
	enforce CityPolicy, HomePolicy, ManufacturerPolicy

	// Instantiating things
	instance gateway: HomeGateway owner Daughter platform PYTHON
	instance ts: TemperatureSensor owner Daughter platform CPOSIX
	instance sl: SmartLock owner Daughter platform ARDUINO
	instance sh: SmartHeather owner Daughter platform JAVA
	instance sf: SmartFridge owner Daughter platform CPOSIX
	instance sg: SmartGlove owner Mother platform CPOSIX
	instance sarahPhone: Phone owner Daughter platform JAVA
	
	// Instantiating channels
	instance privateBroker: Broker platform MQTT
	instance zigbeeHomeNodes:ZigbeeHomeNodes platform ZIGBEE
	instance zwaveHomeNodes:ZwaveHomeNodes platform ZWAVE
	instance upnpHomeNodes:UpnpHomeNodes platform UPNP
	
	// Binding sensors and actuators to their ConnectionPoint in the smarthome
	bind ts.sensedData => zigbeeHomeNodes.temperature
	bind sl.sensedData => zigbeeHomeNodes.lock
	bind sh.sensedData => zigbeeHomeNodes.heater
	bind sf.sensedData => zigbeeHomeNodes.fridge
	bind sg.sensedData => zwaveHomeNodes.gloveSensor
	
	// Binding all ConnectionPoint to the gateway in a star fashion
	bind gateway.ZigbeeData <= zigbeeHomeNodes.*
	bind gateway.ZwaveData <= zwaveHomeNodes.gloveSensor
	bind gateway.upnp <= upnpHomeNodes.anyUpnpDevice
	
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