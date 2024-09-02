package modelo.dao;

import cajero.modelo.Cajero;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import modelo.beans.Usuario;
import modelo.beans.FechaHora;
import modelo.beans.Transaccion;

/**
 *
 * @author Juan Diaz
 */
public class UsuarioDAO {

    private List<Usuario> usuarios;
    private List<Usuario> ultimoAcceso;

    public UsuarioDAO() {
        usuarios = new ArrayList<>();
        ultimoAcceso = new ArrayList<>();
    }
    //Buscar un usuario por el numero de tarjeta
    public int buscar(String NumTarjeta) {
        int n = -1; // variable si no encontro al usuario
        for (int i = 0; i < usuarios.size(); i++) { //recorre la lista
            if (usuarios.get(i).getNumTarjeta().equals(NumTarjeta)) { //verifica en la lista si ya existe un usuario
                n = i;
                break;
            }
        }
        return n;
    }
    //Buscar un usuario por el pin
    public int buscarPin(String PIN) {
        int n = -1; // variable si no encontro al usuario
        for (int i = 0; i < usuarios.size(); i++) { //recorre la lista
            if (usuarios.get(i).getPIN().equals(PIN)) { //verifica en la lista si ya existe un usuario
                n = i;
                break;
            }
        }
        return n;
    }
    //Buscar un usuario por en numero de cuenta
    public int buscarCuenta(String numCuenta) {
        int n = -1; // variable si no encontro al usuario
        for (int i = 0; i < usuarios.size(); i++) { //recorre la lista
            if (usuarios.get(i).getNumCuenta().equals(numCuenta)) { //verifica en la lista si ya existe un usuario
                n = i;
                break;
            }
        }
        return n;
    }
    //Agregar a un Usuario
    public boolean insertar(Usuario usuario) {
        if (buscar(usuario.getNumTarjeta()) == -1 && buscarPin(usuario.getPIN()) == -1) { // si el usuario no existe
            usuarios.add(usuario); //agrega al usuario
            return true;
        } else {
            return false;
        }
    }
    //Modificar datos de un usuario
    public boolean modificar(Usuario usuarioModificado, String numeroTarjetaOriginal) {
        // Buscar al usuario original usando el número de tarjeta anterior
        int indice = buscar(numeroTarjetaOriginal);

        if (indice != -1) { // Si el usuario existe
            // Obtener el usuario actual
            Usuario usuarioActual = usuarios.get(indice);

            // Actualizar los datos del usuario actual
            usuarioActual.setNumCuenta(usuarioModificado.getNumCuenta());
            usuarioActual.setNombre(usuarioModificado.getNombre());
            usuarioActual.setPIN(usuarioModificado.getPIN());
            usuarioActual.setSaldo(usuarioModificado.getSaldo());
            usuarioActual.setMonto(usuarioModificado.getMonto());

            // Si el número de tarjeta ha cambiado, realiza la actualización
            if (!numeroTarjetaOriginal.equals(usuarioModificado.getNumTarjeta())) {
                // Elimina el usuario original
                usuarios.remove(indice);
                Usuario usuarioNuevo = new Usuario();
                // Actualiza el número de tarjeta
                usuarioNuevo.setNumTarjeta(usuarioModificado.getNumTarjeta());
                // Actualizar los datos del usuario actual
                usuarioNuevo.setNumCuenta(usuarioModificado.getNumCuenta());
                usuarioNuevo.setNombre(usuarioModificado.getNombre());
                usuarioNuevo.setPIN(usuarioModificado.getPIN());
                usuarioNuevo.setSaldo(usuarioModificado.getSaldo());
                usuarioNuevo.setMonto(usuarioModificado.getMonto());

                // Inserta el usuario con el nuevo número de tarjeta
                usuarios.add(usuarioNuevo);
            }

            return true;
        } else {
            return false; // Si no se encuentra el usuario
        }
    }
    //Modificar el PIN de un usuario
    public boolean modificarPin(Usuario usuarioModificado) {
        // Busca al usuario original usando su número de tarjeta actual antes de modificarlo
        String numeroTarjetaOriginal = usuarioModificado.getNumTarjeta();
        int indice = buscar(numeroTarjetaOriginal);

        if (indice != -1) { // Si el usuario existe
            // Obtener el usuario actual
            Usuario usuarioActual = usuarios.get(indice);

            // Actualizar los datos
            usuarioActual.setPIN(usuarioModificado.getPIN());
            usuarioActual.setCambioPIN(true); //Le asigna verdadero si cambio de pin
            return true;
        } else {
            return false; // Si no se encuentra el usuario
        }
    }
    //Eliminar un usuario
    public boolean eliminar(String usuario) {
        if (buscar(usuario) != -1) { // si el usuario existe
            usuarios.remove(buscar(usuario));
            return true;
        } else {
            return false;
        }
    }
    //Obtener un usuario
    public Usuario obtener(String usuario) {
        if (buscar(usuario) != -1) { //si el usuario existe
            return usuarios.get(buscar(usuario)); //obtiene el indice donde lo encontro
        } else {
            return null;
        }
    }

