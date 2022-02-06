package com.example.seraphine.service;

import com.example.seraphine.model.User;
import java.util.List;
import java.util.Optional;

public interface AdminService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    void updateUser(Long id, User newUser);
    void deleteUser(Long id);
}
