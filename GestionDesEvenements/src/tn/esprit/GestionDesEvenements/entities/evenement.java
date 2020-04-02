/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.GestionDesEvenements.entities;
import java.io.Serializable;




/**
 *
 * @author MJ-iNFO
 */
public class evenement implements Serializable {
    
    private int id;
    private String Nom;
    private String date;
    private String lieu;
    private String Description;
    private String Type;
    private int ClientId;
    private participant par;

    public participant getPar() {
        return par;
    }

    public void setPar(participant par) {
        this.par = par;
    }

    public evenement(int id, String Nom, String date, String lieu, String Description, String Type, int ClientId, participant par) {
        this.id = id;
        this.Nom = Nom;
        this.date = date;
        this.lieu = lieu;
        this.Description = Description;
        this.Type = Type;
        this.ClientId = ClientId;
        this.par = par;
    }

    public evenement(int id, String Nom, String date, String lieu, String Description, String Type , int ClientId) {
        this.id = id;
        this.Nom = Nom;
        this.date = date;
        this.lieu = lieu;
        this.Description = Description;
        this.Type = Type;
        this.ClientId=ClientId;
    }

    public evenement() {
    }

    public evenement(String Nom, String lieu, String Description) {
        this.Nom = Nom;
        this.lieu = lieu;
        this.Description = Description;
    }
    

    public evenement(String Nom, String date, String lieu, String Description, String Type) {
        this.Nom = Nom;
        this.date = date;
        this.lieu = lieu;
        this.Description = Description;
        this.Type = Type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int ClientId) {
        this.ClientId = ClientId;
    }

    @Override
    public String toString() {
        return "evenement{" + "id=" + id + ", Nom=" + Nom + ", date=" + date + ", lieu=" + lieu + ", Description=" + Description + ", Type=" + Type + ", ClientId=" + ClientId + '}';
    }    
}
