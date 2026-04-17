package Herencia.Ejercicio_2;

public class Cuenta {
	protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }
}
