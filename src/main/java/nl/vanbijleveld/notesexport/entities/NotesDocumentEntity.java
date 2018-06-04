package nl.vanbijleveld.notesexport.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NotesDocumentEntity implements Serializable {

    private static final long serialVersionUID = 547082517877600303L;
    private String noteId;
    private final List<NotesItemEntity> notesItems;

    public NotesDocumentEntity() {
        this.notesItems = new ArrayList();
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteId() {
        return this.noteId;
    }

    public void addNotesItem(NotesItemEntity item) {
        this.notesItems.add(item);
    }

    public List<NotesItemEntity> getNotesItems() {
        return this.notesItems;
    }

}
