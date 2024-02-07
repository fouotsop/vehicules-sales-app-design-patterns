package com.vehiclesale.backend.model.automobile;

import java.util.UUID;

public class AutomobileEssence extends Automobile{
    
    public AutomobileEssence() {}

    public AutomobileEssence(String nom, String marque, Float prix) {
        super(nom, marque, prix);
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getMarque() {
        return super.getMarque();
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public Float getPrix() {
        return super.getPrix();
    }

    @Override
    public void setId(UUID id) {
    }

    @Override
    public void setMarque(String marque) {
        super.setMarque(marque);
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    @Override
    public void setPrix(Float prix) {
        super.setPrix(prix);
    }

    

}
