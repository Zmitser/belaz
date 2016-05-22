package by.eftech.webapp.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "series")
public class Series extends NamedEntity implements Serializable {

    public Series() {
    }

    public Series(String name) {
        super(name);
    }

    public Series(Integer id, String name) {
        super(id, name);
    }
}
