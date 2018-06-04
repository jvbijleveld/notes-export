package nl.vanbijleveld.notesexport.controller;

import java.lang.invoke.MethodHandles;
import java.util.List;

import nl.vanbijleveld.notesexport.entities.NotesView;
import nl.vanbijleveld.notesexport.service.NotesViewService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class NotesViewController {
    private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    NotesViewService viewService;

    @ResponseBody
    @RequestMapping("/views")
    public List<NotesView> getViewList() {
        return viewService.getAllPublicViews();
    }
    
    @ResponseBody
    @RequestMapping("/hiddenviews")
    public List<NotesView> getHiddenViewList() {
        return viewService.getAllHiddenViews();
    }
    
    @ResponseBody
    @RequestMapping("/{viewName}/data")
    public String getViewData(@PathVariable String viewName){
        viewService.getViewData(viewName);
        return "Ok";
    }
    
}
