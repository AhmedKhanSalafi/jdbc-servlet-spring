package com.crudVlidation.crudVlidation.repo;


import com.crudVlidation.crudVlidation.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
