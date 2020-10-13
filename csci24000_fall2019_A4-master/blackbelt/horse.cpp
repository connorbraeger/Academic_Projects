//horse.cpp
#include <iostream>
#include "horse.h"
#include <stdlib.h>
Horse::Horse(){
    Horse::position = 0;
    Horse::percent = 50;
}//end constructor
Horse::Horse(int percent){
    Horse::position = 0;
    Horse::percent = percent;
}
void Horse::advance(){
    if(rand()%100 < Horse::percent){
                Horse::position++;}
}//end advance
int Horse::getPosition(){
    return Horse::position;
}//end horse position
void Horse::setPercent(int new_percent){
    Horse::percent = new_percent;
}

