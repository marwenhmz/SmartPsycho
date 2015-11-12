/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entite;

import java.sql.Date;

/**
 *
 * @author lenov
 */
public class Test {
    public int id_test ;
    public int id_psy ;
    public String nom_test ;
   

    public Test() {
    }

    public Test(int id_test, int id_psy, String nom_test, String date_test) {
        this.id_test = id_test;
        this.id_psy = id_psy;
        this.nom_test = nom_test;
        
    }
    

    

    public int getId_test() {
        return id_test;
    }

    public int getId_psy() {
        return id_psy;
    }

   
    

    public String getNom_test() {
        return nom_test;
    }

    public void setId_test(int id) {
        this.id_test = id;
    }

    public void setId_psy(int id_psy) {
        this.id_psy = id_psy;
    }

    public void setNom_test(String nom_test) {
        this.nom_test = nom_test;
    }

    
    }

    
    
    
    
    

