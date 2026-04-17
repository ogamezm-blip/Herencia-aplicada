package Herencia.Ejercicio_6;

public class Main {

	public static void main(String[] args) {
		/*
        La clase Perro hereda de Animal. Esto indica que un perro es un tipo de animal y, 
        por lo tanto, posee el método hacerSonido.
        Se sobrescribió el método hacerSonido().
        .
         Casos de prueba:
         1. Objeto Animal: Llama a hacerSonido() - Salida: "Sonido genérico".
         2. Objeto Perro: Llama a hacerSonido() - Salida: "Guau, guau".
         */

        Animal animalGenerico = new Animal();
        Perro miPerro = new Perro();

        System.out.println("Prueba con Animal:");
        animalGenerico.hacerSonido();

        System.out.println("\nPrueba con Perro:");
        miPerro.hacerSonido();

	}

}
