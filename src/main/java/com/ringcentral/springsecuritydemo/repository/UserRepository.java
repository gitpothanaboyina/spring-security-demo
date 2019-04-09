package com.ringcentral.springsecuritydemo.repository;


import com.ringcentral.springsecuritydemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
