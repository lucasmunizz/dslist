package com.lucas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {
        
}
