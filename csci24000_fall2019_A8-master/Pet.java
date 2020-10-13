//Pet.java
import java.util.*;
import java.io.*;

public abstract class Pet implements Serializable{
    private static final long serialVersionUID= 42L;
    protected Hunger hungerLevel;
    protected Health healthLevel;
    protected Happiness happinessLevel;
    protected String petName;
    protected String petSpecies;
    protected double petAge;
    transient Scanner input = new Scanner(System.in);
    public String getPetName(){
        return this.petName;
    }//end getPetName
    
    public String getSpecies(){
        return this.petSpecies;
    }//end getPetSpecies

    public void feedPet(){
        boolean shouldContinue = true;
        while (shouldContinue==true){
            System.out.println("Type 1 to feed pet. Type 2 to not feed pet");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    if (this.hungerLevel.increaseAttribute() == false){
                        System.out.println(this.toString() + " is already stuffed.");
                        System.out.println("No more feeding can occur.");
                        shouldContinue = false;
                    }else{
                        System.out.println(this.toString() + " eats the food.");
                        System.out.println(this.toString() + " is " + this.hungerLevel.getCurrentStatus() + ".");
                    }//end inner if else

                }else if (choice ==2){
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end catch
        }//end while true
    }//end feed pet
    public void setPetName(String petName){
        this.petName = petName;
    }//end setPetName()

    public void playWithPet(){
        boolean shouldContinue = true;
        while (shouldContinue==true){
            System.out.println("Type 1 to play with pet. Type 2 to ignore pet");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    if (this.happinessLevel.increaseAttribute() == false){
                        System.out.println(this.toString() + " is already joyous.");
                        System.out.println("No more playing can occur.");
                        shouldContinue = false;
                    }else{
                        System.out.println(this.toString() + " responds positively to the playing.");
                        System.out.println(this.toString() + " is " + this.happinessLevel.getCurrentStatus() + ".");
                        shouldContinue = false;
                    }//end inner if else

                }else if (choice ==2){
                    this.happinessLevel.decreaseAttribute();
                    System.out.println(this.toString() + " will remember your neglect.");
                    System.out.println(this.toString() + " is " + this.happinessLevel.getCurrentStatus() + ".");
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end catch
        }//end while true
    }//end play with pet
    public void medicatePet(){
        boolean shouldContinue = true;
        while (shouldContinue==true){
            System.out.println("Type 1 to medicate pet. Type 2 to not medicate pet");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    if (this.healthLevel.increaseAttribute() == false){
                        System.out.println(this.toString() + " is already in peak condition.");
                        System.out.println("No more medication is needed.");
                        shouldContinue = false;
                    }else{
                        System.out.println(this.toString() + " reluctantly takes the medicine.");
                        System.out.println(this.toString() + " is " + this.healthLevel.getCurrentStatus() + ".");
                    }//end inner if else

                }else if (choice ==2){
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end catch
        }//end while true
    }//end medicate pet
    
    

    public boolean isEqual(Pet otherPet){
        if ((this.getPetName().equals(otherPet.getPetName()) && (this.getSpecies().equals(otherPet.getSpecies())))){
            return true;
        }else{
            return false;
        }
    }//end isEqual
    public String toString(){
        return this.getPetName() + " the " + this.getSpecies();
    }//end toString
    public String attributeStatus(){
        return this.toString() + " is feeling " + this.hungerLevel.getCurrentStatus() + ", " +
        this.healthLevel.getCurrentStatus() + ", and " + this.happinessLevel.getCurrentStatus() + ".";
    }//end attributeStatus
}