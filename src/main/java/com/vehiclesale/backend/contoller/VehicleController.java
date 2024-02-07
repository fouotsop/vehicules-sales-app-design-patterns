package com.vehiclesale.backend.contoller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclesale.backend.Database;
import com.vehiclesale.backend.model.automobile.AutomobileElectrique;
import com.vehiclesale.backend.model.automobile.AutomobileEssence;
import com.vehiclesale.backend.model.automobile.ScooterElectrique;
import com.vehiclesale.backend.model.automobile.ScooterEssence;
import com.vehiclesale.backend.model.automobile.Vehicule;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Vehicle catalog", description = "Save vehicles and get a list of vehicles")
@RestController
@RequestMapping("/vehicules")
public class VehicleController {
    


    @GetMapping
    public ResponseEntity<List<Vehicule>> getVehicles () {

        List<Vehicule> vehicules = Database.getInstance().getVehicules();

        return ResponseEntity.ok(vehicules);
    }

    @Operation(summary = "Add an electrique scooter", description = "Add a new electric scooter to the database")    
    @ApiResponse(responseCode = "200", description = "Scooter added")
    @ApiResponse(responseCode = "400", description = "Bad request") 
    @PostMapping("/vehicule/scooter/electrique")
    public ResponseEntity<ScooterElectrique> add(@RequestBody ScooterElectrique scooterElectrique) {
        scooterElectrique = (ScooterElectrique) Database.getInstance().add(scooterElectrique); 
        return ResponseEntity.ok(scooterElectrique);
    }

    @Operation(summary = "Add a new Fuel scooter", description = "Add a new Fuel scooter to the database")
    @ApiResponse(responseCode = "200", description = "Scooter added")
    @ApiResponse(responseCode = "400", description = "Bad request")
    @PostMapping("/vehicule/scooter")
    public ResponseEntity<ScooterEssence> add(@RequestBody ScooterEssence scooterEssence) {
        scooterEssence = (ScooterEssence) Database.getInstance().add(scooterEssence); 
        return ResponseEntity.ok(scooterEssence);
    }

    @Operation(summary = "Add a new electric mobile car", description = "Add a new electric mobile car to the database")
    @ApiResponse(responseCode = "200", description = "Car added")
    @ApiResponse(responseCode = "400", description = "Bad request")
    @PostMapping("/vehicule/voiture/electriques")
    public ResponseEntity<AutomobileElectrique> add(@RequestBody AutomobileElectrique automobileElectrique) {
        automobileElectrique = (AutomobileElectrique) Database.getInstance().add(automobileElectrique); 
        return ResponseEntity.ok(automobileElectrique);
    }

    @Operation(summary = "Add a new Fuel mobile car", description = "Add a new Fuel mobile car to the database")
    @ApiResponse(responseCode = "200", description = "Car added")
    @ApiResponse(responseCode = "400", description = "Bad request")
    @PostMapping("/vehicule/voiture/essences")
    public ResponseEntity<AutomobileEssence> add(@RequestBody AutomobileEssence automobileEssence) {
        automobileEssence = (AutomobileEssence) Database.getInstance().add(automobileEssence); 
        return ResponseEntity.ok(automobileEssence);
    }

    @Operation(summary = "Get all vehicles", description = "Get all vehicles from the database")
    @ApiResponse(responseCode = "200", description = "Vehicles successfully retrieved")
    @GetMapping("/vehicules")
    public ResponseEntity<List<Vehicule>> getVehiclesEntity() {

        List<Vehicule> vehicules = Database.getInstance().getVehicules();
        
        return ResponseEntity.ok(vehicules);
    }



}