    // Método para registrar la fecha y hora de acceso
    public String registrarAcceso(Usuario usuario) {
        FechaHora fh = new FechaHora();
        usuario.setFechaAcceso(fh.FechaAcceso());
        usuario.setHoraAcceso(fh.HoraAcceso());
        String acceso = usuario.getFechaHora_Acceso();
        //System.out.println("Usuario " + usuario.getNombre() + " ingresó el " + usuario.getFechaAcceso() + " a las " + usuario.getHoraAcceso());
        return acceso;
    }

    // Método para registrar la fecha y hora de salida
    public String registrarSalida(Usuario usuario) {
        FechaHora fh = new FechaHora();
        usuario.setFechaSalida(fh.FechaAcceso());
        usuario.setHoraSalida(fh.HoraAcceso());
        String salida = usuario.getFechaHora_Salida();
        System.out.println("Usuario " + usuario.getNombre() + " salio: " + salida);
        ultimoAcceso.add(usuario);
        return salida;
    }

    //METODOS DE RETIRO, DEPOSITO Y TRANSACCIONES
    private void registrarTransaccion(Usuario usuario, String tipo, int cantidad) {
        FechaHora fh = new FechaHora();
        Transaccion transaccion = new Transaccion(tipo, cantidad, fh.FechaAcceso(), fh.HoraAcceso());
        usuario.agregarTransaccion(transaccion);
    }

