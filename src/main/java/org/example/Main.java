package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcion = -1;
        try {
            Scanner reader = new Scanner(System.in);
            ArrayList<Usuario> listaClientes = new ArrayList<>();
            Usuario usuario = new Usuario();
            String correo = "";
            do {
                System.out.println("Escriba una opción" +
                        "\n1.- Añadir un usuario" +
                        "\n2.- Buscar usuario" +
                        "\n3.- Total ingresos" +
                        "\n0.- Salir");
                opcion = reader.nextInt();
                switch (opcion) {
                    case 1:
                        CRUD_Usuarios.insertarUsuario(reader,listaClientes,usuario);
                        break;
                    case 2:
                        CRUD_Usuarios.buscarUsuario(reader,listaClientes,correo);
                        break;
                    case 3:
                        CRUD_Usuarios.totalIngresos(listaClientes);
                        break;
                    case 0:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opción no reconocida");
                }
            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}