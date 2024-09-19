package org.example;

public abstract class Cliente  {
    private String correo;
    private String contrasena;
    private double descuento;

    public Cliente() {
    }

    public Cliente(String correo, String contrasena, double descuento) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.descuento = descuento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
