#include <SoftwareSerial.h>

SoftwareSerial XBee(2, 3); // RX, TX

void setup() {
	XBee.begin(9600);
	Serial.begin(9600);
}

void loop() {
	if (XBee.available()) { // If data comes in from XBee, send it out to serial monitor
		Serial.write(XBee.read());
	}
}
