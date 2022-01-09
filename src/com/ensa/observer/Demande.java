package com.ensa.observer;

import com.ensa.observable.Observable;

public class Demande  extends Observable {

	//observable
	public static final String INIT="INIT";
    public static final String APPROUVEE="APPROUVEE";
    public static final String IN_ORDER="IN_ORDER";
    public static final String BLOQUEE="BLOQUEE";
    private String state;
    private double prix;

    public Demande(Double prix){
        this.state=Demande.INIT;
        this.prix=prix;
    }

    public Demande(String state, double prix) {
        this.state = state;
        this.prix = prix;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

            notifie();

    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
