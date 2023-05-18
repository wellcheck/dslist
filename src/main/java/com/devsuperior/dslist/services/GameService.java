package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projection.GameMinProjection;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) //Anotação para que o metodo seja apenas de escrita e não vai gravar no banco de dados.
    public GameDTO findById(Long id){ //Metodo de consulta por id
        Game resultado = gameRepository.findById(id).get();
        return  new GameDTO(resultado);
    }
    @Transactional(readOnly = true) //Anotação para que o metodo seja apenas de escrita e não vai gravar no banco de dados.
    public List<GameMinDTO> findAll(){  //Metodo de consulta com DTO, permitir customizar e personalizar  consulta no banco de dados
       List<Game> resultado = gameRepository.findAll();
        return resultado.stream().map(x -> new GameMinDTO(x)).toList();
    }
    @Transactional(readOnly = true) //Anotação para que o metodo seja apenas de escrita e não vai gravar no banco de dados.
    public List<GameMinDTO> findByList(Long listId){  //Metodo de consulta com DTO, permitir customizar e personalizar  consulta no banco de dados
        List<GameMinProjection> resultado = gameRepository.searchByList(listId);
        return resultado.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
