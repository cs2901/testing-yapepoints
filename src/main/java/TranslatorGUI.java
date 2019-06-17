/*import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class TranslatorGUI {
    private JFrame f;
    JPanel inputPanel = new JPanel();
    JList lista;
    Vector paginas;
    JScrollPane englishPanel;
    JTextArea textArea, englishArea;
    JButton translateButton;
    String text;
<<<<<<< HEAD
    Translator translator = new Translator();
=======
    String traslate_to_language = "English";
    String traslate_to_code = "en";
    String[] languages = new String[] {"Español", "Inglés", "Ruso"};
    String[] languages_codes = new String[] {"es", "en", "ru"};


>>>>>>> leonidas
    public TranslatorGUI() {
        f = new JFrame("YapePoint translator");
        englishArea = new JTextArea("English", 20, 20);

        textArea = new JTextArea("Ingrese su texto", 20, 20);
        englishPanel = new JScrollPane(englishArea);

        JComboBox<String> to_language = new JComboBox<>(languages);
        to_language.setSelectedIndex(0);

        to_language.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JComboBox cb = (JComboBox)actionEvent.getSource();
                Integer index = (Integer) cb.getSelectedIndex();
                traslate_to_language = languages[index];
                traslate_to_code = languages_codes[index];
                System.out.println(traslate_to_language);
                System.out.println(traslate_to_code);
            }
        });

        JPanel translatorArea = new JPanel();
        f.getContentPane().add(inputPanel, "West");
        f.getContentPane().add(translatorArea, "East");
        f.getContentPane().add(to_language, "North");

        inputPanel.add(textArea);

        translateButton = new JButton("Traducir");
        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea.getText());
                englishArea.setText(textArea.getText());

                ArrayList<String> finalTexts = translator.getTranslations(textArea.getText());

                englishArea.setText(traslate_to_language + " " + finalTexts.get(0));

            }
        });

        translatorArea.add(englishPanel);

        f.add(translateButton);

        f.pack();
        f.setVisible(true);
    }

}*/