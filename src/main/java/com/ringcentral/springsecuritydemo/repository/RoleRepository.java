package com.ringcentral.springsecuritydemo.repository;

import com.ringcentral.springsecuritydemo.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
