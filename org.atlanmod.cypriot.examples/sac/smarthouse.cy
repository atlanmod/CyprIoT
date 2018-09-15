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
	point speed // A changer
}

channel:pubsub Broker {
	topic room1
	topic light subtopicOf room1
}

channel:pubsub CommandBroker {
	topic realTimeCommand
}

policy cityPolicy {
	
}

//STLS Network Configuration
network stlsNetwork {
	enforce cityPolicy
	instance Computer:gateway owner cityUser @posix
	instance Temperature:car[1] owner anyuser @posix
	instance Broker:CentralMqtt platform MQTT
	instance CommandBroker:commandsMqtt platform MQTT
	instance Central:rest platform HTTP
	bind gateway.command <= commandsMqtt{realTimeCommand}
	bind gateway.cloud => CentralMqtt{room1}
	bind car.speed => rest.speed
}