package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Photo.DELETE, query = "DELETE from Photo p WHERE p.id=:id"),
        @NamedQuery(name = Photo.ALL_SORTED, query = "SELECT p FROM Photo p ORDER BY p.name"),
})
public class Photo {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;

    public static final String DELETE = "Photo.delete";
    public static final String ALL_SORTED = "Photo.getAllSorted";


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
    @JoinTable(name = "truck_mining_has_photo", catalog = "", schema = "belaz", joinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "truck_mining_id", referencedColumnName = "id", nullable = false))
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public Photo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Photo(String name) {
        this.name = name;
    }

    public Photo() {
    }
}
