package com.vehiclesale.backend.model.commande;

import java.util.UUID;

import com.vehiclesale.backend.model.automobile.Vehicule;

public class CommandePayCredit extends CommandeCameroun {

    public CommandePayCredit () {}

    public CommandePayCredit(Etat etat, Vehicule vehicule, Float montant) {
        super(etat, vehicule, montant);
    }

    @Override
    public Float calculMontant() {
        return super.calculMontant();
    }

    @Override
    public Float calculeTax() {
        return super.calculeTax();
    }

    @Override
    public Etat getEtat() {
        return super.getEtat();
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public Vehicule getVehicule() {
        return super.getVehicule();
    }

    @Override
    public void setEtat(Etat etat) {
        super.setEtat(etat);
    }

    @Override
    public void setId(UUID id) {
        super.setId(id);
    }

    @Override
    public void setVehicule(Vehicule vehicule) {
        super.setVehicule(vehicule);
    }
    
    

}

