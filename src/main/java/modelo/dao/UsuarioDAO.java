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

    public boolean insertar(Usuario usuario) {
        if (buscar(usuario.getNumTarjeta()) == -1) { // si el usuario no existe
            usuarios.add(usuario); //agrega al usuario
            return true;
        } else {
            return false;
        }
    }

    public boolean modificar(Usuario usuarioModificado) {
        // Busca al usuario original usando su número de tarjeta actual antes de modificarlo
        String numeroTarjetaOriginal = usuarioModificado.getNumTarjeta();
        int indice = buscar(numeroTarjetaOriginal);

        if (indice != -1) { // Si el usuario existe
            // Obtener el usuario actual
            Usuario usuarioActual = usuarios.get(indice);

            // Actualizar los datos
            usuarioActual.setNombre(usuarioModificado.getNombre());
            usuarioActual.setPIN(usuarioModificado.getPIN());
            usuarioActual.setSaldo(usuarioModificado.getSaldo());
            usuarioActual.setMonto(usuarioModificado.getMonto());

            // Si el número de tarjeta ha cambiado, realiza la actualización en la lista
            if (!usuarioActual.getNumTarjeta().equals(usuarioModificado.getNumTarjeta())) {
                String nuevoNumeroTarjeta = usuarioModificado.getNumTarjeta();

                // Actualizar el número de tarjeta
                usuarioActual.setNumTarjeta(nuevoNumeroTarjeta);

                // Elimina el usuario original de la lista usando el índice
                usuarios.remove(indice);

                // Inserta el usuario modificado con el nuevo número de tarjeta en la posición correcta
                usuarios.add(usuarioActual);
            }

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
