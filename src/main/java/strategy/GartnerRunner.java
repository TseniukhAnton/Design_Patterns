package strategy;

public class GartnerRunner {
    public static void main(String[] args) {
        Gartner gartner = new Gartner();

        gartner.setActivity(new Dig());
        gartner.executeActivity();

        gartner.setActivity(new Relax());
        gartner.executeActivity();

        gartner.setActivity(new Fly());
        gartner.executeActivity();

        gartner.setActivity(new Compete());
        gartner.executeActivity();

        gartner.setActivity(new Dig());
        gartner.executeActivity();
    }
}
