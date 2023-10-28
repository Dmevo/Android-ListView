package com.example.trabalho1;

public class Noticia {

    private String titulo;
    private String texto;
    private String activity;

    public Noticia(String titulo, String texto, String activity) {
        this.titulo = titulo;
        this.texto = texto;
        this.activity = activity;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public String getActivity() {
        return activity;
    }
}
