//horse.cpp
//simulates a race between five horses

#include <iostream>
#include <string>
#include <stdlib.h>

//function prototypes
void position();//prints position of horses on track
int check_win();//checks to see if a horse has won the race

int horse_position[5];
int seed;
int main(){
    std::cout << "Please enter a random seed: ";
    std::cin >> seed;
    srand(seed);
    int h;
    for (h=0; h<5; h++){
        horse_position[h]= 0;
    }//end initial horse position for loop
    int win = 0;
    h = 0;
    while (win == 0){
        for (h=0; h<5; h++){
            if(rand()%2==1){
                horse_position[h]++;
            }//end if
           
        }//end for
        position();
        std::cout <<"\n \n";
        win = check_win();

        

    }//end while loop
    return 0;

}
void position(){
    int i;
    for (i = 0; i < 5; i++){
        int z;
        for (z = 0; z < 15; z++){
            if (z == horse_position[i]){
                std::cout<< i; 
            }//end if
            else {
                std::cout<< ".";
            }//end else
        }//end inner for
        std::cout<< "\n"; 
    }//end outer for loop   
}
int check_win(){
    int cond = 0;
    int z;
    for (z = 0; z<5; z++){
        if (horse_position[z]==15){
            std::cout <<"Horse "<< z << " wins!\n";
            cond = 1;
        }//end if 

    }//end for loop
    return cond;
}//end check_win()
