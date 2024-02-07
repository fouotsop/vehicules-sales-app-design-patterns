package com.vehiclesale.backend.model.commande;

import java.util.UUID;

import com.vehiclesale.backend.model.automobile.Vehicule;

public abstract class Commande {

    private UUID id; 
    private Vehicule vehicule;
    private Etat etat;
    protected Float montant;

    public Commande() {}

    public Commande (Etat etat, Vehicule vehicule, Float montant) {
        this.etat = etat;
        this.vehicule = vehicule;
        this.montant = montant;
    }

    public Etat getEtat() {
        return etat;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public abstract Float calculeTax();

    public Float calculMontant() {
        return calculeTax() + montant;
    }

}
