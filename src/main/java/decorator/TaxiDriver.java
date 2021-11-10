package decorator;

public class TaxiDriver extends DriverDecorator {
    public TaxiDriver(Driver driver) {
        super(driver);
    }

    public String pickUpPassenger() {
        return " Pick Up Passenger in the city.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + pickUpPassenger();
    }
}
