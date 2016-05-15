package by.eftech.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "photo")
public class Photo extends BaseEntity implements Serializable {

    @Column(name = "path")
    protected String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Photo() {
    }

    public Photo(String path) {
        this.path = path;
    }

    public Photo(Integer id, String path) {
        super(id);
        this.path = path;
    }
}
