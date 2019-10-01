thing A import "a.thingml"

user a
channel:pubsub a {
	topic a(m:JSON)
}

network helloNetwork {
	domain a.a.a
	instance A:A platform POSIX owner a
	instance a:a protocol MQTT(server="mqtt.eclipse.org:1883")
	bind A.a => a{a}
}