package bridge;

public class Home extends IceCream{
    public Home(IceCreamMaker iceCreamMaker) {
        super(iceCreamMaker);
    }

    @Override
    public void makeIceCream() {
        System.out.println("Home preparation is in progress...");
        iceCreamMaker.prepareIceCream();
    }
}
