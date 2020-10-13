//main.cpp
#include <fstream>
#include <iostream>
#include <string>
#include <sstream>
bool is_digit(std::string numstr);
int main(){
    std::ifstream inFile;
    std:: ofstream outFile;
    std::string currentLine, sNumber, s;
    std::stringstream converter, ss;
    int number,lineSum=0;
    bool int_line = true;

    inFile.open("input.txt");
    outFile.open("output.txt");
    if (outFile.is_open()){
    while (getline(inFile, currentLine)){
        ss.clear();
        ss.str("");
        ss.str(currentLine);
        if (is_digit(currentLine)){
            while(getline(ss, sNumber, ',')){
                converter.clear();
                converter.str("");
                converter << sNumber;
                converter >> number;
                lineSum = number + lineSum;
                
            }// end while
        }//end if
        else if (lineSum <= 0){
            outFile<< "Integer sum is zero or less. Shame on you."<<std::endl;
            lineSum=0;
        }//end else if
        else{


            if (currentLine.empty()){
                outFile<<"This line is empty. Shame on you."<<std::endl;
            }//end if
            else{
            for (int i = 0; i < lineSum; i++ ){
               if (i < (lineSum - 1)){

                outFile << currentLine<<",";
               }else {
                   outFile<< currentLine << std::endl;
               }//end else
            }//end for
            }//end outer else
            lineSum = 0;
        }//end else
    }//end while
    }else{;
    }// end else
    outFile.close();
    inFile.close();
    return 0;

}//end main
bool is_digit(std::string numstr){
    bool is_num = false;
    char digits[10]= {'0','1','2','3','4','5','6','7','8','9',};
    char firstchars[2];
  
    numstr.copy(firstchars,2,0);
    for(int i = 0; i < 10; i++){
        if (digits[i]==firstchars[0]){
            is_num = true;
        }//end if
        if (digits[i]==firstchars[1]){
            is_num = true;
        }//end if
    }//end for
    
return is_num;
}//end is digit