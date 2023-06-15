package com.praj.springboot.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String name, String password) {
        boolean isValidUserName = name.equalsIgnoreCase("prajnashu");
        boolean isValidPassword = password.equalsIgnoreCase("password");

        return isValidUserName && isValidPassword;
    }
}
