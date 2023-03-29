package com.project.restp1.model.dataDB.board;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotBlank
    @Size(max = 250)
    public String message;
    @NotBlank
    public String sender;
    @NotBlank
    public Date timeSent;

    public int likes;
    public int dislikes;

    public Content() {

    }

}
