package acceso_datos;

public class ConexionBD {
    private static ConexionBD instancia;
    private String estadoConexion;

    private ConexionBD() {
        this.estadoConexion = "Conectado a BD Central";
    }

    public static synchronized ConexionBD getInstance() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public void ejecutarQuery(String query) {
        System.out.println("Ejecutando: [" + query + "] | Estado: " + estadoConexion);
    }
}