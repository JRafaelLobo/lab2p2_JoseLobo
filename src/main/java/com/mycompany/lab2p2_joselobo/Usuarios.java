package com.mycompany.lab2p2_joselobo;

import java.util.ArrayList;

public class Usuarios {

    //atributos
    private ArrayList<String> nombre = new ArrayList();
    private ArrayList<String> username = new ArrayList();
    private ArrayList<String> password = new ArrayList();
    private ArrayList<Integer> edad = new ArrayList();

    //Constructores
    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, String username, String password) {
        this.nombre.add(nombre);
        this.edad.add(edad);
        this.username.add(nombre);
        this.password.add(nombre);
    }

    //Mutadores
    public ArrayList<String> getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getEdad() {
        return edad;
    }

    public ArrayList<String> getUser() {
        return username;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public void setEdad(ArrayList<Integer> edad) {
        this.edad = edad;
    }

    public void setUser(ArrayList<String> user) {
        this.username = user;
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }

    //Metodos de Administracion
    public void addAllData(String nombre, int edad, String user, String password) {
        this.nombre.add(nombre);
        this.edad.add(edad);
        this.username.add(user);
        this.password.add(password);
    }

    public void addNombre(String nombre) {
        this.nombre.add(nombre);
    }

    public void addEdad(int edad) {
        this.edad.add(edad);
    }

    public void addUser(String user) {
        this.username.add(user);
    }

    public void addPassword(String password) {
        this.password.add(password);
    }

    public int getEdad(int id) {
        return edad.get(id);
    }

    public String getNombre(int id) {
        return nombre.get(id);
    }

    public String getUser(int id) {
        return username.get(id);
    }

    public String getPassword(int id) {
        return password.get(id);
    }

    public int getEdadID(String n) {
        return edad.indexOf(n);
    }

    public int getNombreId(String n) {
        return nombre.indexOf(n);
    }

    public int getUserId(String n) {
        return username.indexOf(n);
    }

    public int getPasswordId(String n) {
        return password.indexOf(n);
    }

    public int size() {
        return this.username.size();
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", username=" + username + ", password=" + password + ", edad=" + edad + '}';
    }

}//class
