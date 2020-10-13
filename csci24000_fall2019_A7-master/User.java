//User.java
import java.io.*;

public class User implements Serializable {
    private static final long serialVersionUID= 42L;
    private String pin;
    private String accountNumber;
    private CheckingAccount c;
    private SavingsAccount s;
    public static void main(String[] args) {
        User u = new User("1234","456");
        User v = new User("1234","456");
        User w = new User("4567","123");
        System.out.println("User Pin Number: " +u.getPin());
        System.out.println("User AccountNum: " +u.getAccountNumber());
        System.out.println("User CheckingBalance: " +u.c.balance);
        if (u.isEqual(v)==true){
            System.out.println("isEqual functions properly");
        }else{
            System.out.println("isEqual is a failure");
        }
        if (u.isEqual(w)==true){
            System.out.println("isEqual is a failure");
        }else{
            System.out.println("isEqual fucntions properly");
        }
    }// end main
    public User( String pinNum, String accountNum){
        this.pin = pinNum;
        this.accountNumber = accountNum;
        this.c = new CheckingAccount();
        this.s = new SavingsAccount();

    }//end constructor
    public String getPin(){
        return this.pin;
    }// end getPin
    public String getAccountNumber(){
        return this.accountNumber;
    }//end getAccountNumber
    public CheckingAccount getCheckingAccount(){
        return this.c;
    }//end getCheckingAccount
    public SavingsAccount getSavingsAccount(){
        return this.s;
    }//get SavingsAccount
    public boolean isEqual(User otherUser){
        if ((this.getPin().equals(otherUser.getPin()) && (this.getAccountNumber().equals(otherUser.getAccountNumber())))){
            return true;
        }else{
            return false;
        }
    }//end isEqual
    public String toString(){
        return "Account Number: " + this.accountNumber + " PIN Number: " + this.pin + " Checking Account Balance:" + this.getCheckingAccount().checkBalance() +
        " Savings Account Balance:" + this.getSavingsAccount().checkBalance();
    }

}// class def