# H1 MAIN PROGRAM
**Goals of the main program**
The main program simulates a horse race on a 15 unit track with five horses.  

**INPUT of the main program**
There are no arguments passed to the main program. It does manipulate a global array of ints representing the horses.
It also takes user input in the form of an int to seed a random number. 

**OUTPUT of the main program**
The main function returns int zero.  

**Steps of the main program**
1. Takes input in the form of an int from the user to seed random number function. 
2. Loops through horse array and sets the values of all five elements to zero
3. Intiate while loop, while loop ends when there is a win 
4. For loop nested in the while loop steps through horse array, randomly generates a one or a zero for 
each element in the array, if one, add one to the element in the array. 
5. Prints position of the horses on the track after for loop completed by calling position() function
6. checks for win condition by calling check_win function, if no win condition met, while loop continues.
7. Once a horse has won, end while loop, return zero.

# H1 Position Function
**Goals of the position function**
Prints a graphical representation of the 15 unit track and the position of the horses on the track. 
Dots are used to represent all other positions on the track.  

**Input of the position function**
There is no input.  

**Output of the position function**
The function does not return a value. It does call cout from the standard namespace to print
the strings representing the position of the horses on the track.  

**Steps of the position function**
1. Initialize outer for loop to step through all five elements in horse array.
2. Initialize inner for loop to step through all 15 potential positions on the track. 
If the element at the current index in the horse array equals the position on the track, prints index number
Otherwise, prints a dot
3. end inner for loop, print line break, end outer loop

# H1 Check_Win Function
**Goals of the Check_Win function**
Checks elements in horse array to determine if a horse has finished the race.  

**Input of the Check-Win function**. 
Does not take any arguments.  

**Output of the Check_Win function**. 
Returns either 0 if there was no horse win, returns 1 if there was.  

**Steps of the Check_Win function**. 
1. set condition value to zero.
2. initialize for loop to step through horse array
   If value at the horse position exceeds the max length of the track, output horse win message. 
   change value of cond to 1.
3. end for loop, return condition.
