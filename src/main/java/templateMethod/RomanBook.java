package templateMethod;

public class RomanBook extends BookTemplate{
    @Override
    public void showBookText(){
        System.out.println("Roman");
    }
}
