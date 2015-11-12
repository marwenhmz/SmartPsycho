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
public class Question {
    public int id_question ;
    public int id_test ;
    public int id_psy ;
    public String question ;
   

    public Question() {
    }
    

    public Question(int id_question, int id_test, int id_psy, String question, String categorie) {
        this.id_question = id_question;
        this.id_test = id_test;
        this.id_psy = id_psy;
        this.question = question;
        
    }

    public int getId_question() {
        return id_question;
    }

    public int getId_test() {
        return id_test;
    }

    public int getId_psy() {
        return id_psy;
    }

    public String getQuestion() {
        return question;
    }

    

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public void setId_test(int id_test) {
        this.id_test = id_test;
    }

    public void setId_psy(int id_psy) {
        this.id_psy = id_psy;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    

    @Override
    public String toString() {
        return  "question =" + question ;
    }

    
}
