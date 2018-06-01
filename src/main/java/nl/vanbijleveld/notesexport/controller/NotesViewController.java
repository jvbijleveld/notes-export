package nl.vanbijleveld.notesexport.controller;

import nl.vanbijleveld.notesexport.service.NotesViewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesViewController {

    @Autowired
    NotesViewService viewService;

    @RequestMapping("/views")
    public String getViewList() {
        // ToDo: fetch views
        return null;
    }

}
