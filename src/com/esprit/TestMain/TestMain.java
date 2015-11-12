/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TestMain;
import com.esprit.dao.CahierDAO;
import com.esprit.dao.ImageDAO;
import com.esprit.dao.StatutDAO;
import com.esprit.entities.Cahier;
import com.esprit.entities.Image;
import com.esprit.entities.Statut;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Siwar
 */

public class TestMain{
public static void main(String[] args) {
    
   
        //  DateFormat dateFormatMDY = new SimpleDateFormat("01/01/991");
        //Cahier c=new Cahier();
        //CahierDAO cdao=new CahierDAO();
        //c.setId_cahier(2);
        //c.setDate("01/01/1991");
        //c.setTitre_cahier("happy");
        
        
        Image i=new Image();
        ImageDAO idao=new ImageDAO();
   
        
        i.setTitre_image("la joie");
        i.setDescription("ma vie");
        i.setId_image(3);
   
   
        //idao.insertImage(i)
        
        
        
       Statut s=new Statut();
        StatutDAO sdao=new StatutDAO();
        s.setId_statut(2);
        s.setStatut("belle");
        s.setTitre_statut("siwar");
      String t= sdao.ShowStatutByTitre_statut("siwar");
      System.out.println(t);
       // sdao.insertStatut(s);
       // sdao.DisplayStatut();
      
         //sdao.updateStatut(s);
        //sdao.DisplayStatut();
        
        
        
        //cdao.insertCahier(c);
         //cdao.DeleteCahier(1);
        // System.out.println(c);
   
    } 
       
         
          
}
    

        
        
        
        
        
    
           
    

