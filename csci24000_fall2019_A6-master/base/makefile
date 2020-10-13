CC = g++
CFLAGS = -g -Wall
heapStudents: main.o date.o student.o address.o
	$(CC) $(CFLAGS) main.o date.o student.o address.o -o heapStudents
main.o: main.cpp date.h student.h address.h 
	$(CC) $(CFLAGS) -c main.cpp
student.o: student.cpp date.h student.h address.h
	$(CC) $(CFLAGS) -c student.cpp
date.o: date.cpp date.h
	$(CC) $(CFLAGS) -c date.cpp
address.o: address.cpp address.h 
	$(CC) $(CFLAGS) -c address.cpp
clean: 
	rm *.o
	rm heapStudents
run: heapStudents
	./heapStudents
valgrind:
	valgrind --tool=memcheck --leak-check=yes --show-reachable=yes --num-callers=20 --track-fds=yes ./heapStudents	