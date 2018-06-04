package nl.vanbijleveld.notesexport.entities;

import java.io.Serializable;

public class NotesItemEntity implements Serializable {
    
    private static final long serialVersionUID = 54702323249000303L;
    private String itemName;
    private String itemValue;
    
    public NotesItemEntity(String itemName, String itemValue){
        this.itemName = itemName;
        this.itemValue = itemValue;
    }
    
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    
    public String getItemName(){
        return this.itemName;
    }
    
    public void setItemValue(String itemValue){
        this.itemValue = itemValue;
    }
    
    public String getItemValue(){
        return this.itemValue;
    }
    
}