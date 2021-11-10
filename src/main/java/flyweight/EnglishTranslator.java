package flyweight;

public class EnglishTranslator implements Translator{
    @Override
    public void translate() {
        System.out.println("English translator translates english language...");
    }
}
