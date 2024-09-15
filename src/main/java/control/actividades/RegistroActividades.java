package control.actividades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan Diaz
 */
public class RegistroActividades {

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

    public static void registrarTransacciones(String actividad) {
        // Crear la carpeta si no existe
        File directory = new File("RegistroTransacciones");
        if (!directory.exists()) {
            directory.mkdirs(); // Crea la carpeta si no existe
        }

        // Archivo dentro de la carpeta "actividadesAdministrador"
        File file = new File(directory, "transacciones.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(actividad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registrarDepositos(String actividad) {
        // Crear la carpeta si no existe
        File directory = new File("RegistroDepositos");
        if (!directory.exists()) {
            directory.mkdirs(); // Crea la carpeta si no existe
        }

        // Archivo dentro de la carpeta "actividadesAdministrador"
        File file = new File(directory, "depositos.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(actividad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registrarRetiros(String actividad) {
        // Crear la carpeta si no existe
        File directory = new File("RegistroRetiros");
        if (!directory.exists()) {
            directory.mkdirs(); // Crea la carpeta si no existe
        }

        // Archivo dentro de la carpeta "actividadesAdministrador"
        File file = new File(directory, "retiros.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(actividad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
