package Interfaz;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.logic.AdministradorLogic;

/**
 *
 * @author Juan Diaz
 */
public class Log_Admin extends javax.swing.JPanel {

    /**
     * Creates new form Log_Administrador
     */
    public Log_Admin() {
        initComponents();
        initListeners();
    }

    private void CambioJframe(JFrame j) {
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        lbStitulo1 = new javax.swing.JLabel();
        btnLogAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(860, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lbTitulo.setText("Administrador");
        add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        lbStitulo.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbStitulo.setForeground(new java.awt.Color(153, 153, 153));
        lbStitulo.setText("Usuario");
        add(lbStitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtNombre.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 8, 66));
        txtNombre.setText("Nombre de Usuario");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator1.setForeground(new java.awt.Color(0, 8, 66));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 350, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 8, 66));
        jSeparator2.setForeground(new java.awt.Color(0, 8, 66));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 350, -1));

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 8, 66));
        txtPassword.setText("**********");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        lbStitulo1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lbStitulo1.setForeground(new java.awt.Color(153, 153, 153));
        lbStitulo1.setText("Contraseña");
        add(lbStitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        btnLogAdmin.setBackground(new java.awt.Color(12, 33, 193));
        btnLogAdmin.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnLogAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogAdmin.setText("Entrar");
        btnLogAdmin.setBorderPainted(false);
        btnLogAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogAdminActionPerformed(evt);
            }
        });
        add(btnLogAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed

    }//GEN-LAST:event_txtPasswordMousePressed

    private void btnLogAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogAdminActionPerformed
        // TODO add your handling code here:
        if (!txtNombre.getText().isEmpty() && !String.valueOf(txtPassword.getPassword()).isEmpty()) {
            if (AdministradorLogic.autentificar(txtNombre.getText(), String.valueOf(txtPassword.getPassword()))) {
                //Cambiar al frame de Admin
                Panel_Admin panelAdm = new Panel_Admin();
                CambioJframe(panelAdm);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese su Usuario o Contraseña");
        }
    }//GEN-LAST:event_btnLogAdminActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogAdmin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbStitulo;
    private javax.swing.JLabel lbStitulo1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void initListeners() {
        txtNombre.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (txtNombre.getText().equals("Nombre de Usuario")) {
                    txtNombre.setText("");
                    txtNombre.setForeground(new Color(0, 8, 66));
                }
            }

            public void focusLost(FocusEvent evt) {
                if (txtNombre.getText().isEmpty()) {
                    txtNombre.setText("Nombre de Usuario");
                    txtNombre.setForeground(new Color(0, 8, 66));
                }
            }
        });

        txtPassword.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (String.valueOf(txtPassword.getPassword()).equals("**********")) {
                    txtPassword.setText("");
                    txtPassword.setForeground(new Color(0, 8, 66));
                }
            }

            public void focusLost(FocusEvent evt) {
                if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
                    txtPassword.setText("**********");
                    txtPassword.setForeground(new Color(0, 8, 66));
                }
            }
        });
    }

}
