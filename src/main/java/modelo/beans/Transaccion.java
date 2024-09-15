package modelo.beans;

import java.util.UUID;

/**
 *
 * @author Juan Diaz
 */
public class Transaccion {

    private String tipo; // "Retiro" o "Depósito"
    private int monto;
    private String fecha;
    private String hora;
    private String token; // token único

    public Transaccion(String tipo, int monto, String fecha, String hora) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
        this.token = generarToken(); // Generar el token al crear la transacción

    }

    private String generarToken() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return token + "|" + tipo + "|" + monto + "|" + fecha + "|" + hora;
    }

    public static Transaccion fromString(String line) {
        String[] data = line.split("\\|");
        Transaccion transaccion = new Transaccion(data[1], Integer.parseInt(data[2]), data[3], data[4]);
        transaccion.setToken(data[0]);
        return transaccion;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
