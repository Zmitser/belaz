package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "brake_type", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = BrakeType.DELETE, query = "DELETE from BrakeType b WHERE b.id=:id"),
        @NamedQuery(name = BrakeType.ALL_SORTED, query = "SELECT b FROM BrakeType b ORDER BY b.name"),
})
@Data
@NoArgsConstructor
public class BrakeType {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "brakeType")
    private List<TruckMining> truckMinings;
    public static final String DELETE = "BrakeType.delete";
    public static final String ALL_SORTED = "BrakeType.getAllSorted";
    public boolean newOject() {
        return (id == null);
    }
    public BrakeType(String name) {
        this.name = name;
    }



}
