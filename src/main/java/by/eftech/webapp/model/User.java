package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NamedQueries({
        @NamedQuery(name = User.DELETE, query = "DELETE from User u WHERE u.id=:id"),
        @NamedQuery(name = User.ALL_SORTED, query = "SELECT u FROM User u ORDER BY u.email"),
        @NamedQuery(name = User.BY_EMAIL, query = "SELECT u FROM User u WHERE u.email=?1"),
})
@Data
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
    public static final String DELETE = "User.delete";
    public static final String ALL_SORTED = "User.getAllSorted";
    public static final String BY_EMAIL = "User.getByEmail";
    public boolean newOject() {
        return (this.id == null);
    }
}
