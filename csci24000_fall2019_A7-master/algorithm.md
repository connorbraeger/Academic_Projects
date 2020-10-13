# CheckingAccount
**Goals of the CheckingAccount Class**
The goal of the CheckingAccount class is to model a checking account by allowing deposits and withdrawals from a protected balance. 
Checking Account has one protected attribute, a balance, and four methods. 

## CheckingAccount Constructor
**Goals of the CheckingAccount Constructor**
Instantiates a new instance of Checking class, protected propert balance is set to zero.
**INPUT of the CheckingAccount Constructor**
Does not take input.

**OUTPUT of the CheckingAccount Constructor**
Instantiates new instance of CheckingClass object. Does not return a value.  
**Steps of the CheckingAccount Constructor**
1. sets protected property to zero.

## depositMoney method
**Goals of the depositMoney method**
Models depositing money into a checking account by taking a money amount as a parameter and adding that amount to the protected property balance.
**Input of the depositMoney method**
Takes a double representing an amount of money
**Output of the depositMoney method**
Does not return a value
**Steps of the depositMoney method**
1. protected property balance assigned value of balance plus double passed as parameter. 

## withdrawMoney method
**Goals of the withdrawMoney method**
Models withdrawing money from a checking account by taking a money amount and subtracting that money from the balance as long as the resulting balance will be zero or larger. If resulting amount will be less than zero, outputs an insufficient funds message to the console and returns bool false. Otherwise, returns bool true.
**Input of the withdrawMoney method**
Takes a double money amount as an argument.
**Output of the withdrawMoney method**
returns either bool true or bool false
**Steps of withdrawMoney method**
1. intitiates if statement with condition balance minus withdrawal amount less than zero. 
2. If true, prints out insufficient funds message
3. returns false
4. else balance assigned balance minus withdrawal ammount, returns true.
## checkBalance method
**Goals of checkBalance method**
public method checkBalance returns protected property balance.
**Input of the checkBalance method**
no input
**Output of the checkBalance method**
returns double balance
**Steps of the checkBalance method**
1. returns balance

# SavingsAccount Class
**Goals of SavingsAccount class**
Models The goal of the SavingsAccount class is to model a savings account by allowing deposits and withdrawals from a protected balance. Also has an interest rate private variable of type double and a method to apply the interest rate. Is a childclass of CheckingsAccount. 
SavingAccount has same methods and properties of CheckingAccount plus two constructors and thre new public methods to get and set interest rate property and apply the interest rate.

## SavingsAccount constructor methods
**Goals of SavingsAccount constructor methods**
Instantiates a new instance of SavingsAccount class, protected propert balance is set to zero, interest rate is set to zero if no argument passed. If there is an argument of type double, assigns interest rate property the value of the argument.
 **Input of SavingsAccount constructor**
 Takes no input or input of type double to represent an interest rate.
 **Output of SavingsAccount constructor**
 Instantiates SavingsAccount object, returns no value.
 **Steps of SavingsAccount constructor**
 1. sets interest rate to zero if no argument passed, else sets 
##   setInterestRate method
**Goals of setInterestRate**
Setter method for private property interest rate.
**Input of setInterestRate**
takes double
**Output of setInterestRate**
does not return a valur
**Steps of setInterestRate**
private property interest rate assigned value of argument

## getInterestRate method
**Goals getInterestRate method**
Getter method for private property interestRate
**Input of getInterestRate method**
Takes no interest rate
**Output of getInterestRate method**
returns private property Interest rate of type double
**steps** 
1. returns interest rate
## applyInterestRate method
**Goals of applyInterestRate method**
Takes a double representing time as an argument, applies interest to balance property.
**Input of applyInterestRate method**
takes argument of type double represeting time
**Output of applyInterestRate method**
does not return a value
**Steps of applyInterestRate method**
1. initiates if statement with condition that function parameter time is greater than or equal to zero.
2. if true, then double A representing the interest amount equals the balance times the quanitity one plus the quantity rate times time. 
3. balance is assigned balance plus A
4. else throws an error with message("negative time")

