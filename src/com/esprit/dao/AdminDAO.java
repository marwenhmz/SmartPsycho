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
 * @author Siwar
 */
public class AdminDAO {
    Connection cnx;
    String requete;
    

public AdminDAO() {
cnx = ConnectionBd.getInstance();
}
public void accepterPersonne(Patient p)throws SQLException {
        requete="INSERT INTO patient(nom_patient,prenom_patient,cin_patient,age_patient) VALUES('"+p.getNom_patient()+"','"+p.getPrenom_patient()+"',"+p.getCin_patient()+","+p.getAge_patient()+")";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué"); 
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