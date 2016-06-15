package by.eftech.webapp.repository;


import java.util.List;

public interface UserRepository {

    User save(User User);

    boolean delete(int id);

    User get(int id);

    List<User> getAll();
}
