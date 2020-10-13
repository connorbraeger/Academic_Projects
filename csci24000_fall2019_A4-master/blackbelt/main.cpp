//main.cpp
#include <iostream>
#include <stdlib.h>
#include "race.h"
#include "horse.h"

int main(){
    int seed;
    std::cout << "Please enter a random seed: ";
    std::cin >> seed;
    srand(seed);
    Race race;
    race.start();
    return 0;
}