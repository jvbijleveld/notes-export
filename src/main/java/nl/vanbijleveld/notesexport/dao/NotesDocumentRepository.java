package nl.vanbijleveld.notesexport.dao;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Repository
public class NotesDocumentRepository {
    private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void executeViewQuery(String query){
        LOGGER.info("Execute query {}", query);
        List<Map> rows = jdbcTemplate.queryForList(query, new SluttyRowMapper());
       
    }
    
}
