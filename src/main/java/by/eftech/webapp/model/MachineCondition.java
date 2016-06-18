package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "machine_condition", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = MachineCondition.DELETE, query = "DELETE from MachineCondition c WHERE c.id=:id"),
        @NamedQuery(name = MachineCondition.ALL_SORTED, query = "SELECT c FROM MachineCondition c ORDER BY c.name"),
})
public class MachineCondition {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacities;


    public static final String DELETE = "MachineCondition.delete";
    public static final String ALL_SORTED = "MachineCondition.getAllSorted";
    @Id
    @Column(name = "id")
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

        MachineCondition that = (MachineCondition) o;

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


    @OneToMany(mappedBy = "machineCondition")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }


    @OneToMany(mappedBy = "machineCondition")
    public List<DumpTrucksCrossCountryCapacity> getDumpTrucksCrossCountryCapacities() {
        return dumpTrucksCrossCountryCapacities;
    }

    public void setDumpTrucksCrossCountryCapacities(List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacities) {
        this.dumpTrucksCrossCountryCapacities = dumpTrucksCrossCountryCapacities;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public MachineCondition() {
    }

    public MachineCondition(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public MachineCondition(String name) {
        this.name = name;
    }
}
