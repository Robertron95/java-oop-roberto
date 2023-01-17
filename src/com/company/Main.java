package com.company;


public class Main  {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Lomo", 5.79, Producto.categoria.CARNE, 1, "22-1-2023", true);
        Producto producto2 = new Producto("Kéfir", 4.30, Producto.categoria.LACTEOS, 4, "18-2-2023", false);
        Producto producto3 = new Producto("Bombilla", 7.99, Producto.categoria.ELECTRICIDAD, 2, "No tiene", true);
        Producto producto4 = new Producto("Huevo", 2.02, Producto.categoria.HUEVOS, 1, "No tiene", false);
        Producto producto5 = new Producto("Mascarillas", 1.00, Producto.categoria.HIGIENE, 2, "1-1-2024", true);

        Producto[] arrayProductos = { producto1, producto2, producto3, producto4, producto5 };

        double precioTotal = 0.0;
        double precioMaximo = 0.0;
        double sumaTotal = 0.0;
        double media = 0.0;
        int productosDisponibles = 0;


        for (int i = 0; i <= arrayProductos.length - 1; i++) {

            if (arrayProductos[i].isDisponible()) {
                precioTotal = precioTotal + arrayProductos[i].getPrecio() * arrayProductos[i].getUnidades();

                if (arrayProductos[i].getPrecio() >= precioMaximo) {

                    precioMaximo = arrayProductos[i].getPrecio();
                }

                sumaTotal = sumaTotal + arrayProductos[i].getPrecio();
                productosDisponibles++;
            }

            media = sumaTotal/productosDisponibles;


        }

        System.out.println(precioTotal);
        System.out.println(precioMaximo);
        System.out.println(media);

    }
}
