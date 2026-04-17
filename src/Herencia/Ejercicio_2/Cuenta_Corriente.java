package Herencia.Ejercicio_2;

public class Cuenta_Corriente extends Cuenta{
	private double limiteSobregiro;

    public Cuenta_Corriente(double saldo, double limite) {
        super(saldo);
        this.limiteSobregiro = limite;
    }

    @Override
    public void retirar(double monto) {
        if (saldo + limiteSobregiro >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes (incluso con sobregiro).");
        }
    }
}
