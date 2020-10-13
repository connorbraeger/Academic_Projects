//horse.cpp
#include <iostream>
#include "horse.h"
#include <stdlib.h>
Horse::Horse(){
    Horse::position = 0;
}//end constructor

void Horse::advance(){
    if(rand()%2==1){
                Horse::position++;}
}//end advance
int Horse::getPosition(){
    return Horse::position;
}//end horse position

