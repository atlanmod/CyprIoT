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
thing LightSensor
	assigned sensor,actuator
	import "light_sensor.thingml"

thing Temperature
	assigned sensor,actuator
	import "temperature_sensor.ino"
	
thing gateway 
	assigned actuator
	import "computer.thingml"
		
channel:ptp zigbeeHomeNodes {
	ConnectionPoint temperatureSensor
	ConnectionPoint smartLock
	ConnectionPoint smartHeater
	ConnectionPoint smartFridge
}

channel:ptp zwaveHomeNodes {
	ConnectionPoint gloveSensor
}

channel:ptp upnpHomeNodes {
	ConnectionPoint anyUpnpDevice
}

channel:pubsub broker {
	topic sarahSmarthome
	topic temperatureSensor subtopicOf sarahSmarthome
	topic smartLock subtopicOf sarahSmarthome
	topic smartHeater subtopicOf sarahSmarthome
	topic smartFridge subtopicOf sarahSmarthome
}

policy cityPolicy {
	
}

policy homePolicy {
	
}

policy manufacturerPolicy {
	
}

//STLS Network Configuration
network smarthomeNetwork {
	// Domain of the network
	domain fr.atlanmod.sarahSmarthome.*
	// Enforfing all policies
	enforce cityPolicy, homePolicy, manufacturerPolicy

	// Instanciating things
	instance gateway:homeGateway owner Sarah platform POSIX
	instance Temperature:car owner Sarah platform JAVA
	
	// Instanciating channels
	instance broker:privateBroker platform MQTT
	instance zigbeeHomeNodes:zigbeeHomeNodes platform ZIGBEE
	instance zwaveHomeNodes:zwaveHomeNodes platform ZWAVE
	instance zwaveHomeNodes:zwaveHomeNodes platform UPNP
	
	
	// Binding all ConnectionPoint to the gateway in a star fashion
	bind homeGateway.ZigbeeData <= zigbeeHomeNodes.*
	bind homeGateway.ZwaveData <= zwaveHomeNodes.gloveSensor
	bind homeGateway.ZwaveData <= zwaveHomeNodes.anyUpnpDevice
	
	
	
	// Bridging data to channels
	//bridge speed to privateBroker{speed}
}