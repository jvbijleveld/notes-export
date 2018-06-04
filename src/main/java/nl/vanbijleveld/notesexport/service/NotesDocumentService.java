package nl.vanbijleveld.notesexport.service;

import java.util.ArrayList;
import java.util.List;

import nl.vanbijleveld.notesexport.dao.NotesDocumentRepository;
import nl.vanbijleveld.notesexport.entities.NotesDocumentEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesDocumentService {

    @Autowired
    NotesDocumentRepository docRepo;

    public NotesDocumentEntity getDocByNoteId(String noteId) {
        String tableName = docRepo.getTableNameByNoteId(noteId);
        List<NotesDocumentEntity> doc = docRepo.getDocumentByNoteId(tableName, noteId);
        return ((doc.size() > 0)? doc.get(0) : null);
    }
}