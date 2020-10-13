//horse.h
#ifndef HORSE_H_EXISTS
#define HORSE_H_EXISTS
class Horse {
    private:
        int position;
        int percent;
    public:
        Horse();
        Horse(int percent);
        void advance();
        int getPosition();
        void setPercent(int new_percent);
}; //end class declaration
#endif