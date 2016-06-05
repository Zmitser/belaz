package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = Auxiliary.DELETE, query = "DELETE from Auxiliary a WHERE a.id=:id"),
        @NamedQuery(name = Auxiliary.ALL_SORTED, query = "SELECT a FROM Auxiliary a ORDER BY a.name"),
})
public class Auxiliary {
    public static final String DELETE = "Auxiliary.delete";
    public static final String ALL_SORTED = "Auxiliary.getAllSorted";


    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;

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

    public boolean newOject() {
        return (this.id == null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auxiliary auxiliary = (Auxiliary) o;

        if (id != null ? !id.equals(auxiliary.id) : auxiliary.id != null) return false;
        if (name != null ? !name.equals(auxiliary.name) : auxiliary.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "auxiliary")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public Auxiliary(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Auxiliary(String name) {
        this.name = name;
    }

    public Auxiliary() {
    }
}
