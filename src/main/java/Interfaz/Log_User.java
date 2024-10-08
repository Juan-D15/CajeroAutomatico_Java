package Interfaz;

import control.actividades.RegistroActividades;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.beans.Usuario;
import modelo.logic.UsuarioLogic;

/**
 *
 * @author Juan Diaz
 */
public class Log_User extends javax.swing.JPanel {

    /**
     * Creates new form Log_User
     */
    public Log_User() {
        initComponents();
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

        lbTitulo = new javax.swing.JLabel();
        lbStitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumTarjeta = new javax.swing.JTextField();
        lbStitulo1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPinUser = new javax.swing.JPasswordField();
        btnCambiarPin = new javax.swing.JButton();
        btnLogUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lbTitulo.setText("Usuario");
        add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        lbStitulo.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbStitulo.setForeground(new java.awt.Color(153, 153, 153));
        lbStitulo.setText("No. Tarjeta");
        add(lbStitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator1.setForeground(new java.awt.Color(0, 8, 66));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 350, -1));

        txtNumTarjeta.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtNumTarjeta.setForeground(new java.awt.Color(0, 8, 66));
        txtNumTarjeta.setText("Número de Tarjeta");
        txtNumTarjeta.setBorder(null);
        txtNumTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumTarjetaKeyTyped(evt);
            }
        });
        add(txtNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 350, 30));

        lbStitulo1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbStitulo1.setForeground(new java.awt.Color(153, 153, 153));
        lbStitulo1.setText("PIN");
        add(lbStitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator2.setForeground(new java.awt.Color(0, 8, 66));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 350, -1));

        txtPinUser.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPinUser.setForeground(new java.awt.Color(0, 8, 66));
        txtPinUser.setText("****");
        txtPinUser.setBorder(null);
        txtPinUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPinUserKeyTyped(evt);
            }
        });
        add(txtPinUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 350, -1));

        btnCambiarPin.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnCambiarPin.setForeground(new java.awt.Color(77, 77, 77));
        btnCambiarPin.setText("Cambiar Pin");
        btnCambiarPin.setBorder(null);
        btnCambiarPin.setBorderPainted(false);
        btnCambiarPin.setContentAreaFilled(false);
        btnCambiarPin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPinActionPerformed(evt);
            }
        });
        add(btnCambiarPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        btnLogUsuario.setBackground(new java.awt.Color(12, 33, 193));
        btnLogUsuario.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnLogUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnLogUsuario.setText("Entrar");
        btnLogUsuario.setBorderPainted(false);
        btnLogUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogUsuarioActionPerformed(evt);
            }
        });
        add(btnLogUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogUsuarioActionPerformed
        entrarUsuario();
    }//GEN-LAST:event_btnLogUsuarioActionPerformed

    private void btnCambiarPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPinActionPerformed
        // TODO add your handling code here:
        Pin_Usuario frameCambioPin = new Pin_Usuario();
        CambioJframe(frameCambioPin);
    }//GEN-LAST:event_btnCambiarPinActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarPin;
    private javax.swing.JButton btnLogUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbStitulo;
    private javax.swing.JLabel lbStitulo1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtNumTarjeta;
    private javax.swing.JPasswordField txtPinUser;
    // End of variables declaration//GEN-END:variables

    private void loginUsuario() {
        Panel_User panelUser = new Panel_User(UsuarioLogic.obtener(txtNumTarjeta.getText())); //Envia una referencia de el usuario
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setVisible(false);  // Oculta el frame de login

        // Mostrar el panel de administrador en un nuevo JFrame
        panelUser.setVisible(true);
    }

    private void entrarUsuario() {
        if (!txtNumTarjeta.getText().isEmpty() && !String.valueOf(txtPinUser.getPassword()).isEmpty()) {
            if (UsuarioLogic.autentificar(txtNumTarjeta.getText(), String.valueOf(txtPinUser.getPassword()))) {
                //Cambiar al frame de User
                loginUsuario();
                //Registro actividades
                Usuario obtener = UsuarioLogic.obtener(txtNumTarjeta.getText());
                String Fecha_Hora = UsuarioLogic.registrarAcceso(obtener);
                RegistroActividades.registrarActividadUsuario("Login Usuario: " + "Usuario: " + obtener.getNombre()
                        + " Número de Tarjeta: " + txtNumTarjeta.getText()
                        + " Número de Cuenta: " + obtener.getNumCuenta()
                        + " Fecha y Hora: " + Fecha_Hora);
            } else {
                JOptionPane.showMessageDialog(null, "Número de Tarjeta o PIN incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese su Número de Trajeta o PIN");
        }
    }

    private void CambioJframe(JFrame j) {
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

    }
}
