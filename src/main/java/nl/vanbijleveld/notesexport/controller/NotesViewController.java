package nl.vanbijleveld.notesexport.controller;

import java.util.List;

import nl.vanbijleveld.notesexport.entities.NotesView;
import nl.vanbijleveld.notesexport.service.NotesViewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesViewController {

    @Autowired
    NotesViewService viewService;

    @ResponseBody
    @RequestMapping("/views")
    public List<NotesView> getViewList() {
        return viewService.getAllViews();

    }

}
