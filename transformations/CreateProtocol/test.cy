thing thing1 import "thing1.thingml"
channel:pubsub anychannel {
	topic anytopic
}
network anynet {
	domain org.atlanmod
	instance th1:thing1 platform JAVA
	instance ch1:anychannel platform MQTT
	bind th1.port1 => ch1{anytopic}
}