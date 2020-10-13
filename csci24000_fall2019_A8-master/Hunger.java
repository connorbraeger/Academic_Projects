//Hunger.java
import java.util.*;
import java.io.*;

public class Hunger extends Attribute implements Serializable{
    private static final long serialVersionUID= 42L;
    //protected static String[] attributeArray = {"Starving", "Hungry", "Content", "Full", "Stuffed"};
    public Hunger(){
        this.attributeArray = new String[] {"starving", "hungry", "content", "full", "stuffed"};
        this.currentStatus = attributeArray[2];
        this.attributeArrayIndex = 2;
    }
    public static void main(String[] args) {
        Hunger h = new Hunger();
        System.out.println(h.currentStatus);
        h.decreaseAttribute();
        System.out.println(h.currentStatus);
        h.decreaseAttribute();
        System.out.println(h.currentStatus);
        h.decreaseAttribute();
        System.out.println(h.currentStatus);
        h.increaseAttribute();
        System.out.println(h.currentStatus);
        h.increaseAttribute();
        System.out.println(h.currentStatus);
        h.increaseAttribute();
        System.out.println(h.currentStatus);
        h.increaseAttribute();
        System.out.println(h.currentStatus);

    }
    
}