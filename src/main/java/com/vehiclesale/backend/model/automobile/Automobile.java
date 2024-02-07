package com.vehiclesale.backend.model.automobile;

public  abstract class Automobile extends Vehicule {
    

    public Automobile() {}

    public Automobile(String nom, String marque, Float prix) {
        super(nom, marque, prix);
    }
}
