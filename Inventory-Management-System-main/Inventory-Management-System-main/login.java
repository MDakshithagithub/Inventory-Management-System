/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HARITHA NANDHINI
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userinp = new javax.swing.JTextField();
        passinp = new javax.swing.JPasswordField();
        regbut = new javax.swing.JButton();
        logbut = new javax.swing.JButton();
        cancbut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 177, 74));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("LOGIN FORM");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel4.setText("Password");

        userinp.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        userinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userinpActionPerformed(evt);
            }
        });

        passinp.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        passinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passinpActionPerformed(evt);
            }
        });

        regbut.setBackground(new java.awt.Color(0, 0, 0));
        regbut.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        regbut.setForeground(new java.awt.Color(255, 255, 255));
        regbut.setText("Register");
        regbut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbutActionPerformed(evt);
            }
        });

        logbut.setBackground(new java.awt.Color(0, 0, 0));
        logbut.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        logbut.setForeground(new java.awt.Color(255, 255, 255));
        logbut.setText("Login");
        logbut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbutActionPerformed(evt);
            }
        });

        cancbut.setBackground(new java.awt.Color(0, 0, 0));
        cancbut.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        cancbut.setForeground(new java.awt.Color(255, 255, 255));
        cancbut.setText("Cancel");
        cancbut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userinp, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(passinp)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(regbut)
                .addGap(76, 76, 76)
                .addComponent(logbut, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(cancbut)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(userinp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passinp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regbut)
                    .addComponent(logbut)
                    .addComponent(cancbut))
                .addGap(81, 81, 81))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 560, 500));

        jLabel1.setBackground(new java.awt.Color(240, 156, 77));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invshop/goods.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1640, 1160));

        setSize(new java.awt.Dimension(1433, 992));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passinpActionPerformed

    private void regbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbutActionPerformed
        // TODO add your handling code here:
        register r=new register();
        r.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_regbutActionPerformed

    private void userinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userinpActionPerformed

    private void cancbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancbutActionPerformed
        // TODO add your handling code here:
        this.hide();
        this.dispose();
    }//GEN-LAST:event_cancbutActionPerformed

    private void logbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbutActionPerformed
        try {
            // TODO add your handling code here:
            if(userinp.getText().isEmpty()||passinp.getText().isEmpty())
            {
              JOptionPane.showMessageDialog(this,"UserName or Password is empty");
            }
            else
            {
            String st=userinp.getText();
            String st1=passinp.getText();
            Class.forName("oracle.jdbc.driver.OracleDriver");    
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
            PreparedStatement ps=con.prepareStatement("select * from registration where username=? and password=?");     
            ps.setString(1,st);  
            ps.setString(2,st1);
            ResultSet rs;
            rs=ps.executeQuery();
            if(rs.next())
            {
                companydet cd=new companydet();
                this.hide();
                cd.setVisible(true);
            } 
            else
            {
            JOptionPane.showMessageDialog(this, "UserName and Password do not Match");
            userinp.setText("");
            passinp.setText("");
            }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_logbutActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancbut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logbut;
    private javax.swing.JPasswordField passinp;
    private javax.swing.JButton regbut;
    private javax.swing.JTextField userinp;
    // End of variables declaration//GEN-END:variables
}