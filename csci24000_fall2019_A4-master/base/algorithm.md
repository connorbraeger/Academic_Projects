# MAIN PROGRAM
**Goals of the main program**
The main program simulates a horse race on a 15 unit track with five horses.  

**INPUT of the main program**
There are no arguments passed to the main program.
It also takes user input in the form of an int to seed a random number. 

**OUTPUT of the main program**
The main function returns int zero. It also outputs a message to the user asking for a random seed. 

**Steps of the main program**
1. Takes input in the form of an int from the user to seed random number function. 
2. Instantiates Race object with default parameters. Calls Race object method to control the race. Method ends when race is over.
3. Returns int 0

# Horse program
**Goals of the Horse program**
Horse program defines properties and methods of Horse class. Horse class has one private property, position, which is an int and is set to zero when object is initialized. Hose class has three public methods: a constructor, a void type method to advance the horse's position, and a method to return the int position property of the horse.

## Horse Constructor Method
**Goals of the Horse Constructor Method**
Instantiates object of class Horse.

**Input of the Horse Constructor Method**
Method does not take input. 

**Output of the Constructor Method**
The method does not return a value. It creates an object of class Horse.

**Steps of the constructor method**
1. Creates instance of Horse object when called
2. Sets private property postion to zero.

## getPosition method
**Goals of the getPosition method**
Accesses and returns Horse object private property: position 

**Input of the getPosition method**. 
Does not take any arguments.  

**Output of the getPosition method**. 
Returns position property of the Horse object

**Steps of the getPosition method**. 
1. returns Horse position.

## Advance Method
**Goals of the advance method**
Determines whether or not Horse object will advance, i.e. increase its position property by one.

**Input of the advance method**
Does not take input

**Output of the advance method**
Does not return a value

**Steps of advance method**
1. Randomly generates a one or a zero
2. If a one is generated, position of Horse object increased by one.

# Race Program
**Goals of Race program**
Race program defines properties and methods of race class. Race class has two private properties: an array of horse objects h and an int length representing the length of the track. Length of the track is set to 15 by default. Race has four public methods. Race has two constructors, one that has no parameters and one that takes int length as a parameter and then sets the private property length to the input length. The void type method printLane outputs a representation of the Horse objects position on the track. The void type method start handles the race. 

## Constructor Methods
**Goals of Constructor Methods**
Instantiates object of class Race with length set to either default or the int parameter passed into the method when called. Instantiates an array of horse objects as well.

**Input of Constructor Methods**
Takes either no input or int length as input. 

**Output of Constructor Methods**
Does not return a value, just creates an object of class Race.

**Steps of Constructor Methods**
1. Creates object of Race class when called
2. Sets int length to the default length if no parameters, or to int length passed into constructor if included in method argument.
3. Creates array of Horse objects

## printLane Method
**Goals of printLane Method**
Prints a graphical representation of the lane of the Horse object in the array. 

**Input of the printLane Method**
Takes an int argument representing which horse to display.

**Output of the printLane Method**
The function does not return a value. It does call cout from the standard namespace to print the string representing the position of the horse in its lane.

**Steps of the printLane Method**
1.Initialize for loop to step through all potential positions in lane. 
2. If the position in the lane equals the postion of the Horse object, accessed by calling the getPosition method, outputs the a string representing which horse it is.
3. If position in the lane not equal to the horses position, outputs "."
4. End for loop, output a line break.

## Start method
**Goals of Start Method**
Handles the simulation of the race.

**Input of Start method** 
No input

**Output of Start Method**
Calls printLane method to print lanes of each horse after each round of movement, also prints message announcing the winning horse.

**Steps of Start Method**
1. Assign a variable bool false to represent race has not been won
2. Initiate While loop that continues until race has been won i.e. bool true
3. Nested for loop in while loop that steps through the horses in the array.
4. Calls advance method for each horse in for loop to determine if the horse moves up one unit on the track. 
5. calls Printlane method to print lane of each horse in foor loop.
6. In for loop still, if the position of the horse exceeds the length of the track, change win variable to true. 
7. Exit for loop, exit while loop
8. Output win message

