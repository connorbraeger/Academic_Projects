//Attribute.java
import java.util.*;
import java.io.*;

public abstract class Attribute implements Serializable{
    private static final long serialVersionUID= 42L;
    protected String currentStatus;
    protected String[] attributeArray;
    protected int attributeArrayIndex;
    public String getCurrentStatus(){
        return this.currentStatus;
    }
    public void setCurrentStatus(){
        
        this.currentStatus = attributeArray[this.attributeArrayIndex];
    }
    public boolean increaseAttribute(){
        if(attributeArray.length -1 == this.attributeArrayIndex){
            return false;
        }
        else{
            this.attributeArrayIndex++;
            this.setCurrentStatus();
            return true;
        }//end else  
    }
    public boolean decreaseAttribute(){
        if(0 == this.attributeArrayIndex){
            return false;
        }else{
            this.attributeArrayIndex--;
            this.setCurrentStatus();
            return true;
        }//end else
    }
}//end class definition