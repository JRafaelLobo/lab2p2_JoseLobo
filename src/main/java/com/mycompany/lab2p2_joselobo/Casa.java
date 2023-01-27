package com.mycompany.lab2p2_joselobo;

import java.awt.Color;

public class Casa {
    private int NumeroDeCasa,NumeroDeBloques,NumeroDeBano,NumeroDeCuarto,ancho,largo;
    private Color color;
    String estado;

    public Casa() {
    }

    public Casa(int NumeroDeCasa, int NumeroDeBloques, int NumeroDeBano, int NumeroDeCuarto, int ancho, int largo, Color color) {
        this.NumeroDeCasa = NumeroDeCasa;
        this.NumeroDeBloques = NumeroDeBloques;
        this.NumeroDeBano = NumeroDeBano;
        this.NumeroDeCuarto = NumeroDeCuarto;
        this.ancho = ancho;
        this.largo = largo;
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

    @Override
    public String toString() {
        return "Casa{" + "NumeroDeCasa=" + NumeroDeCasa + ", NumeroDeBloques=" + NumeroDeBloques + ", NumeroDeBano=" + NumeroDeBano + ", NumeroDeCuarto=" + NumeroDeCuarto + ", ancho=" + ancho + ", largo=" + largo + ", color=" + color + '}';
    }
}
