package nl.vanbijleveld.notesexport.entities;

import java.io.Serializable;

public class NotesItemEntity implements Serializable {

    private static final long serialVersionUID = 54702323249000303L;
    private String itemName;
    private Object itemValue;

    public NotesItemEntity(String itemName, Object itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemValue(Object itemValue) {
        this.itemValue = itemValue;
    }

    public Object getItemValue() {
        return this.itemValue;
    }

}
