package com.keycloak.oauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class UserController {

    @PreAuthorize("hasRole('user')")
    @GetMapping("/users")
    public String helloUser(){
        return "Hello KeyCloak - User";
    }

    @PreAuthorize("hasRole('admin')")
    @GetMapping("/admins")
    public String helloAdmin(){
        return "Hello KeyCloak - Admin";
    }
}
