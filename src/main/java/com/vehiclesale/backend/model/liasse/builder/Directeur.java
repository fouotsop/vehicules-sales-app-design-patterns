package com.vehiclesale.backend.model.liasse.builder;

import com.vehiclesale.backend.model.document.DocumentHtml;

public class Directeur {
    

    private AbstractBuilder builder;

    public Directeur(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void Construire () {
        builder.createNewLiasse();
        
        builder.setBonCommande(new DocumentHtml());

        builder.setCertificatCession(new DocumentHtml());

        builder.setDemandeImmatriculation(new DocumentHtml());
    }


}
