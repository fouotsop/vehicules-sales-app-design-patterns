package com.vehiclesale.backend.contoller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclesale.backend.Database;
import com.vehiclesale.backend.model.client.AbstractCompany;
import com.vehiclesale.backend.model.client.Client;
import com.vehiclesale.backend.model.client.Company;
import com.vehiclesale.backend.model.request.LoginRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;



@Tag(name = "Clients and companies", description = "The Clients and Companies API")
@RestController
public class ClientController {


    @Operation(summary = "Client Login", description = "Login to the application as a client")
    @ApiResponse(responseCode = "200", description = "Login successful")
    @ApiResponse(responseCode = "401", description = "Login failed")
    @PostMapping("/clients/login/")
    public ResponseEntity<Client> login(@RequestBody LoginRequest loginRequest) {

        List<AbstractCompany> companies = Database.getInstance().getCompanies();
        for (AbstractCompany company : companies) {
            if (company.getNom().equals(loginRequest.getUsername()) && company.getPassword().equals(loginRequest.getPassword())) {
                return ResponseEntity.ok((Client)company);
            }
        }
        return ResponseEntity.status(401).build();
    }   

    @Operation(summary = "Company Login", description = "Login to the application as a company")    
    @ApiResponse(responseCode = "200", description = "Login successful")
    @ApiResponse(responseCode = "401", description = "Login failed")
    @PostMapping("/companies/login/")
    public ResponseEntity<Company> logEntity(@RequestBody LoginRequest loginRequest) {

         List<AbstractCompany> companies = Database.getInstance().getCompanies();
        for (AbstractCompany company : companies) {
            if (company.getNom().equals(loginRequest.getUsername()) && company.getPassword().equals(loginRequest.getPassword())) {
                return ResponseEntity.ok((Company)company);
            }
        }
        return ResponseEntity.status(401).build();       

    }
    

    @Operation(summary = "Get all clients", description = "Get all clients from the database")
    @ApiResponse(responseCode = "200", description = "Clients successfully retrieved")
    @GetMapping("/clients/")
    public ResponseEntity<List<AbstractCompany>> getClientsEntity() {

        List<AbstractCompany> companies = Database.getInstance().getCompanies();
        
        return ResponseEntity.ok(companies);
    }
    
    @Operation(summary = "Add a new client", description = "Saves a new client in the application database")
    @ApiResponse(responseCode = "201", description = "Client added successfully")
    @PostMapping("/clients/")
    public ResponseEntity<Client> add(@RequestBody Client client) {

        client = (Client) Database.getInstance().add(client);

        return ResponseEntity.ok(client);
    }
    
    @Operation(summary = "Add a new company", description = "Saves a new company in the application database")
    @ApiResponse(responseCode = "201", description = "Client added successfully")
    @PostMapping("/companies/")
    public ResponseEntity<Company> add(@RequestBody Company company) {

        company = (Company) Database.getInstance().add(company);

        return ResponseEntity.ok(company);
    }   

    @Operation(summary = "Add a client to a company", description = "Add a client to a company in the application database")
    @ApiResponse(responseCode = "201", description = "Client added successfully to the company")
    @PostMapping("/companies/{companyId}/clients/")
    public ResponseEntity<Company> addClientToCompany(@RequestBody Client client, String companyId) {
            
            Company company = (Company) Database.getInstance().getById(companyId);
            if (company == null) {
                return ResponseEntity.notFound().build();
            }
            company.addClient(client);

            return ResponseEntity.ok(company);
        }   




}
