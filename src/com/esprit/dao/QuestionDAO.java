/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entite.Patient;
import com.esprit.entite.Question;
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
public class QuestionDAO {
     Connection cnx;
    String requete;
    
    
    public QuestionDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    public  void insertQuestion(Question q) throws SQLException{
        requete="INSERT INTO question ( id_test,id_psy,categorie,question )"
                + " VALUES ( "+q.getId_test()+","+q.getId_psy()+",' "+q.getCategorie()+" ',' "+q.getQuestion()+" ' )";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    }
    public void updateQuestion(Question q) {
       requete = "UPDATE question SET  question=?  WHERE id_question = "+q.getId_question()  ;
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
           
            pst.setString(1, q.getQuestion());
            
            pst.executeUpdate();
            System.out.println("Modification réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de modification");       
        }
    }
     public void delateQuestion(Question q) {
        requete="DELETE FROM question WHERE id="+q.getId_question();
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("Supprission réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de supprission");       
        }
    }
      public Question findQuestiontById(int id) {
        requete="SELECT * FROM question WHERE id_question="+id;
         Question q =null;
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
             q = new Question();
             while(rs.next()){
            q.setId_question(rs.getInt(1));
            q.setId_test(rs.getInt(2));
            q.setId_psy(rs.getInt(3));
            q.setCategorie(rs.getString(4));
            q.setQuestion(rs.getString(5));
           

                 System.out.println(q.getId_question());
                  System.out.println(q.getId_test());
                   System.out.println(q.getId_psy());
                   System.out.println(q.getCategorie());
                 System.out.println(q.getQuestion());
             }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return q;
    }
      public  List<Question> afficheQuestionsByIdTest(int id_test) {
         List<Question> maList = new ArrayList<>();
        requete="SELECT * FROM question where id_test = "+id_test;
        try {
            Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
            Question q=new Question();
            q.setId_question(rs.getInt(1));
            q.setId_test(rs.getInt(2));
            q.setId_psy(rs.getInt(3));
            q.setCategorie(rs.getString(4));
            q.setQuestion(rs.getString(5));
           


            maList.add(q);
            }
            return maList;
        } catch (SQLException ex) {
            System.out.println("erreur d'affichage");
            return null;
        }
        
    }
}
