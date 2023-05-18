package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

@Entity //Deixa uma classe indentica a uma tabela no banco de dados.
@Table(name = "tb_game_list") //Atribui um nome para a tabela.
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrementa no banco de dados, para sempre adicionar um id.
    private Long id;
    private String name;

    public GameList() {
    }

    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameList gameList)) return false;

        if (getId() != null ? !getId().equals(gameList.getId()) : gameList.getId() != null) return false;
        return getName() != null ? getName().equals(gameList.getName()) : gameList.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
