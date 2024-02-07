package com.vehiclesale.backend.model.commande.factory;

import com.vehiclesale.backend.model.commande.Commande;
import com.vehiclesale.backend.model.commande.CommandePayContent;
import com.vehiclesale.backend.model.commande.CommandePayCredit;

public class CommandeFactory {

    public static final String TYPE_COMMANDE1 = "CONTENT";
    public static final String TYPE_COMMANDE2 = "CREDIT";
    

    public Commande createCommande (String typeCommande) {
        Commande commande = null;

        switch (typeCommande) {
            case TYPE_COMMANDE1:
                
                commande = new CommandePayContent();
                break;
            
            case TYPE_COMMANDE2:
                commande = new CommandePayCredit();
            default:
                break;
        }

        return commande;
    }

}
