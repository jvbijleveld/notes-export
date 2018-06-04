package nl.vanbijleveld.notesexport.dao;

import java.lang.invoke.MethodHandles;
import java.util.List;

import nl.vanbijleveld.notesexport.entities.NotesDocumentEntity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NotesDocumentRepository {
    private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    
    private static final String SQL_FIND_TABLENAME = "SELECT table_name FROM note_id_index WHERE note_id = ?";
    private String SQL_GETDOCUMENT_BYNOTEID = "SELECT * FROM <tableName> WHERE NOTEID = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<NotesDocumentEntity> executeViewQuery(String query) {
        LOGGER.info("Execute query {}", query);
        return jdbcTemplate.query(query, new SluttyRowMapper());
    }
    
    public String getTableNameByNoteId(String noteId){
        return jdbcTemplate.queryForObject(SQL_FIND_TABLENAME, new Object[]{noteId}, String.class);
    }
    
    public List<NotesDocumentEntity> getDocumentByNoteId(String tableName, String noteId){
        return jdbcTemplate.query(SQL_GETDOCUMENT_BYNOTEID.replace("<tableName>", tableName), new Object[]{ noteId }, new SluttyRowMapper());
    }
}