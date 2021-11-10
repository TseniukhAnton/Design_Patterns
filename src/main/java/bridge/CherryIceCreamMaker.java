package bridge;

public class CherryIceCreamMaker implements IceCreamMaker{
    @Override
    public void prepareIceCream() {
        System.out.println("Cherry IceCream maker makes IceCream with cherry...");
    }
}
