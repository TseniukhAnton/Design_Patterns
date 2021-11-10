package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TranslatorFactory {
    private static final Map<String, Translator> translators = new HashMap<>();

    public Translator getTranslatorByLanguage(String language) {
        Translator translator = translators.get(language);

        if (translator == null) {
            switch (language) {
                case "english":
                    System.out.println("Hiring English translator...");
                    translator = new EnglishTranslator();
                    break;
                case "german":
                    System.out.println("Hiring German translator...");
                    translator = new GermanTranslator();
            }
            translators.put(language, translator);
        }
        return translator;
    }
}
