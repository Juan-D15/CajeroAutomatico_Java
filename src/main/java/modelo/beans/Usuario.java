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

    public Usuario(String Nombre, String NumTarjeta, String PIN, String Saldo, String Monto) {
        this.Nombre = Nombre;
        this.NumTarjeta = NumTarjeta;
        this.PIN = PIN;
        this.Saldo = Saldo;
        this.Monto = Monto;
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
    
}
