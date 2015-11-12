/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao;


import com.esprit.entities.Image;
import com.esprit.util.ConnectionBd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class ImageDAO {
    Connection cnx;
    String requete;
   
    
public ImageDAO()
{
        cnx = ConnectionBd.getInstance();
}
public void insertImage(Image i) throws FileNotFoundException 
{
        String sql = "insert into image (id_image,image,titre_image,description) values (?,?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setInt(1, i.getId_image());
       
            ps.setString(2, i.getTitre_image());
            ps.setString(3, i.getDescription());
 
            ps.executeUpdate();
            System.out.println("ajout réussit");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'ajout " + ex.getMessage());
        }
        }
    
public void DeleteImage(int id_image) {
        String sql = "delete from image where id_image= ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setInt(1, id_image);
            ps.executeUpdate();
            System.out.println("image supprimé");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
 public Image findImageByTitre_image(String Titre_image) {
        Image image = new Image();
         requete = "select * from image where titre_image = ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setString(1, Titre_image);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                image.setTitre_image(resultat.getString(1));

            }
            return image;

        } catch (SQLException ex) {
       
            System.out.println("erreur lors de la recherche de l'image " + ex.getMessage());
            return null;
        }
    }
 public List<Image> DisplayImage() {

        List<Image> listeDesImage = new ArrayList<Image>();

        requete = "select * from image";
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Image image = new Image();
                image.setTitre_image(resultat.getString(1));
            

                listeDesImage.add(image);
            }
            return listeDesImage;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    } 
}