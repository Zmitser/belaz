package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "engine")
public class Engine extends NamedEntity implements Serializable {

    public Engine() {
    }

    public Engine(String name) {
        super(name);
    }

    public Engine(Integer id, String name) {
        super(id, name);
    }
}
