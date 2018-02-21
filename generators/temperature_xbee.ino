#include <dht.h>

dht DHT;

#define DHT11_PIN 8
#include <SoftwareSerial.h>

SoftwareSerial mySerial(10, 11); // RX, TX

void setup(){
  Serial.begin(9600);
  mySerial.begin(9600);
  mySerial.println("Hello, world?");
}

void loop()
{
  int chk = DHT.read11(DHT11_PIN);
  Serial.print("Temperature = ");
  Serial.println(DHT.temperature);
  Serial.print("Humidity = ");
  Serial.println(DHT.humidity);


 mySerial.print("Temperature = ");
  mySerial.println(DHT.temperature);
  mySerial.print("Humidity = ");
  mySerial.println(DHT.humidity);

  delay(1000);
}
