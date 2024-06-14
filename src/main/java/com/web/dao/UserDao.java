package com.web.dao;

import com.web.model.User;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public interface UserDao {
    void addUser(User user);
    void deleteUser (Long id);
    void editUser (User user);
    User getUserById (Long id);
    List<User> getAllUsers();
}
