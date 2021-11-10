package decorator;

public class DriverDecorator implements Driver{
    Driver driver;

    public DriverDecorator(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String makeJob() {
        return driver.makeJob();
    }
}
