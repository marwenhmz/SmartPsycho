/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entities;

import java.io.File;
import javax.naming.BinaryRefAddr;

/**
 *
 * @author Siwar
 */
public class Image {
    private int id_image;
    private String description;
    private String titre_image;
 
    

    public Image() {
    }

    public Image(int id_image, String description, String titre_image) {
        this.id_image = id_image;
        this.description = description;
        this.titre_image = titre_image;
      
    }

    public int getId_image() {
        return id_image;
    }

    public String getDescription() {
        return description;
    }

    public String getTitre_image() {
        return titre_image;
    }

   

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitre_image(String titre_image) {
        this.titre_image = titre_image;
    }

    @Override
    public String toString() {
        return "Image{" + "id_image=" + id_image + ", description=" + description + ", titre_image=" + titre_image + '}';
    }

   

    
   

   
   

  

    
    
    
    
}
