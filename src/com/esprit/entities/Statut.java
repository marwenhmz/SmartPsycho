/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entities;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javax.xml.soap.Text;

/**
 *
 * @author Siwar
 */
public class Statut {
    private int id_statut;
    private String statut;
    private String titre_statut;

    public Statut() {
    }

    public Statut(int id_statut, String statut, String titre_statut) {
        this.id_statut = id_statut;
        this.statut = statut;
        this.titre_statut = titre_statut;
    }

    public int getId_statut() {
        return id_statut;
    }

    public String getStatut() {
        return statut;
    }

    public String getTitre_statut() {
        return titre_statut;
    }

    public void setId_statut(int id_statut) {
        this.id_statut = id_statut;
    }

    public void setStatut(String statut) {
        this.statut =statut;
    }

    public void setTitre_statut(String titre_statut) {
        this.titre_statut = titre_statut;
    }

    @Override

   
    public String toString() {
        return "Statut{" + "id_statut=" + id_statut + ", statut=" + statut + ", titre_statut=" + titre_statut + '}';
    }
   
    
    
}
