
package com.esprit.dao;

import com.esprit.entite.Patient;
import com.esprit.util.ConnectionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lenov
 */
public class PatientDAO {
    
    Connection cnx;
    String requete;
    
    
    public PatientDAO(){
        cnx = ConnectionBd.getInstance();
        
    }
    
    public  void insertPatient(Patient p) throws SQLException{
        requete="INSERT INTO patient(nom_patient,prenom_patient,cin_patient,age_patient) VALUES('"+p.getNom_patient()+"','"+p.getPrenom_patient()+"',"+p.getCin_patient()+","+p.getAge_patient()+")";
            Statement st =cnx.createStatement();
            st.executeUpdate(requete);
            System.out.println("Insertion effectué");
    
}
     public void updatePatient(Patient p) {
       requete = "UPDATE patient SET nom_patient=?, prenom_patient=?,cin_patient=?,age_patient=?  WHERE id="+p.getId_patient()  ;
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, p.getNom_patient());
            pst.setString(2, p.getPrenom_patient());
            pst.setInt(3, p.getCin_patient());
            pst.setInt(4, p.getAge_patient());
            pst.executeUpdate();
            System.out.println("Modification réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de modification");       
        }
    }
     public void delatePatient(Patient p) {
        requete="DELETE FROM patient WHERE id=2";
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("Supprission réussite");
        } catch (SQLException ex) {
            System.out.println("erreur de supprission");       
        }
    }
      public Patient findPatientById(int id) {
        requete="SELECT * FROM patient WHERE id_patient="+id;
         Patient p=null;
        try {
          Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
             p = new Patient();
             while(rs.next()){
            p.setId_patient(rs.getInt(1));
            p.setNom_patient(rs.getString(2));
            p.setPrenom_patient(rs.getString(3));
            p.setCin_patient(rs.getInt(4));
            p.setAge_patient(rs.getInt(5));

                 System.out.println(p.getNom_patient());
                 System.out.println(p.getPrenom_patient());
             }
        } catch (SQLException ex) {
            System.out.println("erreur recherche"+ex);      
        }
        return p;
    }
      public  List<Patient> affichePatients() {
         List<Patient> maList = new ArrayList<>();
        requete="SELECT * FROM patient ";
        try {
            Statement  st = cnx.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
            Patient p=new Patient();
            p.setId_patient(rs.getInt(1));
            p.setNom_patient(rs.getString(2));
            p.setPrenom_patient(rs.getString(3));
            p.setCin_patient(rs.getInt(4));
            p.setAge_patient(rs.getInt(5));


            maList.add(p);
            }
            Iterator<Patient> it = maList.iterator();

            while(it.hasNext()) {
                Patient pt=it.next();
            System.out.println(pt.getId_patient()+pt.getNom_patient()+pt.getCin_patient()+pt.getAge_patient());

            }
            System.out.println(maList);
            return maList;
        } catch (SQLException ex) {
            System.out.println("erreur d'affichage");
            return null;
        }
        
    }
      
}
