package by.eftech.webapp.model;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
        @NamedQuery(name = MiningMachinery.DELETE, query = "DELETE from MiningMachinery m WHERE m.id=:id"),
        @NamedQuery(name = MiningMachinery.ALL_SORTED, query = "SELECT m FROM MiningMachinery m ORDER BY m.model.name"),
})
public abstract class MiningMachinery {
    private Integer id;
    private String year;
    private String power;
    private Integer length;
    private Integer width;
    private Integer height;
    private Integer price;
    private String application;
    private String advantages;
    private Boolean sold;
    private Engine engine;
    private Transmission transmission;
    private Suspension suspension;
    private Manufacturer manufacturer;
    private Model model;


    public static final String DELETE = "MiningMachinery.delete";
    public static final String ALL_SORTED = "MiningMachinery.getAllSorted";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Basic
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Basic
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }


    @Basic
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Basic
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Basic
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }




    @Basic
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Basic
    public String getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }


    @Basic
    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiningMachinery that = (MiningMachinery) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (power != null ? !power.equals(that.power) : that.power != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (application != null ? !application.equals(that.application) : that.application != null) return false;
        if (advantages != null ? !advantages.equals(that.advantages) : that.advantages != null) return false;
        if (sold != null ? !sold.equals(that.sold) : that.sold != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (application != null ? application.hashCode() : 0);
        result = 31 * result + (advantages != null ? advantages.hashCode() : 0);
        result = 31 * result + (sold != null ? sold.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn()
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @ManyToOne
    @JoinColumn()
    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @ManyToOne
    @JoinColumn
    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }



    @ManyToOne
    @JoinColumn()
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }



    @ManyToOne
    @JoinColumn()
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    public boolean newOject() {
        return (this.id == null);
    }
    public MiningMachinery() {
    }

    public MiningMachinery(String year,  String power,  Integer length, Integer width, Integer height, Integer price, String application, String advantages, Boolean sold, Engine engine, Transmission transmission, Suspension suspension,  Manufacturer manufacturer, Model model) {
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

    public MiningMachinery(Integer id, String year,  String power,  Integer length, Integer width, Integer height,   Integer price, String application, String advantages, Boolean sold, Engine engine, Transmission transmission, Suspension suspension,  Manufacturer manufacturer,Model model) {
        this.id = id;
        this.year = year;
        this.power = power;
        this.length = length;
        this.width = width;
        this.height = height;;
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
