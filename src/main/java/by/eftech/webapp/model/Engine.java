package by.eftech.webapp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "engine")
public class Engine extends BaseEntity implements Serializable{

    @Column(name = "name", nullable = false)
    @NotEmpty
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine() {
    }

    public Engine(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }
}
