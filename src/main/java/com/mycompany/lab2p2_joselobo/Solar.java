package com.mycompany.lab2p2_joselobo;

public class Solar {

    private int ancho, largo;

    public Solar() {
    }

    public Solar(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
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

    public int getArea() {
        return largo * ancho;
    }

    @Override
    public String toString() {
        return "Solar[" + " Estado: " + estado + " Ancho:" + ancho + " Largo: " + largo + ']';
    }

}
