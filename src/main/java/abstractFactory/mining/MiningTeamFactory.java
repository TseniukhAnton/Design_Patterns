package abstractFactory.mining;

import abstractFactory.Engineer;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Seller;
import abstractFactory.Worker;

public class MiningTeamFactory implements ProjectTeamFactory {

    @Override
    public Engineer getEngineer() {
        return new MiningEngineer();
    }

    @Override
    public Worker getWorker() {
        return new MiningWorker();
    }

    @Override
    public Seller getSeller() {
        return new MiningSeller();
    }
}
