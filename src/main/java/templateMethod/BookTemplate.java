package templateMethod;

public abstract class BookTemplate {
    public void readBook(){
        System.out.println("Name");
        System.out.println("Content");
        showBookText();
    }

    public abstract void showBookText();
}
