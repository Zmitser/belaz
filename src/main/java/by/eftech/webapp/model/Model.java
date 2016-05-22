package by.eftech.webapp.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "model")
public class Model extends NamedEntity implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "series_id")
    protected Series series;

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Model() {
    }

    public Model(Integer id, String name, Series series) {
        super(id, name);
        this.series = series;
    }

    public Model(String name, Series series) {
        super(name);
        this.series = series;
    }
}
