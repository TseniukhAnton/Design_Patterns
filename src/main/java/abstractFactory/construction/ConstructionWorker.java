package abstractFactory.construction;

import abstractFactory.Worker;

public class ConstructionWorker implements Worker {
    @Override
    public void buildHouse() {
        System.out.println("Worker builds a house...");
    }
}
