package com.vehiclesale.backend.model.liasse.builder;

import com.vehiclesale.backend.model.document.AbstractDoc;

public class ConcreteBuilder extends AbstractBuilder{

    @Override
    public void setBonCommande(AbstractDoc bonCommande) {
        this.liasse.setBonCommande(bonCommande);
    }

    @Override
    public void setCertificatCession(AbstractDoc certificatCession) {
        this.liasse.setCertificatCession(certificatCession);
    }

    @Override
    public void setDemandeImmatriculation(AbstractDoc demandeImmatriculation) {
        this.liasse.setDemandeImmatriculation(demandeImmatriculation);
    }
    


}
