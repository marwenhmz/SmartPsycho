/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;

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
     public int findPsyByLoginAndPwd(String login,String pwd) {
        String requete="SELECT * FROM psychologue WHERE  login_psy= '"+login +"' AND pwd_psy= '"+pwd+"'";
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
    
    
}
