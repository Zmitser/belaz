package by.eftech.webapp.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = SellerOrder.DELETE, query = "DELETE from SellerOrder s WHERE s.id=:id"),
        @NamedQuery(name = SellerOrder.ALL_SORTED, query = "SELECT s FROM SellerOrder s ORDER BY s.fullname"),
})
@Table(name = "seller_order")
public class SellerOrder {
    private Integer id;
    private Timestamp date;
    private String fullname;
    private String lastname;
    private String companyName;
    private String streetAddress;
    private String town;
    private String country;
    private String emailAddress;
    private String phoneNumber;
    private List<Item> items;



    public static final String DELETE = "SellerOrder.delete";
    public static final String ALL_SORTED = "SellerOrder.getAllSorted";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "fullname")
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "street_address")
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Basic
    @Column(name = "town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SellerOrder order = (SellerOrder) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (date != null ? !date.equals(order.date) : order.date != null) return false;
        if (fullname != null ? !fullname.equals(order.fullname) : order.fullname != null) return false;
        if (lastname != null ? !lastname.equals(order.lastname) : order.lastname != null) return false;
        if (companyName != null ? !companyName.equals(order.companyName) : order.companyName != null) return false;
        if (streetAddress != null ? !streetAddress.equals(order.streetAddress) : order.streetAddress != null)
            return false;
        if (town != null ? !town.equals(order.town) : order.town != null) return false;
        if (country != null ? !country.equals(order.country) : order.country != null) return false;
        if (emailAddress != null ? !emailAddress.equals(order.emailAddress) : order.emailAddress != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(order.phoneNumber) : order.phoneNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (streetAddress != null ? streetAddress.hashCode() : 0);
        result = 31 * result + (town != null ? town.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @ManyToMany(mappedBy = "orders")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public boolean newOject() {
        return (id == null);
    }
    public SellerOrder(Integer id, Timestamp date, String fullname, String lastname, String companyName, String streetAddress, String town, String country, String emailAddress, String phoneNumber, List<Item> items) {
        this.id = id;
        this.date = date;
        this.fullname = fullname;
        this.lastname = lastname;
        this.companyName = companyName;
        this.streetAddress = streetAddress;
        this.town = town;
        this.country = country;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.items = items;
    }

    public SellerOrder(Timestamp date, String fullname, String lastname, String companyName, String streetAddress, String town, String country, String emailAddress, String phoneNumber, List<Item> items) {
        this.date = date;
        this.fullname = fullname;
        this.lastname = lastname;
        this.companyName = companyName;
        this.streetAddress = streetAddress;
        this.town = town;
        this.country = country;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.items = items;
    }

    public SellerOrder() {
    }
}
