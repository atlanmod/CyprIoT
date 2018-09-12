// Role Declaration
role sensor
role actuator
role actor

// Users declaration
user cityUser
	assigned actor,actuator

user anyuser
	assigned actor

// Devices declaration
thing LightSensor 
	assigned sensor,actuator
	import "light_sensor.thingml"

thing Temperature
	assigned sensor,actuator
	import "temperature_sensor.ino"
	
thing Computer 
	assigned actuator
	import "computer.thingml"
		
// Communication channels declaration
channel:ptp Central {
	endpoint speed // A changer
}

channel:pubsub Broker {
	topic room1
	topic light subtopicOf room1
}

channel:pubsub CommandBroker {
	topic realTimeCommand
}

policy cityPolicy {
	rule thing1 allow send thing2 when ok > 1
}

//STLS Network Configuration
network stlsNetwork {
	enforce cityPolicy
	instanceThing Computer:gateway owner cityUser @posix
	instanceThing Temperature:car[1] owner anyuser @posix
	instancePubsub Broker:CentralMqtt platform MQTT
	instancePubsub CommandBroker:commandsMqtt platform MQTT
	instancePTP Central:rest platform HTTP
	bindPubSub gateway.command <= commandsMqtt{realTimeCommand}
	bindPubSub gateway.cloud => CentralMqtt{room1}
	bindPTP car.speed => rest.speed
}