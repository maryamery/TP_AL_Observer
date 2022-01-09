package ma.ensa.observer;

public abstract class OrderHandler {
    abstract void HandleRequest(Demand demand);
    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
