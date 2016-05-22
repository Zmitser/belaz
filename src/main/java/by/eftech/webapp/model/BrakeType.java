package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "brake_type")
public class BrakeType  extends NamedEntity implements Serializable{

    public BrakeType() {
    }

    public BrakeType(String name) {
        super(name);
    }

    public BrakeType(Integer id, String name) {
        super(id, name);
    }
}
