/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entities;

import java.sql.Date;
import java.text.DateFormat;
import java.util.List;

/**
 *
 * @author Siwar
 */
public class Cahier {
   private int id_cahier;
   private String date;
   private String titre_cahier;
   private List<Video> videos;
    private List<Image> images;
     private List<Statut> statuts;

    public Cahier(int id_cahier, String date, String titre_cahier, List<Video> videos, List<Image> images, List<Statut> statuts) {
        this.id_cahier = id_cahier;
        this.date = date;
        this.titre_cahier = titre_cahier;
        this.videos = videos;
        this.images = images;
        this.statuts = statuts;
    }

    public int getId_cahier() {
        return id_cahier;
    }

    public String getDate() {
        return date;
    }

    public String getTitre_cahier() {
        return titre_cahier;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Statut> getStatuts() {
        return statuts;
    }

    public void setId_cahier(int id_cahier) {
        this.id_cahier = id_cahier;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTitre_cahier(String titre_cahier) {
        this.titre_cahier = titre_cahier;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void setStatuts(List<Statut> statuts) {
        this.statuts = statuts;
    }

    @Override
    public String toString() {
        return "Cahier{" + "id_cahier=" + id_cahier + ", date=" + date + ", titre_cahier=" + titre_cahier + ", videos=" + videos + ", images=" + images + ", statuts=" + statuts + '}';
    }
   

  

    
    
}
