package nl.vanbijleveld.notesexport.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import nl.vanbijleveld.notesexport.entities.NotesDocument;
import nl.vanbijleveld.notesexport.entities.NotesItemEntity;

import org.springframework.jdbc.core.RowMapper;

public class SluttyRowMapper implements RowMapper<Object> {

    @Override
    public NotesDocument mapRow(ResultSet rs, int rowNum) throws SQLException {
        NotesDocument doc = new NotesDocument();
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            doc.addNotesItem(createNotesItemFromColumn(rs, i));
        }
        return doc;
    }

    private NotesItemEntity createNotesItemFromColumn(ResultSet rs, int index) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        String name = rsmd.getColumnName(index);
        Object val = null;

        switch (rsmd.getColumnType(index)) {

        case Types.VARCHAR:
            val = rs.getString(name);
        case Types.INTEGER:
            val = rs.getInt(name);
        case Types.DATE:
            val = rs.getDate(name);
        case Types.CLOB:
            val = rs.getString(name);
        }
        System.out.println("Created NotesItem " + name + ": " + val);
        return new NotesItemEntity(name, val);
    }
}
