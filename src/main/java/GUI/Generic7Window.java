/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author fgarr
 */
public class Generic7Window extends javax.swing.JPanel {

    /**
     * Creates new form Generic7Window
     */
    public Generic7Window() {
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

        imgSecondaryLogo = new javax.swing.JLabel();
        lblInstructions3 = new javax.swing.JLabel();
        lblInstructions4 = new javax.swing.JLabel();
        lblInstructions2 = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnAction = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 5, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSecondaryLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\fgarr\\Desktop\\Carpetas\\Nando\\U\\Fidélitas\\III Cuatrimestre\\5. Programación Cliente-Servidor Concurrente\\Proyecto\\Avance #2\\atm-app\\src\\main\\java\\Images\\SecondaryLogo.jpeg")); // NOI18N
        imgSecondaryLogo.setText("jLabel1");
        add(imgSecondaryLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 110));

        lblInstructions3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 36)); // NOI18N
        lblInstructions3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions3.setText("$XXX.XXX,XX");
        lblInstructions3.setToolTipText("");
        add(lblInstructions3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 700, -1));

        lblInstructions4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        lblInstructions4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions4.setText("TXT");
        lblInstructions4.setToolTipText("");
        add(lblInstructions4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 700, -1));

        lblInstructions2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        lblInstructions2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions2.setText("Current balance:");
        lblInstructions2.setToolTipText("");
        add(lblInstructions2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 700, -1));

        lblInstructions1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        lblInstructions1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions1.setText("Account information!");
        lblInstructions1.setToolTipText("");
        add(lblInstructions1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 700, -1));

        txtInput.setBackground(new java.awt.Color(204, 204, 204));
        txtInput.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        txtInput.setForeground(new java.awt.Color(153, 153, 153));
        txtInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInput.setText("TXT");
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        add(txtInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 460, 70));

        btnAction.setBackground(new java.awt.Color(102, 102, 255));
        btnAction.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnAction.setForeground(new java.awt.Color(255, 255, 255));
        btnAction.setText("TXT");
        add(btnAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 460, 70));

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setFont(new java.awt.Font("Franklin Gothic Book", 0, 28)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 830, 200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel imgSecondaryLogo;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblInstructions3;
    private javax.swing.JLabel lblInstructions4;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}