import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Language;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Translator translator = new Translator();

        //List<String> texts = new LinkedList<>();
        List<Language> languages = translator.translate.listSupportedLanguages();

        /*System.out.println("Lenguajes de salida:\n");
        for (Language language : languages) {
            System.out.printf("Nombre: %s, Codigo: %s\n", language.getName(), language.getCode());
        }

        System.out.println("Seleccione el lenguaje de salida:\n");

        Scanner scanner = new Scanner(System.in);
        String endLanguage = scanner.nextLine();*/

        System.out.println("\nIngrese el texto a traducir:\n");

        Scanner scanner = new Scanner(System.in);
        //texts.add(scanner.nextLine());
        String text = scanner.nextLine();

        /*List<Detection> detections = translator.translate.detect(texts);
        Detection detection = detections.get(0);

        System.out.println(translator.doTranslation(translator.translate, texts, detection, endLanguage));*/

        ArrayList<String> finalTexts = translator.getTranslations(text);

        for (String fin : finalTexts) {
            System.out.println(fin);
            System.out.println("\n");
        }

    }

}
