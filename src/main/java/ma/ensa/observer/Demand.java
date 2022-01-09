package ma.ensa.observer;

import java.util.Observable;

public class Demand extends Observable{

    private String demandStatus="In Order";
    private double globalAmount;

    public Demand(double globalAmount) {
        this.globalAmount = globalAmount;
    }

    public Demand(String demandStatus, double globalAmount) {
        this.demandStatus = demandStatus;
        this.globalAmount = globalAmount;
    }

    public double getGlobalAmount() {
        return globalAmount;
    }

    public void setGlobalAmount(double globalAmount) {
        this.globalAmount = globalAmount;
    }

    public void notifyObserver(){
        setChanged();
        notifyObservers();
    }

    public String getDemandStatus() {
        return demandStatus;
    }

    public void setDemandStatus(String demandStatus) {
        this.demandStatus = demandStatus;
        notifyObserver();
    }


}
