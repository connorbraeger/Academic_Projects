//address.h
#ifndef ADDRESS_H_EXISTS
#define ADDRESS_H_EXISTS
#include <string>

class Address{
    private:
        std::string addressLine1;
        std::string addressLine2;
        std::string city;
        std::string state;
        int zipcode;
    public:
        Address();
        ~Address();
        Address(std::string addline);
        std::string getLine1();
        std::string getLine2();
        std::string getCity();
        std::string getState();
        int getZip();
        std::string getFullAdd();
};
#endif


