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

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<NotesDocumentEntity> executeViewQuery(String query) {
        LOGGER.info("Execute query {}", query);
        return jdbcTemplate.query(query, new SluttyRowMapper());
    }

}
