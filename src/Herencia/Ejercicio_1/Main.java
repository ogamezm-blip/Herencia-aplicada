package Herencia.Ejercicio_1;

public class Main {
	public static void main(String[] args) {
		/*
        La herencia la aplique para que en la clase Docente pueda heredar los atributos de la clase Persona y usarlos.
        El metodo que sobreescribi fue mostrar() para mostrar que los datos mostrados son de un docente.
        Caso de prueba:
        Ingresamos el nombre, la edad y la especialidad del docente para mostrarlo.
        */
		System.out.println("             Ejercicio 1.");
        Docente d = new Docente("Ing. García", 40, "Sistemas");
        d.mostrar();
    }
}
