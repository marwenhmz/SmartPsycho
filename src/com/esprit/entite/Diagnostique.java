/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entite;

/**
 *
 * @author lenov
 */
public class Diagnostique {
    public int id_diag ;
    public int id_patient ;
    public int id_psy ;
    public int id_test ;
    public String diag ;

    public Diagnostique() {
    }

    public Diagnostique(int id_diag, int id_patient, int id_psy, int id_test, String diag) {
        this.id_diag = id_diag;
        this.id_patient = id_patient;
        this.id_psy = id_psy;
        this.id_test = id_test;
        this.diag = diag;
    }

    public int getId_diag() {
        return id_diag;
    }

    public int getId_patient() {
        return id_patient;
    }

    public int getId_psy() {
        return id_psy;
    }

    public int getId_test() {
        return id_test;
    }

    public String getDiag() {
        return diag;
    }

    public void setId_diag(int id_diag) {
        this.id_diag = id_diag;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public void setId_psy(int id_psy) {
        this.id_psy = id_psy;
    }

    public void setId_test(int id_test) {
        this.id_test = id_test;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }
    
    
    
    
}
