package abstractFactory.mining;

import abstractFactory.Seller;

public class MiningSeller implements Seller {
    @Override
    public void sellProject() {
        System.out.println("Mining seller sells mining products and raw metals");
    }
}
