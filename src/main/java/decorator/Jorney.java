package decorator;

public class Jorney {
    public static void main(String[] args) {
        Driver driver = new SeniorDriver(new TaxiDriver(new TruckDriver()));

        System.out.println(driver.makeJob());
    }
}
