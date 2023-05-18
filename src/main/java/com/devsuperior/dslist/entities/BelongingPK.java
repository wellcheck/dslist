package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //Está encapsulando os atributos da classe em uma classe só.
public class BelongingPK {

    @ManyToOne //Muitos para um
    @JoinColumn(name = "game_id") //Configura o nome da chave estrangeira, vai ser mapeado para dois campos de chave estrangueira na tabela.
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id") //Configura o nome da chave estrangeira vai ser mapeado para dois campos de chave estrangueira na tabela.
    private GameList gameList;

    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;

        if (getGame() != null ? !getGame().equals(that.getGame()) : that.getGame() != null) return false;
        return getGameList() != null ? getGameList().equals(that.getGameList()) : that.getGameList() == null;
    }

    @Override
    public int hashCode() {
        int result = getGame() != null ? getGame().hashCode() : 0;
        result = 31 * result + (getGameList() != null ? getGameList().hashCode() : 0);
        return result;
    }
}
