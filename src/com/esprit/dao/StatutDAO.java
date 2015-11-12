/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entities.Image;
import com.esprit.entities.Statut;
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
 * @author Siwar
 */
public class StatutDAO {
    
Connection cnx;
String requete;
    
public StatutDAO()
{
        cnx = ConnectionBd.getInstance();
}
public void insertStatut(Statut s) 
{
        String sql = "insert into statut (statut,titre_statut) values (?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, s.getStatut());
            ps.setString(2, s.getTitre_statut());
      
            ps.executeUpdate();
            System.out.println("ajout réussit");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'ajout " + ex.getMessage());
        }
        }
    
public void DeleteStatut(String titre_statut) {
        String sql = "delete from statut where _statut= ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, titre_statut);
            ps.executeUpdate();
            System.out.println("statut supprimé");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
public void updateStatut(Statut s) {
        String sql ="UPDATE statut SET  statut=?  WHERE titre_statut= '"+s.getTitre_statut()+"'";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            
            
            
            ps.setString(1, s.getStatut());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
 public String ShowStatutByTitre_statut(String t) {
        String statut=null ;
         requete = "select statut from statut where titre_statut = ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setString(1,t);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                statut=resultat.getString(1);
                  //System.out.println("statut trouvé");
            }
            return statut;
         

        } catch (SQLException ex) {
       
            System.out.println("erreur lors de la recherche " + ex.getMessage());
            return null;
        }
    }
 public List<Statut> DisplayStatut() {

             List<Statut> listeDesStatut = new ArrayList<Statut>();

        String requete = "select * from statut";
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Statut statut = new Statut();
                statut.setTitre_statut(resultat.getString(1));
            

                listeDesStatut.add(statut);
            }
            System.out.println(listeDesStatut);
            return listeDesStatut;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Lieux" + ex.getMessage());
            return null;
        }
    } 

}
