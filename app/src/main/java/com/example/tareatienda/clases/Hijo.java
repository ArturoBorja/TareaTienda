package com.example.tareatienda.clases;

public class Hijo {
    String descripcion;
    String imagen_cuadrada;
    int id;
    int cant_hijos;
    int padre;

    public Hijo() {
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen_cuadrada(String imagen_cuadrada) {
        this.imagen_cuadrada = imagen_cuadrada;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen_cuadrada() {
        return imagen_cuadrada;
    }

    public int getId() {
        return id;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public int getPadre() {
        return padre;
    }
}
