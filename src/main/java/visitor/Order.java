package visitor;

public class Order implements OrderElement{
    OrderElement[] orderElements;

    public Order(){
        this.orderElements = new OrderElement[]{
                new OrderClass(),
                new Garage(),
                new Repair()
        };
    }
    @Override
    public void beDone(Driver driver) {
        for (OrderElement el : orderElements) {
            el.beDone(driver);
        }
    }
}
