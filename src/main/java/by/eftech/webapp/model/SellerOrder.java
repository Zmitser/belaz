package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "seller_order")
@NamedQueries({
        @NamedQuery(name = SellerOrder.DELETE, query = "DELETE from SellerOrder s WHERE s.id=:id"),
        @NamedQuery(name = SellerOrder.ALL_SORTED, query = "SELECT s FROM SellerOrder s ORDER BY s.fullname"),
})
@Data
@NoArgsConstructor
public class SellerOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "date")
    private Timestamp date;
    @Basic
    @Column(name = "fullname")
    @NotEmpty(message = "full name must not be empty!")
    private String fullname;
    @Basic
    @Column(name = "lastname")
    @NotEmpty(message = "last name must not be empty!")
    private String lastname;
    @Basic
    @Column(name = "company_name")
    @NotEmpty(message = "company name must not be empty!")
    private String companyName;
    @Basic
    @Column(name = "street_address")
    @NotEmpty(message = "street address must to be empty!")
    private String streetAddress;
    @Basic
    @Column(name = "town")
    @NotEmpty(message = "town must not be empty!")
    private String town;
    @Basic
    @Column(name = "country")
    @NotEmpty(message = "country must not empty!")
    private String country;
    @Basic
    @Column(name = "email_address")
    @NotEmpty(message = "email address must not be empty!")
    @Email(message = "email is not valid!")
    private String emailAddress;
    @Basic
    @Column(name = "phone_number")
    @NotEmpty(message = "phone number must not be empty!")
    private String phoneNumber;
    @ManyToMany(mappedBy = "orders")
    private List<Item> items;
    public static final String DELETE = "SellerOrder.delete";
    public static final String ALL_SORTED = "SellerOrder.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
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

}


