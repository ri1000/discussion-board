package com.project.restp1.api;


import com.project.restp1.filter.jwt.AuthenticationTokenFilter;
import com.project.restp1.filter.jwt.JwtUtils;
import com.project.restp1.model.dataDB.board.Board;
import com.project.restp1.model.helpers.BoardRequest;
import com.project.restp1.service.board.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:5000/")
@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private BoardService boardService;

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);


    @PostMapping
    public ResponseEntity makeBoard(@RequestBody BoardRequest boardRequest, HttpServletRequest request) {
        //gets access token from user finds if user is valid
        // then makes a board in database with id;


        Set<String> topics = boardRequest.getTopics();
        Set<String> options = boardRequest.getOptions();

        //try to find the topics and options from the provided strings


        try {
            String headerAuth = request.getHeader("Authorization");
            String jwt = headerAuth.substring("AuthToken".length());
            String username = jwtUtils.getUsernameFromJwtToken(jwt);

            boardService.generateBoard();

        } catch (Exception e) {
            logger.error("User authentication problem!");
        }
    }
}
