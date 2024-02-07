package com.vehiclesale.backend.model.automobile.abstractfactory;

import com.vehiclesale.backend.model.automobile.Automobile;
import com.vehiclesale.backend.model.automobile.AutomobileElectrique;
import com.vehiclesale.backend.model.automobile.Scooter;
import com.vehiclesale.backend.model.automobile.ScooterElectrique;

public class ElectriqueVehiculeFactory extends VehiculeFactory{
   
    public ElectriqueVehiculeFactory() {
    }


    public Scooter createScooter(String nom, String marque, Float prix) {
        return new ScooterElectrique(nom, marque, prix);
    }

    public Automobile createAutomobile(String nom, String marque, Float prix) {
        return new AutomobileElectrique(nom, marque, prix);
    }


    @Override
    public Scooter createScooter() {
        return new ScooterElectrique();
    }


    @Override
    public Automobile createAutomobile() {
        return new AutomobileElectrique();
    }


}
