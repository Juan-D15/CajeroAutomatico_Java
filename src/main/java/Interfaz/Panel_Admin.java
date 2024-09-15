package Interfaz;

import cajero.modelo.Cajero;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.beans.Administrador;

/**
 *
 * @author Juan Diaz
 */
public class Panel_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Panel_Admin
     */
    private Administrador administrador;
    private Cajero cajero;

    public Panel_Admin(Administrador admin) {
        cajero = Cajero.getInstancia();
        initComponents();
        this.setLocationRelativeTo(null);
        administrador = admin;
        Init_Cajero panelCajero = new Init_Cajero(administrador);
        CambioPanel(panelCajero);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tools_Admin = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        btnControlUsuarios = new javax.swing.JButton();
        btnConsultaUsuarios = new javax.swing.JButton();
        btnManejoUsuarios = new javax.swing.JButton();
        btnCajero = new javax.swing.JButton();
        Contenido_Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tools_Admin.setBackground(new java.awt.Color(0, 8, 66));
        Tools_Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarSesion.setBackground(new java.awt.Color(0, 8, 66));
        btnCerrarSesion.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setFocusable(false);
        btnCerrarSesion.setOpaque(true);
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(220, 40));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
        });
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        Tools_Admin.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 220, 40));

        btnControlUsuarios.setBackground(new java.awt.Color(0, 8, 66));
        btnControlUsuarios.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        btnControlUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnControlUsuarios.setText("Control Usuarios");
        btnControlUsuarios.setBorder(null);
        btnControlUsuarios.setBorderPainted(false);
        btnControlUsuarios.setContentAreaFilled(false);
        btnControlUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnControlUsuarios.setFocusable(false);
        btnControlUsuarios.setOpaque(true);
        btnControlUsuarios.setPreferredSize(new java.awt.Dimension(220, 40));
        btnControlUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnControlUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnControlUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnControlUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnControlUsuariosMousePressed(evt);
            }
        });
        btnControlUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlUsuariosActionPerformed(evt);
            }
        });
        Tools_Admin.add(btnControlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 40));

        btnConsultaUsuarios.setBackground(new java.awt.Color(0, 8, 66));
        btnConsultaUsuarios.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        btnConsultaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaUsuarios.setText("Consulta Usuarios");
        btnConsultaUsuarios.setBorder(null);
        btnConsultaUsuarios.setBorderPainted(false);
        btnConsultaUsuarios.setContentAreaFilled(false);
        btnConsultaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultaUsuarios.setFocusable(false);
        btnConsultaUsuarios.setOpaque(true);
        btnConsultaUsuarios.setPreferredSize(new java.awt.Dimension(220, 40));
        btnConsultaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultaUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultaUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConsultaUsuariosMousePressed(evt);
            }
        });
        btnConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaUsuariosActionPerformed(evt);
            }
        });
        Tools_Admin.add(btnConsultaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 40));

        btnManejoUsuarios.setBackground(new java.awt.Color(0, 8, 66));
        btnManejoUsuarios.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        btnManejoUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnManejoUsuarios.setText("Manejo Usuarios");
        btnManejoUsuarios.setBorder(null);
        btnManejoUsuarios.setBorderPainted(false);
        btnManejoUsuarios.setContentAreaFilled(false);
        btnManejoUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManejoUsuarios.setFocusable(false);
        btnManejoUsuarios.setOpaque(true);
        btnManejoUsuarios.setPreferredSize(new java.awt.Dimension(220, 40));
        btnManejoUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManejoUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManejoUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManejoUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnManejoUsuariosMousePressed(evt);
            }
        });
        btnManejoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManejoUsuariosActionPerformed(evt);
            }
        });
        Tools_Admin.add(btnManejoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 40));

        btnCajero.setBackground(new java.awt.Color(0, 8, 66));
        btnCajero.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        btnCajero.setForeground(new java.awt.Color(255, 255, 255));
        btnCajero.setText("Cajero");
        btnCajero.setBorder(null);
        btnCajero.setBorderPainted(false);
        btnCajero.setContentAreaFilled(false);
        btnCajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCajero.setFocusable(false);
        btnCajero.setOpaque(true);
        btnCajero.setPreferredSize(new java.awt.Dimension(220, 40));
        btnCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCajeroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCajeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCajeroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCajeroMousePressed(evt);
            }
        });
        btnCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajeroActionPerformed(evt);
            }
        });
        Tools_Admin.add(btnCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, 40));

        getContentPane().add(Tools_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 220, 540));

        Contenido_Admin.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Contenido_AdminLayout = new javax.swing.GroupLayout(Contenido_Admin);
        Contenido_Admin.setLayout(Contenido_AdminLayout);
        Contenido_AdminLayout.setHorizontalGroup(
            Contenido_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        Contenido_AdminLayout.setVerticalGroup(
            Contenido_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(Contenido_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaUsuariosActionPerformed
        // TODO add your handling code here:
        Consult_User user = new Consult_User();
        CambioPanel(user);
    }//GEN-LAST:event_btnConsultaUsuariosActionPerformed

    private void btnConsultaUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaUsuariosMousePressed
        // TODO add your handling code here:
        btnConsultaUsuarios.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnConsultaUsuariosMousePressed

    private void btnConsultaUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaUsuariosMouseExited
        // TODO add your handling code here:
        btnConsultaUsuarios.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnConsultaUsuariosMouseExited

    private void btnConsultaUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaUsuariosMouseEntered
        // TODO add your handling code here:
        btnConsultaUsuarios.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnConsultaUsuariosMouseEntered

    private void btnConsultaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaUsuariosMouseClicked
        // TODO add your handling code here:
        btnConsultaUsuarios.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnConsultaUsuariosMouseClicked

    private void btnControlUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlUsuariosActionPerformed
        // TODO add your handling code here:
        Control_User user = new Control_User();
        CambioPanel(user);
    }//GEN-LAST:event_btnControlUsuariosActionPerformed

    private void btnControlUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlUsuariosMousePressed
        // TODO add your handling code here:
        btnControlUsuarios.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnControlUsuariosMousePressed

    private void btnControlUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlUsuariosMouseExited
        // TODO add your handling code here:
        btnControlUsuarios.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnControlUsuariosMouseExited

    private void btnControlUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlUsuariosMouseEntered
        // TODO add your handling code here:
        btnControlUsuarios.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnControlUsuariosMouseEntered

    private void btnControlUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlUsuariosMouseClicked
        // TODO add your handling code here:
        btnControlUsuarios.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnControlUsuariosMouseClicked

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        // TODO add your handling code here:
        btnCerrarSesion.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        // TODO add your handling code here:
        btnCerrarSesion.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        // TODO add your handling code here:
        btnCerrarSesion.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        // TODO add your handling code here:
        btnCerrarSesion.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnManejoUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManejoUsuariosMouseClicked
        // TODO add your handling code here:
        btnManejoUsuarios.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnManejoUsuariosMouseClicked

    private void btnManejoUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManejoUsuariosMouseEntered
        // TODO add your handling code here:
        btnManejoUsuarios.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnManejoUsuariosMouseEntered

    private void btnManejoUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManejoUsuariosMouseExited
        // TODO add your handling code here:
        btnManejoUsuarios.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnManejoUsuariosMouseExited

    private void btnManejoUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManejoUsuariosMousePressed
        // TODO add your handling code here:
        btnManejoUsuarios.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnManejoUsuariosMousePressed

    private void btnManejoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManejoUsuariosActionPerformed
        // TODO add your handling code here:
        Reg_User user = new Reg_User();
        CambioPanel(user);
    }//GEN-LAST:event_btnManejoUsuariosActionPerformed

    private void btnCajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajeroMouseClicked
        // TODO add your handling code here:
        btnCajero.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnCajeroMouseClicked

    private void btnCajeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajeroMouseEntered
        // TODO add your handling code here:
        btnCajero.setBackground(new Color(12, 33, 193));
    }//GEN-LAST:event_btnCajeroMouseEntered

    private void btnCajeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajeroMouseExited
        // TODO add your handling code here:
        btnCajero.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnCajeroMouseExited

    private void btnCajeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajeroMousePressed
        // TODO add your handling code here:
        btnCajero.setBackground(new Color(0, 8, 66));
    }//GEN-LAST:event_btnCajeroMousePressed

    private void btnCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajeroActionPerformed
        // TODO add your handling code here:
        Init_Cajero user = new Init_Cajero(administrador);
        CambioPanel(user);
    }//GEN-LAST:event_btnCajeroActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Admin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido_Admin;
    private javax.swing.JPanel Tools_Admin;
    private javax.swing.JButton btnCajero;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultaUsuarios;
    private javax.swing.JButton btnControlUsuarios;
    private javax.swing.JButton btnManejoUsuarios;
    // End of variables declaration//GEN-END:variables
     private void logout() {
        // Mostrar el frame de login
        JFrame loginFrame = new Login(); // Creamos una nueva instancia del Login
        loginFrame.setVisible(true); // Mostramos el Login

        // Cerrar el frame actual del administrador
        this.dispose(); // Cerramos el frame actual (Panel_Admin)
    }

    private void CambioPanel(JPanel p) {
        p.setSize(650, 550);
        p.setLocation(0, 0);

        Contenido_Admin.removeAll();
        Contenido_Admin.add(p, BorderLayout.CENTER);
        Contenido_Admin.revalidate();
        Contenido_Admin.repaint();
    }
}
