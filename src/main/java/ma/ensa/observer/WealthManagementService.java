package ma.ensa.observer;

public class WealthManagementService extends OrderHandler {

    @Override
    void HandleRequest(Demand demand) {
        demand.setDemandStatus("In Order");
        System.out.println("Demand is in order");
        nextHandler.HandleRequest(demand);
    }
}
