package com.ringcentral.springsecuritydemo.controller;

import com.ringcentral.springsecuritydemo.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> getUsers() {
        return new ResponseEntity<>("test", HttpStatus.OK);
    }
}
