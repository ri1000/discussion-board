package com.project.restp1.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserWithUsernameNotFound extends RuntimeException {
    public UserWithUsernameNotFound(String username) {
        super(String.format("Username with the username: %s  not founr", username));
    }
}
