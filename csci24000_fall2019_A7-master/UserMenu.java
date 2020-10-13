//UserMenu.java


import java.util.*;
public class UserMenu{
    Scanner input = new Scanner(System.in);
    protected User user;
    public static void main(String[] args) {
        User connor = new User("1234","122222");
        UserMenu um = new UserMenu();
        um.setUser(connor);
        um.bankMenu();
    }//end main
    public void setUser(User newUser){
        user = newUser;
    }//end setUser
    public void bankMenu(){
        boolean shouldContinue = true;
        while (shouldContinue){
            System.out.println("Type 1 to access checking account. Type 2 to access savings account. Type 3 to exit");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    this.checkingMenu();
                }else if (choice == 2){
                    this.savingsMenu();
                }else if (choice == 3){
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }
        }//end while true
    }//end bankMenu
    public void checkingMenu(){
        boolean shouldContinue = true;
        while (shouldContinue==true){
            System.out.println("Type 1 to view balance. Type 2 to deposit. Type 3 to withdraw. Type 4 to exit");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    System.out.print("Current Balance: $");
                    System.out.printf("%1.2f", user.getCheckingAccount().checkBalance());
                    System.out.print('\n'); 
                } else if (choice == 2){
                    System.out.println("Please enter amount to deposit:");
                    System.out.print("$");
                    double depositAmount = input.nextDouble();
                    user.getCheckingAccount().depositMoney(depositAmount);
                    System.out.print("New balance: $"); 
                    System.out.printf("%1.2f", user.getCheckingAccount().checkBalance());
                    System.out.print('\n');
                } else if (choice == 3){
                    System.out.println("Please enter amount to withdraw:");
                    System.out.print("$");
                    double withdrawAmount = input.nextDouble();
                    if(user.getCheckingAccount().withdrawMoney(withdrawAmount)){
                    System.out.print("New balance: $"); 
                    System.out.printf("%1.2f", user.getCheckingAccount().checkBalance());
                    System.out.print('\n');
                    }
                } else if (choice == 4){
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }
        }//end while true
    }//end checkingMenu
    public void savingsMenu(){
        boolean shouldContinue = true;
        while (shouldContinue==true){
            System.out.println("Type 1 to view balance. Type 2 to deposit. Type 3 to withdraw. Type 4 to exit");
            try{
                int choice = input.nextInt();
                if (choice == 1){
                    System.out.print("Current Balance: $");
                    System.out.printf("%1.2f", user.getSavingsAccount().checkBalance());
                    System.out.print('\n');   
                }else if (choice == 2){
                    System.out.println("Please enter amount to deposit:");
                    System.out.print("$");
                    double depositAmount = input.nextDouble();
                    user.getSavingsAccount().depositMoney(depositAmount);
                    System.out.print("New balance: $"); 
                    System.out.printf("%1.2f", user.getSavingsAccount().checkBalance());
                    System.out.print('\n');
                }else if (choice == 3){
                    System.out.println("Please enter amount to withdraw:");
                    System.out.print("$");
                    double withdrawAmount = input.nextDouble();
                    if(user.getSavingsAccount().withdrawMoney(withdrawAmount)){
                        System.out.print("New balance: $"); 
                        System.out.printf("%1.2f", user.getSavingsAccount().checkBalance());
                        System.out.print('\n');
                    }
                }else if (choice == 4){
                    shouldContinue = false;
                }else{
                    System.out.println("Please choose a valid option.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please choose a valid option.");
                input.next();
            }
        }//end while true
    }// savingsMenu
}//end class def