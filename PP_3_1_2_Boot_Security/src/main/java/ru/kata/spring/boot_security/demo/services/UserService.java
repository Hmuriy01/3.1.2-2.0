package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User findUserByUserName(String username);

    public List<User> findAll();

    public Optional<User> findById(long id);

    public void save(User user);

    public void edit(User user);

    public void remove(long id);

}
