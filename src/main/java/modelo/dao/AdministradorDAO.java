package modelo.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.beans.Administrador;
import modelo.beans.FechaHora;

/**
 *
 * @author Juan Diaz
 */
public class AdministradorDAO {

    private List<Administrador> administradores;

    public AdministradorDAO() {
        administradores = new ArrayList<>();
        cargarAdministradores();
    }

    // Cargar usuarios desde un archivo .txt
    public void cargarAdministradores() {
        File file = new File("datosAdministradores", "Administradores.txt");

        if (file.exists()) {
            administradores.clear();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    Administrador administrador = Administrador.fromString(line);
                    administradores.add(administrador);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo 'Administradores.txt' no existe en la carpeta 'datosAdministradores'.");
        }
    }
    
    //Metodo para registrar el acceso de los administradores
    public String registrarAcceso(Administrador admin) {
        if (admin != null) {
            FechaHora fh = new FechaHora();
            admin.setFechaAcceso(fh.FechaAcceso());
            admin.setHoraAcceso(fh.HoraAcceso());
            String acceso = admin.getFechaHora_Acceso();
            return acceso;
        }
        return null;
    }

    private int buscar(String usuario_admin) {
        int n = -1; // variable si no encontro al usuario
        for (int i = 0; i < administradores.size(); i++) { //recorre la lista
            if (administradores.get(i).getUsuario_admin().equals(usuario_admin)) { //verifica en la lista si ya existe un usuario
                n = i;
                break;
            }
        }
        return n;
    }

    private boolean insertar(Administrador administrador) {
        if (buscar(administrador.getUsuario_admin()) == -1) { // si el usuario no existe
            administradores.add(administrador); //agrega al usuario
            return true;
        } else {
            return false;
        }
    }

    private boolean modificar(Administrador administrador) {
        if (buscar(administrador.getUsuario_admin()) != -1) { // si el usuario existe
            Administrador adminaux = obtener(administrador.getUsuario_admin());
            adminaux.setUsuario_admin(administrador.getUsuario_admin());
            adminaux.setPasword(administrador.getPasword());
            return true;
        } else {
            return false;
        }
    }

    private boolean eliminar(String administrador) {
        if (buscar(administrador) != -1) { // si el usuario existe
            administradores.remove(buscar(administrador));
            return true;
        } else {
            return false;
        }
    }

    public Administrador obtener(String usuario_admin) {
        if (buscar(usuario_admin) != -1) { //si el usuario existe
            return administradores.get(buscar(usuario_admin)); //obtiene el indice donde lo encontro
        } else {
            return null;
        }
    }
}
