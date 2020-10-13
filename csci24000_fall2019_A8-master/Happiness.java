//Happiness.java
import java.util.*;
import java.io.*;

public class Happiness extends Attribute implements Serializable{
    private static final long serialVersionUID= 42L;
    public Happiness(){
        this.attributeArray = new String[] {"furious", "unhappy", "mildly pleased", "happy", "joyous"};
        this.currentStatus = attributeArray[2];
        this.attributeArrayIndex = 2;
    }
}