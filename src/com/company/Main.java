package com.company;


public class Main  {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Lomo", 5.79, "Carnes", 1, "22-1-2023");
        Producto producto2 = new Producto("Kéfir", 4.30, "Lácteos y huevos", 4, "18-2-2023");
        Producto producto3 = new Producto("Bombilla", 7.99, "Electicidad", 2, "No tiene");
        Producto producto4 = new Producto("Huevo", 2.02, "Lácteos y huevos", 1, "No tiene");
        Producto producto5 = new Producto("Mascarillas", 1.00, "Higiene", 2, "1-1-2024");

        Producto[] arrayProductos = { producto1, producto2, producto3, producto4, producto5 };

        double precioTotal = 0.0;
        double precioMaximo = 0.0;
        double sumaTotal = 0.0;


        for (int i = 0; i <= arrayProductos.length - 1; i++) {

            precioTotal = precioTotal + arrayProductos[i].getPrecio() * arrayProductos[i].getUnidades();

            if (arrayProductos[i].getPrecio() >= precioMaximo) {

                precioMaximo = arrayProductos[i].getPrecio();
            }

            sumaTotal = sumaTotal + arrayProductos[i].getPrecio();



        }

        System.out.println(precioTotal);
        System.out.println(precioMaximo);
        System.out.println(sumaTotal/arrayProductos.length);

    }
}
