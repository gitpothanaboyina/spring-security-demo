package com.ringcentral.springsecuritydemo.service;


import com.ringcentral.springsecuritydemo.entity.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

}
