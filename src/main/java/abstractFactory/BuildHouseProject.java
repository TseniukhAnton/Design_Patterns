package abstractFactory;

import abstractFactory.construction.ConstructionTeamFactory;

public class BuildHouseProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new ConstructionTeamFactory();
        Engineer engineer = projectTeamFactory.getEngineer();
        Worker worker = projectTeamFactory.getWorker();
        Seller seller = projectTeamFactory.getSeller();

        System.out.println("Building our new house");
        engineer.createProject();
        worker.buildHouse();
        seller.sellProject();
    }
}
