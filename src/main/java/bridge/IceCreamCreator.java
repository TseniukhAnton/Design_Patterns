package bridge;

import java.util.Arrays;

public class IceCreamCreator {
    public static void main(String[] args) {
        IceCream [] iceCreams = {
                new Supermarket(new ChocoIceCreamMaker()),
                new Home(new CherryIceCreamMaker())
        };

        for (IceCream iceCream: iceCreams){
            iceCream.makeIceCream();
        }
    }
}
