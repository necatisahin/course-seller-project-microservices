package com.necatisahiin.apigateway.service;

import com.necatisahiin.apigateway.model.Role;
import com.necatisahiin.apigateway.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
        //Transactional is required when executing an update/delete query.
    void changeRole(Role newRole, String username);
}
