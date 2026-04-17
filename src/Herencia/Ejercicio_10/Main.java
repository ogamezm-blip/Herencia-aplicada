package Herencia.Ejercicio_10;

public class Main {
    public static void main(String[] args) {
    	/*
         FacturaContado extiende de Factura para reutilizar la lógica de cliente y monto base.
         Se modificó calcularTotal() para aplicar descuentos.
         Se agregó un bloque if para asegurar que el total no sea menor a Q0.00.
         Se usó super() en el constructor y super.calcularTotal().
         Encapsulamiento: Atributos privados en Cliente y Factura con acceso controlado.
         Casos de Prueba:
         1. Factura normal: Q500 - Q50 desc = Q450.
         2. Factura errónea: Q100 - Q150 desc = Q0 (Validación exitosa).
         */

        Cliente c = new Cliente("Roberto", "12345-9587");
        
        // Caso normal
        FacturaContado f1 = new FacturaContado(1, c, 500, 50);

        // Caso con total negativo
        FacturaContado f2 = new FacturaContado(2, c, 100, 150);
        
        f1.mostrarDetalles();
        System.out.println(); 
        f2.mostrarDetalles();
    }
}
