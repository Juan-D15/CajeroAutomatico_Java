package Interfaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.beans.Usuario;
import modelo.logic.UsuarioLogic;

/**
 *
 * @author Juan Diaz
 */
public class Control_User extends javax.swing.JPanel {

    /**
     * Creates new form Control_User
     */
    DefaultTableModel tablaPin;
    DefaultTableModel tablaAcceso;

    public Control_User() {
        initComponents();
        //Tabla de Cambio de PIN
        tablaPin = new DefaultTableModel();
        String[] titulo1 = new String[]{"Usuario", "No. Tarjeta", "No.cuenta", "PIN"};
        tablaPin.setColumnIdentifiers(titulo1);
        tblCambioPin.setModel(tablaPin);
        tblCambioPin.setEnabled(false);
        //Tabla de Acceso de Usuarios
        tablaAcceso = new DefaultTableModel();
        String[] titulo2 = new String[]{"Usuario", "No. Tarjeta", "No.cuenta", "Fecha", "Hora"};
        tablaAcceso.setColumnIdentifiers(titulo2);
        tblAccesoUsuarios.setModel(tablaAcceso);
        tblAccesoUsuarios.setEnabled(false);
        //Ejecutar desde el inicio
        UsuarioLogic.cargarAccesoUsuarios();
        ejecucionTodo();

    }

    private void ejecucionTodo() {
        totalRetirado();
        promedioDepositado();
        usuariosCambioPin();
        usuariosAcceso();
    }

    private void agregar_TablaPIN(String Usuario, String numTarjeta, String numCuenta, String Pin) {
        tablaPin.addRow(new Object[]{Usuario, numTarjeta, numCuenta, Pin});
    }

    private void agregar_TablaAcceso(String Usuario, String numTarjeta, String numCuenta, String Fecha, String Hora) {
        tablaAcceso.addRow(new Object[]{Usuario, numTarjeta, numCuenta, Fecha, Hora});
    }

    private void totalRetirado() {
        int valor = UsuarioLogic.obtenerTotalRetiradoPorTodos();
        txtTotalRetirado.setText(Integer.toString(valor));
    }

    private void promedioDepositado() {
        double valor = UsuarioLogic.obtenerPromedioDepositadoPorTodos();
        txtPromedioDeposito.setText(Double.toString(valor));
    }

    private void usuariosCambioPin() {
        List<Usuario> usuariosPin = UsuarioLogic.obtenerUsuariosConCambioPIN();
        if (usuariosPin != null) {
            for (Usuario usuario : usuariosPin) {
                String nombre = usuario.getNombre();
                String numTarjeta = usuario.getNumTarjeta();
                String numCuenta = usuario.getNumCuenta();
                String Pin = usuario.getPIN();

                agregar_TablaPIN(nombre, numTarjeta, numCuenta, Pin);

            }
        }
    }

    private void usuariosAcceso() {
        List<Usuario> accesosUsuarios = UsuarioLogic.listaAccesoUsuarios();
        if (accesosUsuarios != null) {
            if (accesosUsuarios.isEmpty()) {
                return;
            }

            List<Usuario> usuariosAcceso = new ArrayList<>(accesosUsuarios);
            Collections.reverse(usuariosAcceso);  // Invertir la lista para que el último acceso sea el primero

            for (Usuario usuario : usuariosAcceso) {
                String nombre = usuario.getNombre();
                String numTarjeta = usuario.getNumTarjeta();
                String numCuenta = usuario.getNumCuenta();
                String Fecha = usuario.getFechaSalida();
                String Hora = usuario.getHoraSalida();
                agregar_TablaAcceso(nombre, numTarjeta, numCuenta, Fecha, Hora);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbSTitulo1 = new javax.swing.JLabel();
        txtTotalRetirado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lbSTitulo2 = new javax.swing.JLabel();
        txtPromedioDeposito = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lbSTitulo3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccesoUsuarios = new javax.swing.JTable();
        lbSTitulo4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCambioPin = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(639, 539));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lbTitulo.setText("Control de Usuarios");
        add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        lbSTitulo1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbSTitulo1.setForeground(new java.awt.Color(153, 153, 153));
        lbSTitulo1.setText("Total Retirado por todos los Usuarios");
        add(lbSTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtTotalRetirado.setEditable(false);
        txtTotalRetirado.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalRetirado.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtTotalRetirado.setForeground(new java.awt.Color(0, 8, 66));
        txtTotalRetirado.setBorder(null);
        add(txtTotalRetirado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator2.setForeground(new java.awt.Color(0, 8, 66));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 10));

        lbSTitulo2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbSTitulo2.setForeground(new java.awt.Color(0, 8, 66));
        lbSTitulo2.setText("Acceso de Usuarios");
        add(lbSTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        txtPromedioDeposito.setEditable(false);
        txtPromedioDeposito.setBackground(new java.awt.Color(255, 255, 255));
        txtPromedioDeposito.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPromedioDeposito.setForeground(new java.awt.Color(0, 8, 66));
        txtPromedioDeposito.setBorder(null);
        add(txtPromedioDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 220, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator3.setForeground(new java.awt.Color(0, 8, 66));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, 10));

        lbSTitulo3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbSTitulo3.setForeground(new java.awt.Color(153, 153, 153));
        lbSTitulo3.setText("Promedio del monto depositado");
        add(lbSTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        tblAccesoUsuarios.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblAccesoUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAccesoUsuarios);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 330, 180));

        lbSTitulo4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbSTitulo4.setForeground(new java.awt.Color(0, 8, 66));
        lbSTitulo4.setText("Usuarios con cambio de PIN");
        add(lbSTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        tblCambioPin.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblCambioPin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCambioPin.setGridColor(new java.awt.Color(255, 255, 255));
        tblCambioPin.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblCambioPin);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 330, 180));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbSTitulo1;
    private javax.swing.JLabel lbSTitulo2;
    private javax.swing.JLabel lbSTitulo3;
    private javax.swing.JLabel lbSTitulo4;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tblAccesoUsuarios;
    private javax.swing.JTable tblCambioPin;
    private javax.swing.JTextField txtPromedioDeposito;
    private javax.swing.JTextField txtTotalRetirado;
    // End of variables declaration//GEN-END:variables
}
