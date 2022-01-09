package com.ensa.observer;

import com.ensa.observable.Observateur;

public class Budget implements Observateur {
    
	
	//observer
    private double budget;
    private double bloque;
    protected Demande demande;

    public double getBloque() {
        return bloque;
    }

    public void setBloque(double bloque) {
        this.bloque = bloque;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public Budget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public void actualise() {
        if(demande.getState().equals(Demande.APPROUVEE)) {
      this.setBloque(demande.getPrix());
        }
        if (demande.getState().equals(Demande.IN_ORDER)){
            this.setBudget(this.getBudget()-demande.getPrix());
            this.setBloque(0);
        }


    }
}
