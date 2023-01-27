package com.mycompany.lab2p2_joselobo;

import java.awt.Color;

public class Casa {

    private int NumeroDeCasa, NumeroDeBloques, NumeroDeBano, NumeroDeCuarto, ancho, largo;
    private Color color;
    String estado;

    public Casa() {
    }

    public Casa(int NumeroDeCasa, int NumeroDeBloques, int NumeroDeBano, int NumeroDeCuarto, int ancho, int largo, String estado, Color color) {
        this.NumeroDeCasa = NumeroDeCasa;
        this.NumeroDeBloques = NumeroDeBloques;
        this.NumeroDeBano = NumeroDeBano;
        this.NumeroDeCuarto = NumeroDeCuarto;
        this.ancho = ancho;
        this.largo = largo;
        this.estado = estado;
        this.color = color;
    }

    public int getNumeroDeCasa() {
        return NumeroDeCasa;
    }

    public void setNumeroDeCasa(int NumeroDeCasa) {
        this.NumeroDeCasa = NumeroDeCasa;
    }

    public int getNumeroDeBloques() {
        return NumeroDeBloques;
    }

    public void setNumeroDeBloques(int NumeroDeBloques) {
        this.NumeroDeBloques = NumeroDeBloques;
    }

    public int getNumeroDeBano() {
        return NumeroDeBano;
    }

    public void setNumeroDeBano(int NumeroDeBano) {
        this.NumeroDeBano = NumeroDeBano;
    }

    public int getNumeroDeCuarto() {
        return NumeroDeCuarto;
    }

    public void setNumeroDeCuarto(int NumeroDeCuarto) {
        this.NumeroDeCuarto = NumeroDeCuarto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Casa[" + "Numero De Casa: " + NumeroDeCasa + " Numero De Bloques:" + NumeroDeBloques + " Numero De Bano: " + NumeroDeBano + " Numero De Cuarto:" + NumeroDeCuarto + " Ancho:" + ancho + " largo:" + largo + " Color: " + color + ']';
    }
}
