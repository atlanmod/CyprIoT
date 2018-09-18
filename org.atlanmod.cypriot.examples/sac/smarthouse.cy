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
		
channel:ptp Central {
	ConnectionPoint speed
}

channel:pubsub Broker {
	topic room1
	topic light subtopicOf room1
	topic speed
}

channel:pubsub CommandBroker {
	topic realTimeCommand
}

policy cityPolicy {
	
}

policy homePolicy {
	
}

policy govPolicy {
	
}

//STLS Network Configuration
network stlsNetwork {
	enforce cityPolicy, homePolicy, govPolicy
	instance Computer:gateway owner cityUser platform POSIX
	instance Temperature:car owner anyuser platform JAVA
	instance Broker:CentralMqtt platform MQTT
	instance CommandBroker:commandsMqtt platform MQTT
	instance Central:rest platform HTTP
	bind gateway.command <= commandsMqtt{realTimeCommand}
	bind gateway.cloud => CentralMqtt{room1}
	bind speed car.speed => rest.speed
	bridge speed to CentralMqtt{speed}
}