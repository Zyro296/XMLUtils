package gg.seraph.ui;

import javax.swing.*;
import java.awt.*;

public class TextEditorPanel extends JPanel {

    private final JTextPane textpane;

    public TextEditorPanel() {
        setLayout(new BorderLayout());

        textpane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(textpane);

        add(scrollPane, BorderLayout.CENTER);

    }

    public JTextPane getTextpane() {
        return textpane;
    }

    public void setText(String text){
        textpane.setText(text);
    }

    public String getText(){
        return textpane.getText();
    }

}
