package ma.ensa.observer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;


public class Budget implements Observer {

    private double budget;
    private double blockAmount;

    public Budget(double budget) {
        this.budget = budget;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Demand){
            Demand demand = (Demand) o;
            if(demand.getDemandStatus().equals("Approved")){

                blockAmount = demand.getGlobalAmount();
            }
            else{
                budget -= blockAmount;
                blockAmount = 0;
            }
        }
    }

    public double getBudget() {
        return budget;
    }
}
