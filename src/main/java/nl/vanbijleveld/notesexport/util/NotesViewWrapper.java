package nl.vanbijleveld.notesexport.util;

import nl.vanbijleveld.notesexport.entities.NotesView;
import nl.vanbijleveld.notesexport.entities.NotesViewEntity;

public class NotesViewWrapper {

    public static NotesView wrap(NotesViewEntity ent) {
        return new NotesView(ent.getViewName());
    }
}
