# CC = /*CC*/
LIBS = -lpthread -l mosquitto
CFLAGS = -O2 -w
SRCS = mySAC.c mySAC_Cfg_cfg.c MQTT.c runtime.c
OBJS = mySAC.o mySAC_Cfg_cfg.o MQTT.o runtime.o

all : mySAC_Cfg

.c.o :
	${CC} ${CFLAGS} -c $< 

.cpp.o :
	${CC} ${CFLAGS} -c $< 

mySAC_Cfg : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm

clean:
	rm -f *.o *~ mySAC_Cfg
