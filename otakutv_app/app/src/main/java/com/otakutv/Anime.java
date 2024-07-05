package com.otakutv;

public class Anime {
    //Atributos de la clase Anime.
    //Levanté todos los campos del administrador de ánimes, excepto "Fecha estreno"

    private int idAnime;  // ID autoincremental del anime (int)
    private String titulo; // Título del anime (varchar)
    private String genero;   // Género del anime (varchar)
    private String duracion; // Duración del anime (varchar)
    private String director;  // Director del anime (varchar)
    private String reparto; //Reparto del anime (varchar)
    private String sinapsis; //Sinapsis del anime (varchar)
    private String imagen;   // URL de la imagen del anime (varchar)
    
    //Constructor vacío necesario para la deserialización del JSON.
    public Anime(){}

    //Constructor con parámetros para inicializar todos los atributos.
    public Anime( int idAnime, String titulo, String genero, String duracion, String director, String reparto, String sinapsis, String imagen){
        this.idAnime = idAnime;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.reparto = reparto;
        this.sinapsis = sinapsis;
        this.imagen = imagen;
    }

    //Getters

    public int getIdAnime(){
        return idAnime;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public String getDuracion(){
        return duracion;
    }

    public String getDirector(){
        return director;
    }

    public String getReparto(){
        return reparto;
    }

    public String getSinapsis(){
        return sinapsis;
    }

    public String getImagen(){
        return imagen;
    }

    //Setters

    public void setIdAnime(int idAnime){
        this.idAnime = idAnime;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public void setGenero (String genero){
        this.genero = genero;
    }

    public void setDuracion (String duracion){
        this.duracion = duracion;
    }

    public void setDirector (String director){
        this.director = director;
    }

    public void setReparto (String reparto){
        this.reparto = reparto;
    }

    public void setSinapsis (String sinapsis){
        this.sinapsis = sinapsis;
    }

    public void setImagen (String imagen){
        this.imagen = imagen;
    }




}
