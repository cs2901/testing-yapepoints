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
    JScrollPane englishPanel, russianPanel, frenchPanel, arabianPanel,germanPanel;
    JTextArea textArea, englishArea, russianArea, frenchArea, arabianArea,germanArea;
    JButton translateButton;
    String text;
    Translator translator = new Translator();
    public TranslatorGUI() {
        f = new JFrame("YapePoint translator");
        englishArea = new JTextArea("English", 20, 20);
        russianArea = new JTextArea("Russian", 20, 20);
        frenchArea = new JTextArea("French", 20, 20);
        arabianArea = new JTextArea("Árabe", 20, 20);
        germanArea = new JTextArea("German", 20, 20);

        textArea = new JTextArea("Ingrese su texto", 20, 20);

        englishPanel = new JScrollPane(englishArea);
        russianPanel = new JScrollPane(russianArea);
        frenchPanel = new JScrollPane(frenchArea);
        arabianPanel = new JScrollPane(arabianArea);
        germanPanel = new JScrollPane(germanArea);


        JPanel translatorArea = new JPanel();
        f.getContentPane().add(inputPanel, "West");
        f.getContentPane().add(translatorArea, "East");



        inputPanel.add(textArea);

        translateButton = new JButton("Traducir");
        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea.getText());
                englishArea.setText(textArea.getText());

                ArrayList<String> finalTexts = translator.getTranslations(textArea.getText());

                englishArea.setText("Inglés\n" + finalTexts.get(0));
                russianArea.setText("Ruso\n" + finalTexts.get(1));
                frenchArea.setText("Francés\n" + finalTexts.get(2));
                arabianArea.setText("Árabe\n" + finalTexts.get(3));
                germanArea.setText("Alemán\n" + finalTexts.get(4));

            }
        });

        translatorArea.add(englishPanel);
        translatorArea.add(russianPanel);
        translatorArea.add(frenchPanel);
        translatorArea.add(arabianPanel);
        translatorArea.add(germanPanel);


        f.add(translateButton);

        f.pack();
        f.setVisible(true);
    }

}*/