package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Video.DELETE, query = "DELETE from Video v WHERE v.id=:id"),
        @NamedQuery(name = Video.ALL_SORTED, query = "SELECT v FROM Video v ORDER BY v.name"),
})
public class Video {
    private Integer id;
    private String name;
    private List<TruckMining> truckMinings;

    public static final String DELETE = "Video.delete";
    public static final String ALL_SORTED = "Video.getAllSorted";


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

        Video video = (Video) o;

        if (id != null ? !id.equals(video.id) : video.id != null) return false;
        if (name != null ? !name.equals(video.name) : video.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToMany
    @JoinTable(name = "truck_mining_has_video", catalog = "", schema = "belaz", joinColumns = @JoinColumn(name = "video_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "truck_mining_id", referencedColumnName = "id", nullable = false))
    public List<TruckMining> getTruckMinings() {
        return truckMinings;
    }

    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }

    public boolean newOject() {
        return (this.id == null);
    }

    public Video(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Video(String name) {
        this.name = name;
    }

    public Video() {
    }
}
