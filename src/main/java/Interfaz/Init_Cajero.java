package Interfaz;

import cajero.modelo.Cajero;
import control.actividades.RegistroActividades;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import modelo.beans.Administrador;
import modelo.logic.AdministradorLogic;

/**
 *
 * @author Juan Diaz
 */
public class Init_Cajero extends javax.swing.JPanel {

    /**
     * Creates new form Init_Cajero
     */
    private Cajero cajero;
    private Administrador administrador;
    public Map<Integer, Integer> inicializacion = new HashMap<>();
    public Map<Integer, Integer> nuevoEfectivo = new HashMap<>();

    public Init_Cajero(Administrador admin) {
        cajero = Cajero.nuevoCajero();
        initComponents();
        administrador = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo2 = new javax.swing.JLabel();
        cbBilletes = new javax.swing.JComboBox<>();
        txtCantidadBilletes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        btnAgregarEfect = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbBilletes_Efect = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCantidadBilletes_Efect = new javax.swing.JTextField();
        btnAgregarInit = new javax.swing.JButton();
        btnInitCajer = new javax.swing.JButton();
        btnEnviar_Efect = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo2.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lblTitulo2.setText("Agregar Efectivo: Q0");
        add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        cbBilletes.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbBilletes.setForeground(new java.awt.Color(0, 8, 66));
        cbBilletes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200", "100", "50", "20", "10", "5", "1" }));
        cbBilletes.setBorder(null);
        cbBilletes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cbBilletes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 86, -1));

        txtCantidadBilletes.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtCantidadBilletes.setSelectionColor(new java.awt.Color(12, 33, 193));
        txtCantidadBilletes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadBilletesKeyTyped(evt);
            }
        });
        add(txtCantidadBilletes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 132, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Billetes:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Cantidad:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        lblTitulo1.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lblTitulo1.setText("Inicializar Cajero: Q0");
        add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        btnAgregarEfect.setBackground(new java.awt.Color(12, 33, 193));
        btnAgregarEfect.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAgregarEfect.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEfect.setText("Agregar");
        btnAgregarEfect.setBorderPainted(false);
        btnAgregarEfect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEfectActionPerformed(evt);
            }
        });
        add(btnAgregarEfect, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Billetes:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        cbBilletes_Efect.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbBilletes_Efect.setForeground(new java.awt.Color(0, 8, 66));
        cbBilletes_Efect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200", "100", "50", "20", "10", "5", "1" }));
        cbBilletes_Efect.setBorder(null);
        cbBilletes_Efect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cbBilletes_Efect, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 86, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Cantidad:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        txtCantidadBilletes_Efect.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtCantidadBilletes_Efect.setSelectionColor(new java.awt.Color(12, 33, 193));
        txtCantidadBilletes_Efect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadBilletes_EfectKeyTyped(evt);
            }
        });
        add(txtCantidadBilletes_Efect, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 132, -1));

        btnAgregarInit.setBackground(new java.awt.Color(12, 33, 193));
        btnAgregarInit.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnAgregarInit.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarInit.setText("Agregar");
        btnAgregarInit.setBorderPainted(false);
        btnAgregarInit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInitActionPerformed(evt);
            }
        });
        add(btnAgregarInit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        btnInitCajer.setBackground(new java.awt.Color(12, 33, 193));
        btnInitCajer.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnInitCajer.setForeground(new java.awt.Color(255, 255, 255));
        btnInitCajer.setText("Inicializar");
        btnInitCajer.setBorderPainted(false);
        btnInitCajer.setPreferredSize(new java.awt.Dimension(79, 26));
        btnInitCajer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitCajerActionPerformed(evt);
            }
        });
        add(btnInitCajer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 90, -1));

        btnEnviar_Efect.setBackground(new java.awt.Color(12, 33, 193));
        btnEnviar_Efect.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar_Efect.setText("Enviar");
        btnEnviar_Efect.setBorderPainted(false);
        btnEnviar_Efect.setPreferredSize(new java.awt.Dimension(79, 26));
        btnEnviar_Efect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_EfectActionPerformed(evt);
            }
        });
        add(btnEnviar_Efect, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInitActionPerformed
        AgregarBilletesInit();
        System.out.println("Estado actual del Cajero: " + inicializacion);
    }//GEN-LAST:event_btnAgregarInitActionPerformed

    private void btnAgregarEfectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEfectActionPerformed
        AgregarBilletesEfectivo();
        System.out.println("Estado actual Efectivo: " + nuevoEfectivo);
    }//GEN-LAST:event_btnAgregarEfectActionPerformed

    private void btnInitCajerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitCajerActionPerformed
        InicializarCajero();
    }//GEN-LAST:event_btnInitCajerActionPerformed

    private void btnEnviar_EfectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_EfectActionPerformed
        EnviarEfectivoCajero();
    }//GEN-LAST:event_btnEnviar_EfectActionPerformed

    private void txtCantidadBilletesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBilletesKeyTyped
        // Condicionar el jTextField para números
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57; //ASCII
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadBilletesKeyTyped

    private void txtCantidadBilletes_EfectKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBilletes_EfectKeyTyped
        // Condicionar el jTextField para números
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57; //ASCII
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadBilletes_EfectKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEfect;
    private javax.swing.JButton btnAgregarInit;
    private javax.swing.JButton btnEnviar_Efect;
    private javax.swing.JButton btnInitCajer;
    private javax.swing.JComboBox<String> cbBilletes;
    private javax.swing.JComboBox<String> cbBilletes_Efect;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JTextField txtCantidadBilletes;
    private javax.swing.JTextField txtCantidadBilletes_Efect;
    // End of variables declaration//GEN-END:variables

    private void actualizarTotalInicializacion() {
        lblTitulo1.setText("Inicializar Cajero: Q" + valorInit());
    }

    private void actualizarTotalEfectivo() {
        lblTitulo2.setText("Agregar Efectivo: Q" + valorEfectivo());
    }

    private int valorInit() {
        int total = 0;
        //Itera en cada denominacion de los billetes (clave - valor)
        for (Map.Entry<Integer, Integer> entry : inicializacion.entrySet()) {
            int denominacion = entry.getKey();
            int cantidad = entry.getValue();
            total += cantidad * denominacion;
        }
        return total;
    }

    private int valorEfectivo() {
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : nuevoEfectivo.entrySet()) {
            int denominacion = entry.getKey();
            int cantidad = entry.getValue();
            total += cantidad * denominacion;
        }

        return total + cajero.obtenerTotal();
    }

    private void AgregarBilletesInit() {
        try {
            int cantidad = Integer.parseInt(txtCantidadBilletes.getText());
            if (cantidad > 0) {
                int denominacion = Integer.parseInt((String) cbBilletes.getSelectedItem());

                if (inicializacion.containsKey(denominacion)) {
                    int cantidadExistente = inicializacion.get(denominacion);
                    inicializacion.put(denominacion, cantidadExistente + cantidad);
                } else {
                    inicializacion.put(denominacion, cantidad);
                }
                actualizarTotalInicializacion();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void AgregarBilletesEfectivo() {
        int cantidad = Integer.parseInt(txtCantidadBilletes_Efect.getText());
        if (cantidad > 0) {
            int denominacion = Integer.parseInt((String) cbBilletes_Efect.getSelectedItem());

            // Verifica si la denominación ya existe en el HashMap
            if (nuevoEfectivo.containsKey(denominacion)) {
                // Si existe, suma la nueva cantidad a la cantidad existente
                int cantidadExistente = nuevoEfectivo.get(denominacion);
                nuevoEfectivo.put(denominacion, cantidadExistente + cantidad);
            } else {
                // Si no existe, simplemente agrega la denominación con la cantidad ingresada
                nuevoEfectivo.put(denominacion, cantidad);
            }
            actualizarTotalEfectivo();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InicializarCajero() {
        if (valorInit() > 0) {
            boolean flag = cajero.inicializarCajero(inicializacion);
            if (flag) {
                JOptionPane.showMessageDialog(this, "Cajero Inicializado");
                //Registro de actividades
                String Fecha_Hora = AdministradorLogic.registrarAcceso(administrador);
                RegistroActividades.registrarActividadAdministrador("Inicialización Cajero: " + "Admistrador: " + administrador.getUsuario_admin()
                        + " Cantidad: " + cajero.obtenerTotal()
                        + " Fecha y Hora: " + Fecha_Hora
                );
            } else {
                JOptionPane.showMessageDialog(this, "No se puede inicializar el cajero con esa cantidad", "Error", JOptionPane.ERROR_MESSAGE);
                inicializacion.clear();
            }
            cajero.mostrarTotal();
            actualizarTotalInicializacion();
        }
    }

    public void EnviarEfectivoCajero() {
        if (valorEfectivo() > 0) {
            boolean flag = cajero.agregarEfectivo(nuevoEfectivo);
            if (flag) {
                JOptionPane.showMessageDialog(this, "Efectivo Agregado.");
                nuevoEfectivo.clear(); // Limpiar después de agregar efectivo
            } else {
                JOptionPane.showMessageDialog(this, "No se puede agregar esa cantidad al cajero.", "Error", JOptionPane.ERROR_MESSAGE);
                nuevoEfectivo.clear();
            }
            cajero.mostrarTotal();
            actualizarTotalEfectivo();
        }
    }
}
