package creacion_productos;

public class CreadorFisico extends CreadorProducto {
    private double peso;
    private String dimensiones;

    public CreadorFisico(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public Producto factoryMethod() {
        return new ProductoFisico(peso, dimensiones);
    }
}