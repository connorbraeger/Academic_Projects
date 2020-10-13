//date.cpp
#include <string>
#include <iostream>
#include <sstream>
#include "date.h"
Date::Date(){
    day = 0;
    month = 0;
    year = 0;
    fulldate = "";
}
Date::Date(std::string dateline){//overloaded date constructor
    std::stringstream converter;
    std::stringstream ss;
    fulldate = dateline;
    ss.str(dateline);
    std::string currentLine;
    int i = 0;
    while (getline(ss,currentLine, '/' )){//parses string, converts strings into ints
        if (i == 0){
            std::stringstream converter;
            converter.clear();
            converter.str("");
            converter<<currentLine;
            converter>> Date:: day;
        }else{
            if(i == 1){
                converter.clear();
                converter.str("");
                converter<<currentLine;
                converter>> Date:: month;
            }else{
                converter.clear();
                converter.str("");
                converter<<currentLine;
                converter>> Date:: year;
            }
        }//end outer else
    
        i ++;
        }//end while
}//end Date constructor
Date::~Date(){
}	
int Date::getDay(){//get day attribute
    return day;//
}int Date::getMonth(){//get day attribute
    return month;
}
int Date::getYear(){//get day attribute
    return year;
}
std::string Date::getFulldate(){//get fulldate attribute
    return fulldate;
}

