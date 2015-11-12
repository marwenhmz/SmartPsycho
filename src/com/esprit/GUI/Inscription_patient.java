package com.esprit.GUI;


import com.esprit.dao.PatientDAO;
import com.esprit.entite.Patient;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imen
 */
public class Inscription_patient extends javax.swing.JFrame {

    
    public Inscription_patient() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jNom = new javax.swing.JTextField();
        jPrenom = new javax.swing.JTextField();
        jLogin = new javax.swing.JTextField();
        jCin = new javax.swing.JTextField();
        jAge = new javax.swing.JTextField();
        jTel = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        cin = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        pwd = new javax.swing.JLabel();
        confpwd = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jPwd = new javax.swing.JPasswordField();
        jConfPwd = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        retour = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        inscrir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(jNom);
        jNom.setBounds(160, 0, 198, 29);
        jPanel1.add(jPrenom);
        jPrenom.setBounds(160, 50, 198, 29);
        jPanel1.add(jLogin);
        jLogin.setBounds(160, 100, 198, 29);
        jPanel1.add(jCin);
        jCin.setBounds(160, 150, 198, 29);
        jPanel1.add(jAge);
        jAge.setBounds(160, 200, 198, 29);
        jPanel1.add(jTel);
        jTel.setBounds(160, 350, 198, 29);
        jPanel1.add(jEmail);
        jEmail.setBounds(160, 400, 198, 29);

        nom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nom.setText("Nom                 :");
        jPanel1.add(nom);
        nom.setBounds(40, 0, 120, 30);

        prenom.setBackground(new java.awt.Color(255, 153, 153));
        prenom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prenom.setText("Prenom            :");
        jPanel1.add(prenom);
        prenom.setBounds(40, 50, 120, 30);

        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setText("Login               :");
        jPanel1.add(login);
        login.setBounds(40, 100, 120, 29);

        cin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cin.setText("Cin                   :");
        jPanel1.add(cin);
        cin.setBounds(40, 150, 120, 30);

        age.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        age.setText("Age                  :");
        jPanel1.add(age);
        age.setBounds(40, 200, 120, 30);

        pwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pwd.setText("Pwd                  :");
        jPanel1.add(pwd);
        pwd.setBounds(40, 250, 120, 30);

        confpwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        confpwd.setText("Confirmer pwd :");
        jPanel1.add(confpwd);
        confpwd.setBounds(40, 300, 120, 30);

        tel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tel.setText("Tel                    : ");
        jPanel1.add(tel);
        tel.setBounds(40, 350, 120, 30);

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setText("Email                :");
        jPanel1.add(email);
        email.setBounds(40, 400, 120, 30);
        jPanel1.add(jPwd);
        jPwd.setBounds(160, 250, 200, 30);
        jPanel1.add(jConfPwd);
        jConfPwd.setBounds(160, 300, 200, 30);

        retour.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        retour.setText("Accuil");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });

        quitter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        quitter.setText("Exit");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        inscrir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inscrir.setText("S'inscrire");
        inscrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Inscription Patient");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(retour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quitter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(inscrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(inscrir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1512, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        close();
    }//GEN-LAST:event_quitterActionPerformed

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        Accueil ac =new Accueil();
        ac.setVisible(true);
        close();
    }//GEN-LAST:event_retourActionPerformed

    private void inscrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrirActionPerformed
        PatientDAO pdao=new PatientDAO();
        if(! pdao.findLogin(jLogin.getText())){
        if(jPwd.getText().equals(jConfPwd.getText())){
            if(! pdao.findPatientByCin(Integer.parseInt(jCin.getText())) ){
                if(! pdao.findPatientByEmail(jEmail.getText())){
                    Patient p =new Patient();
                    p.setId_patient(0);
                    p.setNom_patient(jNom.getText());
                    p.setPrenom_patient(jPrenom.getText());
                    p.setLogin(jLogin.getText());
                    p.setCin_patient(Integer.parseInt(jCin.getText()) );
                    p.setAge_patient(Integer.parseInt( jAge.getText()));
                    p.setPwd_patient(jConfPwd.getText());
                    p.setTel_patient(Integer.parseInt( jTel.getText()));
                    p.setEmail_patient(jEmail.getText());

                    try {
                        pdao.insertPatient(p);
                        PatientSwing ps=new PatientSwing();
                        ps.setVisible(true);
                        close();
                    }
                    catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"erreur d'insertion "+ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Email existe deja");
                }

            }else{
                JOptionPane.showMessageDialog(null,"Cin existe deja");
            }
        }else {
            JOptionPane.showMessageDialog(null,"password incorrect");
        }
        }else{
            JOptionPane.showMessageDialog(null,"login existe deja ");
        }
    }//GEN-LAST:event_inscrirActionPerformed
 
     public void close(){
        WindowEvent winClosingEvent =new WindowEvent(this, WindowEvent.WINDOW_CLOSING );
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel cin;
    private javax.swing.JLabel confpwd;
    private javax.swing.JLabel email;
    private javax.swing.JButton inscrir;
    private javax.swing.JTextField jAge;
    private javax.swing.JTextField jCin;
    private javax.swing.JPasswordField jConfPwd;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLogin;
    private javax.swing.JTextField jNom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPrenom;
    private javax.swing.JPasswordField jPwd;
    private javax.swing.JTextField jTel;
    private javax.swing.JLabel login;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel pwd;
    private javax.swing.JButton quitter;
    private javax.swing.JButton retour;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}
