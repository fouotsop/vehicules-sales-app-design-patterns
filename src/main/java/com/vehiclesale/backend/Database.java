package com.vehiclesale.backend;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.vehiclesale.backend.model.automobile.Vehicule;
import com.vehiclesale.backend.model.client.AbstractCompany;
import com.vehiclesale.backend.model.client.Company;
import com.vehiclesale.backend.model.commande.Commande;
import com.vehiclesale.backend.model.liasse.Liasse;

public final class Database {

    private static Database instance;


    private List<Vehicule> vehicules = new ArrayList<>();
    private List<Commande> commandes = new ArrayList<>();
    private List<AbstractCompany> companies = new ArrayList<>();
    private List<Liasse> liasses = new ArrayList<>();

    private Database () {}


    public static Database getInstance() {

        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }


    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }


    public List<Commande> getCommandes() {
        return commandes;
    }


    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }


    public List<AbstractCompany> getCompanies() {
        return companies;
    }


    public void setCompanies(List<AbstractCompany> companies) {
        this.companies = companies;
    }


    public List<Liasse> getLiasses() {
        return liasses;
    }


    public void setLiasses(List<Liasse> liasses) {
        this.liasses = liasses;
    }

    public Commande add(Commande commande) {
        commande.setId(UUID.randomUUID());
        this.getCommandes().add(commande);

        return commande;
    }

    public Vehicule add(Vehicule vehicule) {
        vehicule.setId(UUID.randomUUID());
        this.getVehicules().add(vehicule);

        return vehicule;
    }


    public AbstractCompany add(AbstractCompany company) {
        company.setId(UUID.randomUUID());
        this.getCompanies().add(company);

        return company;
    }   


    public Company getById(String companyId) {
        for (AbstractCompany company : this.getCompanies()) {
            if(company.getId().toString().equals(companyId)) {
                return (Company) company;
            }
        }
        return null;
    }   

    public AbstractCompany getById(String companyId, String clientType) {
        for (AbstractCompany company : this.getCompanies()) {
            if(company.getId().toString().equals(companyId)) {
                return company;
            }
        }
        return null;
    }



    
}
