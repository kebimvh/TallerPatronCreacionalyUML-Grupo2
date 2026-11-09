import acceso_datos.ConexionBD;
import creacion_productos.*;

public class Main {
    public static void main(String[] args) {
        // Prueba Singleton
        ConexionBD bd1 = ConexionBD.getInstance();
        ConexionBD bd2 = ConexionBD.getInstance();
        System.out.println("¿Es la misma instancia de BD?: " + (bd1 == bd2));
        bd1.ejecutarQuery("SELECT * FROM productos");

        System.out.println("---------------------------------------------");

        // Prueba Factory Method
        CreadorProducto creadorFisico = new CreadorFisico(1.5, "20x15x10 cm");
        Producto pFisico = creadorFisico.registrarProducto();
        pFisico.mostrarDetalles();

        CreadorProducto creadorDigital = new CreadorDigital(500.0, "ZIP");
        Producto pDigital = creadorDigital.registrarProducto();
        pDigital.mostrarDetalles();
    }
}