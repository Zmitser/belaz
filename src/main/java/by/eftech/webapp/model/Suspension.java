package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Suspension.DELETE, query = "DELETE from Suspension s WHERE s.id=:id"),
        @NamedQuery(name = Suspension.ALL_SORTED, query = "SELECT s FROM Suspension s ORDER BY s.name"),
})
@Data
@NoArgsConstructor
public class Suspension {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "suspension")
    private List<MiningMachinery> miningMachineries;
    public static final String DELETE = "Suspension.delete";
    public static final String ALL_SORTED = "Suspension.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public Suspension(String name) {
        this.name = name;
    }


}
