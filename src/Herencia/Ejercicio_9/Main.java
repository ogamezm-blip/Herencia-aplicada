package Herencia.Ejercicio_9;

public class Main {
    public static void main(String[] args) {
        /*
         La clase LibroDigital hereda de Libro. Esto permite reutilizar los atributos 
         titul' y autor, ya que un libro digital sigue teniendo estas características.
        
         Se sobrescribió el método mostrarInfo(). Se utilizó super.mostrarInfo() para mostrar los datos generales y 
         luego se añadió la impresión del tamaño en MB exclusivo de los archivos digitales.
         Casos de prueba:
         1. Libro Digital: "Don Quijote", Autor: "Cervantes", Tamaño: 2.5 MB.
         2. Resultado: Debe imprimir los tres datos correctamente en consola.
         */

        LibroDigital miEbook = new LibroDigital("Don Quijote de la Mancha", "Miguel de Cervantes", 2.5);
        
        System.out.println("			Información de la Biblioteca");
        miEbook.mostrarInfo();
    }
}
