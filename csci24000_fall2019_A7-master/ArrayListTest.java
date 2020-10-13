//ArrayListTest.java
import java.util.ArrayList;
public class ArrayListTest{
    public static void main(String[] args) {
        User connor = new User("0001","1");
        User devin = new User("0002","2");
        User poppy = new User("0003","3");
        ArrayList <User> arrayU = new ArrayList<User>();
        arrayU.add(connor);
        arrayU.add(devin);
        arrayU.add(poppy);
        System.out.println(arrayU.get(1).getSavingsAccount().checkBalance());
    }
}