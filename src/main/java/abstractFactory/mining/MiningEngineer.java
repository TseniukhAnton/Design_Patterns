package abstractFactory.mining;

import abstractFactory.Engineer;

public class MiningEngineer implements Engineer {
    @Override
    public void createProject() {
        System.out.println("Mining engineer draws mining constructions");
    }
}
