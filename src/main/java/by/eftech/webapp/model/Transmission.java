package by.eftech.webapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "transmission")
public class Transmission extends BaseEntity implements Serializable {

    @Column(name = "name")
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transmission() {
    }

    public Transmission(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public Transmission(String name) {
        this.name = name;
    }
}
