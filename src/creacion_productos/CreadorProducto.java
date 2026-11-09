package creacion_productos;

public abstract class CreadorProducto {
    public abstract Producto factoryMethod();

    public Producto registrarProducto() {
        Producto producto = factoryMethod();
        System.out.println("Registrando producto en la base de datos...");
        return producto;
    }
}