package state;

public class GartnerWork {
    public static void main(String[] args) {
        Activity activity = new Dig();
        Gartner gartner = new Gartner();

        gartner.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            gartner.process();
            gartner.changeActivity();
        }
    }
}
