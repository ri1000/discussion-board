package com.project.restp1.model.dataDB.board;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Topics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String topic;


    public Topics() {

    }
}
