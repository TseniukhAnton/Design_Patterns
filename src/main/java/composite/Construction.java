package composite;

public class Construction {
    public static void main(String[] args) {
        Brigade brigade = new Brigade();

        BlueWorker firstPlumber = new Plumber();
        BlueWorker secondPlumber = new Plumber();
        BlueWorker roofer = new Roofer();

        brigade.addBlueWorker(firstPlumber);
        brigade.addBlueWorker(secondPlumber);
        brigade.addBlueWorker(roofer);

        brigade.startConstruction();
    }
}
