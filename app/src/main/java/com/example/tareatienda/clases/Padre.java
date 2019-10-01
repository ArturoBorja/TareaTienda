package com.example.tareatienda.clases;

public class Padre {
    String descripcion;
    String imagen_banner;
    int id;
    int cant_hijos;

    public Padre(){

    }
    public Padre(String img){
        this.descripcion = "";
        this.imagen_banner = img;
        this.id=1;
        this.cant_hijos=6;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen_banner() {
        return imagen_banner;
    }

    public int getId() {
        return id;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen_banner(String imagen_banner) {
        this.imagen_banner = imagen_banner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }
}
