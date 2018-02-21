#!/usr/bin/env python
import time
import serial
import paho.mqtt.client as mqtt
 
ser = serial.Serial(
 port='/dev/serial0',
 baudrate = 9600,
 parity=serial.PARITY_NONE,
 stopbits=serial.STOPBITS_ONE,
 bytesize=serial.EIGHTBITS,
 timeout=1
)
counter=0
 
mqttc = mqtt.Client('arduino')
mqttc.connect('iot.eclipse.org',1883)
 
while 1:
 x=ser.readline()
 print x
 mqttc.publish('room/A246',x)
 mqttc.loop(2)