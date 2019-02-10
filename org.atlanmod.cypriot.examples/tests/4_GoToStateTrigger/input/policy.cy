// Devices declaration
thing Thing1 
	import "thing1.thingml"

thing Thing2
	import "thing2.thingml"
	
channel:pubsub Broker {
	topic topic1
	topic topic2 subtopicOf topic1
	topic topic3 subtopicOf topic1
}

policy GoToState {
	rule Thing1 trigger:goToState Thing2.state2 when currentState:Thing1.state2
}