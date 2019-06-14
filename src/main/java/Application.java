import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Language;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*Translator translator = new Translator();

        //List<Language> languages = translator.translate.listSupportedLanguages();

        System.out.println("\nIngrese el texto a traducir:\n");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        ArrayList<String> finalTexts = translator.getTranslations(text);

        for (String fin : finalTexts) {
            System.out.println(fin);
            System.out.println("\n");
        }*/

        TranslatorGUI gui = new TranslatorGUI();


    }

}
