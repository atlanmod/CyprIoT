# CC = /*CC*/
LIBS = -lpthread -l mosquitto
CFLAGS = -O2 -w
SRCS = Temperature.c myTemperature_cfg.c MQTT.c runtime.c
OBJS = Temperature.o myTemperature_cfg.o MQTT.o runtime.o

all : myTemperature

.c.o :
	${CC} ${CFLAGS} -c $< 

.cpp.o :
	${CC} ${CFLAGS} -c $< 

myTemperature : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm

clean:
	rm -f *.o *~ myTemperature
