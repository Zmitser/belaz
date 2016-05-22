package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "manufacturer_country")
public class ManufacturerCountry  extends NamedEntity implements Serializable{

    public ManufacturerCountry() {
    }

    public ManufacturerCountry(String name) {
        super(name);
    }

    public ManufacturerCountry(Integer id, String name) {
        super(id, name);
    }
}
