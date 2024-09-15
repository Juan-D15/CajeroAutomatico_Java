package modelo.logic;

import cajero.modelo.Cajero;
import java.util.List;
import java.util.Map;
import modelo.beans.Transaccion;
import modelo.beans.Usuario;
import modelo.dao.UsuarioDAO;

/**
 *
 * @author Juan Diaz
 */
public class UsuarioLogic {

    private static UsuarioDAO usuariodao = new UsuarioDAO();

    //Autentificar el Usuario
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

    public static List<Usuario> listaUsuarios() {
        return usuariodao.listaUsuarios();
    }

    public static List<Usuario> listaAccesoUsuarios() {
        return usuariodao.listaAccesoUsuarios();
    }

    public static void cargarUsuarios() {
        usuariodao.cargarUsuarios();
    }

    public static void cargarAccesoUsuarios() {
        usuariodao.cargarAccesoUsuarios();
    }

    public static List<Transaccion> UltimasTransacciones(Usuario usuario) {
        return usuariodao.UltimasTransacciones(usuario);
    }

    public static List<Transaccion> transaccionesUsuarios(Usuario usuario) {
        return usuariodao.transaccionesUsuarios(usuario);
    }

    public static boolean retirar(String numTarjeta, String pin, int cantidad, Cajero cajero) {
        return usuariodao.retirar(numTarjeta, pin, cantidad, cajero);
    }

    public static boolean depositar(String numTarjeta, String pin, String numCuentaDestino, Map<Integer, Integer> billetes, Cajero cajero) {
        return usuariodao.depositar(numTarjeta, pin, numCuentaDestino, billetes, cajero);
    }

    public static int obtenerTotalRetiradoPorTodos() {
        return usuariodao.obtenerTotalRetiradoPorTodos();
    }

    public static double obtenerPromedioDepositadoPorTodos() {
        return usuariodao.obtenerPromedioDepositadoPorTodos();
    }

    public static List<Usuario> obtenerUsuariosConCambioPIN() {
        return usuariodao.obtenerUsuariosConCambioPIN();
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
