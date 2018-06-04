package nl.vanbijleveld.notesexport.entities;

import java.io.Serializable;

public class NotesViewDocument implements Serializable {
    
    private static final long serialVersionUID = 547082517877600303L;
    private String noteId;
    private String json;
    
    public void setNoteId(String noteId){
        this.noteId = noteId;
    }
    
    public String getNoteId(){
        return this.noteId;
    }
    
    public void setJson(String json){
        this.json = json;
    }
    
    public String getJson(){
        return this.json;
    }
    
}