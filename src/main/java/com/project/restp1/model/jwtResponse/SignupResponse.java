package com.project.restp1.model.jwtResponse;

import lombok.Data;

import java.util.List;

@Data
public class SignupResponse {
    private String token;
    private String type = "AuthToken";
    private String refreshToken;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public SignupResponse(String token, String refreshToken, Long id, String username, String email, List<String> roles) {
        this.token = token;
        this.refreshToken = refreshToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
