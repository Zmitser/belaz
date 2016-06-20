package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "machine_location", schema = "belaz", catalog = "")
@NamedQueries({
        @NamedQuery(name = MachineLocation.DELETE, query = "DELETE from MachineLocation l WHERE l.id=:id"),
        @NamedQuery(name = MachineLocation.ALL_SORTED, query = "SELECT l FROM MachineLocation l ORDER BY l.name"),
})
public class MachineLocation {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;

    public static final String DELETE = "MachineLocation.delete";
    public static final String ALL_SORTED = "MachineLocation.getAllSorted";

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

        MachineLocation that = (MachineLocation) o;

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

    @OneToMany(mappedBy = "machineLocation")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public MachineLocation(String name) {
        this.name = name;
    }

    public MachineLocation() {
    }

    public MachineLocation(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
