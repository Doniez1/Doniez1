/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.GestionDesEvenements.service;

import java.io. Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.esprit.GestionDesEvenements.Utils.MyConnection;
import tn.esprit.GestionDesEvenements.entities.evenement;
import tn.esprit.GestionDesEvenements.entities.type_events;
/**
 *
 * @author MJ-iNFO
 */
public class EvenementService implements Serializable{
    private  Connection cnx;
    private ResultSet res ;
    private Statement ste;

    public EvenementService() {
        cnx =MyConnection.getInstance().getCnx();
    }
   
    public void ajouterEvenement(evenement E){
        try{
        String req="INSERT INTO evenement (Nom,lieu ,Description) VALUES (?,?,?)";
        PreparedStatement pre =cnx.prepareStatement(req);
        pre.setString(1,E.getNom());
        pre.setString(2,E.getLieu());
     
        pre.setString(3,E.getDescription());
        pre.executeUpdate();
        System.out.println("insertion 2 valide");
        
                
    }catch(SQLException e){
            System.out.println(e);
    }
    }
    public List <evenement> afficherEvents(){
        
        List<evenement>ListEvenements = new ArrayList<>();
        String req= "SELECT * FROM evenement join type_events  join user   ";
        Statement st;
        try{
        st= cnx.createStatement();
        ResultSet res=st.executeQuery(req);
         while(res.next()){
        evenement t =new evenement();
        
        t.setId(res.getInt("id"));
        t.setNom(res.getString("nom"));
        t.setLieu(res.getString("lieu"));
        t.setDescription(res.getString("Description"));
        t.setType(res.getString("type"));
        t.setClientId(res.getInt("ClientId"));
        
         
        ListEvenements.add(t);
          
       }
        
     System.out.println(ListEvenements);
                   
    }catch(SQLException e){
            System.out.println(e);
    }
      return ListEvenements;
       
               
    
    }
    public void deleteEvents(int id)  {
        try {
            String requete = " delete from evenement  where id='"+id+"'" ;
            Statement St=cnx.createStatement();
            St = cnx.prepareStatement(requete);
            St=cnx.createStatement();
            St.executeUpdate(requete);
            
        } catch (SQLException ex) {
            Logger.getLogger(EvenementService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateEvents(evenement E ,int id){
        try {
        String requete = " update evenement  set Nom=?  , lieu=? , Description=?   where id='"+id+"'"  ;
           
        PreparedStatement pre =cnx.prepareStatement(requete);
        pre.setString(1,E.getNom());
      
        pre.setString(2,E.getLieu());
        pre.setString(3,E.getDescription());
        pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EvenementService.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
   
        public evenement getById(int idEvents ,String Nom){
         evenement t=null;
   
        String req= "SELECT * FROM evenement where id='"+idEvents+"' or nom='"+Nom+"'  ";
        Statement st;
        try{
        st= cnx.createStatement();
        ResultSet res=st.executeQuery(req);
         while(res.next()){
        t =new evenement();
        
        t.setId(res.getInt("id"));
        t.setNom(res.getString(2));
        t.setLieu(res.getString(4));
        t.setDescription(res.getString(5));
        t.setType(res.getString(6));
        t.setClientId(res.getInt("ClientId"));
           
       }
        
     System.out.println(t);
                   
    }catch(SQLException e){
            System.out.println(e);
    }
      return t;
     
             
    }
   
    
    public List <evenement> triEvents(){
        
        List<evenement>ListEvenements = new ArrayList<>();
        String req= "select * from evenement ORDER BY nom DESC";
        Statement st;
        try{
        st= cnx.createStatement();
        ResultSet res=st.executeQuery(req);
         while(res.next()){
        evenement t =new evenement();
        
        t.setId(res.getInt("id"));
        t.setNom(res.getString(2));
        t.setLieu(res.getString(4));
        t.setDescription(res.getString(5));
        t.setType(res.getString(6));
        t.setClientId(res.getInt("ClientId"));
        
         
        ListEvenements.add(t);
          
       }
        
     System.out.println(ListEvenements);
                   
    }catch(SQLException e){
            System.out.println(e);
    }
      return ListEvenements;
       
               
    
    }
   /*  public void participerEvents ( ){
        try{
        String req="INSERT INTO participant VALUES ()";
        PreparedStatement pre =cnx.prepareStatement(req);
        pre.setString(1,E.getNom());
        pre.setString(2,E.getLieu());
     
        pre.setString(3,E.getDescription());
        pre.executeUpdate();
        System.out.println("insertion 2 valide");
        
                
    }catch(SQLException e){
            System.out.println(e);
    }
    }
    */
   
}
