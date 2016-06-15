package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Lenovo on 15.06.2016.
 */
@Entity
public class Engine {
    private Integer id;
    private String name;
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacity;
    private List<MiningMachinery> miningMachineries;
    private List<TruckMining> truckMinings;

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

        Engine engine = (Engine) o;

        if (id != null ? !id.equals(engine.id) : engine.id != null) return false;
        if (name != null ? !name.equals(engine.name) : engine.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "engine")
    public List<DumpTrucksCrossCountryCapacity> getDumpTrucksCrossCountryCapacity() {
        return dumpTrucksCrossCountryCapacity;
    }

    public void setDumpTrucksCrossCountryCapacity(List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacity) {
        this.dumpTrucksCrossCountryCapacity = dumpTrucksCrossCountryCapacity;
    }

    @OneToMany(mappedBy = "engine")
    public List<MiningMachinery> getMiningMachineries() {
        return miningMachineries;
    }

    public void setMiningMachineries(List<MiningMachinery> miningMachineries) {
        this.miningMachineries = miningMachineries;
    }

    @OneToMany(mappedBy = "engine")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }
}
