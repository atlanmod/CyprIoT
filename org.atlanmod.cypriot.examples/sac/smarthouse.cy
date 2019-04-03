import "policies.cy"
import "channels.cy"
import "things.cy"


//Smarthome Network Configuration
network SmarthomeNetwork {
	// Domain of the network
	domain fr.nantes.sarahSmarthome
	
	// Enforcing all policies
	enforce CityPolicy, HomePolicy, ManufacturerPolicy override-deny

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
	bind ts => zigbeeHomeNodes.temperature
	bind sl => zigbeeHomeNodes.lock
	bind sh => zigbeeHomeNodes.heater
	bind sf => zigbeeHomeNodes.fridge
	bind sg => zwaveHomeNodes.gloveSensor
	
	// Binding all ConnectionPoint to the gateway in a star fashion
	bind gateway.zigbeePort <= zigbeeHomeNodes.all
	bind gateway.zwavePort <= zwaveHomeNodes.gloveSensor
	bind gateway.upnpPort <= upnpHomeNodes.anyUpnpDevice
	
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