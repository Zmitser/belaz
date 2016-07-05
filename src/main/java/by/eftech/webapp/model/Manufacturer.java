package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Manufacturer.DELETE, query = "DELETE from Manufacturer m WHERE m.id=:id"),
        @NamedQuery(name = Manufacturer.ALL_SORTED, query = "SELECT m FROM Manufacturer m ORDER BY m.name"),
})
@Data
@NoArgsConstructor
public class Manufacturer {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "manufacturer")
    private List<MiningMachinery> miningMachineries;
    public static final String DELETE = "Manufacturer.delete";
    public static final String ALL_SORTED = "Manufacturer.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public Manufacturer(String name) {
        this.name = name;
    }

}
