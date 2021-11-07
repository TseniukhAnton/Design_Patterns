package abstractFactory;

import abstractFactory.mining.MiningTeamFactory;

public class MiningDevelopmentProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new MiningTeamFactory();
        Engineer engineer = projectTeamFactory.getEngineer();
        Worker worker = projectTeamFactory.getWorker();
        Seller seller = projectTeamFactory.getSeller();

        System.out.println("Starting new mining project");
        engineer.createProject();
        worker.buildHouse();
        seller.sellProject();
    }
}
