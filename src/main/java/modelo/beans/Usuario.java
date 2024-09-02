package modelo.beans;

import java.util.ArrayList;
import java.util.List;

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
    private String MontoDisponible;
    private String NumCuenta;
    private List<Transaccion> transacciones;
    private int totalRetirado;
    private int totalDepositado;
    private boolean cambioPIN;
    private String FechaAcceso;
    private String HoraAcceso;
    private String FechaSalida;
    private String HoraSalida;

    public Usuario(String Nombre, String NumCuenta, String NumTarjeta, String PIN, String Saldo, String Monto) {
        this.Nombre = Nombre;
        this.NumCuenta = NumCuenta;
        this.NumTarjeta = NumTarjeta;
        this.PIN = PIN;
        this.Saldo = Saldo;
        this.Monto = Monto;
        this.MontoDisponible = Monto;
        this.totalRetirado = 0;
        this.totalDepositado = 0;
        this.cambioPIN = false;
        this.transacciones = new ArrayList<>();

    }

    public Usuario(String NumTarjeta, String PIN) {
        this.NumTarjeta = NumTarjeta;
        this.PIN = PIN;
    }

    public Usuario() {
    }

    // Métodos para manejar transacciones
    public void agregarTransaccion(Transaccion transaccion) {
        if (transaccion != null) {
            transacciones.add(transaccion);
        }
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public int getTotalDepositado() {
        return totalDepositado;
    }

    public void incrementarTotalDepositado(int cantidad) {
        this.totalDepositado += cantidad;
    }

    public int getTotalRetirado() {
        return totalRetirado;
    }

    public void incrementarTotalRetirado(int cantidad) {
        this.totalRetirado += cantidad;
    }

    public boolean haCambiadoPIN() {
        return cambioPIN;
    }

    public void setCambioPIN(boolean cambioPIN) {
        this.cambioPIN = cambioPIN;
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

    public String getMontoDisponible() {
        return MontoDisponible;
    }

    public void setMontoDisponible(String MontoDisponible) {
        this.MontoDisponible = MontoDisponible;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public void setFechaAcceso(String FechaAcceso) {
        this.FechaAcceso = FechaAcceso;
    }

    public void setHoraAcceso(String HoraAcceso) {
        this.HoraAcceso = HoraAcceso;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    //Fecha y Hora juntos
    public String getFechaHora_Acceso() {
        return FechaAcceso + ", " + HoraAcceso;
    }

    public String getFechaHora_Salida() {
        return FechaSalida + ", " + HoraSalida;
    }
}
