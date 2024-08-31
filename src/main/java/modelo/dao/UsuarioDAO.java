package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.Usuario;

/**
 *
 * @author Juan Diaz
 */
public class UsuarioDAO {

    private List<Usuario> usuarios;

    public UsuarioDAO() {
        usuarios = new ArrayList<>();
    }

    public int buscar(String NumTarjeta) {
        int n = -1; // variable si no encontro al usuario
        for (int i = 0; i < usuarios.size(); i++) { //recorre la lista
            if (usuarios.get(i).getNumTarjeta().equals(NumTarjeta)) { //verifica en la lista si ya existe un usuario
                n = i;
                break;
            }
        }
        return n;
    }

    public int buscarPin(String PIN) {
        int n = -1; // variable si no encontro al usuario
        for (int i = 0; i < usuarios.size(); i++) { //recorre la lista
            if (usuarios.get(i).getPIN().equals(PIN)) { //verifica en la lista si ya existe un usuario
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean insertar(Usuario usuario) {
        if (buscar(usuario.getNumTarjeta()) == -1 && buscarPin(usuario.getPIN()) == -1) { // si el usuario no existe
            usuarios.add(usuario); //agrega al usuario
            return true;
        } else {
            return false;
        }
    }

    public boolean modificar(Usuario usuarioModificado, String numeroTarjetaOriginal) {
        // Buscar al usuario original usando el número de tarjeta anterior
        int indice = buscar(numeroTarjetaOriginal);

        if (indice != -1) { // Si el usuario existe
            // Obtener el usuario actual
            Usuario usuarioActual = usuarios.get(indice);

            // Actualizar los datos del usuario actual
            usuarioActual.setNumCuenta(usuarioModificado.getNumCuenta());
            usuarioActual.setNombre(usuarioModificado.getNombre());
            usuarioActual.setPIN(usuarioModificado.getPIN());
            usuarioActual.setSaldo(usuarioModificado.getSaldo());
            usuarioActual.setMonto(usuarioModificado.getMonto());

            // Si el número de tarjeta ha cambiado, realiza la actualización
            if (!numeroTarjetaOriginal.equals(usuarioModificado.getNumTarjeta())) {
                // Elimina el usuario original
                usuarios.remove(indice);
                Usuario usuarioNuevo = new Usuario();
                // Actualiza el número de tarjeta
                usuarioNuevo.setNumTarjeta(usuarioModificado.getNumTarjeta());
                // Actualizar los datos del usuario actual
                usuarioNuevo.setNumCuenta(usuarioModificado.getNumCuenta());
                usuarioNuevo.setNombre(usuarioModificado.getNombre());
                usuarioNuevo.setPIN(usuarioModificado.getPIN());
                usuarioNuevo.setSaldo(usuarioModificado.getSaldo());
                usuarioNuevo.setMonto(usuarioModificado.getMonto());

                // Inserta el usuario con el nuevo número de tarjeta
                usuarios.add(usuarioNuevo);
            }

            return true;
        } else {
            return false; // Si no se encuentra el usuario
        }
    }

    public boolean modificarPin(Usuario usuarioModificado) {
        // Busca al usuario original usando su número de tarjeta actual antes de modificarlo
        String numeroTarjetaOriginal = usuarioModificado.getNumTarjeta();
        int indice = buscar(numeroTarjetaOriginal);

        if (indice != -1) { // Si el usuario existe
            // Obtener el usuario actual
            Usuario usuarioActual = usuarios.get(indice);

            // Actualizar los datos
            usuarioActual.setPIN(usuarioModificado.getPIN());

            return true;
        } else {
            return false; // Si no se encuentra el usuario
        }
    }

    public boolean eliminar(String usuario) {
        if (buscar(usuario) != -1) { // si el usuario existe
            usuarios.remove(buscar(usuario));
            return true;
        } else {
            return false;
        }
    }

    public Usuario obtener(String usuario) {
        if (buscar(usuario) != -1) { //si el usuario existe
            return usuarios.get(buscar(usuario)); //obtiene el indice donde lo encontro
        } else {
            return null;
        }
    }
}
