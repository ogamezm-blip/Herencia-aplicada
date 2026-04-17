package Herencia.Ejercicio_8;

public class Main {
    public static void main(String[] args) {
        /*
         Las clases Rectangulo y Circulo extienden de la clase base Figura. Esto 
         establece que ambas son figuras y deben tener un comportamiento para calcular su área.
         Se sobrescribió el método calcularArea().
         Casos de prueba:
         1. Rectángulo: Base 5, Altura 10 - Resultado esperado: 50.0.
         2. Círculo: Radio 7 - Resultado esperado: 153.94.
         */

        Figura miRectangulo = new Rectangulo(5, 10);
        Figura miCirculo = new Circulo(7);

        System.out.println("Área del Rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Área del Círculo: " + String.format("%.2f", miCirculo.calcularArea()));
    }
}
