package nl.vanbijleveld.notesexport.dao;

import java.lang.invoke.MethodHandles;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import nl.vanbijleveld.notesexport.entities.NotesDocumentEntity;
import nl.vanbijleveld.notesexport.entities.NotesItemEntity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

public class SluttyRowMapper implements RowMapper<NotesDocumentEntity> {
    private static String NOTE_ID_COLUMN = "NOTEID";

    private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public NotesDocumentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        NotesDocumentEntity doc = new NotesDocumentEntity();
        ResultSetMetaData rsmd = rs.getMetaData();

        doc.setNoteId(rs.getString(NOTE_ID_COLUMN));
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            createNotesItemFromColumn(rs, rsmd, i, doc);
        }
        return doc;
    }

    private void createNotesItemFromColumn(ResultSet rs, ResultSetMetaData rsmd, int index, NotesDocumentEntity doc) throws SQLException {
        String name = rsmd.getColumnName(index);
        Object val = null;

        if (NOTE_ID_COLUMN.equals(name)) {
            //return;
        }
        switch (rsmd.getColumnType(index)) {
        case Types.VARCHAR:
            val = rs.getString(name);
            break;
        case Types.INTEGER:
            val = rs.getInt(name);
            break;
        }
        LOGGER.debug("Created NotesItem {} : {}", name, val);
        doc.addNotesItem(new NotesItemEntity(name, val));
    }
}
