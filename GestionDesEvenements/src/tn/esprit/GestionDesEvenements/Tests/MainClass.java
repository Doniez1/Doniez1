/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.GestionDesEvenements.Tests;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import tn.esprit.GestionDesEvenements.Utils.MyConnection;
import tn.esprit.GestionDesEvenements.entities.type_events;
import tn.esprit.GestionDesEvenements.entities.evenement;
import tn.esprit.GestionDesEvenements.service.ServiceType;
import tn.esprit.GestionDesEvenements.service.EvenementService;
/**
 *
 * @author MJ-iNFO
 */
public class MainClass {
      public static void main(String[] args) {
       MyConnection cnx1=MyConnection.getInstance();

       
       System.out.println(" ***********************************Les types des  evenements *****************************************");
       ServiceType St = new ServiceType();
       type_events t= new type_events( "compétition");
       type_events t2= new type_events( "rando");
       
     /*  St.ajouterType1(t2);*/
       St.afficherAll() ;
       St.deleteType(3);
       St.updateType(t2, 10);
       
       System.out.println(" ***********************************Les evenements *****************************************");
       EvenementService es = new EvenementService();
       evenement e1= new evenement ("events","bizerte","bonjour");
       evenement e2= new evenement ("changer","nabeul","bonjour");
       /*es.ajouterEvenement(e1);
       es.ajouterEvenement(e2);*/
       es.afficherEvents();
      /* es.updateEvents(e2,26);*/
      es.deleteEvents(52);
      es.getById(100,"Kef");
      es.triEvents();
     
   
}
    
}
