
package forms;

import java.awt.Color;
import javax.swing.BorderFactory;
import utility.BDUtility;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        //BDUtility.setImage(this, "images/nw.jpg", 1397, 771);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnRegisterUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        btnViewAttandance = new javax.swing.JButton();
        btnGenerateQr = new javax.swing.JButton();
        btnMarkAttandance = new javax.swing.JButton();
        btnViewQr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 0));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(196, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 50, -1));

        btnRegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisterUser.setText("Register User");
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 148, -1));

        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateUser.setText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 148, -1));

        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 148, -1));

        btnViewUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewUser.setText("View User");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 148, -1));

        btnViewAttandance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewAttandance.setText("View Attendance");
        btnViewAttandance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAttandanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewAttandance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 148, -1));

        btnGenerateQr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateQr.setText("Generate Qr");
        btnGenerateQr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateQrActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerateQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 148, -1));

        btnMarkAttandance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMarkAttandance.setText("Mark Attendance");
        btnMarkAttandance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAttandanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarkAttandance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        btnViewQr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewQr.setText("View Qr");
        btnViewQr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewQrActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 148, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("DASH BOARD FOR ATTENDANCE MANAGEMENT");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 60));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utility/images/n2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 1210, 700));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, 700));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1400, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
    
        BDUtility.openForm(UpdateUser.class.getSimpleName(), new UpdateUser());
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
   
        BDUtility.openForm(UserRegistration.class.getSimpleName(), new UserRegistration());
    }//GEN-LAST:event_btnRegisterUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        
        BDUtility.openForm(ViewUser.class.getSimpleName(), new ViewUser());

    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
        BDUtility.openForm(DeleteUser.class.getSimpleName(), new DeleteUser());

    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnGenerateQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateQrActionPerformed

        BDUtility.openForm(GenerateQr.class.getSimpleName(), new GenerateQr());
    }//GEN-LAST:event_btnGenerateQrActionPerformed

    private void btnViewQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewQrActionPerformed
       
        BDUtility.openForm(ViewQrs.class.getSimpleName(), new ViewQrs());
    }//GEN-LAST:event_btnViewQrActionPerformed

    private void btnMarkAttandanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAttandanceActionPerformed
        
        BDUtility.openForm(MarkAttandance.class.getSimpleName(), new MarkAttandance());
    }//GEN-LAST:event_btnMarkAttandanceActionPerformed

    private void btnViewAttandanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAttandanceActionPerformed
      
        BDUtility.openForm(ViewAttandance.class.getSimpleName(), new ViewAttandance());
    }//GEN-LAST:event_btnViewAttandanceActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnGenerateQr;
    private javax.swing.JButton btnMarkAttandance;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewAttandance;
    private javax.swing.JButton btnViewQr;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
