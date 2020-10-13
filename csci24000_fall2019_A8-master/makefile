MainMenu.class: MainMenu.java CatMenu.class DogMenu.class PetMenu.class Attribute.class Health.class Hunger.class Happiness.class Pet.class Dog.class Cat.class
	javac -g MainMenu.java
PetMenu.class: PetMenu.java Attribute.class Health.class Hunger.class Happiness.class Pet.class Dog.class Cat.class
	javac -g PetMenu.java
DogMenu.class: DogMenu.java PetMenu.class Attribute.class Health.class Hunger.class Happiness.class Pet.class Dog.class Cat.class
	javac -g DogMenu.java
CatMenu.class: CatMenu.java PetMenu.class Attribute.class Health.class Hunger.class Happiness.class Pet.class Dog.class Cat.class
	javac -g CatMenu.java
Pet.class: Pet.java Attribute.class Health.class Hunger.class Happiness.class
	javac -g Pet.java
Dog.class: Dog.java Pet.class Attribute.class Health.class Hunger.class Happiness.class
	javac -g Dog.java
Cat.class: Cat.java Pet.class Attribute.class Health.class Hunger.class Happiness.class
	javac -g Cat.java
Attribute.class: Attribute.java
	javac -g Attribute.java
Happiness.class: Happiness.java Attribute.class
	javac -g Happiness.java
Health.class: Health.java Attribute.class
	javac -g Health.java
Hunger.class: Hunger.java Attribute.class
	javac -g Hunger.java
clean:
	rm *.class
run: MainMenu.class
	java MainMenu
debug: ATM.class
	jdb MainMenu