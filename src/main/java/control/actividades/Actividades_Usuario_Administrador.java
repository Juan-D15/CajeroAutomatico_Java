package control.actividades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan Diaz
 */
public class Actividades_Usuario_Administrador {

    public static void registrarActividadUsuario(String actividad) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("act_usuarios.txt", true))) {
            writer.write(actividad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registrarActividadAdministrador(String actividad) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("act_administradores.txt", true))) {
            writer.write(actividad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
