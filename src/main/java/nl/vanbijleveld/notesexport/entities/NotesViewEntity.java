package nl.vanbijleveld.notesexport.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ln_view_queries")
public class NotesViewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long viewid;

    @Column(name = "view_name")
    private String viewName;

    @Column(name = "view_alias")
    private String viewAlias;

    @Column(name = "view_query")
    private String viewQuery;

    public long getViewid() {
        return viewid;
    }

    public void setViewid(long viewid) {
        this.viewid = viewid;
    }

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
