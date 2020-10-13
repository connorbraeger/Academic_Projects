# H1 MAIN PROGRAM
**Goals of the main function**
Reads file "input.txt" consisting of alternating lines. The first line is a series of ints, the second line is a string. Creates output file "output.txt" such that each line in the file is the string repeated a number of times equaling the sum of the preceding ints line.  

**INPUT of the main program**
There are no arguments passed to the main program.
It does open an input file called "input.txt".

**OUTPUT of the main program**
The main function returns int zero. It also outputs a file named "output.txt".

**Steps of the main program**
1. Declare input stream variable for the input file
2. declare output stream variable for the output file
3. declare string variables for current line and int values in int line
4. declare stringstream variables for int conversion and current line string stream
5. Delcare int variables for string to int conversion and int line sum
6. Define bool variable for switch between int lines and str lines as true since first line will be an int line in input.txt
7. Open "input.txt" file
8. Open "output.txt" file
9. initialize if statement to ensure output file successfully opened
10. Initialize while loop inside if statement, ends when all lines of input file read, gets string of current line of input file and copies it into current line string
11. clear current line string stream, set string current line in string stream.
12. if int line switch variable true, initialize while loop that ends when end of current line string stream object reached, reads ints in string stream delimited by a comma, copies ints in int line into string variable string number.
13. string number outputted into converter string stream.
14. int inputed into int variable number from converter string stream
15. line sum variable assigned value of number + line sum variable
16. End while loop, set int line switch variable to false.
17. If int line switch is false, initiate for loop, loops a number of times equivalent to sum of the ints in the previous line of the input file. 
18. If the loop counter is less than the sum, outputs current line string to outfile followd by a ",".
19. If loop counter equal to sum, outputs current line string followed by an new line and stream flush.
20. End for loop, set int line bool to true and line sum to zero.  
21. Exit outer while loop, exit if statement
22. Else statement outputs "unable to open file" to console
23. close input file, close output file, return 0
   

