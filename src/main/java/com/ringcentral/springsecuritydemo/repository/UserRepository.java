package com.ringcentral.springsecuritydemo.repository;


import com.ringcentral.springsecuritydemo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
