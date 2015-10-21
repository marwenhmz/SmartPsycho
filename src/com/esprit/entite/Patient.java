package com.esprit.entite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenov
 */
public class Patient {
    public int id_patient ;
    public String nom_patient ;
    public String prenom_patient ;
    public int age_patient ;
    public int cin_patient ;

   

    public int getId_patient() {
        return id_patient;
    }

    public String getNom_patient() {
        return nom_patient;
    }

    public String getPrenom_patient() {
        return prenom_patient;
    }

    public int getAge_patient() {
        return age_patient;
    }

    public int getCin_patient() {
        return cin_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public void setNom_patient(String nom_patient) {
        this.nom_patient = nom_patient;
    }

    public void setPrenom_patient(String prenom_patient) {
        this.prenom_patient = prenom_patient;
    }

    public void setAge_patient(int age_patient) {
        this.age_patient = age_patient;
    }

    public void setCin_patient(int cin_patient) {
        this.cin_patient = cin_patient;
    }
    
    
        
}
