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
    @Column(name = "view_id")
    private long viewId;

    @Column(name = "view_name")
    private String viewName;

    @Column(name = "view_alias")
    private String viewAlias;

    @Column(name = "view_query")
    private String viewQuery;
    
    @Column(name = "view_hidden")
    private Boolean isHidden;


    public long getViewId() {
        return viewId;
    }

    public void setViewId(long viewId) {
        this.viewId = viewId;
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
    
    public Boolean getIsHidden(){
        return this.isHidden;
    }
    
    public void setIsHidden(Boolean isHidden){
        this.isHidden = isHidden;
    }
}
