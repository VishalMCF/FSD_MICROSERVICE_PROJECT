package com.example.redcat.microservice3apigateway.service;

import com.example.redcat.microservice3apigateway.model.Roles;
import com.example.redcat.microservice3apigateway.model.Users;
import com.example.redcat.microservice3apigateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author sa
 * @date 10.10.2021
 * @time 11:31
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Users saveUser(Users user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Roles.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }


    @Override
    public Optional<Users> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional //Transactional is required when executing an update/delete query.
    public void changeRole(Roles newRole, String username)
    {
        userRepository.updateUserRole(username, newRole);
    }
}
