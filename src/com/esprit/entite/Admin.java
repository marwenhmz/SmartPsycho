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
public class Admin {
    public int id ;
    public String login_admin ;
    public String pwd_admin ;

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public String getLogin_admin() {
        return login_admin;
    }

    public String getPwd_admin() {
        return pwd_admin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin_admin(String login_admin) {
        this.login_admin = login_admin;
    }

    public void setPwd_admin(String pwd_admin) {
        this.pwd_admin = pwd_admin;
    }
    
}
