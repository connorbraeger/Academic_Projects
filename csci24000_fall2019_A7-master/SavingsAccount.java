import java.io.*;
import java.util.*;

//SavingsAccount.java
public class SavingsAccount extends CheckingAccount implements Serializable{
    private double interestRate;
    private static final long serialVersionUID= 42L;
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        System.out.println("s original balance :" +s.balance);
        System.out.println("s original original interest rate :" +s.interestRate);
        s.depositMoney(110.50);
        System.out.println("s new balance: " +s.balance);
        s.withdrawMoney(200.10);
        s.withdrawMoney(75.0);
        System.out.println("s balance after withdrawal: " + s.balance);
        System.out.println("s balance after withdrawal: " +s.checkBalance());
        s.setInterestRate(0.10);
        System.out.println("s new interest rate :" + s.getInterestRate());
        s.appplyInterestRate(2);
        System.out.println("s balance after interest: " + s.balance);
        System.out.println("s balance after interest: " +s.checkBalance());
        SavingsAccount s2 = new SavingsAccount(3);
        System.out.println("s original original interest rate :" +s2.getInterestRate());

    }
    public SavingsAccount(){
        this.interestRate = 0;
    }//end default constructor
    public SavingsAccount(double rate){
        this.interestRate = rate;
        
    }//end constructor
    public void setInterestRate(double newRate){
        this.interestRate= newRate;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    //end setInterestRate
    public void appplyInterestRate(double time)throws InputMismatchException{
        if (time >= 0){
            double A = this.balance * (1 + (this.interestRate*time));
            this.balance = A + this.balance;}
        else{
            throw new InputMismatchException("negative time");
        }
    }//end applyInterestRate
}//end class definition


