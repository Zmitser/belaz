package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = Series.DELETE, query = "DELETE from Series s WHERE s.id=:id"),
        @NamedQuery(name = Series.ALL_SORTED, query = "SELECT s FROM Series s ORDER BY s.name"),
})
public class Series {
    private Integer id;
    private String name;
    private List<Model> models;

    public static final String DELETE = "Series.delete";
    public static final String ALL_SORTED = "Series.getAllSorted";



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

        Series series = (Series) o;

        if (!id.equals(series.id)) return false;
        if (!name.equals(series.name)) return false;
        return models.equals(series.models);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + models.hashCode();
        return result;
    }

    @OneToMany(mappedBy = "series")
    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public Series() {
    }

    public Series(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Series(String name) {
        this.name = name;
    }
}
