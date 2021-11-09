package prototype;

import java.sql.SQLOutput;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "super", "Sourcecode sourceCode = new SourceCode();");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("=======================================================================================");
        System.out.println(masterClone);
    }
}
