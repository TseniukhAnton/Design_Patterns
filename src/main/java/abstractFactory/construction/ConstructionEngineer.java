package abstractFactory.construction;

import abstractFactory.Engineer;

public class ConstructionEngineer implements Engineer {
    @Override
    public void createProject() {
        System.out.println("Engineer draws a house project...");
    }
}
