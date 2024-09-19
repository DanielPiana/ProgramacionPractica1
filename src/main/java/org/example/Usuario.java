package org.example;

public class Usuario extends Cliente{
    private boolean premium;

    public Usuario() {
    }

    public Usuario(String correo, String contrasena, double descuento, boolean premium) {
        super(correo, contrasena, descuento);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

}
