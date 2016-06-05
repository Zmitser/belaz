package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = Transmission.DELETE, query = "DELETE from Transmission t WHERE t.id=:id"),
        @NamedQuery(name = Transmission.ALL_SORTED, query = "SELECT t FROM Transmission t ORDER BY t.name"),
})
public class Transmission {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;


    public static final String DELETE = "Transmission.delete";
    public static final String ALL_SORTED = "Transmission.getAllSorted";




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

        Transmission that = (Transmission) o;

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

    @OneToMany(mappedBy = "transmission")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public Transmission(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Transmission() {
    }

    public Transmission(String name) {
        this.name = name;
    }
}
