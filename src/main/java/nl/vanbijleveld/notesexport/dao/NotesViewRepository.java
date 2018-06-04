package nl.vanbijleveld.notesexport.dao;

import nl.vanbijleveld.notesexport.entities.NotesViewEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesViewRepository extends CrudRepository<NotesViewEntity, String> {

    NotesViewEntity findOneByViewName(String viewName);
    
    Iterable<NotesViewEntity> findByIsHidden(Boolean b);

}
