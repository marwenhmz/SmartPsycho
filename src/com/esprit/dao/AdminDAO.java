/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.util.ConnectionBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lenov
 */
public class AdminDAO {
    Connection cnx;
    String requete;
    
    
    public AdminDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    
     public int findAdminByLoginAndPwd(String login,String pwd) {
        requete="SELECT * FROM admin WHERE  login_admin= '"+login +"' AND pwd_admin= '"+pwd+"'";
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
