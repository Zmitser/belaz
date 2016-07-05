package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Series.DELETE, query = "DELETE from Series s WHERE s.id=:id"),
        @NamedQuery(name = Series.ALL_SORTED, query = "SELECT s FROM Series s ORDER BY s.name"),
})
@Data
@NoArgsConstructor
public class Series {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "series")
    private List<Model> models;
    public static final String DELETE = "Series.delete";
    public static final String ALL_SORTED = "Series.getAllSorted";
    public boolean newOject() {
        return (id == null);
    }
    public Series(String name) {
        this.name = name;
    }
}
