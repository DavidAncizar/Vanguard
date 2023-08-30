/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umariana.mundo;

/**
 *
 * @author Sistemas
 */
public class Video {
    private String idVideo;
    private String titulo;
    private String autor;
    private String anio;
    private String genero;
    private String url;
    private String letra;

    public Video() {
    }

    public Video(String idVideo, String titulo, String autor, String anio, String genero, String url, String letra) {
        this.idVideo = idVideo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.url = url;
        this.letra = letra;
    }

    public String getIdVideo() {
        return idVideo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnio() {
        return anio;
    }

    public String getGenero() {
        return genero;
    }

    public String getUrl() {
        return url;
    }

    public String getLetra() {
        return letra;
    }

    public void setIdVideo(String idVideo) {
        this.idVideo = idVideo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
 
}
