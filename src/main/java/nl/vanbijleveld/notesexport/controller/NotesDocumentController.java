package nl.vanbijleveld.notesexport.controller;

import java.lang.invoke.MethodHandles;
import java.util.List;

import nl.vanbijleveld.notesexport.entities.NotesDocumentEntity;
import nl.vanbijleveld.notesexport.service.NotesDocumentService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesDocumentController {
    private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    NotesDocumentService documentService;

    
    @ResponseBody
    @RequestMapping("/doc/{noteId}")
    public NotesDocumentEntity getViewData(@PathVariable String noteId) {
        return documentService.getDocByNoteId(noteId);
    }

    
}
