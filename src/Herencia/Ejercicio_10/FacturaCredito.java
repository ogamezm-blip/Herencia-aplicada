package Herencia.Ejercicio_10;

public class FacturaCredito extends Factura {
	private int cuotas;
    private double recargo;

    public FacturaCredito(int numero, Cliente cliente, double totalBase, int cuotas, double recargo) {
        super(numero, cliente, totalBase); 
        this.cuotas = cuotas;
        this.recargo = recargo;
    }

    @Override
    public double calcularTotal() {
        double resultado = super.calcularTotal() + recargo;
        
        if (resultado < 0) {
            System.out.println("Error: El total de la factura crédito no puede ser negativo.");
            return 0;
        }
        return resultado;
    }

    public int getCuotas() { 
    	return cuotas; 
    	}
    public void setCuotas(int cuotas) { 
    	this.cuotas = cuotas; 
    	}
    
    @Override
    public void mostrarDetalles() {
        System.out.println("       FACTURA AL CRÉDITO");
        super.mostrarDetalles();
        System.out.println("Número de cuotas: " + cuotas);
        System.out.println("Recargo por financiamiento: Q" + recargo);
        System.out.println("Total Final: Q" + calcularTotal());
    }
}
