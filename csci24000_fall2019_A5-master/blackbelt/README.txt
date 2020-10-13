For the blackbelt extension I implemented a boolean function is_digit
is_digit takes a string object as its argument
It copies the first two characters in the string into a character array.
It copies two characters incase the number is a negative number.
The function then loops through an array of characters containing the all ten digits.
If either element in the two element char array == an element in the digit array:
a bool, is_num becomes true, otherwise it is false.
The function returns is_num
This is_digit function is used instead of my switch boolean variable to determine if 
it should treat the current line like an int line or a string line.
If the string line is empty, outputs a message to the outfile ""This line is empty. Shame on you."
If the integer sum is zero or less,  outputs message to the outfile: "Integer sum is zero or less. Shame on you."
The way my original program was written, it could handle more than three ints.
My program does take floats, it rounds them down to the closest int.
