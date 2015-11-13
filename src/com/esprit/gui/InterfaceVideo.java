/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.gui;

import com.esprit.entities.Album;
import com.esprit.util.ConnectionBd;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;

/**
 *
 * @author Siwar
 */
public class InterfaceVideo extends javax.swing.JFrame {
 Connection connection=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    EmbeddedMediaPlayerComponent mediaPlayerComponent;
    /**
     * Creates new form InterfaceVideo
     */
    public InterfaceVideo() {
        initComponents();
         connection =ConnectionBd.getInstance();
         
        String sql="Select * from  album";
        try {
         pst=connection.prepareStatement(sql);
         ResultSet rs=pst.executeQuery();
         while ( rs.next()) {
             
             String titre_album=rs.getString("titre_album");
            String description_album=rs.getString("description_album");
            int id_album=rs.getInt("id_album");
            ListeAl.addItem(new com.esprit.entities.Album(id_album, titre_album, description_album));
             
         }
        
         } catch(SQLException e) {
        }
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
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        ListeAl = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setText("titre_video");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 70, 80, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 70, 90, 20);

        jLabel4.setText("description");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 130, 80, 30);

        jButton1.setText("attach vidéo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 220, 100, 23);

        jButton2.setText("vidéo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 220, 59, 23);

        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(290, 250, 53, 30);
        jPanel1.add(textArea1);
        textArea1.setBounds(110, 140, 100, 80);

        ListeAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeAlActionPerformed(evt);
            }
        });
        jPanel1.add(ListeAl);
        ListeAl.setBounds(60, 280, 70, 20);

        jButton4.setText("supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(380, 260, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/p.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -30, 570, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        //jLabel2.setIcon(new ImageIcon(filename));
        jButton1.setText(filename);
        try{
            filenameDst = "video/" + f.getName(); //esm video
            File vidsrc =new File(filename);
            File viddst =new File(filenameDst);
            FileInputStream fis=new FileInputStream(vidsrc); //copie pour lire
            FileOutputStream fos = new FileOutputStream(viddst); //ecrire
//            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for (int readNum;(readNum=fis.read(buf))!=-1;){
            fos.write(buf,0,readNum); 
            }
            
//            person_image=bos.toByteArray();
            
        
        }
        catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
            System.out.println(e.getMessage());
        }        // TODO add your handling code here
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int p = JOptionPane.showConfirmDialog(null,"voulez vous vraiment ajouter","Ajout",JOptionPane.YES_NO_OPTION);
        if (p==0){
        
        try{
            
            String sql="Insert into video (titre_video,description_v,video,id_album) values(?,?,?,?)";
            pst=connection.prepareStatement(sql);
          
           pst.setString(2,textArea1.getText());
            pst.setString(1,jTextField2.getText());
            pst.setString(3, filenameDst);
            pst.setInt(4,  ((Album)ListeAl.getSelectedItem()).getId_album());
              
            pst.execute();
            JOptionPane.showMessageDialog(null, "video ajouté");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       
        }
                //        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

 String sql ="select video from video where titre_video= '"+jTextField2.getText()+"'";
           
            if (rs.next()){
                String vidPath = rs.getString("video");
                String[] args = new String[1]; //passer un seul param
                args[0] = vidPath;
                VideoPlayer.main(args); 
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
                    }        
//        Manager.createPlayer();
                              


                                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ListeAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListeAlActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 String sql="delete from video where titre_video='"+jTextField2.getText()+"'";
     try {
         pst=connection.prepareStatement(sql);
          pst.execute();
     } catch (SQLException ex) {
         Logger.getLogger(InterfaceVideo.class.getName()).log(Level.SEVERE, null, ex);
     }
           
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new InterfaceVideo().setVisible(true);
            }
        });
    }
    public void close(){
        WindowEvent winClosingEvent =new WindowEvent(this, WindowEvent.WINDOW_CLOSING );
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ListeAl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

String filename=null ;
int s=0;
String filenameDst;
}
