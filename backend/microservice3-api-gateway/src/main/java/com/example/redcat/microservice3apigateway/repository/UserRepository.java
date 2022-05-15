package com.example.redcat.microservice3apigateway.repository;

import com.example.redcat.microservice3apigateway.model.Roles;
import com.example.redcat.microservice3apigateway.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author sa
 * @date 10.10.2021
 * @time 11:27
 */
public interface UserRepository extends JpaRepository<Users, Long>
{
    //findBy+fieldName

    Optional<Users> findByUsername(String username);

    @Modifying
    @Query("update Users set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Roles role);
}
