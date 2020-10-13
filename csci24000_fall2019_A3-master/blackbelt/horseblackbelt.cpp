//horse.cpp
//simulates a race between five horses

#include <iostream>
#include <string>
#include <stdlib.h>

//function prototypes
void print_position(int* x);
int check_win(int* x);

int main(){
    int seed;
    int horse_position[5];
    std::cout << "Please enter a random seed: ";
    std::cin >> seed;
    srand(seed);
    int h;
    for (h=0; h<5; h++){
        horse_position[h]= 0;
    }//end initial horse position for loop
    int win = 0;
    h=0;
    while (win == 0){
        for (h=0;h<5;h++){
            if(rand()%2==1){
                horse_position[h]++;
            }//end if
           
        }//end for
        print_position(horse_position);
        std::cout <<"\n \n";
        win = check_win(horse_position);

        

    }//end while loop
    return 0;

}
void print_position(int* x){

    int i;
    for (i = 0; i < 5; i++){
        int z;
        for (z = 0; z < 15; z++){
            if (z == *x){
                std::cout<< i; 
            }//end if
            else {
                std::cout<< ".";
            }//end else
            
        }//end inner for
        x++;
        std::cout<< "\n"; 
    }//end outer for loop   
}
int check_win(int* x){
    int cond = 0;
    int z;
    for (z = 0; z<5; z++){
        if (*x == 15){
            std::cout <<"Horse "<< z << " wins!\n";
            cond = 1;
        }//end if 
        x++;
    }//end for loop
    return cond;
}//end check_win()
