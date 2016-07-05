package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "front_wheels", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = FrontWheels.DELETE, query = "DELETE from FrontWheels f WHERE f.id=:id"),
        @NamedQuery(name = FrontWheels.ALL_SORTED, query = "SELECT f FROM FrontWheels f ORDER BY f.name"),
})
@Data
@NoArgsConstructor
public class FrontWheels {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "frontWheels", cascade = CascadeType.ALL)
    private List<TruckMining> truckMinings;
    public static final String DELETE = "FrontWheels.delete";
    public static final String ALL_SORTED = "FrontWheels.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public FrontWheels(String name) {
        this.name = name;
    }


}
