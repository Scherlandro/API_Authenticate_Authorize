package com.authenticate.service;

import com.authenticate.model.Role;
import com.authenticate.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String rolename);
    User getUser(String username);
    List<User> listUsers();
    void removeUser(Long id);
}
