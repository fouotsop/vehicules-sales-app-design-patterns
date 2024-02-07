package com.vehiclesale.backend.model.automobile.abstractfactory;

import com.vehiclesale.backend.model.automobile.Automobile;
import com.vehiclesale.backend.model.automobile.Scooter;

public abstract class VehiculeFactory {
    
    public abstract Scooter createScooter();

    public abstract Automobile createAutomobile();

    public abstract Scooter createScooter(String nom, String marque, Float prix);   

    public abstract Automobile createAutomobile(String nom, String marque, Float prix); 
}
