package factory;

public class Dog implements Animal{
    @Override
    public void makeNoise(){
        System.out.println("I can bark");
    }
}
