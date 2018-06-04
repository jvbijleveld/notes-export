package nl.vanbijleveld.notesexport.dao;

import java.lang.invoke.MethodHandles;
import java.util.List;

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

    public void executeViewQuery(String query) {
        LOGGER.info("Execute query {}", query);
        List<Object> rows = jdbcTemplate.query(query, new SluttyRowMapper());

    }

}
