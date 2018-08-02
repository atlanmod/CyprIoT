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
thing:Trafficlight 
	assigned sensor,actuator
	import "trafficlight.thingml"

thing:Car
	assigned sensor,actuator
	import "car.thingml"
	
thing:Monitor 
	assigned actuator
	import "monitor.ino"
		
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

//Network Configuration
network stlsNetwork {
	instanceThing Monitor~gateway owner cityUser
	instanceThing Car~car[1] owner anyuser
	instancePubsub Broker~CentralMqtt
	instancePubsub CommandBroker~commandsMqtt
	instanceReqrep Central~rest
	bindPubSub gateway.command <= commandsMqtt{realTimeCommand}
	bindPubSub gateway.cloud => CentralMqtt{room1}
	bindReqRep car.speed => rest.speed
}