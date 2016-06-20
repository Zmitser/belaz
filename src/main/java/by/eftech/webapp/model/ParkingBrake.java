package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "parking_brake")
@NamedQueries({
        @NamedQuery(name = ParkingBrake.DELETE, query = "DELETE from ParkingBrake p WHERE p.id=:id"),
        @NamedQuery(name = ParkingBrake.ALL_SORTED, query = "SELECT p FROM ParkingBrake p ORDER BY p.name"),
})
public class ParkingBrake {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;

    public static final String DELETE = "ParkingBrake.delete";
    public static final String ALL_SORTED = "ParkingBrake.getAllSorted";

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

        ParkingBrake that = (ParkingBrake) o;

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

    @OneToMany(mappedBy = "parkingBrake")
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public boolean newOject() {
        return (this.id == null);
    }


    public ParkingBrake(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ParkingBrake(String name) {
        this.name = name;
    }

    public ParkingBrake() {
    }
}
