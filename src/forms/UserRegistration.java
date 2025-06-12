/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import dao.ConnectionProvider;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utility.BDUtility;
import java.sql.Connection;
import java.sql.*;

public class UserRegistration extends javax.swing.JFrame {


    public UserRegistration() {
        initComponents();
        BDUtility.setImage(this, "images/re.jpg", 850, 600);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtContect = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblImage = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 157, 43, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 155, 304, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Gender");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 209, 60, -1));

        radioMale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioMale.setText("Male");
        radioMale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioMaleItemStateChanged(evt);
            }
        });
        getContentPane().add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 210, 98, -1));

        radioFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioFemaleItemStateChanged(evt);
            }
        });
        getContentPane().add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 210, 98, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 258, 43, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 258, 304, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Contact");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 309, 60, -1));
        getContentPane().add(txtContect, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 309, 304, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 362, 60, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 362, 304, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("State");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 415, 43, -1));
        getContentPane().add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 415, 304, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Country");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 467, 60, -1));
        getContentPane().add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 467, 304, -1));

        jInternalFrame1.setVisible(true);

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        btnRegister.setBackground(new java.awt.Color(51, 0, 51));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 512, 139, -1));

        btnClear.setBackground(new java.awt.Color(51, 0, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 512, 139, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Registration");

        btnExit.setBackground(new java.awt.Color(153, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnExit)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    BufferedImage originalImage = null;
    File selectedFile = null;
    private void radioMaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioMaleItemStateChanged
        // TODO add your handling code here:
        if (radioMale.isSelected()) {
            radioFemale.setSelected(false);
        }
    }//GEN-LAST:event_radioMaleItemStateChanged

    private void radioFemaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioFemaleItemStateChanged
        // TODO add your handling code here:
        if (radioFemale.isSelected()) {
            radioMale.setSelected(false);
        }
    }//GEN-LAST:event_radioFemaleItemStateChanged

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtName.getText().toString();
            String gender = "";
            if (radioMale.isSelected()) {
                gender = "Male";
            } else if (radioFemale.isSelected()) {
                gender = "Female";
            }
            String email = txtEmail.getText().trim();
            //String email = txtEmail.getText().toString();
            // String emailRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
            String emailRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";

            //String emailRegex = "^[a-z0-9]+@gmail\\.com$";
            if (!email.matches(emailRegex)) {
                JOptionPane.showMessageDialog(null, "Invalid Email.", "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String contect = txtContect.getText().toString();
            String contectRegex = "^\\d{9}$";
            if (!contect.matches(contectRegex)) {
                JOptionPane.showMessageDialog(null, "Invalid Contect number.", "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String address = txtAddress.getText().toString();
            String state = txtState.getText().toString();
            String country = txtCountry.getText().toString();
            String uniqueRegId = "" + System.nanoTime() + System.nanoTime() + System.nanoTime() + System.nanoTime();

            if (name.isEmpty() || email.isEmpty() || contect.isEmpty() || address.isEmpty() || state.isEmpty() || country.isEmpty() || uniqueRegId.isEmpty() || gender.isEmpty()) {
                JOptionPane.showMessageDialog(null, "One or more fileds are empty.", "Field Empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Connection connection = ConnectionProvider.getCon();
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery("select * from userdetails where email = '" + email.trim() + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Duplicate email.", "Duplicate", JOptionPane.WARNING_MESSAGE);
                    return;

                }

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex);
            }

            String imageName = saveImage(email);

            String insertQuery = "INSERT into userdetails(name,gender,email,contect,address,state,country,uniqueRegId,imageName) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, gender);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, contect);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, state);
            preparedStatement.setString(7, country);
            preparedStatement.setString(8, uniqueRegId);
            preparedStatement.setString(9, imageName);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "User Registered Successfully");
            clearForm();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION);
        selectedFile = fileChooser.getSelectedFile();
        try {
            originalImage = ImageIO.read(selectedFile);

            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();

            int labelWidth = lblImage.getWidth();
            int lableHeight = lblImage.getHeight();

            double scaleX = (double) labelWidth / originalWidth;
            double scaleY = (double) lableHeight / originalHeight;

            double scale = Math.min(scaleX, scaleY);

            int scaledWidth = (int) (originalWidth * scale);
            int scaledHeight = (int) (originalHeight * scale);

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

            ImageIcon icon = new ImageIcon(scaledImage);
            lblImage.setIcon(icon);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_lblImageMouseClicked

    private String saveImage(String email) {
        if (originalImage != null && selectedFile != null) {
            try {
                String savePath = BDUtility.getPath("images\\");
                String extention = BDUtility.getFileExtension(selectedFile.getName());
                String imageName = email + "." + extention;
                File saveFile = new File(savePath + imageName);
                BufferedImage scaledImage = BDUtility.scaleImage(originalImage, ImageIO.read(selectedFile));
                ImageIO.write(scaledImage, extention, saveFile);
                return imageName;

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    private void clearForm() {
        txtName.setText("");
        txtEmail.setText("");
        txtContect.setText("");
        txtAddress.setText("");
        txtState.setText("");
        txtCountry.setText("");
        radioMale.setSelected(false);
        radioFemale.setSelected(false);
        lblImage.setIcon(null);

    }

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContect;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
