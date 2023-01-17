package com.company;



public class Producto {

    private String nombre;
    private double precio;
    private String categoria;
    private int unidades;
    private String fechaDeCaducidad;

    public Producto() { }

    public Producto(String nombre, double precio, String categoria, int unidades, String fechaDeCaducidad) {

        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.unidades = unidades;
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", unidades=" + unidades +
                ", fechaDeCaducidad=" + fechaDeCaducidad +
                '}';
    }
}
