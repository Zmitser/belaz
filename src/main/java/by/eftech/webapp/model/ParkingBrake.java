package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "parking_brake", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = ParkingBrake.DELETE, query = "DELETE from ParkingBrake p WHERE p.id=:id"),
        @NamedQuery(name = ParkingBrake.ALL_SORTED, query = "SELECT p FROM ParkingBrake p ORDER BY p.name"),
})
@Data
@NoArgsConstructor
public class ParkingBrake {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "parkingBrake")
    private List<TruckMining> truckMinings;
    public static final String DELETE = "ParkingBrake.delete";
    public static final String ALL_SORTED = "ParkingBrake.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public ParkingBrake(String name) {
        this.name = name;
    }

}
