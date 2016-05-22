package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "rear_wheels")
public class RearWheels extends NamedEntity implements Serializable{
    public RearWheels() {
    }

    public RearWheels(String name) {
        super(name);
    }

    public RearWheels(Integer id, String name) {
        super(id, name);
    }
}
