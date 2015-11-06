/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entite.Diagnostique;
import com.esprit.util.ConnectionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenov
 */
public class DiagnostiqueDAO {
    Connection  cnx ;
           
    String requete ;
    public DiagnostiqueDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    public  void insertDiagnostique(Diagnostique q) throws SQLException{
        requete="INSERT INTO  diagnostique (id_psy,id_patient,id_test,diag)"
                + " VALUES('"+q.getId_psy()+"','"+q.getId_patient()+"','"+q.getId_test()+"','"+q.getDiag()+"')";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    }
    public void updateDiagnostique(Diagnostique d) {
       requete = "UPDATE question SET  diag=?  WHERE id_diag = "+d.getId_diag()  ;
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
           
            pst.setString(1, d.getDiag());
            
            pst.executeUpdate();
            System.out.println("Modification réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de modification");       
        }
    }
     public void delateDiagnostique(Diagnostique d) {
        requete="DELETE FROM  diagnostique WHERE id="+d.getId_diag();
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("Supprission réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de supprission");       
        }
    }
      public  Diagnostique findDiagnostiqueById(int id) {
        requete="SELECT * FROM diagnostique WHERE id_diag="+id;
         Diagnostique d =null;
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
             d = new Diagnostique();
             while(rs.next()){
            d.setId_diag(rs.getInt(1));
            d.setId_psy(rs.getInt(2));
            d.setId_patient(rs.getInt(3));
            d.setId_test(rs.getInt(4));
            d.setDiag(rs.getString(5));
            
           

                 System.out.println(d.getId_diag());
                  System.out.println(d.getId_psy());
                   System.out.println(d.getId_patient());
                   System.out.println(d.getId_test());
                 System.out.println(d.getDiag());
             }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return d;
    }
      public  List<Diagnostique> afficheDiagnostiquesByIdPatient(int id_patient) {
         List<Diagnostique> maList = new ArrayList<>();
        requete="SELECT * FROM diagnostique where id_patient = "+id_patient;
        try {
            Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
            Diagnostique d=new Diagnostique();
            d.setId_diag(rs.getInt(1));
            d.setId_psy(rs.getInt(2));
            d.setId_patient(rs.getInt(3));         
            d.setId_test(rs.getInt(4));
            d.setDiag(rs.getString(5));
           


            maList.add(d);
            }
            return maList;
        } catch (SQLException ex) {
            System.out.println("erreur d'affichage");
            return null;
        }
        
    }
    
}
