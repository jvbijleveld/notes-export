package nl.vanbijleveld.notesexport.entities;

import java.io.Serializable;

public class NotesView implements Serializable {

    private static final long serialVersionUID = 5470825150249000303L;
    private String viewName;
    private long viewId;

    public NotesView(String name) {
        this.viewName = name;
    }
    
    public NotesView(long id, String name) {
        this.viewName = name;
        this.viewId = id;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
    
    public long getViewId(){
        return this.viewId;
    }

    public void setViewId(long id){
        this.viewId = id;
    }
}
