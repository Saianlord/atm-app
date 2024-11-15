/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI;

/**
 *
 * @author fgarr
 */
public class LoginWindow extends javax.swing.JPanel {

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddService = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        imgMainLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 255), 5, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddService.setBackground(new java.awt.Color(102, 102, 255));
        btnAddService.setFont(new java.awt.Font("Franklin Gothic Book", 0, 66)); // NOI18N
        btnAddService.setForeground(new java.awt.Color(255, 255, 255));
        btnAddService.setText("+");
        add(btnAddService, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 790, 70, 70));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("Password");
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 460, 70));

        txtUser.setBackground(new java.awt.Color(204, 204, 204));
        txtUser.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("User");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 460, 70));

        btnLogin.setBackground(new java.awt.Color(102, 102, 255));
        btnLogin.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, 460, 70));

        lblLogo.setFont(new java.awt.Font("Franklin Gothic Book", 1, 36)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("Your trusted bank!");
        add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 700, 60));

        imgMainLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMainLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\fgarr\\Desktop\\Carpetas\\Nando\\U\\Fidélitas\\III Cuatrimestre\\5. Programación Cliente-Servidor Concurrente\\Proyecto\\Avance #2\\atm-app\\src\\main\\java\\Images\\MainLogo.jpeg")); // NOI18N
        add(imgMainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel imgMainLogo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}