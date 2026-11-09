package creacion_productos;

public class CreadorDigital extends CreadorProducto {
    private double tamanoArchivo;
    private String formato;

    public CreadorDigital(double tamanoArchivo, String formato) {
        this.tamanoArchivo = tamanoArchivo;
        this.formato = formato;
    }

    @Override
    public Producto factoryMethod() {
        return new ProductoDigital(tamanoArchivo, formato);
    }
}