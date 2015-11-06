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
public class Psy {
    
    public int id_psy;
    public String login_psy ;
    public String pwd_psy;
    public String specialite;
    public Psy() {
    }

    public Psy(int id_psy, String login_psy, String pwd_psy, String specialite) {
        this.id_psy = id_psy;
        this.login_psy = login_psy;
        this.pwd_psy = pwd_psy;
        this.specialite = specialite;
    }

    public int getId_psy() {
        return id_psy;
    }

    public String getLogin_psy() {
        return login_psy;
    }

    public String getPwd_psy() {
        return pwd_psy;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setId_psy(int id_psy) {
        this.id_psy = id_psy;
    }

    public void setLogin_psy(String login_psy) {
        this.login_psy = login_psy;
    }

    public void setPwd_psy(String pwd_psy) {
        this.pwd_psy = pwd_psy;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    

  
    
}
