package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true) //Anotação para que o metodo seja apenas de escrita e não vai gravar no banco de dados.
    public List<GameListDTO> findAll(){  //Metodo de consulta com DTO, permitir customizar e personalizar  consulta no banco de dados
       List<GameList> resultado = gameListRepository.findAll();
        return resultado.stream().map(x -> new GameListDTO(x)).toList();
    }
}
