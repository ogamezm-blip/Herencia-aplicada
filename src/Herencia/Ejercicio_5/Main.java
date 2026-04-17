package Herencia.Ejercicio_5;

public class Main {

	public static void main(String[] args) {
		/*
         La clase Gerente extiende de Empleado. Esto permite que el Gerente 
         herede automáticamente el nombre y el salario base sin tener que volver a declararlos.
         Se sobrescribió el método calcularSalario(). En lugar de solo retornar 
         el salario base, la versión del Gerente suma un bono adicional.
         Casos de prueba:
         1. Empleado normal: Salario Base Q3000 - Resultado esperado: Q3000.
         2. Gerente: Salario Base Q5000 + Bono Q2000 - Resultado esperado: Q7000.
         */
        
        Empleado emp = new Empleado("Juan Pérez", 3000.0);
        Gerente ger = new Gerente("Marta Gómez", 5000.0, 2000.0);

        System.out.println("Salario Empleado: Q" + emp.calcularSalario());
        System.out.println("Salario Gerente: Q" + ger.calcularSalario());

	}

}
