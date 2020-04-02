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
public class type_events {
    private int id;
    public String Type;
    private String date;
    
  
    private evenement events;

    public type_events(int id, String Type, String date, evenement events) {
        this.id = id;
        this.Type = Type;
        this.date =  date;
        this.events = events;
    }

    public type_events() {
    }

    public type_events(String Type) {
        this.Type = Type;
    }
    

    public type_events(String Type, String date) {
        this.Type = Type;
        this.date = date;
    }
    

    public type_events(int id, String Type, String date) {
        this.id = id;
        this.Type = Type;
        this.date = date;
    }
    

    public type_events(String Type, String date, evenement events) {
        this.Type = Type;
        this.date = date;
        this.events = events;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public evenement getEvents() {
        return events;
    }

    public void setEvents(evenement events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "type_events{" + "id=" + id + ", Type=" + Type + ", date" + date + '}';
    }

   
    
    
}
