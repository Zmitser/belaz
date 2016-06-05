package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Manufacturer.DELETE, query = "DELETE from Manufacturer m WHERE m.id=:id"),
        @NamedQuery(name = Manufacturer.ALL_SORTED, query = "SELECT m FROM Manufacturer m ORDER BY m.name"),
})
public class Manufacturer {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;


    public static final String DELETE = "Manufacturer.delete";
    public static final String ALL_SORTED = "Manufacturer.getAllSorted";

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

        Manufacturer that = (Manufacturer) o;

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

    @OneToMany(mappedBy = "manufacturer")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public Manufacturer(String name) {
        this.name = name;
    }

    public Manufacturer() {
    }

    public Manufacturer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
