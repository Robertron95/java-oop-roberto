package com.company;



public class Producto {

    private String nombre;
    private double precio;
    public enum categoria { CARNE, LACTEOS, HUEVOS, PESCADOS, PANADERIA, ELECTRICIDAD, HIGIENE,
    DROGUERIA, COSMETICA, FRUTAS, VERDURAS, HELADOS, APERITIVOS, GALLETAS, BEBIDAS, COLEGIO; }

    private categoria nombreCategoria;
    private int unidades;
    private String fechaDeCaducidad;

    public Producto() { }

    public Producto(String nombre, double precio, categoria nombreCategoria, int unidades, String fechaDeCaducidad) {

        this.nombre = nombre;
        this.precio = precio;
        this.nombreCategoria = nombreCategoria;
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

    public categoria getCategoria() {
        return nombreCategoria;
    }

    public void setCategoria(categoria nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
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
                ", categoria='" + nombreCategoria + '\'' +
                ", unidades=" + unidades +
                ", fechaDeCaducidad=" + fechaDeCaducidad +
                '}';
    }
}
