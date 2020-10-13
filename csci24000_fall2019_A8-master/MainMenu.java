//MainMenu.java
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Arrays;
public class MainMenu{
    protected static String[] speciesArray = {"dog","cat"};
    protected static ArrayList<Pet> petArrayList = new ArrayList<Pet>();
    Scanner input = new Scanner(System.in);
    protected Pet currentPet;
    protected CatMenu catmenu;
    protected DogMenu dogmenu;
    protected static boolean ArrayListExists;
    public MainMenu(){
        //this.currentPet = new Pet ("default");
        this.catmenu = new CatMenu();
        this.dogmenu = new DogMenu();
        try{
            MainMenu.loadPetArrayList();
            MainMenu.petArrayList.size();
            ArrayListExists = true;
//            System.out.println("Arraylist does exist");
        }catch( NullPointerException e){
            ArrayListExists = false;
           // System.out.println("Arraylist does not exist");
            petArrayList = new ArrayList<Pet>();
        }//end try catch
    }//end constructor
    public static void main(String[] args) {
        MainMenu m = new MainMenu();
        m.MainMenuOptions();
    }//end main

    public void MainMenuOptions(){
        boolean shouldContinue= true;
        while (shouldContinue){
            if(ArrayListExists== false){
                this.createPet();
            }//end if
            try{
                System.out.println("Please either create a new pet or load an existing one.");
                //this.choosePet();
                if(this.choosePet()){
                    System.out.println("Type 1 to interact with " + this.currentPet.toString() +", type 2 to choose different pet, or type 3 to exit");
                    int choice = input.nextInt();
                    if (choice == 1){
                        if (this.currentPet instanceof Cat ){
                            this.catmenu.setPet(this.currentPet);
                            this.catmenu.CatOptions();
                        }else{
                            this.dogmenu.setPet(this.currentPet);
                            this.dogmenu.DogOptions();
                        }//end choice 1 if else
                    }else if( choice == 2){
                        continue;
                    }else if (choice == 3){
                        shouldContinue = false;
                        System.out.println("Wave bye to your pet for now!");
                    }else{
                        System.out.println("Please choose a valid option.");
                    }//end if else for pet interaction if pet was choosen
                }else{
                    System.out.println("Wave bye to your pet for now!");
                    shouldContinue = false;
                }//end if else for if a pet was choosen
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end try catch
        }//end while true   
    }//end MainMenu Options

    public boolean choosePet(){
        boolean shouldContinue = true;
        boolean chosePet = true;
        while (shouldContinue){
            //try{ MainMenu.petArrayList.isEmpty();
            //}catch(NullPointerException e){
             //   this.createPet();
             //   break;
           // }
            System.out.println("Enter 1 to create a new pet. Enter 2 to load a pet. Enter 3 to exit.");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    this.createPet();
                    shouldContinue = false;
                }else if (choice == 2){
                    this.loadPet();
                    shouldContinue = false;
                }else if (choice == 3){
                    shouldContinue = false;
                    chosePet = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }//end inner for
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end try catch
        }//end while true
        return chosePet;
    }//chosePet()
    
