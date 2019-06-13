import com.google.cloud.translate.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Translator {

    public static final String API_KEY = "AIzaSyAqGKOFzgCbvtZZvGnf4zzi5TSOP-EUZTY";

    public static void main(String[] args) {
        Translate translate = TranslateOptions.newBuilder().setApiKey(API_KEY).build().getService();

        List<String> texts = new LinkedList<>();
        List<Language> languages = translate.listSupportedLanguages();

        System.out.println("Lenguajes de salida:\n");
        for (Language language : languages) {
            System.out.printf("Nombre: %s, Codigo: %s\n", language.getName(), language.getCode());
        }
        System.out.println("Seleccione el lenguaje de salida:\n");

        Scanner scanner = new Scanner(System.in);
        String endLanguage = scanner.nextLine();

        System.out.println("\nIngrese el texto a traducir:\n");

        scanner = new Scanner(System.in);
        texts.add(scanner.nextLine());

        List<Detection> detections = translate.detect(texts);
        Detection detection = detections.get(0);

        System.out.println(doTranslation(translate, texts, detection, endLanguage));

    }

    public static String doTranslation(Translate translate, List<String> texts, Detection detection, String endLang) {
        List<Translation> translations = translate.translate(texts,
                Translate.TranslateOption.sourceLanguage(detection.getLanguage()),
                Translate.TranslateOption.targetLanguage(endLang));

        Translation translation = translations.get(0);

        return translation.getTranslatedText();
    }
}
