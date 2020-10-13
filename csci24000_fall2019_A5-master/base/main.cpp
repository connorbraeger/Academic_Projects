//main.cpp
#include <fstream>
#include <iostream>
#include <string>
#include <sstream>

int main(){
    std::ifstream inFile;
    std:: ofstream outFile;
    std::string currentLine, sNumber;
    std::stringstream converter, ss;
    int number, lineSum=0;
    bool int_line = true;
    



    inFile.open("input.txt");
    outFile.open("output.txt");
    if (outFile.is_open()){
    while (getline(inFile, currentLine)){
        ss.clear();
        ss.str("");
        ss.str(currentLine);
        if (int_line){
            while(getline(ss, sNumber, ',')){
                converter.clear();
                converter.str("");
                converter << sNumber;
                converter >> number;
                lineSum = number + lineSum;
            }// end while
            int_line = false;
        }//end if
        else{
            for (int i = 0; i < lineSum; i++ ){
               if (i < (lineSum - 1)){

                outFile << currentLine<<",";
               }else {
                   outFile<< currentLine << std::endl;
               }//end else in for loop
            }//end for loop
            
            int_line = true;
            lineSum = 0;
        }  // end else 
    }//end outer while loop
    }//end outer if
    else{
        std::cout<<"unable to open file";
    }
    outFile.close();
    inFile.close();
    return 0;

}//end main


