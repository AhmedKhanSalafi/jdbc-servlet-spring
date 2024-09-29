package com.Role.Based.Authentication.Role.Based.Authentication.repo;


import com.Role.Based.Authentication.Role.Based.Authentication.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends CrudRepository<User, Long> {

        @Query("SELECT u FROM User u WHERE u.username = :username")
        public User getUserByUsername(@Param("username") String username);
    }

