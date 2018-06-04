package nl.vanbijleveld.notesexport.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import nl.vanbijleveld.notesexport.entities.NotesViewDocument;

import org.springframework.jdbc.core.RowMapper;

public class SluttyRowMapper implements RowMapper<Object> {

    @Override
    public NotesViewDocument mapRow(ResultSet rs, int rowNum) throws SQLException {
        NotesViewDocument doc = new NotesViewDocument();
        String retJson = "";
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            String name = rsmd.getColumnName(i);
            retJson += name + ",";
            System.out.println("Found column " + name);
        }
        doc.setJson(retJson);
        return doc;
    }

}
