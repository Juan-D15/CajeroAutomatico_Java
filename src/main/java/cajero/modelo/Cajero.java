package cajero.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan Diaz
 */
public class Cajero {

    private Map<Integer, Billete> billetes;
    private boolean inicializado;
    private static final int max_Inicial = 10000;
    private static final int max_Total = 30000;

    public Cajero() {
        billetes = new HashMap<>();
        inicializado = false;
        inicializarDenominaciones();
    }

    private void inicializarDenominaciones() {
        int[] denominaciones = {200, 100, 50, 20, 10, 5, 1};
        for (int denominacion : denominaciones) {
            billetes.put(denominacion, new Billete(denominacion, 0));
        }
    }

    public boolean inicializarCajero(Map<Integer, Integer> cantidades) {
        if (cantidades != null) {
            int total = 0;
            for (Map.Entry<Integer, Integer> entry : cantidades.entrySet()) {
                int denominacion = entry.getKey();
                int cantidad = entry.getValue();
                System.out.println("CANTIDAD: "+cantidad+" DENOMINACION: "+denominacion);
                total += cantidad * denominacion;
                System.out.println("PRIMER TOTAL: "+total);
            }

            if (total > max_Inicial) {
                System.out.println("TOTAL VERIFICACION: "+total);
                System.out.println("No se puede inicializar con más de Q. 10,000.00.");
                return false;
            }

            // Si el total es válido, agregar los billetes
            for (Map.Entry<Integer, Integer> entry : cantidades.entrySet()) {
                int denominacion = entry.getKey();
                int cantidad = entry.getValue();
                Billete billete = billetes.get(denominacion);
                if (billete != null) {
                    billete.agregarCantidad(cantidad);
                }
            }

            inicializado = true;
            System.out.println("Cajero inicializado con éxito.");
            return true;
        }
        return false;
    }

    public boolean agregarEfectivo(Map<Integer, Integer> cantidades) {
        if (cantidades != null) {
            if (!inicializado) {
                System.out.println("El cajero no ha sido inicializado.");
                return false;
            }

            int total_Efectivo = obtenerTotal();
            int nuevoTotal = total_Efectivo;

            // Verifica si el nuevo total excedería el límite antes de modificar cualquier cosa
            for (Map.Entry<Integer, Integer> entry : cantidades.entrySet()) {
                int denominacion = entry.getKey();
                int cantidad = entry.getValue();
                nuevoTotal += cantidad * denominacion;

                if (nuevoTotal > max_Total) {
                    System.out.println("No se puede superar el límite de Q. 30,000.00. Operación cancelada.");
                    return false;
                }
            }

            // Si el nuevo total es válido, agregar los billetes
            for (Map.Entry<Integer, Integer> entry : cantidades.entrySet()) {
                int denominacion = entry.getKey();
                int cantidad = entry.getValue();
                Billete billete = billetes.get(denominacion);
                if (billete != null) {
                    billete.agregarCantidad(cantidad);
                }
            }

            System.out.println("Efectivo agregado con éxito.");
            return true;
        }
        return false;
    }

    private int obtenerTotal() {
        int total_Obtener = 0;
        for (Billete billete : billetes.values()) {
            total_Obtener += billete.getCantidad() * billete.getDenominacion();
        }
        return total_Obtener;
    }

    public void mostrarTotal() {
        System.out.println("Total en el cajero: Q." + obtenerTotal());
    }
}
