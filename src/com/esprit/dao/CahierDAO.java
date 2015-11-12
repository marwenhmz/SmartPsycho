/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;

import com.esprit.entities.Cahier;
import com.esprit.entities.Patient;
import com.esprit.util.ConnectionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Siwar
 */
public class CahierDAO {

    Connection cnx;
    String requete;

    public CahierDAO() {
        cnx = ConnectionBd.getInstance();
    }

    public void insertCahier(Cahier c) {
        String sql = "insert into cahier_de_souvenir (id_cahier,date,titre_cahier) values (?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setInt(1, c.getId_cahier());
            ps.setString(2, c.getDate());
            ps.setString(3, c.getTitre_cahier());
            ps.executeUpdate();
            System.out.println("ajout réussit");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'ajout " + ex.getMessage());
        }
    }

    public void DeleteCahier(int id_cahier) {
        String sql = "delete from cahier where id_cahier= ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setInt(1, id_cahier);
            ps.executeUpdate();
            System.out.println("Cahier de souvenir supprimé");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public Cahier findCahierByTitre_cahier(String Titre_cahier) {
        Cahier cahier = new Cahier();
        requete = "select * from cahier_de_souvenir where titre_cahier = ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setString(1, Titre_cahier);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                cahier.setTitre_cahier(resultat.getString(1));

            }
            return cahier;

        } catch (SQLException ex) {
            
            System.out.println("erreur lors de la recherche du Cahier " + ex.getMessage());
            return null;
        }
    }

    public List<Cahier> DisplayAllCahier() {

        List<Cahier> listeDesCahier = new ArrayList<Cahier>();

        String requete = "select * from cahier_de_souvenir";
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Cahier cahier = new Cahier();
                cahier.setTitre_cahier(resultat.getString(1));
            

                listeDesCahier.add(cahier);
            }
            return listeDesCahier;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
}
    