# User Class
**Goals of User class**
Models a user of an ATM. User has an account number private property of type string, a pin number private property of type string, a savingsAccount private property of type SavingsAccount, and a checkingAccount private property of type CheckingAccount.
Has public constructor method, getters for all properties, a method to determine if two different Users are equal, and a to String method to represent the Class as a string.
## User constructor method
**Goals of User constructor method**
Instantiates a new instance of User. Takes two arguments, a string for the pin number and a string for the account number which are then set to the appropriate private properties.
checking account and savings account properties are both initialized as well.
**Input of User constructor method**
takes two strings as arguments
**Output of User constructor method**
Instantiates new User, does not return a value
**Steps of User Constructor**
1. assigns private property pin value of first method argument
2. assigns private property accountnumber value of second method argument
3. calls checkingAccount constructor to instantiate new CheckingAccount instance
4. calls SavingsAccount constructor to instantiate new SavingsAccount instance
## getPin, getAccountNumber, getCheckingAccount, getSavingsAccount methods
**Goals of getPin, getAccountNumber, getCheckingAccount, getSavingsAccount methods**
getters for private properties of User Class
**Input of getPin, getAccountNumber, getCheckingAccount, getSavingsAccount methods** ** 
takes no input
**Output of getPin, getAccountNumber, getCheckingAccount, getSavingsAccount methods**
returns private property stated in method name of original property type 
**Steps of getPin, getAccountNumber, getCheckingAccount, getSavingsAccount methods**
1. returns private property

## isEqual method
**Goals of isEqual**
compares Pin number and Account number of one User to another User, returns boolean true if equal, else returns false.
**Input of isEqual**
takes User object
**Output of isEqual**
returns bool true or bool false
**Steps of isEqual**
1. Inititiate if statement with condition that account number(accessed with getAccountNumber) of user1 equals user2 and pin number(Accessed with getPin method) of user1  equals user2
2. returns true if condition met
3. else returns false.

## toString method
**Goals of toString method**
returns a string representation of User class of the form "Account Number: accountNumber PIN Number: pin Checking Account Balance: checking account Balance Savings Account Balance: SavingsBalance
**Input of toString method**
takes no input
**Output of toString Method**
outputs string
**Steps of toString method**
1. returns string of format described in goals section by concatenating string phrases with appropriate private property strings accessed with getter methods.
# UserMenu Class
**Goals of UserMenu Class**
Models a menu interface of an ATM. Has private property user of type User. Has public methods to set User, simulate a main user menu, a checking menu and a savings menu. Has no explicity defined constructor, just the default one.
## setUser method
**Goals of setUser method**
assigns private property user the value of the user object argument in the method parameter.
**Input of of setUser method**
Takes a User object as input
**Output of setUser method**
does not return a value
**Steps of setUser**
1. private propert user is assigned value of user object from method argument.
## bankMenu method
**goals of bankMenu method**
models a the main menu of an atm after pin has been entered. Allows user to enter checking acccount menu, saving account menu or to exit. 
**Input of bankMenu method**
Takes no input in method parameters, does take user input from console
**Output of bankMenu method**
Does not return a value, does output messages to console.
**Steps of bankMenu**
1. assigns boolean sentry variable true to tell upcoming while to keep going.
2. intitiate while loop with boolean sentry variable just defined.
3. Outputs message to console asking for user input to determine if user wants to access checkings account, savings account or exits.
4. Intitiate try catch to account for user input issues. 
5. get user input
6. if user input equals 1, then call checkingMenu method
7. if user input equals 2, call savingsMenu method
8. if user input equals three, boolean while loop sentry variable becomes false. 
9. If user input is of an unexpected type or value, output message telling user to choose a valid option. Takes user input again. 
10. While exited when boolean sentry while variable assigned false, method ends.

