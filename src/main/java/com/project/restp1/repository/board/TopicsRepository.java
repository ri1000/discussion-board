package com.project.restp1.repository.board;

import com.project.restp1.model.dataDB.board.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicsRepository extends JpaRepository<Topics, Long> {
}
