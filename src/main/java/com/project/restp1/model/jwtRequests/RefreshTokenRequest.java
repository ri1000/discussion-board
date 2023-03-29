package com.project.restp1.model.jwtRequests;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RefreshTokenRequest {

    @NotBlank
    private String refreshToken;

}
