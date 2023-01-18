package com.company;

public class Fabricante {

    private String nombre;
    private String pais;

    public Fabricante() { }

    public Fabricante(String nombre, String pais) {

        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
