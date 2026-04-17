package Herencia.Ejercicio_3;

public class Main {

	public static void main(String[] args) {
		/*
         La clase ProductoPerecedero hereda nombre y precio de la clase Producto.
         No se utilizo sobrescritura.
         Casos de prueba::
         1. Producto con 5 días (No vencido).
         2. Producto con -1 días (Vencido).
         */
		System.out.println("          Ejercicio 3");
        ProductoPerecedero leche = new ProductoPerecedero("Leche", 15.0, -1);
        System.out.println("Producto: " + leche.nombre + "\nPrecio:" + leche.precio + "\nVencido?: " + leche.estaVencido());
    }


}
