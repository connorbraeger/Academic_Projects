//ATM.java
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ATM{
    protected UserMenu usermenu;
    protected AdminMenu adminmenu;
    protected static ArrayList<User> userArrL;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ATM a = new ATM();
        /*User connor = new User("0001","1");
        User devin = new User("0002","2");
        User poppy = new User("0003","3");
        ArrayList <User> testArrL = new ArrayList<User>();
        testArrL.add(connor);
        testArrL.add(devin);
        testArrL.add(poppy);
        ATM.userArrL= testArrL;*/
        a.getCredentials();
    }//end main
    public ATM(){
        this.usermenu = new UserMenu();
        this.adminmenu = new AdminMenu();
        ATM.userArrL= new ArrayList<User>();
        ATM.loadUserArray();
    }
    public void getCredentials(){
        boolean shouldContinue= true;
        while (shouldContinue){
            try{
                System.out.println("Please enter an Account Number:");
                String accountNumber = input.next();
                System.out.println("Please enter a Pin Number:");
                String pinNumber = input.next();
                User generic = new User(pinNumber, accountNumber);
                boolean isMatch = false;
                if (accountNumber.equals("00000") && pinNumber.equals("12345")){
                    this.adminmenu.mainAdminMenu();
                    isMatch = true;
                }//end if
                for (int i = 0; i <ATM.userArrL.size(); i++ ){
                    if (generic.isEqual(ATM.userArrL.get(i))){
                        this.usermenu.setUser(ATM.userArrL.get(i));
                        this.usermenu.bankMenu();
                        isMatch = true;
                        ATM.saveUserArray();
                        shouldContinue=false;
                        System.out.println("Thanking for banking with RETH Bank.");

                    }//end if
                }//end for
                if(isMatch==false){
                        System.out.println("Account not found. Exiting system.");
                        shouldContinue=false;
                     }//end if
            }catch(InputMismatchException e){
                System.out.println();
                input.next();
            }//end try
        }//end while
    }//end get credentials
    public static void saveUserArray(){
        try{
            FileOutputStream fos = new FileOutputStream("userArray.dat");
            ObjectOutputStream obOutStr = new ObjectOutputStream(fos);
            obOutStr.writeObject(ATM.userArrL);
            obOutStr.close();
            fos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }//end try catch
    }//end saveUserArray
    public static void loadUserArray(){
        try{
            FileInputStream fInStr = new FileInputStream("userArray.dat");
            ObjectInputStream obInStr = new ObjectInputStream(fInStr);
            ATM.userArrL = (ArrayList) obInStr.readObject();
            obInStr.close();
            fInStr.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }//end try catch
    }//end loadUserArray
}//end ATM class def

