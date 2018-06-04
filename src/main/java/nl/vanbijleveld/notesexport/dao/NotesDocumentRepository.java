package nl.vanbijleveld.notesexport.dao;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import nl.vanbijleveld.notesexport.entities.NotesViewDocument;

@Repository
public class NotesDocumentRepository {
    private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void executeViewQuery(String query) {
        LOGGER.info("Execute query {}", query);
        List<NotesViewDocument> rows = jdbcTemplate.query(query, new SluttyRowMapper());

    }

}
