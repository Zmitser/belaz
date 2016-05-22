package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "manufacturer")
public class Manufacturer extends NamedEntity implements Serializable{

    public Manufacturer() {
    }

    public Manufacturer(String name) {
        super(name);
    }

    public Manufacturer(Integer id, String name) {
        super(id, name);
    }
}
