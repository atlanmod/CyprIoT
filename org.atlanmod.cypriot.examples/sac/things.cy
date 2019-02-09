import "users.cy"

// Devices declaration

thing HomeGateway
	assigned sensor, actuator
	import "models/gateway.thingml"
	
thing TemperatureSensor
	assigned sensor
	import "models/temperatureSensor.thingml"

thing SmartLock
	assigned sensor, actuator
	import "models/smartLock.ino"

thing SmartHeather
	assigned actuator
	import "models/smartHeather.thingml"

thing SmartFridge
	assigned sensor, actuator
	import "models/smartFridge.thingml"

thing SmartGlove
	assigned sensor
	import "models/smartGlove.thingml"

thing Phone
	assigned sensor, actuator
	import "models/sarah.thingml"