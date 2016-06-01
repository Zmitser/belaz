package by.eftech.webapp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "seller_order")
public class Order extends BaseEntity {

    @Column(name = "date", nullable = false)
    protected LocalDateTime date;

    @Column(name = "fullname", nullable = false)
    @NotEmpty
    protected String fullname;

    @Column(name = "lastname", nullable = false)
    @NotEmpty
    protected String lastname;

    @Column(name = "company_name", nullable = false)
    @NotEmpty
    protected String companyName;

    @Column(name = "street_address", nullable = false)
    @NotEmpty
    protected String streetAddress;

    @Column(name = "town", nullable = false)
    @NotEmpty
    protected String town;

    @Column(name = "country", nullable = false)
    @NotEmpty
    protected String country;

    @Column(name = "email_address", nullable = false)
    @NotEmpty
    protected String emailAddress;

    @Column(name = "phone_number", nullable = false)
    @NotEmpty
    protected String phoneNumber;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "order_has_item", joinColumns = {
            @JoinColumn(name = "order_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "item_id",
                    nullable = false, updatable = false) })
    protected List<Item> items;

    public LocalDateTime getDateTime() {
        return date;
    }

    public void setDateTime(LocalDateTime date) {
        this.date = date;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Order() {
    }

    public Order(LocalDateTime date, String fullname, String lastname, String companyName, String streetAddress, String town, String country, String emailAddress, String phoneNumber, List<Item> items) {
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


    public Order(Integer id, LocalDateTime date, String fullname, String lastname, String companyName, String streetAddress, String town, String country, String emailAddress, String phoneNumber, List<Item> items) {
        super(id);
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
}
