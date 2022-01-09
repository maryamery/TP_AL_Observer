package com.ensa.observer;

public class ServiceComptable extends OrderHandler {
	
    //changer le statut
    @Override
    public void handleRequest(Demande demande,Budget budget) {

         if(demande.getPrix()<=budget.getBudget()){
            demande.setState(Demande.APPROUVEE);
}      nextHandler.handleRequest(demande,budget);

    }
}
