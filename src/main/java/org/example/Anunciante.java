package org.example;

public class Anunciante extends Cliente{
    private int numAnuncios;

    public Anunciante() {
    }

    public Anunciante(String correo, String contrasena, double descuento, int numAnuncios) {
        super(correo, contrasena, descuento);
        this.numAnuncios = numAnuncios;
    }

    public int getNumAnuncios() {
        return numAnuncios;
    }

    public void setNumAnuncios(int numAnuncios) {
        this.numAnuncios = numAnuncios;
    }
}
