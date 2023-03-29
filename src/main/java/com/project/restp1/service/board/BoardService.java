package com.project.restp1.service.board;


import com.project.restp1.model.dataDB.board.Board;
import com.project.restp1.model.dataDB.board.Option;
import com.project.restp1.model.dataDB.board.Topics;
import com.project.restp1.repository.board.BoardRepository;
import com.project.restp1.repository.board.ContentRepository;
import com.project.restp1.repository.board.OptionRepository;
import com.project.restp1.repository.board.TopicsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
public class BoardService {

    private final BoardRepository boardRepository;
    private final ContentRepository contentRepository;
    private final OptionRepository optionRepository;
    private final TopicsRepository topicsRepository;


    public BoardService(BoardRepository boardRepository, ContentRepository contentRepository,
                        OptionRepository optionRepository, TopicsRepository topicsRepository) {
        this.boardRepository = boardRepository;
        this.contentRepository = contentRepository;
        this.optionRepository = optionRepository;
        this.topicsRepository = topicsRepository;
    }

    public Board generateBoard(String username, Set<Option> options, Set<Topics> topics) {
        // generates a board objects with the username and topics
        // and options provided as lists

        Board board = new Board();
        board.setId(UUID.randomUUID());
        board.setBoardOwner(username);
        board.setOptions(options);
        board.setTopics(topics);

        return board;
    }
}
