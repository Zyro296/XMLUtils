package gg.seraph.ui;

import javax.swing.*;
import java.awt.*;

public class TextEditorPanel extends JPanel {

    private final JTextArea textArea;

    public TextEditorPanel() {
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void setText(String content) {
        textArea.setText(content);
    }

    public String getText() {
        return textArea.getText();
    }
}
