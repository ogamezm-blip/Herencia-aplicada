package Herencia.Ejercicio_10;

public class FacturaContado extends Factura {
	private double descuento;

    public FacturaContado(int numero, Cliente cliente, double totalBase, double descuento) {
        super(numero, cliente, totalBase);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        double resultado = super.calcularTotal() - descuento;
        
        if (resultado < 0) {
            System.out.println("Error: El descuento no puede ser mayor al total.");
            return 0;
        }
        return resultado;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("        FACTURA AL CONTADO");
        super.mostrarDetalles(); 
        System.out.println("Descuento aplicado: Q" + descuento);
        System.out.println("Total Final: Q" + calcularTotal());
    }
    
}
