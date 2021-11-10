package composite;

public class Plumber implements BlueWorker {
    @Override
    public void doJob() {
        System.out.println("Plumber makes tubes work...");
    }
}
