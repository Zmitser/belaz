package by.eftech.webapp.service;

import by.eftech.webapp.model.User;

import java.util.List;

public interface UserService {

    User save(User timetable);


    void delete(int id);


    User get(int id);


    void update(User user);


    List<User> getAll();


}