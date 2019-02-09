import "users.cy"

// Devices declaration

thing HomeGateway
	assigned sensor, actuator
	import "gateway.thingml"
	
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
	import "sarah.thingml"