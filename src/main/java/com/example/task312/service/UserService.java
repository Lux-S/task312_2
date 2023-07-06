package com.example.task312.service;
import com.example.task312.model.User;
import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
    void saveUser(User user);
}

