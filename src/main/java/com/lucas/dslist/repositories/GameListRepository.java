package com.lucas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
