# CC = /*CC*/
LIBS = -lpthread 
CFLAGS = -O2 -w
SRCS = AirConditionner.c myAirConditionner_cfg.c runtime.c
OBJS = AirConditionner.o myAirConditionner_cfg.o runtime.o

all : myAirConditionner

.c.o :
	${CC} ${CFLAGS} -c $< 

.cpp.o :
	${CC} ${CFLAGS} -c $< 

myAirConditionner : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm

clean:
	rm -f *.o *~ myAirConditionner
