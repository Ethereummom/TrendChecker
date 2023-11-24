package com.pingpong.jlab.pingpong.domain.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pingpong.jlab.pingpong.domain.board.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

    
}
