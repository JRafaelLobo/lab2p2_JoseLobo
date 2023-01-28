package com.mycompany.lab2p2_joselobo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_JoseLobo {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Usuarios U = new Usuarios();
        ArrayList listacosas = new ArrayList();
        U.addAllData("admin", 0, "admin", "admin1234");
        String User = "admin";
        int opcion;
        do {
            opcion = Menu();
            switch (opcion) {
                case 1 -> {
                    int registropcion = RegistroMenu();
                    switch (registropcion) {
                        case 1 -> {
                            System.out.println("""
                                           ------------------------------
                                           1. Crear Casa
                                           2. Crear Edificio
                                           3. Crear Solar
                                           ------------------------------
                                           Ingrese la Opcion:
                                           """);
                            switch (leer.nextInt()) {
                                case 1 -> {
                                    Casa temp = CrearCasa();
                                    listacosas.add(temp);
                                }//case 1
                                case 2 -> {
                                    Edificio temp = CrearEdificio();
                                    listacosas.add(temp);
                                }//case 2
                                case 3 -> {
                                    Solar temp = CrearSolar();
                                    listacosas.add(temp);
                                }//case 3
                            }//Switch Crear
                        }//case 1
                        case 2 -> {
                            for (Object listacosa : listacosas) {
                                System.out.println(listacosa);
                            }
                        }//case 2
                        case 3 -> {
                            System.out.println("Ingrese el id a modificar: ");
                            int id = leer.nextInt();
                            System.out.println("Objecto a modificar");
                            System.out.println(listacosas.get(id));
                            if (listacosas.get(id) instanceof Casa) {
                                Casa temp = CrearCasa();
                                listacosas.add(id, temp);
                            }
                            if (listacosas.get(id) instanceof Edificio) {
                                Edificio temp = CrearEdificio();
                                listacosas.add(id, temp);
                            }
                            if (listacosas.get(id) instanceof Solar) {
                                Solar temp = CrearSolar();
                                listacosas.add(id, temp);
                            }
                        }//case 3
                        case 4 -> {
                            System.out.println(listacosas);
                            System.out.println("Ingrese el id a modificar: ");
                            int id = leer.nextInt();
                            listacosas.remove(id);
                        }//case 4
                        case 5 -> {
                            for (Object listacosa : listacosas) {
                                System.out.println(listacosa);
                            }
                            System.out.println("Elija un objecto a comprar: ");
                            int id = leer.nextInt();
                            if (listacosas.get(id) instanceof Casa) {
                                System.out.println("Ingrese la casa a modificar: ");
                                ((Casa) listacosas.get(id)).setOwner(User);
                            }
                            if (listacosas.get(id) instanceof Edificio) {
                                System.out.println("Ingrese a que modificar: ");
                                ((Edificio) listacosas.get(id)).setEstado(leer.next());
                            }
                            if (listacosas.get(id) instanceof Solar) {
                                System.out.println("Los Solares no tiene Estado");
                            }

                        }//case 5
                    }//switch registropcion
                }//case 1
                case 2 -> {
                    System.out.println(listacosas);
                    System.out.println("Ingrese el Id para manejar el estado: ");
                    int id = leer.nextInt();
                    if (listacosas.get(id) instanceof Casa) {
                        System.out.println("Ingrese la casa a modificar: ");
                        ((Casa) listacosas.get(id)).setEstado(leer.next());
                    }
                    if (listacosas.get(id) instanceof Edificio) {
                        System.out.println("Ingrese a que modificar: ");
                        ((Edificio) listacosas.get(id)).setEstado(leer.next());
                    }
                    if (listacosas.get(id) instanceof Solar) {
                        System.out.println("Los Solares no tiene Estado");
                    }
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
                            User = null;
                        }//case 3
                    }//switch usuarioOpcion
                }//case 3
                case 4 -> {
                    System.out.println("Saliendo...");
                }//case 4
                default -> {
                    System.out.println("Opcion Incorrecta");
                }//default
            }//switch
        } while (opcion != 4);
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

    public static int RegistroMenu() {
        System.out.println("""
                           ------------------------------
                           1. Crear Casas/Edificios/Solares
                           2. Listar Casas/Edificios/Solares
                           3. Modificar Casas/Edificios/Solares
                           4. Borrar Casas/Edificios/Solares
                           5. Vender Casas/Edificios/Solares
                           ------------------------------
                           Ingrese Su Opcion:
                           """);
        return leer.nextInt();

    }//RegistroMenu

    public static Casa CrearCasa() {
        System.out.println("Ingrese el numero de Casa:");
        int NumerodeCasa = leer.nextInt();
        System.out.println("Ingrese el numero de Bloque:");
        int NumerodeBloque = leer.nextInt();
        System.out.println("Ingrese el Ancho: ");
        int ancho = leer.nextInt();
        System.out.println("Ingrese la largo: ");
        int largo = leer.nextInt();
        System.out.println("Ingrese la numero de baños: ");
        int bano = leer.nextInt();
        System.out.println("Ingrese la numero de cuartos: ");
        int cuartos = leer.nextInt();
        System.out.println("Ingrese el Estado: ");
        String estado = leer.next();
        Casa C = new Casa(NumerodeCasa, NumerodeBloque, bano, cuartos, ancho, largo, estado, JColorChooser.showDialog(null, "Ingrese el Color de la Casa", Color.yellow));
        return C;
    }//CrearCasa

    public static Edificio CrearEdificio() {
        System.out.println("Ingrese el numero de pisos: ");
        int pisos = leer.nextInt();
        System.out.println("Ingrese la numero de locales: ");
        int locales = leer.nextInt();
        System.out.println("Ingrese la Direccion: ");
        String Direccion = leer.next();
        System.out.println("Ingrese el Estado: ");
        String estado = leer.next();
        Edificio E = new Edificio(pisos, locales, Direccion, estado);
        return E;
    }//Crear Edificio

    public static Solar CrearSolar() {
        System.out.println("Ingrese el ancho: ");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el largo: ");
        int largo = leer.nextInt();
        Solar S = new Solar(ancho, largo);
        return S;
    }
}
