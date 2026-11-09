package creacion_productos;

public class ProductoDigital implements Producto {
    private double tamanoArchivo;
    private String formato;

    public ProductoDigital(double tamanoArchivo, String formato) {
        this.tamanoArchivo = tamanoArchivo;
        this.formato = formato;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Digital -> Tamaño: " + tamanoArchivo + " MB, Formato: " + formato);
    }
}