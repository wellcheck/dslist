package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

@Entity //Deixa uma classe indentica a uma tabela no banco de dados.
@Table(name="tb_game") //Atribui um nome para a tabela.
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrementa no banco de dados, para sempre adicionar um id.
    private Long id;
    private String title;

    @Column(name = "game_year") //Altera o nome da tabela no banco de dados
    private Integer year;
    private String genre;
    private String platforms;

    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT") //Essa anotação permitir inserir mais de 255 caracteres no banco de dados.
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {
    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;

        if (getId() != null ? !getId().equals(game.getId()) : game.getId() != null) return false;
        if (getTitle() != null ? !getTitle().equals(game.getTitle()) : game.getTitle() != null) return false;
        if (getYear() != null ? !getYear().equals(game.getYear()) : game.getYear() != null) return false;
        if (getGenre() != null ? !getGenre().equals(game.getGenre()) : game.getGenre() != null) return false;
        if (getPlatforms() != null ? !getPlatforms().equals(game.getPlatforms()) : game.getPlatforms() != null)
            return false;
        if (getScore() != null ? !getScore().equals(getScore()) : game.getScore() != null) return false;
        if (getImgUrl() != null ? !getImgUrl().equals(game.getImgUrl()) : game.getImgUrl() != null) return false;
        if (getShortDescription() != null ? !getShortDescription().equals(game.getShortDescription()) : game.getShortDescription() != null)
            return false;
        return getLongDescription() != null ? getLongDescription().equals(game.getLongDescription()) : game.getLongDescription() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
        result = 31 * result + (getGenre() != null ? getGenre().hashCode() : 0);
        result = 31 * result + (getPlatforms() != null ? getPlatforms().hashCode() : 0);
        result = 31 * result + (getScore() != null ? getScore().hashCode() : 0);
        result = 31 * result + (getImgUrl() != null ? getImgUrl().hashCode() : 0);
        result = 31 * result + (getShortDescription() != null ? getShortDescription().hashCode() : 0);
        result = 31 * result + (getLongDescription() != null ? getLongDescription().hashCode() : 0);
        return result;
    }
}