## checkingMenu method
**Goals of checkingMenu method**
Simulates a checkingsaccount menu of an atm. Allows user to get current balance, allows user to deposit money, withdraw and exit menu.
**Input of checkingMenu method**
Takes no input in method parameters, does take user input from console
**Output of checkingMenu method** 
Does not return a value, does output messages to console.
**Steps of checkingMenu method**
1. sentry variable assigned boolean true
2. While true loop initiated
3. Outputs message to console asking user for input to determine checking menu option.
4. initiate try-catch loop handle unexpected user input.
5. if input equals 1, output current balance to string using getBalance method of checkingAccount object
6. if input equals to 2, get user input again, adds user input to balance using method of checkingAccount object, outputs a message to console with new balance
7. if input equals 3, get user input, pass user input into withdrawMoney method of CheckingAccount object. 
8. Outputs new checking account balance to string
9. if input equals four, assign sentry variable boolean false;
10. if exception occurs, prints a message to console asking for valid input, takes input again.
11. exits method when sentry variable is false.
## checkingMenu method
**Goals of checkingMenu method**
Simulates a savings account menu of an atm. Allows user to get current balance, allows user to deposit money, withdraw and exit menu.
**Input of checkingMenu method**
Takes no input in method parameters, does take user input from console
**Output of checkingMenu method** 
Does not return a value, does output messages to console.
**Steps of checkingMenu method**
1. sentry variable assigned boolean true
2. While true loop initiated
3. Outputs message to console asking user for input to determine csavings menu option.
4. initiate try-catch loop handle unexpected user input.
5. if input equals 1, output current balance to string using getBalance method of savingsAccount object
6. if input equals to 2, get user input again, adds user input to balance using method of savingsAccount object, outputs a message to console with new balance
7. if input equals 3, get user input, pass user input into withdrawMoney method of savingsAccount object. 
8. Outputs new checking account balance to string
9. if input equals four, assign sentry variable boolean false;
10. if exception occurs, prints a message to console asking for valid input, takes input again.
11. exits method when sentry variable is false.

# AdminMenu Class
**Goals of AdminMenu Class**
Simulates the admin privledges by allowing the admin to add users to user database, delete users, list users, and apply interest to all users. Has one method to control flow of the rest of the methods. All methods public. Has no properties.
Has no explicitly defined constructor. 

## addUser method
**Goals of addUser method**
Adds User object to arrayList of User objects that is a static property of ATM class by asking for a new pin and a new account number.
**Input of addUser method**
no input arguments taken, does ask for user input from console
**Output of Adduser method**
Does not return a value, does output messages to console.
**Steps of addUser method**
1. Outputs message to console asking for new account number
2. assigns input as string variable representing new account number
3. Outputs message to console asking for new pin number
4. assigns input as string variable representing new pin number
5. intializes new User instance with string variables for pin number and account number as constructor arguments.
6. boolean variable representing if two users are a match assigned false
7. Loops through ATM class level propery User ArrayList 
8. if the newly constructed user equals a user in the array according to the isEqual User method, boolean variable assigned true.
9. end for loop, if boolean variable false, add user to ArrayList 
10. else outputs a message to console informing that user cannot be duplicated

## deleteUser method
**Goals of delete User method**
Removes User object from ArrayList of User objects that is a static property of ATM class by taking user input to match a given account number and pin number to a currently saved User.
**Input of deleteUser method**
no input arguments taken, does ask for user input from console
**Output of deleteUser method**
Does not return a value, does output messages to console.
**Steps of deleteUser**
1. Outputs message to console asking for account number of user to be deleted
2. assigns input as string variable representing deleted account number
3. Outputs message to console asking for pin number of user to be dleted
4. assigns input as string variable representing delted pin number
5. intializes new User instance with string variables for pin number and account number as constructor arguments.
6. boolean variable representing if two users are a match assigned false
7. Loops through ATM class level property User ArrayList 
8. outer if statement initiated with condition if the newly constructed user equals a user in the array according to the isEqual User method
9. if true, then inner if statement initiated with condition that checking account balance and savings account balance of user from ATM User ArrayList both equal zero, then match boolean variable assigned true, user removed from ArrayList,
10. else statement for inner if loop outputs message that user with non empty accounts cannot be deleted, sets match boolean variable to true
11. exits outer if loop, exits for loop, if match boolean false, outputs message informing user that matching account found.

## applyInterestToAll method
**Goals of applyInterestToAll method**
Takes user input for time, loops through user ArrayList, applies interest to all user savings accounts by passing time to applyInterestRate method
**Input of applyInterestToAll method**
no input arguments taken, does ask for user input from console
**Output of applyInterestToAll method**
Does not return a value, does output messages to console.
**Steps of applyInterestToAll method**
1.Outputs message to console asking for a time period in months
2. sentry boolean variable assigned true.
3. While true loop initiated with sentry variable
4. try catch loop intitated to catch input exceptions
5. In try loop, assign user input to time variable of type double. 
6. If the time input greater than or equal to zero, initiate for loop to loop through ATM class level property User ArrayList
7.  Calls appplyInterestRate method from savingsaccount of user object, passes it time input. 
8.  end for loop, boolean sentry variable assigned false
9.  else outputs message to console asking for valid time, while loop continues.
10. if exception caught, outputs message to console asking for valid time, while loop continues.
11. While loop ends, method ends