    public boolean retirar(String numTarjeta, String pin, int cantidad, Cajero cajero) {
        int indice = buscar(numTarjeta);

        if (indice != -1) { // Si el usuario existe
            // Obtener el usuario actual
            Usuario usuario = usuarios.get(indice);
            if (usuario != null && usuario.getPIN().equals(pin)) {
                if (Integer.parseInt(usuario.getSaldo()) >= cantidad
                        && cantidad <= Integer.parseInt(usuario.getMonto())
                        && cantidad <= Integer.parseInt(usuario.getMontoDisponible())) {
                    if (cajero.disponibilidadBilletes(cantidad)) {
                        // Actualizar saldo del usuario
                        int valor = Integer.parseInt(usuario.getSaldo()) - cantidad;
                        String nuevoSaldo = Integer.toString(valor);
                        usuario.setSaldo(nuevoSaldo);

                        // Actualiza el monto diario disponible del usuario
                        int montoDisponible = Integer.parseInt(usuario.getMonto()) - cantidad;
                        String nuevoDisponible = Integer.toString(montoDisponible);
                        usuario.setMontoDisponible(nuevoDisponible);

                        // Debitar billetes del cajero
                        cajero.debitarBilletes(cantidad);
                        usuario.incrementarTotalRetirado(cantidad);

                        // Registrar la transacción
                        registrarTransaccion(usuario, "Retiro", cantidad);

                        return true;
                    } else {
                        System.out.println("El cajero no tiene suficientes billetes para este retiro.");
                    }
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("PIN incorrecto o usuario no encontrado.");
            }
        }
        return false;
    }

    public boolean depositar(String numTarjeta, String pin, String numCuentaDestino, Map<Integer, Integer> billetes, Cajero cajero) {
        int indiceOrigen = buscar(numTarjeta);

        if (indiceOrigen != -1) { // Si el usuario existe
            // Obtener el usuario que realiza el depósito
            Usuario usuarioOrigen = usuarios.get(indiceOrigen);

            if (usuarioOrigen != null && usuarioOrigen.getPIN().equals(pin)) {
                // Buscar el usuario destino usando el número de cuenta
                int indiceDestino = buscarCuenta(numCuentaDestino);

                if (indiceDestino != -1) { // Si la cuenta destino existe
                    // Obtener el usuario destino
                    Usuario usuarioDestino = usuarios.get(indiceDestino);

                    // Calcular el monto total del depósito
                    int cantidad = calcularMontoDepositado(billetes);
                    // Actualizar el saldo del usuario destino
                    int valor = Integer.parseInt(usuarioDestino.getSaldo()) + cantidad;
                    String nuevoSaldo = Integer.toString(valor);
                    usuarioDestino.setSaldo(nuevoSaldo);

                    // Agregar billetes al cajero
                    cajero.agregarBilletes(billetes);
                    usuarioDestino.incrementarTotalDepositado(cantidad);

                    // Registrar la transacción en la cuenta destino/origen
                    registrarTransaccion(usuarioOrigen, "Depósito", cantidad);

                    // Registrar la transacción en la cuenta origen (opcional)
                    //registrarTransaccion(usuarioOrigen, "Depósito a cuenta " + numCuentaDestino, cantidad);
                    return true;
                } else {
                    System.out.println("Cuenta destino no encontrada.");
                }
            } else {
                System.out.println("PIN incorrecto o usuario no encontrado.");
            }
        } else {
            System.out.println("Usuario origen no encontrado.");
        }

        return false;
    }

    // Calcular el monto total del depósito
    private int calcularMontoDepositado(Map<Integer, Integer> billetes) {
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : billetes.entrySet()) {
            total += entry.getKey() * entry.getValue();
        }
        return total;
    }

    //Total retirado por todos los usuarios
    public int obtenerTotalRetiradoPorTodos() {
        int total = 0;
        for (Usuario usuario : usuarios) {
            total += usuario.getTotalRetirado();
        }
        System.out.println("TOTAL RETIRADO TODOS: "+total);
        return total;
    }

    //Promedio depositado de todos los usuarios
    public double obtenerPromedioDepositadoPorTodos() {
        int totalDepositado = 0;
        for (Usuario usuario : usuarios) {
            totalDepositado += usuario.getTotalDepositado();
        }
        return !usuarios.isEmpty() ? (double) totalDepositado / usuarios.size() : 0;
    }
    
    //Lista de usuario que hicieron cambio de PIN
    public List<Usuario> obtenerUsuariosConCambioPIN() {
        List<Usuario> usuariosConCambioPIN = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario.haCambiadoPIN()) {
                usuariosConCambioPIN.add(usuario);
            }
        }
        return usuariosConCambioPIN;
    }

    //Ultimas 5 transacciones del ususario
    public List<Transaccion> getUltimasTransacciones(Usuario usuario) {
        int start = Math.max(0, usuario.getTransacciones().size() - 5);
        return usuario.getTransacciones().subList(start, usuario.getTransacciones().size());
    }
    
    //Lista de Usuarios
    public List<Usuario> listaUsuarios() {
        return usuarios;
    }
    //Lista de acceso de Usuarios
    public List<Usuario> listaAccesoUsuarios() {
        return ultimoAcceso;
    }
}
