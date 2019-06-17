import com.google.cloud.translate.*;

import java.util.*;

public class Translator {

    private static final String API_KEY = "AIzaSyAqGKOFzgCbvtZZvGnf4zzi5TSOP-EUZTY";
    public Translate translate;

    //private ArrayList<String> languages = new ArrayList<>();
    //private ArrayList<String> languages_code = new ArrayList<>();

    public Translator() {
        translate = TranslateOptions.newBuilder().setApiKey(API_KEY).build().getService();
        /*languages.add("Inglés");
        languages.add("Ruso");
        languages.add("Francés");
        languages.add("Árabe");
        languages.add("Alemán");
        languages_code.add("en");
        languages_code.add("ru");
        languages_code.add("fr");
        languages_code.add("ar");
        languages_code.add("de");*/
    }

    public String doTranslation(Translate translate, List<String> texts, Detection detection, String outputLang) {
        List<Translation> translations = translate.translate(texts,
                Translate.TranslateOption.sourceLanguage(detection.getLanguage()),
                Translate.TranslateOption.targetLanguage(outputLang));

        Translation translation = translations.get(0);

        return translation.getTranslatedText();
    }


    public String getTranslations(String text) {

        Detection detection = translate.detect(text);

        List<String> texts = new LinkedList<>();
        texts.add(text);

        System.out.println("Ingrese el código del lenguaje de salida:\n");

        Scanner scanner = new Scanner(System.in);
        String outputLang = scanner.nextLine();

        return doTranslation(translate, texts, detection, outputLang);

    }


}
