package cajero.modelo;

/**
 *
 * @author Juan Diaz
 */
public class Billete {

    private int denominacion;
    private int cantidad;

    public Billete(int denominacion, int cantidad) {
        this.denominacion = denominacion;
        this.cantidad = cantidad;
    }

    public int getDenominacion() {
        return denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
}
