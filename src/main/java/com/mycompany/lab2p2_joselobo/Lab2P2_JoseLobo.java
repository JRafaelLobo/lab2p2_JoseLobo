package com.mycompany.lab2p2_joselobo;

import java.util.Scanner;

public class Lab2P2_JoseLobo {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=Menu();  
    }
    public static int Menu(){
        System.out.println("""
                           1. Registro de Inmueble/Solar
                           2. Manejo de Estados
                           3. Log In/Sign Up
                           4. Salir
                           """);
        return leer.nextInt();
    }//menu
}
