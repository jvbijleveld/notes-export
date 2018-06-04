package nl.vanbijleveld.notesexport.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

import org.springframework.jdbc.core.RowMapper;

public class SluttyRowMapper implements RowMapper{
    
    public Object mapRow(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        
        for (int i = 1; i <= rsmd.getColumnCount(); i++){
            String name = rsmd.getColumnName(i);
            System.out.println("Found column " + name);
        }
        
        return new Object();
        
    }
}
