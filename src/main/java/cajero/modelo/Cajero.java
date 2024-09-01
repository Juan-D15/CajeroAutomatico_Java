package cajero.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan Diaz
 */
public class Cajero {

    private static Cajero instancia;
    private Map<Integer, Billete> billetes;
    private boolean inicializado;
    private static final int max_Inicial = 10000;
    private static final int max_Total = 30000;

    // Constructor privado para evitar la creación de nuevas instancias
    private Cajero() {
        billetes = new HashMap<>();
        inicializado = false;
        inicializarDenominaciones();
    }

    // Método estático para obtener la única instancia de la clase
    public static Cajero getInstancia() {
        if (instancia == null) {
            instancia = new Cajero();
        }
        return instancia;
    }

    // Método para crear una nueva instancia de Cajero
    public static Cajero nuevoCajero() {
        instancia = new Cajero();
        return instancia;
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
                total += cantidad * denominacion;
            }

            if (total > max_Inicial) {
                System.out.println("No se puede inicializar con más de Q. 10,000.00.");
                return false;
            }

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

            for (Map.Entry<Integer, Integer> entry : cantidades.entrySet()) {
                int denominacion = entry.getKey();
                int cantidad = entry.getValue();
                nuevoTotal += cantidad * denominacion;

                if (nuevoTotal > max_Total) {
                    System.out.println("No se puede superar el límite de Q. 30,000.00. Operación cancelada.");
                    return false;
                }
            }

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

    public boolean disponibilidadBilletes(int cantidad) {
        Map<Integer, Integer> billetesNecesarios = calcularBilletes(cantidad);

        for (Map.Entry<Integer, Integer> entry : billetesNecesarios.entrySet()) {
            int denominacion = entry.getKey();
            int cantidadRequerida = entry.getValue();
            Billete billete = billetes.get(denominacion);

            if (billete == null || billete.getCantidad() < cantidadRequerida) {
                return false; // No hay suficientes billetes de esta denominación
            }
        }

        return true; // Hay suficientes billetes para cubrir el retiro
    }

    public void debitarBilletes(int cantidad) {
        Map<Integer, Integer> billetesADebitar = calcularBilletes(cantidad);

        for (Map.Entry<Integer, Integer> entry : billetesADebitar.entrySet()) {
            int denominacion = entry.getKey();
            int cantidadADebitar = entry.getValue();
            Billete billete = billetes.get(denominacion);

            if (billete != null && billete.getCantidad() >= cantidadADebitar) {
                billete.restarCantidad(cantidadADebitar);
            }
        }
    }

    public void agregarBilletes(Map<Integer, Integer> cantidades) {
        for (Map.Entry<Integer, Integer> entry : cantidades.entrySet()) {
            int denominacion = entry.getKey();
            int cantidad = entry.getValue();
            Billete billete = billetes.get(denominacion);

            if (billete != null) {
                billete.agregarCantidad(cantidad);
            }
        }
        System.out.println("Billetes agregados con éxito.");
    }

    private Map<Integer, Integer> calcularBilletes(int cantidad) {
        Map<Integer, Integer> resultado = new HashMap<>();
        int montoRestante = cantidad;

        int[] denominaciones = {200, 100, 50, 20, 10, 5, 1};

        for (int denominacion : denominaciones) {
            int cantidadBilletes = montoRestante / denominacion;
            if (cantidadBilletes > 0) {
                Billete billete = billetes.get(denominacion);
                if (billete != null && billete.getCantidad() >= cantidadBilletes) {
                    resultado.put(denominacion, cantidadBilletes);
                    montoRestante -= cantidadBilletes * denominacion;
                } else if (billete != null && billete.getCantidad() > 0) {
                    resultado.put(denominacion, billete.getCantidad());
                    montoRestante -= billete.getCantidad() * denominacion;
                }
            }
        }

        // Verificar si el monto restante es mayor a cero
        if (montoRestante > 0) {
            // Si no podemos cubrir la cantidad exacta, el retiro debería fallar
            return new HashMap<>(); // Retorna un mapa vacío para indicar que no se puede cubrir la cantidad exacta
        }

        return resultado;
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
