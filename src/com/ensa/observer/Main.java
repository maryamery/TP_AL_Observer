package com.ensa.observer;

public class Main {
    public static void main(String[] args){
    	
    	
        OrderHandler comptable=new ServiceComptable();
        OrderHandler patrimoine=new ServicePatrimoine();

        comptable.nextHandler=patrimoine;
        patrimoine.nextHandler=comptable;
        Demande demande=new Demande(15.0);
        Budget budget=new Budget(70.0);
        demande.ajoute(budget);
        budget.setDemande(demande);
        comptable.handleRequest(demande,budget);
        System.out.println(budget.getBudget());
        System.out.println(budget.getBloque());
        System.out.println(demande.getState());
    }
}
