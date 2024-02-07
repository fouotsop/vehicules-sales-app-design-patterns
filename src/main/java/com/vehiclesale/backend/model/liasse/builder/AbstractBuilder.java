package com.vehiclesale.backend.model.liasse.builder;

import com.vehiclesale.backend.model.document.AbstractDoc;
import com.vehiclesale.backend.model.liasse.Liasse;

public abstract class AbstractBuilder {
    protected Liasse liasse; 

    public AbstractBuilder() {
    }

    public abstract void setBonCommande(AbstractDoc bonCommande);

    public abstract void setCertificatCession(AbstractDoc certificatCession);   

    public abstract void setDemandeImmatriculation(AbstractDoc demandeImmatriculation); 


    public void createNewLiasse() {
        liasse = Liasse.getInstance();
    }

    public Liasse getLiasse() {
        return liasse;
    }
}
