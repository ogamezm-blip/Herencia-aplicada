package Herencia.Ejercicio_4;
public class Main {
	public static void main(String[] args) {
		/*
		 Use la herencia para definir un transporte general y un bus específico.
		 Metodo sobreescrito fue descripcion() para añadir la ruta.
		 Caso de prueba: 
		 Bus con 40 pasajeros y ruta "Norte".
		 */
		Bus miBus = new Bus(40, "Norte");
		miBus.descripcion();
	}
}
