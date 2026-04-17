package Herencia.Ejercicio_2;

public class Main {

	public static void main(String[] args) {
		/*
         La herencia la aplique en las clases Cuenta_Corriente y Cuenta para que Cuenta_Corriente pueda heredar el atributo saldo.
         El metodo que sobreescribi fue retirar() para permitir saldos negativos controlados.
         Casos de pruebas:
         1. Saldo 1000, Límite 500, Retiro 1300 (Debería funcionar: saldo queda en -300).
         2. Retiro 2000 (Debería fallar: supera el saldo + sobregiro).
         */
        Cuenta_Corriente miCuenta = new Cuenta_Corriente(1000, 500);
        
        System.out.println("			Ejercicio 2");
        miCuenta.retirar(1300);
        miCuenta.retirar(500); // Intento de retirar más del límite
    }

}
