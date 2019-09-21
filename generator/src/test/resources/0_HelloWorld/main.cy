thing hello import "device1.thingml" 

user myuser

channel:pubsub pubsub1 {
	topic topic1(m:JSON)
}

policy myPolicy {
	rule hello deny:receive myuser
}

network helloNetwork {
	domain org.hello
	enforce myPolicy override-allow
	instance helloInst:hello platform POSIX owner myuser
	instance myPubsub1:pubsub1 protocol MQTT(server="mqtt.eclipse.org:1883")
	bind helloInst.myport => myPubsub1{topic1}
}