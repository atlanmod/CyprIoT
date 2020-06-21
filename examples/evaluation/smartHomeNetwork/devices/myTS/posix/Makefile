# CC = /*CC*/
LIBS = -lpthread -l mosquitto
CFLAGS = -O2 -w
SRCS = myTS.c myTS_Cfg_cfg.c MQTT.c runtime.c
OBJS = myTS.o myTS_Cfg_cfg.o MQTT.o runtime.o

all : myTS_Cfg

.c.o :
	${CC} ${CFLAGS} -c $< 

.cpp.o :
	${CC} ${CFLAGS} -c $< 

myTS_Cfg : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm

clean:
	rm -f *.o *~ myTS_Cfg
