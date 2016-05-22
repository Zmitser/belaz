package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "video")
public class Video extends NamedEntity implements Serializable{

    public Video() {
    }

    public Video(String name) {
        super(name);
    }

    public Video(Integer id, String name) {
        super(id, name);
    }
}
