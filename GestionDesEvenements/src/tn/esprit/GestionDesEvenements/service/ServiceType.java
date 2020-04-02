/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.GestionDesEvenements.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tn.esprit.GestionDesEvenements.Utils.MyConnection;
import tn.esprit.GestionDesEvenements.entities.type_events;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MJ-iNFO
 */
public class ServiceType {
    
    private  Connection cnx;

    public ServiceType() {
        cnx =MyConnection.getInstance().getCnx();
    }
    public void ajouterType(type_events t){
        try{
        String req="INSERT INTO type_events (Type,date )VALUES ('"+t.getType()+"','"+t.getDate()+"')";
        Statement St=cnx.createStatement();
        St.executeUpdate (req);
        System.out.println("insertion valide");
        
                
    }catch(SQLException e){
            System.out.println(e);
    }
    }
     public void ajouterType1(type_events t ){
        try{
        String req="INSERT INTO type_events (Type,date) VALUES (?,?)";
        PreparedStatement pre =cnx.prepareStatement(req);
        pre.setString(1,t.getType());
        pre.setString(2,t.getDate());
        pre.executeUpdate();
        System.out.println("insertion 2 valide");
        
                
    }catch(SQLException e){
            System.out.println(e);
    }
    }
    
    public List <type_events> afficherAll(){
        
        List<type_events>ListType = new ArrayList<>();
        String req= "SELECT * FROM type_events ";
        Statement st;
         try{
       st= cnx.createStatement();
       ResultSet res=st.executeQuery(req);
       while(res.next()){
           type_events t =new type_events();
           t.setId(res.getInt("id"));
           t.setType(res.getString(2));
        
           ListType.add(t);
      
       }
        
     System.out.println(ListType);
                   
    }catch(SQLException e){
            System.out.println(e);
    }
      return ListType;
       
               
    
    }
    public void deleteType(int id)  {
        try {
            String requete = " delete from type_events where id='"+id+"'" ;
            Statement St=cnx.createStatement();
            St = cnx.prepareStatement(requete);
            St=cnx.createStatement();
            St.executeUpdate(requete);
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateType(type_events t,int id){
        try {
            String requete = " update type_events set type=? , date=?   where id='"+id+"'"  ;
           
        PreparedStatement pre =cnx.prepareStatement(requete);
        pre.setString(1,t.getType());
        pre.setString(2,t.getDate());
        pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
    

