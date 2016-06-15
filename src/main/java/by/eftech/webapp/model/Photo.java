package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Lenovo on 15.06.2016.
 */
@Entity
public class Photo {
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

        Photo photo = (Photo) o;

        if (id != null ? !id.equals(photo.id) : photo.id != null) return false;
        if (name != null ? !name.equals(photo.name) : photo.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToMany
    @JoinTable(name = "dump_trucks_cross_country_capacity_has_photo", catalog = "", schema = "belaz", joinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "dump_trucks_cross_country_capacity_id", referencedColumnName = "id", nullable = false))
    public List<DumpTrucksCrossCountryCapacity> getDumpTrucksCrossCountryCapacity() {
        return dumpTrucksCrossCountryCapacity;
    }

    public void setDumpTrucksCrossCountryCapacity(List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacity) {
        this.dumpTrucksCrossCountryCapacity = dumpTrucksCrossCountryCapacity;
    }

    @ManyToMany
    @JoinTable(name = "mining machinery_has_photo", catalog = "", schema = "belaz", joinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "mining machinery_id", referencedColumnName = "id", nullable = false))
    public List<MiningMachinery> getMiningMachineries() {
        return miningMachineries;
    }

    public void setMiningMachineries(List<MiningMachinery> miningMachineries) {
        this.miningMachineries = miningMachineries;
    }

    @ManyToMany
    @JoinTable(name = "truck_mining_has_photo", catalog = "", schema = "belaz", joinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "truck_mining_id", referencedColumnName = "id", nullable = false))
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }
}
