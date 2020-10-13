//CheckingAccount.java
import java.io.Serializable;
public class CheckingAccount implements Serializable{
    protected double balance;
    private static final long serialVersionUID= 42L;
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount();
        System.out.println(c.balance);
        c.depositMoney(110.50);
        System.out.println(c.balance);
        c.withdrawMoney(200.10);
        c.withdrawMoney(75.0);
        System.out.println(c.balance);
        System.out.println(c.checkBalance());

    }//end main
    public CheckingAccount(){
        this.balance = 0;
    }//end constructor
    public void depositMoney(double deposit){
        this.balance = this.balance + deposit;
    }//end depositMoney
    public boolean withdrawMoney(double withdrawal){
        if ((this.balance - withdrawal) < 0){
            System.out.println("Insufficient funds");
            return false;
        }else{
            this.balance = this.balance - withdrawal;
            return true;
        }//end else
    }//end withdrawMoney
    public double checkBalance(){
        return this.balance;
    }//end CheckBalance
}
