package control.actividades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan Diaz
 */
public class Actividades_Usuario_Administrador {

    public static void registrarActividadUsuario(String actividad) {
        // Crear la carpeta si no existe
        File directory = new File("actividadesUsuario");
        if (!directory.exists()) {
            directory.mkdirs(); // Crea la carpeta si no existe
        }

        // Archivo dentro de la carpeta "actividadesUsuario"
        File file = new File(directory, "act_usuarios.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(actividad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registrarActividadAdministrador(String actividad) {
        // Crear la carpeta si no existe
        File directory = new File("actividadesAdministrador");
        if (!directory.exists()) {
            directory.mkdirs(); // Crea la carpeta si no existe
        }

        // Archivo dentro de la carpeta "actividadesAdministrador"
        File file = new File(directory, "act_administradores.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(actividad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
