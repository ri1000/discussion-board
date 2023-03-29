package com.project.restp1.model.dataDB.board;


import com.project.restp1.model.User;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Board {

    @Id
    public UUID id;

    @NotBlank
    public String boardOwner;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "board_content", joinColumns = @JoinColumn(name = "board_id"), inverseJoinColumns = @JoinColumn(name = "content_id"))
    public Set<Content> contentList = new HashSet<>();


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "board_users", joinColumns = @JoinColumn(name = "board_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    public Set<User> members = new HashSet<>();


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "board_topics", joinColumns = @JoinColumn(name = "board_id"), inverseJoinColumns = @JoinColumn(name = "topic_id"))
    public Set<Topics> topics = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "board_options", joinColumns = @JoinColumn(name = "board_id"), inverseJoinColumns = @JoinColumn(name = "option_id"))
    public Set<Option> options = new HashSet<>();


    public Board() {

    }


}
