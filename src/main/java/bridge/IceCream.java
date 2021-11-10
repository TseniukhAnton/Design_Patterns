package bridge;

public abstract class IceCream {
    protected IceCreamMaker iceCreamMaker;

    protected IceCream(IceCreamMaker iceCreamMaker) {
        this.iceCreamMaker = iceCreamMaker;
    }

    public abstract void makeIceCream();
}
