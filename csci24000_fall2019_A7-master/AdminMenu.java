//AdminUser.java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class AdminMenu{
    Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        User connor = new User("0001","1");
        User devin = new User("0002","2");
        User poppy = new User("0003","3");
        ArrayList <User> testArrL = new ArrayList<User>();
        testArrL.add(connor);
        testArrL.add(devin);
        testArrL.add(poppy);
        AdminMenu a = new AdminMenu();
        ATM.userArrL = testArrL;
        a.mainAdminMenu();

    }
    public void addUser(){
        System.out.println("Enter new user Account Number:");
        String newAccountNum = input.next();
        System.out.println("Enter new user PIN Number:");
        String newPINnum = input.next();
        User addedUser = new User(newPINnum,newAccountNum);
        boolean isMatch = false;
        for (int i = 0; i <ATM.userArrL.size(); i++ ){
            if ((addedUser.isEqual(ATM.userArrL.get(i))==true)){
                isMatch = true;
            }//end if
        }//end for
        if (isMatch == false){
            ATM.userArrL.add(addedUser);
        }
        else{
            System.out.println("Cannot add duplicate user");
        }
    }//end addUser()
    public void deleteUser(){
        System.out.println("Enter Account Number of user to be deleted:");
        String delAccountNum = input.next();
        System.out.println("Enter PIN Number of user to be deleted:");
        String delPINnum = input.next();
        User deletedUser = new User(delPINnum,delAccountNum);
        boolean isMatch = false;
        for (int i = 0; i <ATM.userArrL.size(); i++ ){
            if ((deletedUser.isEqual(ATM.userArrL.get(i))==true)){
                if((ATM.userArrL.get(i).getCheckingAccount().checkBalance()==0) && (ATM.userArrL.get(i).getSavingsAccount().checkBalance()==0)){
                    
                    isMatch = true;
                    ATM.userArrL.remove(i);
                }else{
                    System.out.println("Cannot delete user with non empty account.");
                    isMatch = true;
                }
            }//end if
        }//end for
        if (isMatch == false){
            System.out.println("No matching user found");
        }//end if

    }//end deleteUser
    public void applyInterestToAll(){
        System.out.println("Enter time period in months:");
        boolean shouldContinue = true;
        input.next();
        while(shouldContinue){
            try{
                double interestTime = input.nextDouble();
                if (interestTime>=0){
                    for (int i = 0; i <ATM.userArrL.size(); i++ ){
                        ATM.userArrL.get(i).getSavingsAccount().appplyInterestRate(interestTime);
                    }//end for
                    shouldContinue=false;
                }else{
                    System.out.println("Please enter a valid time.");
                    input.next();
                }//end else
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid time.");
                input.next();
            }//end for loop
        }//end while loop
    }//end applyInterestToAll
    public void listAllUsers(){
        String userList = "";
        for (int i = 0; i <ATM.userArrL.size(); i++ ){
            userList = userList + ATM.userArrL.get(i).toString() + '\n';
        }
        System.out.println(userList);
    }//end listAllUsers
    public void mainAdminMenu(){
        boolean shouldContinue = true;
        while (shouldContinue){
            System.out.println("Type 1 to add a user. Type 2 to delete a user. Type 3 to list all users. " + '\n'
            + "Type 4 to apply interest to all savings accounts. Type 5 to exit");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    this.addUser();
                }else if (choice == 2){
                    this.deleteUser();
                }else if (choice==3){
                    this.listAllUsers();
                }else if (choice == 4){
                    this.applyInterestToAll();
                }else if (choice == 5){
                    System.out.println("Would you like to save userArrayL? Type 1 for yes or Type 0 for no.");
                    int saveChoice = input.nextInt();
                    if (saveChoice == 1){
                        ATM.saveUserArray();
                        System.out.println("UserArrayL Overwritten");

                    }else{
                        System.out.println("No changes saved");
                    }//end if/else
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch(InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }//end try catch
        }//end while true
    }//end bankMenu
    
}