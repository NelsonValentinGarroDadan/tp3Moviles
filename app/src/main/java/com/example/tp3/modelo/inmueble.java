package com.example.tp3moviles.modelo;

public class inmueble {
    private double precio;
    private String DIreccion;
    private int foto;

    public inmueble(double precio, String DIreccion, int foto) {
        this.precio = precio;
        this.DIreccion = DIreccion;
        this.foto = foto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDIreccion() {
        return DIreccion;
    }

    public void setDIreccion(String DIreccion) {
        this.DIreccion = DIreccion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
