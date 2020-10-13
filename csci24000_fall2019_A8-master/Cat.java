//Cat.java
import java.util.*;
import java.io.*;


public class Cat extends Pet implements Serializable{
    private static final long serialVersionUID= 42L;
    
    public Cat(String petname){
        this.petName = petname;
        this.petSpecies = "Cat";
        this.petAge = 0;
        this.hungerLevel = new Hunger();
        this.healthLevel = new Health();
        this.happinessLevel = new Happiness();
    }
    public Cat(String petname, double petage){
        this.hungerLevel = new Hunger();
        this.healthLevel = new Health();
        this.happinessLevel = new Happiness();
        this.petName = petname;
        this.petSpecies = "Cat";
        this.petAge = petage;
    }
    public static void main(String[] args) {
        Cat poppy = new Cat ("Poppy");
        poppy.feedPet();
        poppy.playWithPet();
        poppy.medicatePet();
        Cat poppy2 = new Cat ("Poppy", 3.4);
        boolean success = poppy.isEqual(poppy2);
        System.out.println(success);
        System.out.println(poppy.toString());
    }
    public void catchMouse(){
        if (this.healthLevel.attributeArrayIndex == 3){
            this.hungerLevel.increaseAttribute();
            System.out.println(this.toString() + " was healthy enough to catch the mouse");
        }else{
            System.out.println(this.toString() + "was not healthy enough to catch mouse.");
        }
    }
}