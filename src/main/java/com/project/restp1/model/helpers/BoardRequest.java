package com.project.restp1.model.helpers;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class BoardRequest {


    @NotBlank
    private String username;
    private Set<String> topics;
    private Set<String> options;


}
