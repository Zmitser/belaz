package by.eftech.webapp.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "suspension")
public class Suspension extends NamedEntity implements Serializable{


    public Suspension() {
    }

    public Suspension(String name) {
        super(name);
    }

    public Suspension(Integer id, String name) {
        super(id, name);
    }
}
