//Dog.java
import java.util.*;
import java.io.*;

public class Dog extends Pet implements Serializable{
    private static final long serialVersionUID= 42L;
    
    public Dog(String petname){
        this.petName = petname;
        this.petSpecies = "Dog";
        this.petAge = 0;
        this.hungerLevel = new Hunger();
        this.healthLevel = new Health();
        this.happinessLevel = new Happiness();
    }
    public Dog(String petname, double petage){
        this.hungerLevel = new Hunger();
        this.healthLevel = new Health();
        this.happinessLevel = new Happiness();
        this.petName = petname;
        this.petSpecies = "Dog";
        this.petAge = petage;
    }
    public static void main(String[] args) {
        Dog fawkes = new Dog ("Fawkes");
        fawkes.feedPet();
        fawkes.playWithPet();
        fawkes.medicatePet();
        Dog fawkes2 = new Dog ("Fawkes", 3.4);
        boolean success = fawkes.isEqual(fawkes2);
        System.out.println(success);
        System.out.println(fawkes.toString());
    }
    public void chaseTail(){
        if (this.hungerLevel.attributeArrayIndex >1){
            this.happinessLevel.increaseAttribute();
            System.out.println(this.toString() + " was full enough to chase tail");
        }else{
            System.out.println(this.toString() + "was too hungry to chase tail.");
        }
    }

}