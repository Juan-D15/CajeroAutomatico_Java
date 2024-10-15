package conexionSQLServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juan Diaz
 */
public class CConexion {

    Connection conectar = null;

    String usuario = "userCajerosql";
    String password = "C@jero772";
    String bd = "CAJERO_DB";
    String ip = "localhost";
    String puerto = "1433";

    String url = "jdbc:sqlserver://" + ip + ":" + puerto + "/" + bd;

    public Connection establecerConexion() {
        try {
            String url = "jdbc:sqlserver://" + ip + ":" + puerto + ";" + "databaseName=" + bd + ";" + "encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(url, usuario, password);
            System.out.println("BASE DE DATOS CONECTADA");

        } catch (SQLException e) {
            System.out.println("ERROR AL CONECTAR A LA BASE DE DATOS");
            e.printStackTrace();
        }
        return conectar;
    }
}
