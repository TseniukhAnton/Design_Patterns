package decorator;

public class TruckDriver implements Driver{
    @Override
    public String makeJob() {
        return "Drive a truck.";
    }
}
