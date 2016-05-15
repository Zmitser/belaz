package by.eftech.webapp.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "suspension")
public class Suspension extends BaseEntity implements Serializable{

    @Column(name = "name", nullable = false)
    @NotEmpty
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Suspension() {
    }

    public Suspension(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public Suspension(String name) {
        this.name = name;
    }
}
