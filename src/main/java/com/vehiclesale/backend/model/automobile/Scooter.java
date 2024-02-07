package com.vehiclesale.backend.model.automobile;

import java.util.UUID;

public abstract class Scooter extends Vehicule {
   
    public Scooter() {

    }
    
    public Scooter(String nom, String marque, Float prix) {
        super(nom, marque, prix);
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public void setId(UUID id) {
        super.setId(id);
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public String getMarque() {
        return super.getMarque();
    }

    @Override
    public Float getPrix() {
        return super.getPrix();
    }
}
