package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){  //Metodo de consulta com DTO, permitir customizar e personalizar  consulta no banco de dados
       List<Game> resultado = gameRepository.findAll();
        return resultado.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
