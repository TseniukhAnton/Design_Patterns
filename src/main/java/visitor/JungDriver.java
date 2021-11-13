package visitor;

public class JungDriver implements Driver{
    @Override
    public void execute(OrderClass orderClass) {
        System.out.println("Poor execution of the order");
    }

    @Override
    public void execute(Garage garage) {
        System.out.println("Skips visit to garage");
    }

    @Override
    public void execute(Repair repair) {
        System.out.println("Fails repair");
    }
}
