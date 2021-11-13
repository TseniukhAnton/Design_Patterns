package visitor;

public class Garage implements OrderElement{
    @Override
    public void beDone(Driver driver) {
        driver.execute(this);
    }
}
