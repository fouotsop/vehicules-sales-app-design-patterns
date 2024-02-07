package com.vehiclesale.backend.model.client;

import java.util.UUID;

public abstract class AbstractCompany {

    private UUID id;
    private String nom;
    private String password;

    public AbstractCompany() {}

    public AbstractCompany(String nom) {
        this.nom = nom;
    }   

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }  

    public void setNom(String nom) {
        this.nom = nom;
    }   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
