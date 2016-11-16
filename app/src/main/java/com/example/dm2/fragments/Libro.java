package com.example.dm2.fragments;


public class Libro {
    private String titulo;
    private String autor;
    private String contenido;

    public Libro(String titulo,String autor, String contenido){
        this.titulo=titulo;
        this.autor=autor;
        this.contenido=contenido;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getContenido(){
        return contenido;
    }
}
