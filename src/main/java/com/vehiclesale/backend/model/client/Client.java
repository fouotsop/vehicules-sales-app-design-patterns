package com.vehiclesale.backend.model.client;

import java.util.UUID;

public class Client extends AbstractCompany {


    public Client() {
    }   
   
    public Client(String nom) {
        super(nom);
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public void setId(UUID id) {
        super.setId(id);
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }   

    
    


}
