/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartpsycho;

import com.esprit.dao.PatientDAO;
import com.esprit.entite.Patient;
import java.sql.SQLException;

/**
 *
 * @author lenov
 */
public class SmartPsycho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Patient p=new Patient();
        p.setNom_patient("marwen");
        p.setPrenom_patient("hamza");
        p.setCin_patient(9391891);
        p.setAge_patient(25);
        
          PatientDAO pdao=new PatientDAO();
          pdao.insertPersonne(p);   }
    
}
