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
public class Resultat {
    public int id_resultat ;
    public int id_question ;
    public int id_patient ;
    public int id_test ;
    public String result;

    public Resultat() {
    }

    public Resultat(int id_resultat, int id_question, int id_patient, int id_test, String result) {
        this.id_resultat = id_resultat;
        this.id_question = id_question;
        this.id_patient = id_patient;
        this.id_test = id_test;
        this.result = result;
    }

    public int getId_resultat() {
        return id_resultat;
    }

    public int getId_question() {
        return id_question;
    }

    public int getId_patient() {
        return id_patient;
    }

    public int getId_test() {
        return id_test;
    }

    public String getResult() {
        return result;
    }

    public void setId_resultat(int id_resultat) {
        this.id_resultat = id_resultat;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public void setId_test(int id_test) {
        this.id_test = id_test;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Resultat{" + "id_resultat=" + id_resultat + ", id_question=" + id_question + ", id_patient=" + id_patient + ", id_test=" + id_test + ", result=" + result + '}';
    }


    
}
