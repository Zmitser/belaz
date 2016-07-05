package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "rear_wheels", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = RearWheels.DELETE, query = "DELETE from RearWheels r WHERE r.id=:id"),
        @NamedQuery(name = RearWheels.ALL_SORTED, query = "SELECT r FROM RearWheels r ORDER BY r.name"),
})
@Data
@NoArgsConstructor
public class RearWheels {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "rearWheels")
    private List<TruckMining> truckMinings;
    public static final String DELETE = "RearWheeels.delete";
    public static final String ALL_SORTED = "RearWheels.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public RearWheels(String name) {
        this.name = name;
    }

}
