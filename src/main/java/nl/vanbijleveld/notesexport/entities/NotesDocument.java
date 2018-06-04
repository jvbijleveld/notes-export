package nl.vanbijleveld.notesexport.entities;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import nl.vanbijleveld.notesexport.entities.NotesItemEntity;

public class NotesDocument implements Serializable {
    
    private static final long serialVersionUID = 547082517877600303L;
    private String noteId;
    private String json;
    private List<NotesItemEntity> notesItems;
    
    public NotesDocument(){
        this.notesItems = new ArrayList();
    }
    
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
    
    public void addNotesItem(NotesItemEntity item){
        this.notesItems.add(item);
    }
    
    public List<NotesItemEntity> getNotesItems(){
        return this.notesItems;
    }
    
}