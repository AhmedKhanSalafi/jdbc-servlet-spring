package com.springsecuritywithJwt.springsecuritywithJwt.repo;


import com.springsecuritywithJwt.springsecuritywithJwt.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
        Optional<UserInfo> findByEmail(String email); // Use 'email' if that is the correct field for login
    }

