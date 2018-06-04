package nl.vanbijleveld.notesexport.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import nl.vanbijleveld.notesexport.entities.NotesDocument;
import nl.vanbijleveld.notesexport.entities.NotesItemEntity;

import org.springframework.jdbc.core.RowMapper;

public class SluttyRowMapper implements RowMapper<Object> {

    @Override
    public NotesDocument mapRow(ResultSet rs, int rowNum) throws SQLException {
        NotesDocument doc = new NotesDocument();
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            String name = rsmd.getColumnName(i);
            String val = rs.getString(name);
            doc.addNotesItem(new NotesItemEntity(name,val));
            
            System.out.println("Found column " + name + ": " + val);
        }
        return doc;
    }
    
    private getColumnValue(ResultSet rs, String columnName, SqlType type){
        
        
    }

}
