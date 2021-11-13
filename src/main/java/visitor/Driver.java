package visitor;

public interface Driver {
    public void execute(OrderClass orderClass);

    public void execute(Garage garage);

    public void execute(Repair repair);
}
