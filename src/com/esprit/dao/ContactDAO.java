/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entite.Patient;
import com.esprit.entite.Psy;
import com.esprit.entite.Test;
import com.esprit.util.ConnectionBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenov
 */
public class ContactDAO {
     Connection cnx;
    String requete;

    public ContactDAO() {
        cnx = ConnectionBd.getInstance();
    }
    
    public  void affecterTest (Patient p,Psy ps,Test t) throws SQLException{
        requete="INSERT INTO  contact (id_patient,id_psy,id_test,passer_test)"
                + " VALUES("+p.getId_patient()+","+ps.getId_psy()+","+t.getId_test()+","+ 0 +")";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    }
    
//     public  boolean findContactByIds(int id_patient,int id_psy) {
//        requete="SELECT * FROM contact WHERE id_patient="+id_patient+"AND id_psy= "+id_psy;
//         boolean find=false ;
//        try {
//          Statement  st = cnx.createStatement();
//            ResultSet rs=st.executeQuery(requete);
//             
//             while(rs.next()){
//            find=true;
//              }
//        } catch (SQLException ex) {
//            System.out.println("erreur recherche"+ex);      
//        }
//        return find;
//    }
     
     
      public  List<String> afficheContactsByIdPatientAndIdPsy(int id_patient,int id_psy) {
        
          List<String> maList = new ArrayList<>();
        requete="SELECT id_test FROM contact where id_patient = "+id_patient+"AND id_psy = "+id_psy;
        try {
            Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
              Test t = new Test();
              t.setId_test(rs.getInt(1));
              String sql="Select nom_test from test where id_test= "+t.getId_test() ;
              ResultSet rs2=st.executeQuery(sql);
              rs2.next();
              t.setNom_test(rs2.getString(3));
            maList.add(t.getNom_test());
            }
            return maList;
        } catch (SQLException ex) {
            System.out.println("erreur d'affichage");
            return null;
        }
        
    }
}
