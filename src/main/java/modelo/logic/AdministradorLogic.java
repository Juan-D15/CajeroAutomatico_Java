package modelo.logic;

import modelo.beans.Administrador;
import modelo.dao.AdministradorDAO;

/**
 *
 * @author Juan Diaz
 */
public class AdministradorLogic {

    private static AdministradorDAO administradordao = new AdministradorDAO();

    public static boolean autentificar(String usuario_admin, String password) {
        if (obtener(usuario_admin) != null) {
            Administrador AdmConsulta = obtener(usuario_admin);
            if (AdmConsulta.getUsuario_admin().equals(usuario_admin) && AdmConsulta.getPasword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void cargarAdministradores() {
        administradordao.cargarAdministradores();
    }

    public static String registrarAcceso(Administrador usuario) {
        return administradordao.registrarAcceso(usuario);
    }

    public static Administrador obtener(String administrador) {
        return administradordao.obtener(administrador);
    }
}
