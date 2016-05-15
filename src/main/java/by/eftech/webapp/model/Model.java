package by.eftech.webapp.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "model")
public class Model extends BaseEntity implements Serializable {


    @Column(name = "name")
    protected String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "series_id")
    protected Series series;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Model() {
    }

    public Model(Integer id, String name, Series series) {
        super(id);
        this.name = name;
        this.series = series;
    }

    public Model(String name, Series series) {
        this.name = name;
        this.series = series;
    }
}
