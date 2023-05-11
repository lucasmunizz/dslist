package com.lucas.dslist.dto;

import com.lucas.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList list){
        id = list.getId();
        name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
}
