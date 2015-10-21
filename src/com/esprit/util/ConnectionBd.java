/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lenov
 */
public class ConnectionBd {
     public String url="jdbc:mysql://localhost/smart_psy";
    public String login="root";
    public String pwd="";
    static Connection cnx=null;
    
    private ConnectionBd(){
        try {
            cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connection etablie");
            
        } catch (SQLException ex) {
            System.out.println("connection non etablie");        }
    }
    public static Connection getInstance(){
        if(cnx==null){
            new ConnectionBd();  
    }
    return cnx;
}
    
}
