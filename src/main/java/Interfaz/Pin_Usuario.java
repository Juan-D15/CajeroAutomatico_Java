package Interfaz;

import control.actividades.RegistroActividades;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;
import modelo.beans.Usuario;
import modelo.logic.UsuarioLogic;

/**
 *
 * @author Juan Diaz
 */
public class Pin_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Pin_Usuario
     */
    public Pin_Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        initListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbStitulo = new javax.swing.JLabel();
        txtNumTarjeta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPinUser = new javax.swing.JPasswordField();
        lbStitulo1 = new javax.swing.JLabel();
        lbStitulo2 = new javax.swing.JLabel();
        txtPinUserConfirm = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        btnCambiarPin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lbTitulo.setText("Cambio Pin");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        lbStitulo.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbStitulo.setForeground(new java.awt.Color(153, 153, 153));
        lbStitulo.setText("No. Tarjeta");
        jPanel1.add(lbStitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        txtNumTarjeta.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtNumTarjeta.setForeground(new java.awt.Color(0, 8, 66));
        txtNumTarjeta.setText("Número de Tarjeta");
        txtNumTarjeta.setBorder(null);
        txtNumTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumTarjetaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 350, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator1.setForeground(new java.awt.Color(0, 8, 66));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 350, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator2.setForeground(new java.awt.Color(0, 8, 66));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 350, -1));

        txtPinUser.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPinUser.setForeground(new java.awt.Color(0, 8, 66));
        txtPinUser.setText("****");
        txtPinUser.setBorder(null);
        txtPinUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPinUserKeyTyped(evt);
            }
        });
        jPanel1.add(txtPinUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 350, -1));

        lbStitulo1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbStitulo1.setForeground(new java.awt.Color(153, 153, 153));
        lbStitulo1.setText("Nuevo PIN");
        jPanel1.add(lbStitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        lbStitulo2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbStitulo2.setForeground(new java.awt.Color(153, 153, 153));
        lbStitulo2.setText("Confirmar Pin");
        jPanel1.add(lbStitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        txtPinUserConfirm.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPinUserConfirm.setForeground(new java.awt.Color(0, 8, 66));
        txtPinUserConfirm.setText("****");
        txtPinUserConfirm.setBorder(null);
        txtPinUserConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPinUserConfirmKeyTyped(evt);
            }
        });
        jPanel1.add(txtPinUserConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 350, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator3.setForeground(new java.awt.Color(0, 8, 66));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 350, -1));

        btnCambiarPin.setBackground(new java.awt.Color(12, 33, 193));
        btnCambiarPin.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnCambiarPin.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarPin.setText("Cambiar");
        btnCambiarPin.setBorderPainted(false);
        btnCambiarPin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPinActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPinActionPerformed
        cambiarPin();
        this.dispose();
    }//GEN-LAST:event_btnCambiarPinActionPerformed

    private void txtPinUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinUserKeyTyped
        // Condicionar el jTextField para números
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57; //ASCII
        if (!numero) {
            evt.consume();
        }

        if (String.valueOf(txtPinUser.getPassword()).trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPinUserKeyTyped

    private void txtPinUserConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinUserConfirmKeyTyped
        // Condicionar el jTextField para números
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57; //ASCII
        if (!numero) {
            evt.consume();
        }

        if (String.valueOf(txtPinUserConfirm.getPassword()).trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPinUserConfirmKeyTyped

    private void txtNumTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTarjetaKeyTyped
        // Condicionar el jTextField para números
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57; //ASCII
        if (!numero) {
            evt.consume();
        }

        if (txtNumTarjeta.getText().trim().length() == 16) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumTarjetaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pin_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pin_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pin_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pin_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pin_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarPin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbStitulo;
    private javax.swing.JLabel lbStitulo1;
    private javax.swing.JLabel lbStitulo2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtNumTarjeta;
    private javax.swing.JPasswordField txtPinUser;
    private javax.swing.JPasswordField txtPinUserConfirm;
    // End of variables declaration//GEN-END:variables

    private void cambiarPin() {
        if (!txtNumTarjeta.getText().isEmpty()
                && !String.valueOf(txtPinUser.getPassword()).isEmpty()
                && !String.valueOf(txtPinUserConfirm.getPassword()).isEmpty()) {

            String numTarjeta = txtNumTarjeta.getText();
            String pin = String.valueOf(txtPinUser.getPassword());

            // Crear un objeto Usuario con los nuevos datos
            Usuario usuarioModificado = new Usuario(numTarjeta, pin);

            // Llamar al método modificar
            if (String.valueOf(txtPinUserConfirm.getPassword()).equals(String.valueOf(txtPinUser.getPassword()))) {
                if (UsuarioLogic.modificarPin(usuarioModificado)) {
                    JOptionPane.showMessageDialog(null, "Usuario Modificado");
                    Usuario obtener = UsuarioLogic.obtener(usuarioModificado.getNumTarjeta());
                    String Fecha_Hora = UsuarioLogic.registrarAcceso(obtener);
                    RegistroActividades.registrarActividadUsuario("Cambio de PIN Usuario: "
                            + "Nombre: " + obtener.getNombre()
                            + " Número de Cuenta: " + obtener.getNumCuenta()
                            + " Número de Tarjeta: " + obtener.getNumTarjeta()
                            + " Nuevo PIN: " + pin
                            + " Saldo: " + obtener.getSaldo()
                            + " Monto: " + obtener.getMonto()
                            + " Fecha y Hora: " + Fecha_Hora);
                    txtNumTarjeta.setText("");
                    txtPinUser.setText("");
                    txtPinUserConfirm.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El Usuario no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El pin es incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.");
        }
    }

    private void initListeners() {
        txtNumTarjeta.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (txtNumTarjeta.getText().equals("Número de Tarjeta")) {
                    txtNumTarjeta.setText("");
                    txtNumTarjeta.setForeground(new Color(0, 8, 66));
                }
            }

            public void focusLost(FocusEvent evt) {
                if (txtNumTarjeta.getText().isEmpty()) {
                    txtNumTarjeta.setText("Número de Tarjeta");
                    txtNumTarjeta.setForeground(new Color(0, 8, 66));
                }
            }
        });

        txtPinUser.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (String.valueOf(txtPinUser.getPassword()).equals("****")) {
                    txtPinUser.setText("");
                    txtPinUser.setForeground(new Color(0, 8, 66));
                }
            }

            public void focusLost(FocusEvent evt) {
                if (String.valueOf(txtPinUser.getPassword()).isEmpty()) {
                    txtPinUser.setText("****");
                    txtPinUser.setForeground(new Color(0, 8, 66));
                }
            }
        });

        txtPinUserConfirm.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (String.valueOf(txtPinUserConfirm.getPassword()).equals("****")) {
                    txtPinUserConfirm.setText("");
                    txtPinUserConfirm.setForeground(new Color(0, 8, 66));
                }
            }

            public void focusLost(FocusEvent evt) {
                if (String.valueOf(txtPinUserConfirm.getPassword()).isEmpty()) {
                    txtPinUserConfirm.setText("****");
                    txtPinUserConfirm.setForeground(new Color(0, 8, 66));
                }
            }
        });
    }
}
