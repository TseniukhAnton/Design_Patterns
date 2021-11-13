package visitor;

public class Repair implements OrderElement{
    @Override
    public void beDone(Driver driver) {
        driver.execute(this);
    }
}
