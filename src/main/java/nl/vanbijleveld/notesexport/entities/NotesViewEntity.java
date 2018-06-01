package nl.vanbijleveld.notesexport.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ln_view_queries")
public class NotesViewEntity {

    @Column(name = "view_name")
    private String viewName;

    @Column(name = "view_alias")
    private String viewAlias;

    @Column(name = "view_query")
    private String viewQuery;

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getViewAlias() {
        return viewAlias;
    }

    public void setViewAlias(String viewAlias) {
        this.viewAlias = viewAlias;
    }

    public String getViewQuery() {
        return viewQuery;
    }

    public void setViewQuery(String viewQuery) {
        this.viewQuery = viewQuery;
    }

}
