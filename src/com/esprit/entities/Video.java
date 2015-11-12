/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entities;

import java.sql.Blob;

/**
 *
 * @author Siwar
 */
public class Video {
     private int id_video;
    private String description_v;
    private String titre_video;
    private Blob video;

    public Video() {
    }

    public Video(int id_video, String description_v, String titre_video, Blob video) {
        this.id_video = id_video;
        this.description_v = description_v;
        this.titre_video = titre_video;
        this.video = video;
    }

    public int getId_video() {
        return id_video;
    }

    public String getDescription_v() {
        return description_v;
    }

    public String getTitre_video() {
        return titre_video;
    }

    public Blob getVideo() {
        return video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public void setDescription_v(String description_v) {
        this.description_v = description_v;
    }

    public void setTitre_video(String titre_video) {
        this.titre_video = titre_video;
    }

    public void setVideo(Blob video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Video{" + "id_video=" + id_video + ", description_v=" + description_v + ", titre_video=" + titre_video + ", video=" + video + '}';
    }
    
    
}
