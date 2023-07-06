package com.example.task312.dao;

import com.example.task312.model.User;
import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
    void save(User user);
}