package modelo.beans;

/**
 *
 * @author Juan Diaz
 */
public class Usuario {

    private String Nombre;
    private String NumTarjeta;
    private String PIN;
    private String Saldo;
    private String Monto;
    private String NumCuenta;

    public Usuario(String Nombre, String NumCuenta, String NumTarjeta, String PIN, String Saldo, String Monto) {
        this.Nombre = Nombre;
        this.NumCuenta = NumCuenta;
        this.NumTarjeta = NumTarjeta;
        this.PIN = PIN;
        this.Saldo = Saldo;
        this.Monto = Monto;
    }

    public Usuario(String NumTarjeta, String PIN) {
        this.NumTarjeta = NumTarjeta;
        this.PIN = PIN;
    }

    public Usuario() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumTarjeta() {
        return NumTarjeta;
    }

    public void setNumTarjeta(String NumTarjeta) {
        this.NumTarjeta = NumTarjeta;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

}
