//Health.java
import java.util.*;
import java.io.*;

public class Health extends Attribute implements Serializable{
    private static final long serialVersionUID= 42L;
    public Health(){
        this.attributeArray = new String[] {"dead", "near death", "ill", "healthy"};
        this.currentStatus = attributeArray[3];
        this.attributeArrayIndex = 3;
    }
    public boolean increaseAttribute(){
        if(attributeArray.length -1 == this.attributeArrayIndex){
            return false;
        }else if(this.attributeArrayIndex== 0){
            System.out.println("Cannot revive a dead pet.");
            return false;
        }else{
            this.attributeArrayIndex++;
            this.setCurrentStatus();
            return true;
        }//end else  
    }//overwrote increaseAttribute to account for immutable nature of a dead animal.
}