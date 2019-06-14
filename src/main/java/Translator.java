import com.google.cloud.translate.*;

import java.util.*;

public class Translator {

    private static final String API_KEY = "AIzaSyAqGKOFzgCbvtZZvGnf4zzi5TSOP-EUZTY";
    public Translate translate;

    private ArrayList<String> languages = new ArrayList<>();
    private ArrayList<String> languages_code = new ArrayList<>();

    public Translator() {
        translate = TranslateOptions.newBuilder().setApiKey(API_KEY).build().getService();
        languages.add("Inglés");
        languages.add("Ruso");
        languages.add("Francés");
        languages.add("Árabe");
        languages.add("Alemán");
        languages_code.add("en");
        languages_code.add("ru");
        languages_code.add("fr");
        languages_code.add("ar");
        languages_code.add("de");
    }

    public String doTranslation(Translate translate, List<String> texts, Detection detection, String endLang) {
        List<Translation> translations = translate.translate(texts,
                Translate.TranslateOption.sourceLanguage(detection.getLanguage()),
                Translate.TranslateOption.targetLanguage(endLang));

        Translation translation = translations.get(0);

        return translation.getTranslatedText();
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public ArrayList<String> getTranslations(String text) {
        Detection detection = translate.detect(text);

        List<String> texts = new LinkedList<>();
        texts.add(text);

        ArrayList<String> endTexts = new ArrayList<>();

        for (String language : languages_code ) {
            String translation = doTranslation(translate, texts, detection, language);
            endTexts.add(translation);
        }

        return endTexts;

    }


}
