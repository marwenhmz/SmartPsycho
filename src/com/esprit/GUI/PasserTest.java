/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;

import com.esprit.dao.QuestionDAO;
import com.esprit.dao.ResultatDAO;
import com.esprit.dao.TestDAO;
import com.esprit.entite.Question;
import com.esprit.entite.Resultat;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenov
 */
public class PasserTest extends javax.swing.JFrame {

    /**
     * Creates new form PasserTest
     */
    public int idq;
    public Iterator<Question> courrentQuestion ;
    int index;
     List <Question> l ;
    
    
    public PasserTest() {
     
        initComponents();
        index=0;
        TestDAO tdao=new TestDAO();
        String nt ;
              nt=  tdao.findNomTestById(ListTests.idpt);
         nomtest.setText(nt);
           
        QuestionDAO qdao=new QuestionDAO();
        //l =new ArrayList<>();
        l=qdao.afficheQuestionsByIdTest(ListTests.idpt);
        //courrentQuestion = l.iterator();
        Question cc=l.get(index);
         idq=cc.getId_question();
         question.setText((String)cc.toString());
        
         
         

        
    }
    public PasserTest(List<Question> l, int index){
               
                initComponents();
        TestDAO tdao=new TestDAO();
        String nt ;
              nt=  tdao.findNomTestById(ListTests.idpt);
         nomtest.setText(nt);
        this.index=index;
        this.l=l;
        Question  c=l.get(index);
        idq=c.getId_question();
        question.setText(c.toString());
        

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        question = new javax.swing.JTextField();
        reponse = new javax.swing.JTextField();
        suivant = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        precedent = new javax.swing.JButton();
        nomtest = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        suivant.setText("Suivant");
        suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivantActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        precedent.setText("Précedent");
        precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(nomtest, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(precedent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(suivant, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomtest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit))
                .addGap(18, 18, 18)
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suivant)
                    .addComponent(precedent))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivantActionPerformed
      
        Resultat r=new Resultat();
        ResultatDAO rdao =new ResultatDAO();
         r.setId_question(idq);
         r.setId_patient(Authentification.idpatient);
         r.setId_test(ListTests.idpt);
         r.setResult(reponse.getText());
        if( rdao.findResultatByIds(Authentification.idpatient, ListTests.idpt,idq)){
            rdao.updateResultat(r);
           
       
        }else  {
             try {
                rdao.insertResultat(r);
            } catch (SQLException ex) {
                Logger.getLogger(PasserTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        if(index+1 < l.size()){
           
        PasserTest pt = new PasserTest(l, index+1);
       pt.setVisible(true);
        close();

        } else {
            Thnx t=new Thnx();
            t.setVisible(true);
            close();
        }
        

   
    }//GEN-LAST:event_suivantActionPerformed
 public void close(){
        WindowEvent winClosingEvent =new WindowEvent(this, WindowEvent.WINDOW_CLOSING );
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
 
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       
        close();
    }//GEN-LAST:event_ExitActionPerformed

    private void precedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedentActionPerformed
     
        if(index > 0){
           
        PasserTest pt = new PasserTest(l,index-1);
       pt.setVisible(true);
        close();

   }
    }//GEN-LAST:event_precedentActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nomtest;
    private javax.swing.JButton precedent;
    private javax.swing.JTextField question;
    private javax.swing.JTextField reponse;
    private javax.swing.JButton suivant;
    // End of variables declaration//GEN-END:variables
}
