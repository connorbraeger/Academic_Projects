//race.cpp
#include "horse.h"
#include "race.h"
#include <iostream>
#include <string>
#include <stdlib.h>
#define DEFAULT_LENGTH 15

Race::Race() {
    Race:: length = 15;
    for (int i= 0; i < NUM_OF_HORSES; i++){
        int percent = rand()%101;
       
        
        h[i] = Horse(percent);
    }
}
Race::Race(int length){
    Race::length = length;
    Race:: length = 15;
    for (int i= 0; i < NUM_OF_HORSES; i++){
        int percent = rand()%101;
          h[i] = Horse(percent);
    }
}
void Race::printLane(int horseNum){

    for (int i = 0; i< Race::length; i++){
        if (i == Race::h[horseNum].getPosition()){
                std::cout<< horseNum; 
            }//end if
            else {
                std::cout<< ".";
            }//end else
        
    }//end for loop
    std::cout<< "\n";
}
void Race::start(){
    bool win = false;
    int winning_num;
    while (win == false){
        for (int horseNum = 0; horseNum < NUM_OF_HORSES; horseNum++){
            if( win == false){
                h[horseNum].advance();
                Race::printLane(horseNum);
                if (Race::h[horseNum].getPosition()== Race::length){
                    win = true;
                    winning_num = horseNum;
                }// end inner if
            }//end outer if
            else{
                Race::printLane(horseNum);
            }//end else
        }//end for
        if (win==false){
            std::cout <<"\n \n";
        }//end if
    
    }//end while loop
    std::cout <<"\nHorse "<< winning_num << " wins!\n";
}


