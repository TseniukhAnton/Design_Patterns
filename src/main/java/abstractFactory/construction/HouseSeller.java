package abstractFactory.construction;

import abstractFactory.Seller;

public class HouseSeller implements Seller {
    @Override
    public void sellProject() {
        System.out.println("House seller sells a  house... ");
    }
}
