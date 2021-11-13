package visitor;

public class ExperiencedDriver implements Driver{
    @Override
    public void execute(OrderClass orderClass) {
        System.out.println("Executes Order till the end");
    }

    @Override
    public void execute(Garage garage) {
        System.out.println("Drives jung to garage");
    }

    @Override
    public void execute(Repair repair) {
        System.out.println("Fixes poor repair");
    }
}
