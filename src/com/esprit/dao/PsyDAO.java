/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;

import com.esprit.entite.Patient;
import com.esprit.entite.Psy;
import com.esprit.util.ConnectionBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wassim
 */
public class PsyDAO {
    Connection cnx;
    String requete;
    
    
    public PsyDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    
    
     public  void insertPsy(Psy p) throws SQLException{
        requete="INSERT INTO psychologue (nom_psy,prenom_psy,login,cin_psy,age_psy,pwd_psy,ville,tel_psy,email_psy,diplome)"
                + " VALUES ('"+p.getNom_psy()+"','"+p.getPrenom_psy()+"','"+p.getLogin()+"',"+p.getCin_psy()+","+p.getAge_psy()+",'"+p.getPwd_psy()+"','"+p.getVille() +"',"+p.getTel_psy()+",'"+p.getEmail_psy()+"','"+p.getDiplome()+"')";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    
}
     public int findPsyByLoginAndPwd(String login,String pwd) {
        String requete="SELECT * FROM psychologue WHERE  login= '"+login +"' AND pwd_psy= '"+pwd+"'";
         int p=0;
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            
             while(rs.next()){
               p=rs.getInt(1);
                     }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return p;
    }
      public boolean findPsyByCin(int id) {
            boolean find=false ;
        requete="SELECT * FROM psychologue WHERE cin_psy="+id;
        
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            
             while(rs.next()){
                find=true;
             }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return find;
    }
       public boolean findPsyByEmail(String  email) {
            boolean find=false ;
        requete="SELECT * FROM psychologue WHERE email_psy= '"+email+"'";
        
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            
             while(rs.next()){
                find=true;
             }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return find;
    }
     public boolean findLogin(String  login) {
            boolean find=false ;
        requete="SELECT * FROM psychologue WHERE login '"+login+"'";
        
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            
             while(rs.next()){
                find=true;
             }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return find;
    }
    
}
