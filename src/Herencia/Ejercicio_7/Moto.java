package Herencia.Ejercicio_7;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: Motocicleta \nCilindrada: " + cilindrada + "cc");
    }
}
