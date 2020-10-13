//student.cpp
#include <string>
#include <iostream>
#include <sstream>
#include "address.h"
#include "date.h"
#include "student.h"

Student::Student(){//Student constructor
    firstName ="";
    lastName = "";
    gpa = 0;
    credhrs = 0;
    birthDate = new Date();//date object allocated on heap
    gradDate = new Date();//date object allocated on heap
    a = new Address ();//address object allocated on heap
}
void Student::setStudent(std::string info){//set student attributes
    std::stringstream ss;
    ss.str(info);
    std::string currentLine;
    std::string address;
    std::stringstream converter;

    int i = 0;
    while (getline(ss,currentLine, ',' )){//parses string, sets attributes based on string
        if (i == 0){
            Student::lastName = currentLine;
        }
        if (i==1){
            Student::firstName = currentLine;
        }
        if (i==2){
            address = currentLine + ",";
        }
        if (i>2 && i<6){
            address = address + currentLine + ",";
        }
        if (i == 6){
            address = address + currentLine;
            delete Student:: a;
            Student:: a = new Address (address);
        }
        if (i==7){
            delete Student::birthDate;
            Student:: birthDate = new Date(currentLine);
        }
        if (i==8){
            delete Student::gradDate;
            Student::gradDate = new Date(currentLine);
        }
        if (i==9){
            converter.clear();
            converter.str("");
            converter<<currentLine;
            converter>> Student::gpa;

        }
        else{
            converter.clear();
            converter.str("");
            converter<<currentLine;
            converter>> Student:: credhrs;
            
        }
        i ++;
    }//end while loop
}//end setStudent 
Student::~Student(){//student deconstructor
    delete Student::a; 
    delete Student::birthDate;
    delete Student::gradDate; 
    
    
    
}
std::string Student:: getLastName(){//getter for Last Name attribute
    return Student::lastName;
}
std::string Student::getFirstName(){//getter for First Name
    return Student::firstName;
}
int Student::getGPA(){//getter for GPA
    return Student::gpa;
}
int Student::getCredhrs(){//getter for credit hours
    return Student::credhrs;
}
std::string Student::SimpleReportLine(){//returns string of student name
    return "First name: " + Student::firstName + ", Last Name: " + Student::firstName;
}
std::string Student::FullReportLine(){//returns string with all student data
    std::string stringcredithours ="";
    std::string stringgpa = "";
    std::stringstream convertstream;
    convertstream.clear();
    convertstream.str("");
    convertstream<<Student::credhrs;
    convertstream>>stringcredithours;
    convertstream.clear();
    convertstream.str("");
    convertstream<<Student::gpa;
    convertstream>>stringgpa;

    return "First name: "+ Student::firstName + " Last Name: " + Student::lastName +" "+ a->getFullAdd() + " DOB: " + birthDate->getFulldate() + " Grad Date: " 
    + gradDate->getFulldate() + " GPA: " + stringgpa + " Credit hours: " + stringcredithours;

}//end FullreportLine

