# Attribute Class
**Goals of the Attribute Class**
The goal of the Attribute Class is to serve as an abstract data type. Each specific attribute is composed of a list of values that can be increased or decreased. The class is abstract. The class has a protected ssring to represent the current status of the attribute, a  protected string array containing the different possibile values of the attributes, a protected index integer for keeping track of which attribute element is the current status. It has public methods to get the current status, set the current status, and increase and decrease the current status to the next value in the array.

## setCurrentStatus() method
**Goals of the setCurrentStatus() method**
sets protected attribute currentStatus
**INPUT of the setCurrentStatus() method**
does not take input

**OUTPUT of the setCurrentStatus() method**
Does not return a value. 
**Steps of the setCurrentStatus() method**
1. Assign currentStatus value of Attribute Array at index Attribute array index.

## getCurrentStatus() method
**Goals of the getCurrentStatus() method**
gets protected attribute current status
**Input of the getCurrentStatus() method**
Takes no input
**Output of the getCurrentStatus() method**
Returns string currentStatus
**Steps of the getCurrentStatus() method**
1. returns protected attribute currentStatus

## increaseAttribute() method
**Goals of the withdrawMoney method**
increases the attributearrayindex by one unless the index is already the last index in the array
**Input of the increaseAttribute() method**
No input
**Output of the increaseAttribute() method**
returns boolean depending on whether the index was increased
**Steps of increaseAttribute() method**
1. if statement with condition if attributeArrayindex equal to length of the array minus one, return false
2. else adds one to attributeArrayIndex, calls setCurrentStatus()
3. returns true
## decreaseAttribute() method
**Goals of decreaseAttribute() method**
decreases the attributearrayindex by one unless the index is already at zero
**Input of the checkBalance method**
no input
**Output of the decreaseAttribute() method**
returns returns boolean depending on whether the index was decreased
**Steps of the decreaseAttribute() method**
1. if protected attributeArray index equals 0, return false
2. else, decrease attributeArrayIndex
3. calls setCurrentStatus
4. returns true

# Health Class
**Goals of Health class**
Extends Abstract class Attribute to represent a health attribute. Inherits all methods and properties except it reimplements increase attribute and has an explicit constructor

## Health constructor methods
**Goals of SavingsAccount constructor method**
Instantiates a new instance of Health class, protected property attributeArray is set to {"dead", "near death", "ill", "healthy"}, protected property currentStatus is set to the fourth element of the attributeArray, protected property attributeArray is set to three,
 **Input of Health constructor**
No input
 **Output of Health constructor**
 Instantiates Health object, returns no value.
 **Steps of Health constructor**
 1. protected property attributeArray is set to {"dead", "near death", "ill", "healthy"}
 2. currentStatus is set to the fourth element of the attributeArray.
 3. protected property attributeArray is set to three.
##   setInterestRate method
**Goals of increaseAttribute()**
increases the attributearrayindex by one unless the index is already the last index in the array, also does not allow attribute to be increased once its been set to zero since a dead pet cannot come back from the dead.
**Input of increaseAttribute()**
no input
**Output of increaseAttribute()**
does not return a value
**Steps of increaseAttribute()**
1. if statement with condition if attributeArrayindex equal to length of the array minus one, return false
2. else if protected attributeArrayIndex equals zero, outputs message to user saying pet cannot revive, returns false
3. else else adds one to attributeArrayIndex, calls setCurrentStatus()
3. returns true
# Happiness Class
**Goals of Happiness class**
Extends Abstract class Attribute to represent a Happiness attribute. Inherits all methods and properties from Attribute class and has an explicitly defined constructor.

## Happiness constructor method
**Goals of Happiness constructor methods**
Instantiates a new instance of Happiness class, protected property attributeArray is set to {"furious", "unhappy", "mildly pleased", "happy", "joyous"}, protected property currentStatus is set to the third element of the attributeArray, protected property attributeArray is set to two,
 **Input of Happiness constructor**
 Takes no input 
 **Output of Happiness constructor**
 returns no value.
 **Steps of Happiness constructor**
1. protected property attributeArray is set to {"furious", "unhappy", "mildly pleased", "happy", "joyous"}
 1. currentStatus is set to the third element of the attributeArray.
 2. protected property attributeArray is set to two.

## Hunger constructor method
**Goals of Hunger() constructor method**
Instantiates a new instance of Hunger class, protected property attributeArray is set to {"starving", "hungry", "content", "full", "stuffed"}, protected property currentStatus is set to the third element of the attributeArray, protected property attributeArray is set to two,
 **Input of Hunger constructor**
 Takes no input 
 **Output of Hunger constructor**
returns no value.
 **Steps of Hunger constructor**
