package nl.vanbijleveld.notesexport.service;

import java.util.ArrayList;
import java.util.List;

import nl.vanbijleveld.notesexport.dao.NotesViewRepository;
import nl.vanbijleveld.notesexport.entities.NotesView;
import nl.vanbijleveld.notesexport.entities.NotesViewEntity;
import nl.vanbijleveld.notesexport.util.NotesViewWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesViewService {

    @Autowired
    NotesViewRepository viewRepo;

    public List<NotesView> getAllPublicViews() {
        return iterableToList(viewRepo.findByIsHidden(false));
    }
    
    public List<NotesView> getAllHiddenViews() {
        return iterableToList(viewRepo.findByIsHidden(true));
    }
    
    private List<NotesView> iterableToList(Iterable<NotesViewEntity> list){
        List<NotesView> viewList = new ArrayList<>();
        for (NotesViewEntity vw : list) {
            viewList.add(NotesViewWrapper.wrap(vw));
        }
        return viewList;
    }

}
