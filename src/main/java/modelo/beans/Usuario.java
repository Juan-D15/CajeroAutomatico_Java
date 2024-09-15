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
        this.transacciones = new ArrayList<>();
    }

    // Implementa un toString para guardar los datos en formato CSV
    @Override
    public String toString() {
        // Convierte la lista de transacciones a una cadena separada por ";"
        String transaccionesString = transacciones.stream()
                .map(Transaccion::toString) // Suponiendo que Transaccion también tiene un toString implementado
                .reduce((a, b) -> a + ";" + b)
                .orElse("");

        return Nombre + "," + NumCuenta + "," + NumTarjeta + "," + PIN + ","
                + Saldo + "," + Monto + "," + MontoDisponible + "," + totalRetirado + ","
                + totalDepositado + "," + cambioPIN + "," + FechaSalida + "," + HoraSalida + ","
                + transaccionesString;
    }

    // Implementa un fromString para cargar los datos desde el archivo
    public static Usuario fromString(String line) {
        String[] data = line.split(",");

        Usuario usuario = new Usuario();
        usuario.setNombre(data[0]);
        usuario.setNumCuenta(data[1]);
        usuario.setNumTarjeta(data[2]);
        usuario.setPIN(data[3]);
        usuario.setSaldo(data[4]);
        usuario.setMonto(data[5]);
        usuario.setMontoDisponible(data[6]);
        usuario.setTotalRetirado(Integer.parseInt(data[7]));
        usuario.setTotalDepositado(Integer.parseInt(data[8]));
        usuario.setCambioPIN(Boolean.parseBoolean(data[9]));
        usuario.setFechaSalida(data[10]);
        usuario.setHoraSalida(data[11]);

        // Si hay transacciones en la línea, cargarlas
        if (data.length > 12) {
            String[] transaccionesData = data[12].split(";");
            for (String transaccionString : transaccionesData) {
                Transaccion transaccion = Transaccion.fromString(transaccionString);
                usuario.getTransacciones().add(transaccion);
            }
        }

        return usuario;
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

    public int getTotalRetirado() {
        return totalRetirado;
    }

    public void setTotalRetirado(int totalRetirado) {
        this.totalRetirado = totalRetirado;
    }

    public void setTotalDepositado(int totalDepositado) {
        this.totalDepositado = totalDepositado;
    }

    public void incrementarTotalDepositado(int cantidad) {
        this.totalDepositado += cantidad;
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
        return FechaSalida != null ? FechaSalida : "";
    }

    public String getHoraSalida() {
        return HoraSalida != null ? HoraSalida : "";
    }

    //Fecha y Hora juntos
    public String getFechaHora_Acceso() {
        return FechaAcceso + ", " + HoraAcceso;
    }

    public String getFechaHora_Salida() {
        return (FechaSalida != null ? FechaSalida : "") + ", " + (HoraSalida != null ? HoraSalida : "");
    }
}
