package by.eftech.webapp.repository;


import by.eftech.webapp.model.User;

import java.util.List;

public interface UserRepository {

    User save(User User);

    boolean delete(int id);

    User get(int id);

    List<User> getAll();
}