1. protected property attributeArray is set to {"starving", "hungry", "content", "full", "stuffed"}
 1. currentStatus is set to the third element of the attributeArray.
 2. protected property attributeArray is set to two.

# Pet Class
**Goals of Pet class**
Models a pet with a name, hungerlevel, happiness level, healthlevel, petname, species and petage all as protected properties. has methods to get name, get species, feed pet, set pet name, play with pet, and medicate pet, and has to string methods and a method to determine if two pets are equal.
## getPetName() method
**Goals of getPetName()**
getter for petName
**Input of getPetName()**
no input
**Output of getPetName()**
returns string
**Steps of getPetName()**
1. returns protected property petName
## getSpecies() method
**Goals of getSpecies() method**
getter for petName
**Input of getSpecies() method** 
takes no input
**Output getSpecies() method**
returns protected property petname 
**Steps of getSpecies() method**
1. returns string petname

## isEqual() method
**Goals of isEqual()**
compares PetName string and Pet species string of one Pet to another, returns boolean true if equal, else returns false.
**Input of isEqual()**
takes Pet object
**Output of isEqual**
returns bool true or bool false
**Steps of isEqual()**
1. Inititiate if statement with condition that petname(accessed with getpetname) of pet1 equals pet2 and petspecies number(Accessed with getspecies method) of pet1  equals pet2
2. returns true if condition met
3. else returns false.

## toString() method
**Goals of toString() method**
returns a string representation of Pet class of the form PetName + " the" + getPetSpecies  
**Input of toString() method**
takes no input
**Output of toString() Method**
outputs string
**Steps of toString method()**
1. returns string of format described in goals section by concatenating string phrases with appropriate private property strings accessed with getter methods.

## feedPet() method
**Goals of feedPet()()**
simulates feeding a pet
**Input of feedPet()**
no input
**Output of feedPet()**
returns bool
**Steps of feedPet()**
1. while loop variable set to true
2. while loop intiated
3. Ask user to feed pet or not feed pet, gets input
4. if input is 1, increase hungerlevel by calling increase attribute if hungerlevel is not at max, 
5. sets while loop variable to false
6. if input equals two, set loop variable to false
7. catches input errors, outputs message to choose valid option.
## setPetName() method
**Goals of setPetName()method**
setter for pet name
**Input of setPetName() method** 
takes string
**Output setPetName() method**
no output 
**Steps of setPetName()method**
1. assign protected petname string valuse passed into method

## playWithPet() method
**Goals of playWithPet()**
simulates playing with pet
**Input of playWithPet()**
no input
**Output of playWithPet()**
returns bool true or bool false
**Steps of playWithPet()**
1. while loop variable set to true
2. while loop intiated
3. Ask user to play with pet or not play with pet, gets input
4. if input is 1, increase happinesslevel by calling increase attribute if happiness is not at max,
5.  sets while loop variable to false
6.  if input is two, set loop variable to false
7. catches input errors, outputs message to choose valid option.

## medicatePet() method
**Goals of toString() method**
simulates medicating pet
**Input of medicatePet() method**
takes no input
**Output of medicatePet() Method**
outputs bool
**Steps of medicatePet() method**
1. while loop variable set to true
2. while loop intiated
3. Ask user to medicate pet or not medicate pet, gets input
4. if input is 1, increase healthlevellevel by calling increase attribute if healthlevel is not at max,
5.  sets while loop variable to false
6.  if input is two, set loop variable to false
7. catches input errors, outputs message to choose valid option.

# Cat Class
**Goals of Cat class**
Models a cat pet type, extends abstract class pet, explicitly defines two contstructors and a catch mouse method

## Cat constructor method
**Goals of Cat constructor methods**
Instantiates a new instance of Cat class
 **Input of Cat constructor**
 Takes string or string and double 
 **Output of Cat constructor**
 Instantiates Cat object, returns no value.
 **Steps of Cat constructor**
 1. protected property petname assigned petname passed into parameter
 2. petSpecies asssigned string "cat"
 3. petAge assigned zero or passed petAge
 4. hungerLevel gets new hunger object
 5. healthlevel gets new Health object
 6. happinesslevel gets new happiness object



##   catchMouse() method
**Goals of catchMouse()**
simulates catching a mouse
**Input of catchMouse()**
takes no input
**Output of catchMouse()**
does not return a value
**Steps of catchMouse()**
if cat objects healthlevel's attributeArray index at 3, outputs success message and increases hunger level
else outputs message that cat was not healthy enough to cath mouse
# Dog Class
**Goals of Dog class**
Models a dog pet type, extends abstract class pet, explicitly defines two contstructors and a chaseTail method
## Dog methods
**Goals of Dog constructor method**
Instantiates a new instance of DOg class
 **Input of Dog constructor**
 Takes string or string and double 
 **Output of Dog constructor**
 Instantiates Dog object, returns no value.
 **Steps of Dog constructor**
 1.  protected property petname assigned petname passed into parameter
 2. petSpecies asssigned string "dog"
 3. petAge assigned zero or passed petAge
 4. hungerLevel gets new hunger object
 5. healthlevel gets new Health object
 6. happinesslevel gets new happiness object
