package Herencia.Ejercicio_3;

public class ProductoPerecedero extends Producto{
	private int diasParaVencer;

    public ProductoPerecedero(String nombre, double precio, int diasParaVencer) {
        super(nombre, precio);
        this.diasParaVencer = diasParaVencer;
    }

    public boolean estaVencido() {
        return diasParaVencer <= 0;
    }
}
