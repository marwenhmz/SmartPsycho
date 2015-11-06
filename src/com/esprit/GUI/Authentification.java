/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;

import com.esprit.entite.Psy;
import com.esprit.util.ConnectionBd;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lenov
 */
public class Authentification extends javax.swing.JFrame {
    
    /**
     * Creates new form Authentification
     */
  
    Connection cnx=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
     static int idp  ; 
     static int idpatient=1  ; 
    
    
    public Authentification() {
        initComponents();
        cnx = ConnectionBd.getInstance();
    }
    public void close(){
        WindowEvent winClosingEvent =new WindowEvent(this, WindowEvent.WINDOW_CLOSING );
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonConnect = new javax.swing.JButton();
        jButtonInscrir = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldPwd = new javax.swing.JPasswordField();
        jRadioPatient = new javax.swing.JRadioButton();
        jRadioPsy = new javax.swing.JRadioButton();
        jRadioAdmin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SP.PNG"))); // NOI18N

        jLabel2.setText("Login :        ");

        jLabel3.setText("Password :");

        jButtonConnect.setText("Connecter");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jButtonInscrir.setText("Inscrir");
        jButtonInscrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscrirActionPerformed(evt);
            }
        });

        jButtonQuitter.setText("Quitter");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        jTextFieldLogin.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldLoginInputMethodTextChanged(evt);
            }
        });
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jPasswordFieldPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPwdActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioPatient);
        jRadioPatient.setText("Patient");
        jRadioPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPatientActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioPsy);
        jRadioPsy.setText("Psychologue");
        jRadioPsy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPsyActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioAdmin);
        jRadioAdmin.setText("Admin");
        jRadioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordFieldPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConnect)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioPatient)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioPsy)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jButtonInscrir)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonQuitter)
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 412, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordFieldPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonInscrir)
                                    .addComponent(jButtonQuitter))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioPatient)
                                    .addComponent(jRadioPsy)
                                    .addComponent(jRadioAdmin))
                                .addGap(36, 36, 36))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonConnect)
                        .addGap(107, 107, 107))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPwdActionPerformed
       //
    }//GEN-LAST:event_jPasswordFieldPwdActionPerformed

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
       String sql ;
       if(personne=="patient"){
         sql="select * from patient where nom_patient=? and pwd_patient=?";
        try {
            pst=cnx.prepareStatement(sql);
            pst.setString(1,jTextFieldLogin.getText());
            pst.setString(2,jPasswordFieldPwd.getText());
            rs=pst.executeQuery();
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Login And Password Are Correct");
                
//                Patient patient = new Patient();
//                session.setAttribute("patient", patient);
                
                
                rs.close();
                pst.close();
                close();
                PatientSwing ps = new PatientSwing();
                ps.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Login And Password Are Not Correct");
                close();
                Authentification at = new Authentification();
                at.setVisible(true);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
       }
       else if(personne=="psy"){
            sql="select * from psychologue where login_psy=? and pwd_psy=?";
        try {
            pst=cnx.prepareStatement(sql);
            pst.setString(1,jTextFieldLogin.getText());
            pst.setString(2,jPasswordFieldPwd.getText());
            rs=pst.executeQuery();
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Login And Password Are Correct");
                
              Psy psycho = new Psy();
             
                psycho.setId_psy(rs.getInt(1));
                idp=psycho.getId_psy();

                rs.close();
                pst.close();
                close();
                NomTest nt = new NomTest();
                nt.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Login And Password Are Not Correct");
                close();
                Authentification at = new Authentification();
                at.setVisible(true);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
       }
       else if(personne=="admin"){
           sql="select * from admin where login_admin=? and pwd_admin=?";
        try {
            pst=cnx.prepareStatement(sql);
            pst.setString(1,jTextFieldLogin.getText());
            pst.setString(2,jPasswordFieldPwd.getText());
            rs=pst.executeQuery();
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Login And Password Are Correct");
                
//                Admin adm = new Admin();
//                session.setAttribute("adm", adm);
                
                
                rs.close();
                pst.close();
                close();
                AdminSwing adms = new AdminSwing();
                adms.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Login And Password Are Not Correct");
                close();
                Authentification at = new Authentification();
                at.setVisible(true);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
       }
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jButtonInscrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscrirActionPerformed
        close();
        Menu_inscription ins =new Menu_inscription();
        ins.setVisible(true);
        close();
    }//GEN-LAST:event_jButtonInscrirActionPerformed

    private void jTextFieldLoginInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldLoginInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginInputMethodTextChanged

    private void jRadioPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPatientActionPerformed
       personne="patient";
    }//GEN-LAST:event_jRadioPatientActionPerformed

    private void jRadioPsyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPsyActionPerformed
        personne="psy";
    }//GEN-LAST:event_jRadioPsyActionPerformed

    private void jRadioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAdminActionPerformed
        personne="admin";
    }//GEN-LAST:event_jRadioAdminActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
       close();
    }//GEN-LAST:event_jButtonQuitterActionPerformed

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
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonInscrir;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordFieldPwd;
    private javax.swing.JRadioButton jRadioAdmin;
    private javax.swing.JRadioButton jRadioPatient;
    private javax.swing.JRadioButton jRadioPsy;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
    private String personne ;
}
