package com.mycompany.lab2p2_joselobo;

public class Edificio {

    private int NumeroDePisos, CantDeLocales;
    private String DireccionPorReferencia, estado, dueno;

    public Edificio() {
    }

    public Edificio(int NumeroDePisos, int CantDeLocales, String DireccionPorReferencia, String estado) {
        this.NumeroDePisos = NumeroDePisos;
        this.CantDeLocales = CantDeLocales;
        this.DireccionPorReferencia = DireccionPorReferencia;
        this.estado = estado;
    }

    public int getNumeroDePisos() {
        return NumeroDePisos;
    }

    public void setNumeroDePisos(int NumeroDePisos) {
        this.NumeroDePisos = NumeroDePisos;
    }

    public int getCantDeLocales() {
        return CantDeLocales;
    }

    public void setCantDeLocales(int CantDeLocales) {
        this.CantDeLocales = CantDeLocales;
    }

    public String getDireccionPorReferencia() {
        return DireccionPorReferencia;
    }

    public void setDireccionPorReferencia(String DireccionPorReferencia) {
        this.DireccionPorReferencia = DireccionPorReferencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Edificio[" + " Numero De Pisos: " + NumeroDePisos + " Cantidad De Locales:" + CantDeLocales + " Direccion Por Referencia:" + DireccionPorReferencia + "Dueno: " + dueno + ']';
    }

}
