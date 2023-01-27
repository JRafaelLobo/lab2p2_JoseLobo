package com.mycompany.lab2p2_joselobo;

public class Edificio {
    
    private int NumeroDePisos, CantDeLocales;
    private String DireccionPorReferencia, estado;

    public Edificio() {
    }

    public Edificio(int NumeroDePisos, int CantDeLocales, String DireccionPorReferencia) {
        this.NumeroDePisos = NumeroDePisos;
        this.CantDeLocales = CantDeLocales;
        this.DireccionPorReferencia = DireccionPorReferencia;
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

    @Override
    public String toString() {
        return "Edificio{" + "NumeroDePisos=" + NumeroDePisos + ", CantDeLocales=" + CantDeLocales + ", DireccionPorReferencia=" + DireccionPorReferencia + '}';
    }
    

}
