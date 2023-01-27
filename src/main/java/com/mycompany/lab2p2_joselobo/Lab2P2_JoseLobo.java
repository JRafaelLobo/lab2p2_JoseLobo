package com.mycompany.lab2p2_joselobo;

import java.util.Scanner;

public class Lab2P2_JoseLobo {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Usuarios U = new Usuarios();
        String User = "admin";
        int opcion = Menu();
        switch (opcion) {
            case 1 -> {

            }//case 1
            case 2 -> {

            }//case 2
            case 3 -> {
                int usuariopcion = UsuariosMenu();
                switch (usuariopcion) {
                    case 1 -> {
                        System.out.println("------------------------------");
                        System.out.println("Iniciando Session");
                        System.out.println("Ingrese Su Usuario");
                        String UserIngresado = leer.next();
                        System.out.println("Ingrese su Contraseña");
                        String password = leer.next();
                        for (String t : U.getUser()) {
                            if (t == UserIngresado) {
                                if (password == U.getPassword(U.getUserId(t))) {
                                    User = UserIngresado;
                                } else {
                                    System.out.println("Contraseña Incorrecta");
                                }
                            } else {
                                System.out.println("El Usuario Ingresado no Existe");
                            }
                        }
                        System.out.println("------------------------------");
                    }//case 1
                    case 2 -> {
                        System.out.println("------------------------------");
                        System.out.println("Creando Usuario");
                        System.out.println("Ingrese su Nombre: ");
                        U.addNombre(leer.next());
                        System.out.println("Ingrese su Edad: ");
                        U.addEdad(leer.nextInt());
                        System.out.println("Ingrese su Usuario: ");
                        String UsuarioIngresado = leer.next();
                        U.addUser(UsuarioIngresado);
                        System.out.println("Ingrese su Contraseña: ");
                        U.addPassword(leer.next());
                        User = UsuarioIngresado;
                        System.out.println("------------------------------");
                    }//case 2
                    case 3 -> {
                        User=null;
                    }//case 3
                }//switch usuarioOpcion
            }//case 3
            case 4 -> {

            }//case 4
            default -> {
                System.out.println("Opcion Incorrecta");
            }//default
        }//switch
    }//main

    public static int Menu() {
        System.out.println("""
                           ------------------------------
                           Menu
                           1. Registro de Inmueble/Solar
                           2. Manejo de Estados
                           3. Log In/Sign Up
                           4. Salir
                           ------------------------------
                           Ingrese Su Opcion:
                           """);
        return leer.nextInt();
    }//menu

    public static int UsuariosMenu() {
        System.out.println("""
                           ------------------------------
                           1. Log In
                           2. Sign Up
                           3. Log out
                           ------------------------------
                           Ingrese Su Opcion:
                           """);
        return leer.nextInt();
    }
}
