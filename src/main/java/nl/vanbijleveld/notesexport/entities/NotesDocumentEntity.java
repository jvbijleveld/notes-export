package nl.vanbijleveld.notesexport.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class NotesDocumentEntity implements Serializable {

    private static final long serialVersionUID = 547082517877600303L;
    private String noteId;
    private final Map notesItems;

    public NotesDocumentEntity() {
        this.notesItems = new HashMap();
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteId() {
        return this.noteId;
    }

    public void addNotesItem(String name, Object value) {
        this.notesItems.put(name, value);
    }

    public Map getNotesItems() {
        return this.notesItems;
    }

}
