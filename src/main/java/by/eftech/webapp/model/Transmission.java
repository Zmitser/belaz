package by.eftech.webapp.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "transmission")
public class Transmission extends NamedEntity implements Serializable {
    public Transmission() {
    }

    public Transmission(String name) {
        super(name);
    }

    public Transmission(Integer id, String name) {
        super(id, name);
    }
}
