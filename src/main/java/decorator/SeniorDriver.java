package decorator;

public class SeniorDriver extends DriverDecorator{
    public SeniorDriver(Driver driver) {
        super(driver);
    }

    public String prepareReport(){
        return "Prepare week report and provide it.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + prepareReport();
    }
}
