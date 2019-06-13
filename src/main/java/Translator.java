import com.google.cloud.translate.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Translator {

    private static final String API_KEY = "AIzaSyAqGKOFzgCbvtZZvGnf4zzi5TSOP-EUZTY";

    public static void main(String[] args) {
        Translate translate = TranslateOptions.newBuilder().setApiKey(API_KEY).build().getService();

        List<String> texts = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        texts.add(scanner.nextLine());

        List<Detection> detections = translate.detect(texts);
        Detection detection = detections.get(0);

        List<Translation> translations = translate.translate(texts,
                Translate.TranslateOption.sourceLanguage(detection.getLanguage()),
                Translate.TranslateOption.targetLanguage("de"));

        Translation translation = translations.get(0);
        System.out.println(translation.getTranslatedText());

    }
}
