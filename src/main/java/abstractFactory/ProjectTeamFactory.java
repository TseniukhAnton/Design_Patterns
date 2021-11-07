package abstractFactory;

public interface ProjectTeamFactory {
    Engineer getEngineer();
    Worker getWorker();
    Seller getSeller();
}