##   chaseTail() method
**Goals of chaseTail()**
simualtes dog chasing tail
**Input of chaseTail()**
no input
**Output of chaseTail()**
no return
**Steps of chaseTail()**
if dog objects healthlevel's attributeArray index greater than 1, outputs success message and increases happiness level
else outputs message that cat was not full enough to chase tail
# MainMenu Class
**Goals of MainMenu Class**
Interface for creating new pet, loading a pet, saving petdata
## MainMenu() constructor method
**Goals MainMenu() constructor method**
instantiates new mainmenu obkect
**Input of MainMenu() constructor method**
Takes no input
**Output of MainMenu() constructor method**
does not return a value
**Steps of MainMenu() constructor**
1. protected property catmenu gets new catmenu
2. protected propery dogmenu gets new dogmenu
3. determines if data already exits for pets in directory

## MainMenuOptions() method
**Goals of MainMenuOptions()**
asks if user wants to create pet, load pet, interact with pet or leave pet
**Input of MainMenuOptions()**
takes no input
**Output of MainMenuOptions()**
returns no value
**Steps of MainMenuOptions()**
1. if no pet data exits, calls create pet
2. asks user for input on whether user wants to load pet, create pet, or exit
3. if user inputs 1, determines if pet is cat or dog and then calls appropriate menu
4. if input is two, continues
5. if input is three, exits 
6. 
## ChoosePet() method
**goals of ChoosePet()  method**
allows user to choose pet
**Input of ChoosePet()  method**
Takes no input 
**Output of ChoosePet()  method**
returns bool
**Steps of ChoosePet() method**
1. asks user for input, if 1 calls create pet returns true, if two calls load pet, returns true, if three returns false

## loadPet() method
**Goals of loadPet() method**
loads pet from pet array
**Input of loadPet() method**
Takes no input 
**Output of loadPet()method** 
does not return value
**Steps of loadPet() method**
loops through Array of pets, prints out an index next to each string name of the pet
asks for user input corresponding to index next to pet to choose said pet
sets current pet attribute to chosen pet from array
## saveUserArray method
**Goals of saveUserArray method**
Writes Pet data from the ArrayList to seperate file called "petArrayList.dat"
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
Reads Pet data from "petArrayList.dat" file, writes data to Pet ArrayList.
**Input of loadUserArray method**
Reads from file
**Output of loadUserArray method**
no output
**Steps of loadUserArray method**
1.try catch initiated to handle input exceptions.
2.open file
3.write data from file to ArrayList
4.close file
   
## createPet() method
**Goals of createPet()**
Takes user input to create new pet
**Input of createPet()**
no input
**Output of createPet()**
returns no value
**Steps of createPet()**
asks user for a valid species, cat or dog
if species valid, asks for petname
if there is no saved data, creates new cat or dog obkect depending on species name
if there is asaved data, loops through saved data to ensure no duplicates are bing added

# PetMenu Class
**Goals of PetMenu Class**
Abstract class that serves as an interface for interacting with pet

## setPet() method
**Goals of setPet() method**
sets protected variable pet
**Input of setPet() method**
takes pet object
**Output of setPet() method**
Does not return a value
**Steps of setPet() method**
sets protected variable pet to pet

## renamePet() method
**Goals of renamePet()  method**
allows user to input new name for pet
**Input of renamePet() method**
no input arguments taken, does ask for user input from console
**Output of renamePet() method**
Does not return a value, does output messages to console.
**Steps of renamePet()**
1.asks user for pet name, sets protected petname to that new name, catches input exceptions

# CatMenu Class and Dog Menu Class
**Goals of CatMenu Class**
Extends PetMenu for a cat, dogmenu extends Petmenu for a dog


## CatOptions() method and DogOptions()
**Goals of CatOptions()  method**
Allows of user interaction with dog or cat
**Input of CatOptions() method**
no input arguments taken, does ask for user input from console
**Output of CatOptions()  method**
Does not return a value, does output messages to console.
**Steps of CatOptions()  method**
1. Asks user to input 1 to see pets status, 2 to rename pet, 3 to feed pet, 4 to play with pet, 5 to medicate pet, six to do species specific action, and 7 to exit. Calls appropriate pet methods based on input



