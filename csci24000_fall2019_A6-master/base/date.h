//date.h
#ifndef DATE_H_EXISTS
#define DATE_H_EXISTS
#include <string>

class Date{
    private:
        int day;
        int month;
        int year;
        std::string fulldate;
    public:
        Date();
        Date(std::string dateline);
        ~Date();
        int getDay();
        int getMonth();
        int getYear();
        std::string getFulldate();
};
#endif
