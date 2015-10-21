/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entite.Patient;
import com.esprit.technique.ConnectionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenov
 */
public class PatientDAO {
    
    Connection cnx;
    String requete;
    
    
    public PatientDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    
    public  void insertPersonne(Patient p) throws SQLException{
        requete="INSERT INTO patient(nom_patient,prenom_patient,cin_patient,age_patient) VALUES('"+p.getNom_patient()+"','"+p.getPrenom_patient()+"',"+p.getCin_patient()+","+p.getAge_patient()+")";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    
}
     public void updatePersonne(Patient p) {
       requete = "UPDATE patient SET nom_patient=?, prenom_patient=?,cin_patient=?,age_patient=?  WHERE id="+p.getId_patient()  ;
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, p.getNom_patient());
            pst.setString(2, p.getPrenom_patient());
            pst.setInt(3, p.getCin_patient());
            pst.setInt(4, p.getAge_patient());
            pst.executeUpdate();
            System.out.println("Modification réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de modification");       
        }
    }
     public void deletePersonne(Patient p) {
        requete="DELETE FROM patient WHERE id=2";
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("Supprission réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de supprission");       
        }
    }
}