    public void loadPet(){
        boolean shouldContinue = true;
        while (shouldContinue){
            try{
                System.out.println("Please type numerical key adjacent to pet name to select pet.");
                for (int i = 0; i <MainMenu.petArrayList.size(); i++ ){
                    System.out.println(i + ": " + MainMenu.petArrayList.get(i).toString());
                }
                int choice = input.nextInt();
                if (choice >= 0 && choice <MainMenu.petArrayList.size()){
                    this.currentPet = MainMenu.petArrayList.get(choice);
                    shouldContinue=false;
                }else{
                    throw new InputMismatchException("no matching key");
                }//end if else  
            }catch(InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end try catch    
        }//end while true
    }//end loadPet()

    public static void savePetArrayList(){
        try{
            FileOutputStream fos = new FileOutputStream("petArrayList.dat");
            ObjectOutputStream obOutStr = new ObjectOutputStream(fos);
            obOutStr.writeObject(MainMenu.petArrayList);
            obOutStr.close();
            fos.close();
        }catch(Exception e){
            System.out.println("failsaved");
        }//end try catch
    }//end savePetArrayList()

    public static void loadPetArrayList(){
        try{
            FileInputStream fInStr = new FileInputStream("petArrayList.dat");
            ObjectInputStream obInStr = new ObjectInputStream(fInStr);
            MainMenu.petArrayList = (ArrayList) obInStr.readObject();
            obInStr.close();
            fInStr.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }//end try catch
    }//end loadPetArrayList()

    public void createPet(){
        boolean shouldContinue = true;
        while (shouldContinue){
            boolean isMatch= false;
            try{
            System.out.println("Please enter in a valid species." +
            " Options are cat or dog.");
            String speciesType = input.next().toLowerCase().trim();
                if (Arrays.asList(speciesArray).contains(speciesType)){
                    System.out.println("Please enter a name for your pet.");
                    String petname = input.next();
                    if (MainMenu.ArrayListExists==false){
                        if (speciesType.equals("cat")){
                            Cat newCat = new Cat (petname);
                            System.out.println("The name of your new pet is "+ 
                            newCat.toString());
                            this.currentPet = new Cat (petname);
                            this.currentPet = newCat;
                            MainMenu.petArrayList.add(this.currentPet);
                            shouldContinue=false;
                        }else{
                            Dog newDog = new Dog(petname);
                            System.out.println("The name of your new pet is "+ 
                            newDog.toString());
                            this.currentPet = newDog;
                            MainMenu.petArrayList.add(newDog);
                            shouldContinue = false;
                        }//end inner if else for if statement that no save data exists for pet arraylist
                    }else{
                        if (speciesType.equals("cat")){
                            Cat newCat = new Cat (petname);
                            for (int i = 0; i <MainMenu.petArrayList.size(); i++ ){
                                if ((newCat.isEqual(MainMenu.petArrayList.get(i)))){
                                    isMatch = true;
                                    System.out.println(isMatch);
                                }//end if for determining if current cat name is in use already
                            }//end for loop for determining if current cat name is in use already 
                            if (!isMatch){
                                System.out.println("The name of your new pet is "+ 
                                newCat.toString());
                                this.currentPet = new Cat (petname);
                                this.currentPet = newCat;
                                MainMenu.petArrayList.add(this.currentPet);
                                shouldContinue=false;
                            }else{
                                System.out.println("Cannot add duplicate pet");
                                System.out.println("List of already taken pet names and corresponding species");
                                for (int i = 0; i <MainMenu.petArrayList.size(); i++ ){
                                    System.out.println(i + ": " + MainMenu.petArrayList.get(i).toString());
                                }//end for loop for listing current pets
                            }//end if else for ensuring no duplicate cats added
                        }else{
                            Dog newDog = new Dog(petname);
                            for (int i = 0; i <MainMenu.petArrayList.size(); i++ ){
                                if ((newDog.isEqual(MainMenu.petArrayList.get(i)))){
                                    isMatch = true;
                                }//end if for determining if current cat name is in use already
                            }//end for loop for determining if current cat name is in use already 
                            
                            if (!isMatch){
                                System.out.println("The name of your new pet is "+ 
                                newDog.toString());
                                this.currentPet = newDog;
                                MainMenu.petArrayList.add(newDog);
                                shouldContinue = false;
                            }else{
                                System.out.println("Cannot add duplicate pet");
                                System.out.println("List of already taken pet names and corresponding species");
                                for (int i = 0; i <MainMenu.petArrayList.size(); i++ ){
                                    System.out.println(i + ": " + MainMenu.petArrayList.get(i).toString());
                                }//end for loop for listing current pets
                            }//end if else for ensuring no duplicate dogs added

                        }// end if else statements for determining behavior depending on species type
                    }// end if else statements for determining behavior based on whether there is a saved pet or not
                }else{
                    throw new InputMismatchException("incorrect species choice");
                }//end if statements for behavior based on whether or not user input for species is valid

            }catch (InputMismatchException e){
                System.out.println("Please choose a species option.");
            }//end try catch
        }//end while true
        shouldContinue = true;
        while (shouldContinue){
            try{
                System.out.println("Would you like to save newly created pet? Type 1 for yes or Type 0 for no.");
                int saveChoice = input.nextInt();
                if (saveChoice == 1){
                    MainMenu.savePetArrayList();
                    System.out.println(this.currentPet.toString() + " saved.");
                    shouldContinue = false;
                }else if (saveChoice == 0){
                    System.out.println("No changes saved");
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }//end inner else 
            }catch(InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end try catch
        }//end while true
    }//end createPet()
    
}//end class def