## listAllUsers method
**Goals of listAllUsers method**
Lists information for all users in ATM class level property User ArrayList.
**Input of listAllUsers method**
no input
**Output of listAllUsers method**
Does not return a value, does output messages to console.
**Steps of listAllUsers**
1. define a string variable with empty string value
2. initiate for loop to loop through ATM class level property User ArrayList
3. string variable assigned variable + string representing user from ArrayList using toString method of user class.
4. Prints user list variable to console

## mainAdminMenu
**Goals of mainAdminMenu method** 
controls the flow of method calling based on user input
**Input of mainAdminMenu method**
no input arguments taken, does ask for user input from console
**Output of mainAdminMenu method**
Does not return a value, does output messages to console.
**Steps of mainAdminMenu method**
1. sentry boolean variable assigned true
2. while loop with sentry variable as condition intitiated
3. Outputs message to console asking for input to determine if the admin wants to adduser, delete user, list user, apply interest or exit.
4. try catch loop intitated to catch input exceptions
5. if input equals 1, calls addUser method
6. if input equals 2, calls deleteUser method
7. if input equals 3, calls list all users method
8. if input equals 4, calls applyInterestToAll method
9. if input equals 5, outputs message to console asking if user would like to save changes
10. if user input equals 1, calls ATM method saveUserArray. outputs a save successful message
11. else it does not save, outputs a message saying as much
12. sentry variable assigned false
13. If exception caough, outputs a message imploring user to choose a valid method. 

# ATM class
**Goals of ATM class**
Takes pin and account number and determines if adminMenu or Usermenu should be called. Also controls loading and saving of user data stored in User ArrayList. Has a protected static ArrayList of Users to store data. Has a protected AdminMenu object and a protected UserMenu object.

## ATM constructor method
**Goals of ATM constructor method. method**
Instantiates an instance of ATM object. UserMenu property and AdminMenu property constructors are called as well. loadUserArray method called as well
**Input of ATM Constructor method**
No input
**Output of ATM constructor method**
No output, just instatiates instance of ATM class method
**Steps of ATM constructor method**
1. Protected property usermenu instantiated
2. Protected property admin instantiated
3. Protected static property user arraylist instantiated
4. loadUserArray method called
   
## getCredentials Method
**Goals of getCredentials method**
Takes user input in the form of an account number and a pin, determines if the pin and account number should be for an admin or a user menu. If account not found, system exits. 

**Input of getCredentials method**
no input arguments taken, does ask for user input from console
**Output of getCredentials method**
Does not return a value, does output messages to console.
**Steps of getCredentials method**
1. sentry boolean variable assigned true
2. while loop with sentry variable as condition intitiated
3. try catch loop intitated to catch input exceptions
4. Outputs message to console asking for account number of user 
5. assigns input as string variable representing account number
6. Outputs message to console asking for pin number of user 
7. assigns input as string variable representing pin number
8. intializes new User instance with string variables for pin number and account number as constructor arguments.
9.  boolean variable representing if two users are a match assigned false
10. If statement with condition that account number input and pin number input equal "00000" and "12345" respectively
11. if condition met, calls mainAdminMenu method
12. match boolean assigned true
13. exit if statement
14. Loops through ATM class level property User ArrayList 
8. if statement inside for loop initiated with condition if the newly constructed user equals a user in the array according to the isEqual User method
9. If condition met, calls bankMenu usermenu method
10. assigns match variable to true
11. calls saveUserArray
12. sentry boolean assigned false
13. Outputs message to console thanking user for banking
14. end if
15. end for
16. if match variable false, outputs a message saying user not found
17. sentry variable set to false
18. while loop exits.

## saveUserArray method
**Goals of saveUserArray method**
Writes User data from the ArrayList to seperate file called userArray.dat
**Input of saveUserArray method**
takes no input
**Output of saveUserArray method**
does not return a vaule, does write data to file
**Steps of saveUserArray method**
1. try catch initiated to handle output exceptions.
2. open file
3. write object to file
4. close file

## loadUserArray method
**Goals of loadUserArray method**
Reads User data from UserArray.dat file, writes data to user ArrayList.
**Input of loadUserArray method**
Reads from file
**Output of loadUserArray method**
no output
**Steps of loadUserArray method**
1.try catch initiated to handle input exceptions.
2.open file
3.write data from file to ArrayList
4.close file