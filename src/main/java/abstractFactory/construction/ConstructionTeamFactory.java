package abstractFactory.construction;

import abstractFactory.Engineer;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Seller;
import abstractFactory.Worker;

public class ConstructionTeamFactory implements ProjectTeamFactory {
    @Override
    public Engineer getEngineer() {
        return new ConstructionEngineer();
    }

    @Override
    public Worker getWorker() {
        return new ConstructionWorker();
    }

    @Override
    public Seller getSeller() {
        return new HouseSeller();
    }
}
