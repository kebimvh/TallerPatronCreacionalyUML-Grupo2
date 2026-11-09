package creacion_productos;

public class ProductoFisico implements Producto {
    private double peso;
    private String dimensiones;

    public ProductoFisico(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Físico -> Peso: " + peso + " kg, Dimensiones: " + dimensiones);
    }
}