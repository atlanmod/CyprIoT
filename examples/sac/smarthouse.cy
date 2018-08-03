// Role Declaration
role:sensor
role:actuator
role:actor

// Users declaration
user:cityUser
	assigned actor,actuator

user:anyuser
	assigned actor

// Devices declaration
thing:LightSensor 
	assigned sensor,actuator
	import "light_sensor.thingml"

thing:Temperature
	assigned sensor,actuator
	import "temperature_sensor.ino"
	
thing:Computer 
	assigned actuator
	import "computer.thingml"
		
// Communication channels declaration
channel:reqrep Central {
	endpoint speed
}

channel:pubsub Broker {
	topic room1 
	topic light subtopicOf room1
}

channel:pubsub CommandBroker {
	topic realTimeCommand
}

//STLS Network Configuration
network stlsNetwork {
	instanceThing Computer~gateway owner cityUser
	instanceThing Temperature~car[1] owner anyuser
	instancePubsub Broker~CentralMqtt
	instancePubsub CommandBroker~commandsMqtt
	instanceReqrep Central~rest
	bindPubSub gateway.command <= commandsMqtt{realTimeCommand}
	bindPubSub gateway.cloud => CentralMqtt{room1}
	bindReqRep car.speed => rest.speed
}