# CC = /*CC*/
LIBS = -lpthread -l mosquitto
CFLAGS = -O2 -w
SRCS = Monitor.c myMonitor_cfg.c MQTT.c runtime.c
OBJS = Monitor.o myMonitor_cfg.o MQTT.o runtime.o

all : myMonitor

.c.o :
	${CC} ${CFLAGS} -c $< 

.cpp.o :
	${CC} ${CFLAGS} -c $< 

myMonitor : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm

clean:
	rm -f *.o *~ myMonitor
