package com.vehiclesale.backend.model.automobile;

import java.util.UUID;

public abstract class Vehicule {
   
    private UUID id;
    private String nom;
    private String marque;
    private Float prix;
    public Vehicule() {}

    public Vehicule(String nom, String marque, Float prix) {
        this.prix = prix;
        this.marque = marque;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Float getPrix() {
        return this.prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }
    
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id; 
    }

}
