/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entite.Test;
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
public class TestDAO {
    Connection cnx ;
    String requete ;
    public TestDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    public  void insertTest(Test t) throws SQLException{
        requete="INSERT INTO test (id_psy,nom_test)"
                + " VALUES("+t.getId_psy()+",'"+t.getNom_test()+"')";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    }
    public void updateTest(Test t) {
       requete = "UPDATE test SET  nom_test=? WHERE id_test = "+t.getId_test();
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
           
            pst.setString(1, t.getNom_test());
            
            pst.executeUpdate();
            System.out.println("Modification réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de modification");       
        }
    }
     public void delateTest(Test q) {
        requete="DELETE FROM test WHERE id="+q.getId_test();
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("Supprission réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de supprission");       
        }
    }
      public Test findIdTestByIdAndNom(int id_psy,String nom_test ) {
        requete="SELECT * FROM test WHERE ( id_psy= "+id_psy+" AND nom_test= '"+nom_test+"')";
         Test t =null;
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
             t = new Test();
             while(rs.next()){
            t.setId_test(rs.getInt(1));
            t.setId_psy(rs.getInt(2));
            t.setNom_test(rs.getString(3));
            
          }
             
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return t;
      }
        
        public String findNomTestById(int id_test ) {
        requete="SELECT nom_test FROM test WHERE  id_test= "+id_test ;
         String nt ="";
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            
             while(rs.next()){
             nt = rs.getString(1);
                 System.out.println(nt);
          }
             
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return nt;
    }
      public  List<Test> afficheTestsByIdPsy(int id_psy) {
         List<Test> maList = new ArrayList<>();
        requete="SELECT * FROM test where id_test = "+id_psy;
        try {
            Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
            Test t=new Test();
            t.setId_test(rs.getInt(1));
            t.setId_psy(rs.getInt(2));

           


            maList.add(t);
            }
            return maList;
        } catch (SQLException ex) {
            System.out.println("erreur d'affichage");
            return null;
        }
      }
         public  List<String> afficheTests() {
         List<String> maList = new ArrayList<>();
        requete="SELECT nom_test FROM test ";
        try {
            Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){

            maList.add(rs.getString(1));
            }
            return maList;
        } catch (SQLException ex) {
            System.out.println("erreur d'affichage");
            return null;
        }
        
    }
         public int findIdTestByNom(String nom ) {
             int nt=0 ;
        requete="SELECT id_test FROM test WHERE  nom_test= '"+nom+"'" ;
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            
             while(rs.next()){
            nt=rs.getInt(1);
                 System.out.println(rs);
               
          }
             
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        
    
      return nt;
}
          public boolean findTestById(int id_test ) {
             boolean find=false ;
        requete="SELECT id_test FROM test WHERE  id_test= '"+id_test+"'" ;
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            
             while(rs.next()){
                 rs.getInt(1);
             find=true ;
               
          }
             
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        
    
      return find ;
}
         
}
