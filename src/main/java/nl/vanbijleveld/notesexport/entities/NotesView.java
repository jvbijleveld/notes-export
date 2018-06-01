package nl.vanbijleveld.notesexport.entities;

import java.io.Serializable;

public class NotesView implements Serializable {

    private static final long serialVersionUID = 5470825150249000303L;
    private String viewName;

    public NotesView(String name) {
        this.viewName = name;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

}
