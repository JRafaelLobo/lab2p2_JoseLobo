package com.mycompany.lab2p2_joselobo;

public class Solar {

    private String estado;
    private int ancho, largo;

    public Solar() {
    }
    

    public Solar(String estado, int ancho, int largo) {
        this.estado = estado;
        this.ancho = ancho;
        this.largo = largo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    @Override
    public String toString() {
        return "Solar{" + "estado=" + estado + ", ancho=" + ancho + ", largo=" + largo + '}';
    }

}
