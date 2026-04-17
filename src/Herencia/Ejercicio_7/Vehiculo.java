package Herencia.Ejercicio_7;

public class Vehiculo {
	protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo Marca: " + marca + " \nVelocidad: " + velocidad + " km/h");
    }
}
