package modelo.beans;

/**
 *
 * @author Juan Diaz
 */
public class Transaccion {

    private String tipo; // "Retiro" o "Depósito"
    private int monto;
    private String fecha;
    private String hora;

    public Transaccion(String tipo, int monto, String fecha, String hora) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
