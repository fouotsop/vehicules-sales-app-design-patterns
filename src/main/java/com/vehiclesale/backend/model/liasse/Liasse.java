package com.vehiclesale.backend.model.liasse;

import java.util.UUID;

import com.vehiclesale.backend.model.document.AbstractDoc;

public final class Liasse {
   
    private UUID id;
    public static Liasse instance;

    private AbstractDoc demandeImmatriculation;
    private AbstractDoc bonCommande;
    
    private AbstractDoc certificatCession;

    public Liasse() {
    }

    public static Liasse getInstance() {

        if(instance == null) {
            instance = new Liasse();
        }

        return instance;
    }

    public AbstractDoc getDemandeImmatriculation() {
        return demandeImmatriculation;
    }

    public void setDemandeImmatriculation(AbstractDoc demandeImmatriculation) {
        this.demandeImmatriculation = demandeImmatriculation;
    }

    public AbstractDoc getBonCommande() {
        return bonCommande;
    }

    public void setBonCommande(AbstractDoc bonCommande) {
        this.bonCommande = bonCommande;
    }

    public AbstractDoc getCertificatCession() {
        return certificatCession;
    }

    public void setCertificatCession(AbstractDoc certificatCession) {
        this.certificatCession = certificatCession;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


}
