package Herencia.Ejercicio_10;

public class Factura {
	private int numero;
    private Cliente cliente;
    protected double totalBase; 

    public Factura(int numero, Cliente cliente, double totalBase) {
        this.numero = numero;
        this.cliente = cliente;
        this.totalBase = totalBase;
    }

    public double calcularTotal() {
        return totalBase;
    }
    
    public void mostrarDetalles() {
        System.out.println("Factura No: " + numero);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("NIT: " + cliente.getNit());
        System.out.println("Monto Base: Q" + totalBase);
    }
}
