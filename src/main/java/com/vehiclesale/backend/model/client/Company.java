package com.vehiclesale.backend.model.client;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Company extends AbstractCompany {

    private List<AbstractCompany> clients = new ArrayList<>();

    public Company() {
    }   
    
    public Company(String nom) {
        super(nom);
    } 

    public List<AbstractCompany> getClients() {
        return clients;
    }   

    public void setClients(List<AbstractCompany> clients) {
        this.clients = clients;
    }


    public void addClient(AbstractCompany client) {
        client.setId(UUID.randomUUID());
        clients.add(client);
    }

    public void removeClient(AbstractCompany client) {
        clients.remove(client);
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
