package com.vehiclesale.backend.model.automobile.abstractfactory;

import com.vehiclesale.backend.model.automobile.Automobile;
import com.vehiclesale.backend.model.automobile.AutomobileEssence;
import com.vehiclesale.backend.model.automobile.Scooter;
import com.vehiclesale.backend.model.automobile.ScooterEssence;

public class EssenceVehicleFactory extends VehiculeFactory{
   
    
    public Scooter createScooter(String nom, String marque, Float prix) {   
        return new ScooterEssence(nom, marque, prix);
    }

    public Automobile createAutomobile(String nom, String marque, Float prix) {
        return new AutomobileEssence(nom, marque, prix);
    }

    @Override
    public Scooter createScooter() {
        return new ScooterEssence();
    }

    @Override
    public Automobile createAutomobile() {
        return new AutomobileEssence();
    }
}
