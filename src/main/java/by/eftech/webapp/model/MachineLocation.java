package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Lenovo on 15.06.2016.
 */
@Entity
@Table(name = "machine_location", schema = "belaz", catalog = "")
public class MachineLocation {
    private Integer id;
    private String name;
    private DumpTrucksCrossCountryCapacity dumpTrucksCrossCountryCapacity;
    private List<MiningMachinery> miningMachineries;
    private TruckMining truckMinings;

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

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "machine_location_id", nullable = false)
    public DumpTrucksCrossCountryCapacity getDumpTrucksCrossCountryCapacity() {
        return dumpTrucksCrossCountryCapacity;
    }

    public void setDumpTrucksCrossCountryCapacity(DumpTrucksCrossCountryCapacity dumpTrucksCrossCountryCapacity) {
        this.dumpTrucksCrossCountryCapacity = dumpTrucksCrossCountryCapacity;
    }

    @OneToMany(mappedBy = "machineLocation")
    public List<MiningMachinery> getMiningMachineries() {
        return miningMachineries;
    }

    public void setMiningMachineries(List<MiningMachinery> miningMachineries) {
        this.miningMachineries = miningMachineries;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "machine_location_id", nullable = false)
    public TruckMining getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(TruckMining truckMinings) {
        this.truckMinings = truckMinings;
    }
}
