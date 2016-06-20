package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = BrakeType.DELETE, query = "DELETE from BrakeType b WHERE b.id=:id"),
        @NamedQuery(name = BrakeType.ALL_SORTED, query = "SELECT b FROM BrakeType b ORDER BY b.name"),
})
@Entity
@Table(name = "brake_type", schema = "belaz", catalog = "")
public class BrakeType {

    public static final String DELETE = "BrakeType.delete";
    public static final String ALL_SORTED = "BrakeType.getAllSorted";


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrakeType brakeType = (BrakeType) o;

        if (id != null ? !id.equals(brakeType.id) : brakeType.id != null) return false;
        if (name != null ? !name.equals(brakeType.name) : brakeType.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "brakeType")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }


    public boolean newOject() {
        return (id == null);
    }

    public BrakeType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public BrakeType(String name) {
        this.name = name;
    }

    public BrakeType() {
    }
}
