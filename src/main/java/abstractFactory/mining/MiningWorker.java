package abstractFactory.mining;

import abstractFactory.Worker;

public class MiningWorker implements Worker {
    @Override
    public void buildHouse() {
        System.out.println("Mining worker builds houses for mining ");
    }
}
