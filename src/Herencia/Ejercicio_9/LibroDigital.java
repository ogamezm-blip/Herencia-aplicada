package Herencia.Ejercicio_9;

public class LibroDigital extends Libro {
    private double tamanioMB;

    public LibroDigital(String titulo, String autor, double tamanioMB) {
        super(titulo, autor); 
        this.tamanioMB = tamanioMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Digital \nTamaño: " + tamanioMB + " MB");
    }
}
