package bridge;

public class Supermarket extends IceCream{
    public Supermarket(IceCreamMaker iceCreamMaker) {
        super(iceCreamMaker);
    }

    @Override
    public void makeIceCream() {
        System.out.println("Supermarket preparation is in progress...");
        iceCreamMaker.prepareIceCream();
    }
}
