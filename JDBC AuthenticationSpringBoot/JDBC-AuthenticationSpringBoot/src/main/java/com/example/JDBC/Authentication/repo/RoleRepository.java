package com.example.JDBC.Authentication.repo;




import com.example.JDBC.Authentication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;
import java.util.Optional;

    public interface RoleRepository extends JpaRepository<Role, Long> {
        Optional<Role> findByName(String name);

}
