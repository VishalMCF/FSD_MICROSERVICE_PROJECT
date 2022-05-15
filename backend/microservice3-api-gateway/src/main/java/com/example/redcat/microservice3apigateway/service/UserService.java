package com.example.redcat.microservice3apigateway.service;

import com.example.redcat.microservice3apigateway.model.Roles;
import com.example.redcat.microservice3apigateway.model.Users;

import java.util.Optional;

/**
 * @author sa
 * @date 10.10.2021
 * @time 11:31
 */
public interface UserService
{
    Users saveUser(Users user);

    Optional<Users> findByUsername(String username);

    void changeRole(Roles newRole, String username);
}
