/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entities;

/**
 *
 * @author Siwar
 */
public class Album {
    private int id_album;
    private String titre_album;
    private String  description_album;

    public Album(int id_album, String titre_album, String description_album) {
        this.id_album = id_album;
        this.titre_album = titre_album;
        this.description_album = description_album;
    }

    public int getId_album() {
        return id_album;
    }

    public String getTitre_album() {
        return titre_album;
    }

    public String getDescription_album() {
        return description_album;
    }

    public void setId_album(int id_album) {
        this.id_album = id_album;
    }

    public void setTitre_album(String titre_album) {
        this.titre_album = titre_album;
    }

    public void setDescription_album(String description_album) {
        this.description_album = description_album;
    }

    @Override
    public String toString() {
        return titre_album;
    }


    
    
}
