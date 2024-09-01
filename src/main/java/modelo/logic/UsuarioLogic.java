package modelo.logic;

import cajero.modelo.Cajero;
import java.util.Map;
import modelo.beans.Usuario;
import modelo.dao.UsuarioDAO;

/**
 *
 * @author Juan Diaz
 */
public class UsuarioLogic {

    private static UsuarioDAO usuariodao = new UsuarioDAO();

    public static boolean autentificar(String NumTarjeta, String pin) {
        if (obtener(NumTarjeta) != null) {
            Usuario UserConsulta = obtener(NumTarjeta);
            if (UserConsulta.getNumTarjeta().equals(NumTarjeta) && UserConsulta.getPIN().equals(pin)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean retirar(String numTarjeta, String pin, int cantidad, Cajero cajero) {
        return usuariodao.retirar(numTarjeta, pin, cantidad, cajero);
    }

    public static boolean depositar(String numTarjeta, String pin, String numCuentaDestino, Map<Integer, Integer> billetes, Cajero cajero) {
        return usuariodao.depositar(numTarjeta, pin, numCuentaDestino, billetes, cajero);
    }

    public static boolean insertar(Usuario usuario) {
        return usuariodao.insertar(usuario);
    }

    public static boolean modificar(Usuario usuario, String numeroTarjetaOriginal) {
        return usuariodao.modificar(usuario, numeroTarjetaOriginal);
    }

    public static boolean modificarPin(Usuario usuario) {
        return usuariodao.modificarPin(usuario);
    }

    public static boolean eliminar(String usuario) {
        return usuariodao.eliminar(usuario);
    }

    public static Usuario obtener(String usuario) {
        return usuariodao.obtener(usuario);
    }

    public static String registrarAcceso(Usuario usuario) {
        return usuariodao.registrarAcceso(usuario);
    }

    public static String registrarSalida(Usuario usuario) {
        return usuariodao.registrarSalida(usuario);
    }

}
