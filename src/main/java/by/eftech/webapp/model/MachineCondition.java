package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "machine_condition")
@NamedQueries({
        @NamedQuery(name = MachineCondition.DELETE, query = "DELETE from MachineCondition c WHERE c.id=:id"),
        @NamedQuery(name = MachineCondition.ALL_SORTED, query = "SELECT c FROM MachineCondition c ORDER BY c.name"),
})
@Data
@NoArgsConstructor
public class MachineCondition {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "machineCondition")
    private List<TruckMining> truckMinings;
    @OneToMany(mappedBy = "machineCondition")
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacities;
    public static final String DELETE = "MachineCondition.delete";
    public static final String ALL_SORTED = "MachineCondition.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public MachineCondition(String name) {
        this.name = name;
    }
}

