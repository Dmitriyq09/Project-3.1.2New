package com.web.service;

import com.web.dao.UserDaoImp;
import com.web.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private UserDaoImp userDaoImp;

    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDaoImp.addUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDaoImp.deleteUser(id);
    }

    @Transactional
    @Override
    public void editUser(User user) {
        userDaoImp.editUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(Long id) {
        return userDaoImp.getUserById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDaoImp.getAllUsers();
    }
}

//Аннотацию @Transactional следует добавить над методами, которые требуют выполнения в рамках транзакции.
// В данном случае, аннотацию @Transactional можно добавить над каждым методом в классе UserServiceImp,
// так как все эти методы выполняют операции с базой данных, и их выполнение должно быть в рамках одной транзакции.