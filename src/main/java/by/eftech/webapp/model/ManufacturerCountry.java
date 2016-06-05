package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturer_country", schema = "belaz", catalog = "")
@NamedQueries({
        @NamedQuery(name = ManufacturerCountry.DELETE, query = "DELETE from ManufacturerCountry m WHERE m.id=:id"),
        @NamedQuery(name = ManufacturerCountry.ALL_SORTED, query = "SELECT m FROM ManufacturerCountry m ORDER BY m.name"),
})
public class ManufacturerCountry {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;


    public static final String DELETE = "ManufacturerCountry.delete";
    public static final String ALL_SORTED = "ManufacturerCountry.getAllSorted";
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManufacturerCountry that = (ManufacturerCountry) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "manufacturerCountry")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public ManufacturerCountry(String name) {
        this.name = name;
    }

    public ManufacturerCountry(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ManufacturerCountry() {
    }


}
