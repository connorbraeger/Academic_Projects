//PetMenu.java
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public abstract class PetMenu{
    Scanner input = new Scanner(System.in);
    protected Pet pet;
    public void setPet(Pet newPet){
        this.pet = newPet;
    }
    public void renamePet(){
        boolean shouldContinue = true;
        while (shouldContinue==true){
            System.out.println("Type new pet name: ");
            try{
                this.pet.petName = input.nextLine();
                System.out.println("Your pet's new name is " + this.pet.toString());
                shouldContinue =false;
            }catch (InputMismatchException e){
                    System.out.println("Please choose a valid name.");
                    input.next();
            }//end trycatch
        }//end while
    }//end rename
   
}