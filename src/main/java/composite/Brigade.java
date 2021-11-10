package composite;

import java.util.ArrayList;
import java.util.List;

public class Brigade {
    private List<BlueWorker> blueWorkers = new ArrayList<>();

    public void addBlueWorker(BlueWorker blueWorker) {
        blueWorkers.add(blueWorker);
    }

    public void removeBlueWorker(BlueWorker blueWorker) {
        blueWorkers.remove(blueWorker);
    }

    public void startConstruction(){
        System.out.println("Brigade builds a construction...\n");
        for (BlueWorker blueWorker : blueWorkers){
            blueWorker.doJob();
        }
    }
}
