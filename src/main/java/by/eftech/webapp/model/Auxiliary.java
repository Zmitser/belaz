package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "auxiliary")
public class Auxiliary extends NamedEntity implements Serializable {

    public Auxiliary() {
    }

    public Auxiliary(String name) {
        super(name);
    }

    public Auxiliary(Integer id, String name) {
        super(id, name);
    }
}
