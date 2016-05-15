package by.eftech.webapp.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "series")
public class Series extends BaseEntity implements Serializable {

    @Column(name = "name", nullable = false)
    @NotEmpty
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series() {
    }


    public Series(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public Series(String name) {
        this.name = name;
    }
}
