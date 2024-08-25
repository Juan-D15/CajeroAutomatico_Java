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

    public boolean modificar(Usuario usuario) {
        if (buscar(usuario.getNumTarjeta()) != -1) { // si el usuario existe
            Usuario useraux = obtener(usuario.getNumTarjeta());
            useraux.setNombre(usuario.getNombre());
            useraux.setNumTarjeta(usuario.getNumTarjeta());
            useraux.setPIN(usuario.getPIN());
            useraux.setSaldo(usuario.getSaldo());
            useraux.setMonto(usuario.getMonto());
            return true;
        } else {
            return false;
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
