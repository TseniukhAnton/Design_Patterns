package visitor;

public class OrderClass implements OrderElement{
    @Override
    public void beDone(Driver driver) {
        driver.execute(this);
    }
}
