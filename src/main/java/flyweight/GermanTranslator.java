package flyweight;

public class GermanTranslator implements Translator{
    @Override
    public void translate() {
        System.out.println("German translator translates german language...");
    }
}
