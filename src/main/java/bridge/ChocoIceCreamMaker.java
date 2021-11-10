package bridge;

public class ChocoIceCreamMaker implements IceCreamMaker{
    @Override
    public void prepareIceCream() {
        System.out.println("Choco IceCream maker prepares IceCream with chocolate...");
    }
}
