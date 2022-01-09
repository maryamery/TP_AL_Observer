package ma.ensa.observer;

public class AccountService extends OrderHandler{

    @Override
    void HandleRequest(Demand demand) {

        demand.setDemandStatus("Approved");
        System.out.println("Demand is Approved");
        nextHandler.HandleRequest(demand);
    }

}
