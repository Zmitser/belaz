package by.eftech.webapp.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "front_wheels")
public class FrontWheels extends NamedEntity implements Serializable{

    public FrontWheels() {
    }

    public FrontWheels(String name) {
        super(name);
    }

    public FrontWheels(Integer id, String name) {
        super(id, name);
    }
}
