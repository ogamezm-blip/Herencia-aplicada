package Herencia.Ejercicio_7;

public class Main {
    public static void main(String[] args) {
        /*
         La clase Moto extiende a la clase Vehiculo. Al hacerlo, la moto adquiere automáticamente 
         los atributos marca y velocidad sin necesidad de volver a declararlos.
         Se sobrescribió mostrarInfo().
         Casos de prueba:
         1. Creación de una Moto: Marca "Yamaha", Velocidad 140 km/h, Cilindrada 600cc.
         2. Verificación de salida: Debe mostrar los tres datos en consola.
         */

        Moto miMoto = new Moto("Yamaha", 140, 600);
        
        System.out.println("			Información del Vehículo");
        miMoto.mostrarInfo();
    }
}
