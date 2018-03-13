# CC = /*CC*/
LIBS = -lpthread 
CFLAGS = -O2 -w
SRCS = Monitor.c myMonitor_cfg.c runtime.c
OBJS = Monitor.o myMonitor_cfg.o runtime.o

all : myMonitor

.c.o :
	${CC} ${CFLAGS} -c $< 

.cpp.o :
	${CC} ${CFLAGS} -c $< 

myMonitor : $(OBJS)
	$(CC) -o $@ $(OBJS) $(LIBS) -lm

clean:
	rm -f *.o *~ myMonitor
