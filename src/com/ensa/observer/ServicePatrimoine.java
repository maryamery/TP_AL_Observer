package com.ensa.observer;

public class ServicePatrimoine extends OrderHandler {

    @Override
    public void handleRequest(Demande demande,Budget budget) {
        if(demande.getState().equals(demande.APPROUVEE)){
        demande.setState(demande.IN_ORDER);
        }
        else nextHandler.handleRequest(demande,budget);
    }
}
