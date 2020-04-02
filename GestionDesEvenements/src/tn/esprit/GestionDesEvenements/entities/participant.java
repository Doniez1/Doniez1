/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.GestionDesEvenements.entities;

/**
 *
 * @author MJ-iNFO
 */
public class participant {
    private int id;
    private int Evenement_id;
    private int  user_id;

    public participant(int id, int Evenement_id, int user_id) {
        this.id = id;
        this.Evenement_id = Evenement_id;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEvenement_id() {
        return Evenement_id;
    }

    public void setEvenement_id(int Evenement_id) {
        this.Evenement_id = Evenement_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    
    
}
