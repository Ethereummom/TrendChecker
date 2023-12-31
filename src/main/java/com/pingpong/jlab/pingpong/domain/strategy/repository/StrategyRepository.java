package com.pingpong.jlab.pingpong.domain.strategy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pingpong.jlab.pingpong.domain.strategy.entity.Strategy;

@Repository
public interface StrategyRepository extends JpaRepository<Strategy, Long>{

    @Query(value = "select * from strategy ORDER BY calculated_Yield asc LIMIT 5", nativeQuery = true)
    List<Strategy> getStrategyListBycalculatedYield();


    
}
