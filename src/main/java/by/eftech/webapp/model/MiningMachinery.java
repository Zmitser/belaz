package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
        @NamedQuery(name = MiningMachinery.DELETE, query = "DELETE from MiningMachinery m WHERE m.id=:id"),
        @NamedQuery(name = MiningMachinery.ALL_SORTED, query = "SELECT m FROM MiningMachinery m ORDER BY m.model.name"),
})
@Data
@NoArgsConstructor
public abstract class MiningMachinery {
    @Id
    @TableGenerator(name = "EVENT_GEN",
            table = "SEQUENCES",
            pkColumnName = "SEQ_NAME",
            valueColumnName = "SEQ_NUMBER",
            pkColumnValue = "SEQUENCE",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "EVENT_GEN")
    private Integer id;
    @Basic
    private String year;
    @Basic
    private String power;
    @Basic
    private Integer length;
    @Basic
    private Integer width;
    @Basic
    private Integer height;
    @Basic
    private Integer price;
    @Basic
    private String application;
    @Basic
    private String advantages;
    @Basic
    private LocalDateTime date;
    @Basic
    private Boolean sold;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Engine engine;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Transmission transmission;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Suspension suspension;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Manufacturer manufacturer;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Model model;
    public static final String DELETE = "MiningMachinery.delete";
    public static final String ALL_SORTED = "MiningMachinery.getAllSorted";

    public boolean newOject() {
        return (this.id == null);
    }

    public MiningMachinery(String year, String power, Integer length, Integer width, Integer height, Integer price, String application, String advantages, Boolean sold, Engine engine, Transmission transmission, Suspension suspension, Manufacturer manufacturer, Model model) {
        this.year = year;
        this.power = power;
        this.length = length;
        this.width = width;
        this.height = height;
        this.price = price;
        this.application = application;
        this.advantages = advantages;
        this.sold = sold;
        this.engine = engine;
        this.transmission = transmission;
        this.suspension = suspension;
        this.manufacturer = manufacturer;
        this.model = model;
    }


}
