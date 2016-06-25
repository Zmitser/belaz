package by.eftech.webapp.service;


import by.eftech.webapp.LoggedUser;
import by.eftech.webapp.model.User;
import by.eftech.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public User get(int id) {
        return userRepository.get(id);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);;
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public LoggedUser loadUserByUsername(String login) throws UsernameNotFoundException {
        User u = userRepository.getByEmail(login.toLowerCase());
        if (u == null) {
            throw new UsernameNotFoundException("User " + login + " is not found");
        }
        return new LoggedUser(u);
    }
}