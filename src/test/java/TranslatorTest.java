import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translation;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {
    @Test
    public void testTranslateTextList(Translate translate) {
        List<String> texts = new LinkedList<>();
        texts.add("Hello, World!");
        texts.add("¡Hola Mundo!");
        List<Translation> translations = translate.translate(texts);

        Translation translation = translations.get(0);
        assertEquals("Hello, World!", translation.getTranslatedText());
        assertEquals("en", translation.getSourceLanguage());
        translation = translations.get(1);
        assertEquals("Hello World!", translation.getTranslatedText());
        assertEquals("es", translation.getSourceLanguage());
    }
}
