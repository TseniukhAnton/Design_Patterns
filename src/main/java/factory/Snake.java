package factory;

public class Snake implements Animal{
    @Override
    public void makeNoise(){
        System.out.println("I can crawl and sting");
    }
}
