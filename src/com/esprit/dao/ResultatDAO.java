/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entite.Question;
import com.esprit.entite.Resultat;
import com.esprit.util.ConnectionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lenov
 */
public class ResultatDAO {
  Connection cnx;
    String requete;
    
    
    public ResultatDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    public  void insertResultat(Resultat r) throws SQLException{
        requete="INSERT INTO resultat (id_question,id_patient,id_test,result)"
                + " VALUES('"+r.getId_question()+"','"+r.getId_patient()+"','"+r.getId_test()+"','"+r.getResult()+"')";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    }
//    public void updateResultat(Resultat p) {
//       requete = "UPDATE resultat SET id_resultat=?, id_question=?,id_patient=?,id_test=?,result=?  WHERE id="+p.getId_resultat()  ;
//        try {
//            PreparedStatement pst = cnx.prepareStatement(requete);
//            pst.setInt(1, p.getId_resultat());
//            pst.setInt(1, p.getId_question());
//            pst.setInt(1, p.getId_patient());
//            pst.setInt(1, p.getId_test());
//            pst.setString(2, p.getResult());           
//           
//            pst.executeUpdate();
//            System.out.println("Modification réussite");
//        } catch (SQLException ex) {
//            System.out.println("erreur de modification");       
//        }
//    }
//     public void delateResultat(Resultat p) {
//        requete="DELETE FROM resultat WHERE id="+p.getId_resultat();
//        try {
//            PreparedStatement pst = cnx.prepareStatement(requete);
//            pst.executeUpdate(requete);
//            System.out.println("Supprission réussite");
//        } catch (SQLException ex) {
//            System.out.println("erreur de supprission");       
//        }
//    }
      public List<Resultat> findResultatsByIds(int id_patient, int id_test) {
        requete = "SELECT * FROM resultat WHERE  id_patient="+id_patient+" AND id_test="+id_test ;
         List<Resultat> maList = new ArrayList<>();
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
             
             while(rs.next()){
            Resultat p=new Resultat();
            p.setId_resultat(rs.getInt(1));
            p.setId_question(rs.getInt(2));
            p.setId_patient(rs.getInt(3));
            p.setId_test(rs.getInt(4));
            p.setResult(rs.getString(5));
            maList.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return maList;
    }
//      public  List<Resultat> afficheResultats() {
//         List<Resultat> maList = new ArrayList<>();
//        requete="SELECT * FROM resultat ";
//        try {
//            Statement  st = cnx.createStatement();
//            ResultSet rs=st.executeQuery(requete);
//            while(rs.next()){
//            Resultat p=new Resultat();
//            p.setId_resultat(rs.getInt(1));
//            p.setNote(rs.getString(2));
//            p.setCompt_rendu(rs.getString(3));
//           
//
//
//            maList.add(p);
//            }
//            return maList;
//        } catch (SQLException ex) {
//            System.out.println("erreur d'affichage");
//            return null;
//        }
//        
//    }
}
   

