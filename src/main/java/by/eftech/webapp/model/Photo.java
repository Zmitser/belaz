package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "photo")

public class Photo extends NamedEntity implements Serializable {

    public Photo() {
    }

    public Photo(String name) {
        super(name);
    }

    public Photo(Integer id, String name) {
        super(id, name);
    }
}
