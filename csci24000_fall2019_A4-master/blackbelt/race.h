//race.h
#ifndef RACE_H_EXISTS
#define RACE_H_EXISTS
#define NUM_OF_HORSES 5
//a race of horses
#include "horse.h"

class Race{
    private:
        Horse h[NUM_OF_HORSES];
        int length;
    public:
        Race();
        Race(int length);
        void printLane(int horseNum);
        void start();
}; //end class declaration
#endif