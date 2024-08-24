package modelo.beans;

/**
 *
 * @author Juan Diaz
 */
public class Administrador {

    private String usuario_admin;
    private String password;

    public Administrador(String usuario_admin, String pasword) {
        this.usuario_admin = usuario_admin;
        this.password = pasword;
    }

    public String getUsuario_admin() {
        return usuario_admin;
    }

    public void setUsuario_admin(String usuario_admin) {
        this.usuario_admin = usuario_admin;
    }

    public String getPasword() {
        return password;
    }

    public void setPasword(String pasword) {
        this.password = pasword;
    }

}
