//CatMenu.java
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class CatMenu extends PetMenu{
    Scanner input = new Scanner(System.in);
    public CatMenu(){
        this.pet = new Cat("kitty");
        
    }
    public static void main(String[] args) {
        CatMenu c = new CatMenu();
        c.CatOptions();
    }
    public void CatOptions(){
        boolean shouldContinue = true;
        while (shouldContinue){
            System.out.println("Type 1 to see pet's current status. Type 2 to rename pet. Type 3 to feed pet");
            System.out.println("Type 4 to play with pet. Type 5 to medicate pet. Type 6 to allow cat to try to catch mouse.");
            System.out.println("Type 7 to save and exit");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    System.out.println(this.pet.attributeStatus());
                }else if (choice == 2){
                    this.renamePet();
                }else if (choice == 3){
                    this.pet.feedPet();
                }else if (choice == 4){
                    this.pet.playWithPet();
                }else if (choice == 5){
                    this.pet.medicatePet();
                }else if (choice == 6){
                     ((Cat) this.pet).catchMouse();
                }else if (choice == 7){
                    System.out.println("Would you like to save? Type 1 for yes or Type 0 for no.");
                    int saveChoice = input.nextInt();
                    if (saveChoice == 1){
                        MainMenu.savePetArrayList();
                        System.out.println("Save successful");
                        shouldContinue = false;
                    }else if (saveChoice == 0){
                        System.out.println("No changes saved");
                        shouldContinue = false;
                    }else{
                        System.out.println("Please choose a valid option.");
                    }//end inner else 
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }
        }//end while true
    }//end CatOptions
}

