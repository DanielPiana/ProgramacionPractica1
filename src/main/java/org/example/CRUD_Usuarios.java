package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CRUD_Usuarios {
    public static final double descuentoPremium = 35.5;
    public static final double descuentoNormal = 20.5;

    public static ArrayList<Usuario> insertarUsuario (Scanner reader, ArrayList<Usuario> lista, Usuario usu) {
        boolean semaforo = false;
        String correo="";
        do {
            System.out.println("Escriba su correo");
            correo = reader.next();
            for (Usuario usuarioActual : lista) {
                if (usuarioActual.getCorreo().equals(correo)) {
                    System.out.println("Ese usuario ya existe");
                    semaforo = true;
                    break;
                }
            }
        } while (semaforo);
        usu.setCorreo(correo);
        System.out.println("Escriba su contraseña");
        usu.setContrasena(reader.next());
        String respuestaPremium;
        do {
            System.out.println("¿Es usuario premium? Escriba Si o No");
            respuestaPremium = reader.next();
        } while (!respuestaPremium.equalsIgnoreCase("si") && !respuestaPremium.equalsIgnoreCase("no"));
        if (respuestaPremium.equalsIgnoreCase("si")) {
            usu.setPremium(true);
        } else {
            usu.setPremium(false);
        }
        System.out.println("Escriba su descuento");
        usu.setDescuento(reader.nextDouble());
        lista.add(usu);
        return lista;
    }

    public static void buscarUsuario (Scanner reader,ArrayList<Usuario> lista, String correo) {
        System.out.println("Escriba el correo para la búsqueda");
        correo = reader.next();
        for (Usuario usuarioActual: lista) {
            if (usuarioActual.getCorreo().equals(correo)) {
                System.out.println("Ese usuario existe");
                break;
            } else {
                System.out.println("Ese usuario no existe");
            }
        }
    }
    public static void totalIngresos (ArrayList<Usuario> lista ) {
        double descuentoUsuario;
        double descuentoTotal=0;
        for (Usuario usuarioActual : lista) {
            if (usuarioActual.isPremium()) {
                descuentoUsuario = usuarioActual.getDescuento();
                descuentoTotal =descuentoPremium - descuentoUsuario;
            } else {
                descuentoUsuario = usuarioActual.getDescuento();
                descuentoTotal =descuentoNormal - descuentoUsuario;
            }
        }
        System.out.println("Ingresos totales: " + descuentoTotal);
    }
}
