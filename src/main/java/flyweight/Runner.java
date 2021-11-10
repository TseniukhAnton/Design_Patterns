package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TranslatorFactory translatorFactory = new TranslatorFactory();

        List<Translator> translators = new ArrayList<>();

        translators.add(translatorFactory.getTranslatorByLanguage("english"));
        translators.add(translatorFactory.getTranslatorByLanguage("english"));
        translators.add(translatorFactory.getTranslatorByLanguage("english"));
        translators.add(translatorFactory.getTranslatorByLanguage("english"));
        translators.add(translatorFactory.getTranslatorByLanguage("english"));
        translators.add(translatorFactory.getTranslatorByLanguage("english"));
        translators.add(translatorFactory.getTranslatorByLanguage("german"));
        translators.add(translatorFactory.getTranslatorByLanguage("german"));
        translators.add(translatorFactory.getTranslatorByLanguage("german"));
        translators.add(translatorFactory.getTranslatorByLanguage("german"));
        translators.add(translatorFactory.getTranslatorByLanguage("german"));
        translators.add(translatorFactory.getTranslatorByLanguage("german"));

        for (Translator translator : translators){
            translator.translate();
        }
    }
}
