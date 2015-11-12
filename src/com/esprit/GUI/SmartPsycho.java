/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;

import com.esprit.dao.ContactDAO;
import com.esprit.entite.Patient;
import com.sun.xml.registry.uddi.bindings_v2_2.Contact;
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
//        p.setNom_patient("siwar");
//        p.setPrenom_patient("brjeb");
//        p.setCin_patient(25245545);
//        p.setAge_patient(23);


//        Resultat rsu=new Resultat();
//        rsu.id_resultat=2;
//        rsu.id_question=1;
//        rsu.id_patient=1;
//        rsu.id_test=1;
//        rsu.result="die";
        
        
//       Question q = new Question();
//       q.id_question=0;
//       q.id_test=1;
//       q.id_psy=1;
//       q.categorie="kannibalisme";
//       q.question="viande arabe ou allmend ";
      //  List list ;
        
        
//          ResultatDAO rdao=new ResultatDAO();
//          list=rdao.findResultatsByIds(1, 1);
//          Iterator it = list.iterator();
//        while(it.hasNext()){
//            Resultat r = (Resultat) it.next();
//            System.out.println(r.getResult());
        
        
//        QuestionDAO qdao=new QuestionDAO();
//        list=qdao.afficheQuestionsByIdTest(1);
//        Iterator it = list.iterator();
//         while(it.hasNext()){
//              Question q  = (Question) it.next();
//              System.out.println(q.getQuestion());
//         }
//         QuestionDAO qdao=new QuestionDAO();
//         Question q = new Question();
//         q.id_question=1;
//         q.question="why";
//         qdao.updateQuestion(q);
        
        
//        TestDAO t = new TestDAO();
//        List ts;
//        ts =  t.afficheTests();
//        System.out.println(ts);
 
//     Question q=new Question();
//        q.id_question=0;
//        q.id_test=1 ;
//        q.id_psy=1;
//        q.question="what??";
//        QuestionDAO qdao = new QuestionDAO();
//        try {
//            qdao.insertQuestion(q);
//        } catch (SQLException ex) {
//            Logger.getLogger(EcrirTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
        ContactDAO c =new ContactDAO();
        
        System.out.println(c.afficheContactsByIdPatientAndIdPsy(1, 1));
    
    }
}
