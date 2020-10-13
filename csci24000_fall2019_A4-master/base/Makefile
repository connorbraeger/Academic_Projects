#makefile for horserace 
horseRace: main.o race.o horse.o
	g++ main.o race.o horse.o -o horseRace
main.o: main.cpp horse.h race.h 
	g++ -c main.cpp
race.o: race.cpp race.h horse.h 
	g++ -c race.cpp
horse.o: horse.cpp horse.h 
	g++ -c horse.cpp
clean:
	rm *.o
	rm horseRace
run: horseRace
	./horseRace