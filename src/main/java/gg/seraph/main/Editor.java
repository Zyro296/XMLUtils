package gg.seraph.main;

import gg.seraph.ui.MenuBarBuilder;
import gg.seraph.ui.TabSidebarPanel;
import gg.seraph.ui.TextEditorPanel;

import javax.swing.*;
import java.awt.*;

public class Editor extends JFrame {

    public Editor() {
        int width = 800;
        int height = 600;

        setTitle("XMLUtils");
        setSize(width, height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Panels erstellen
        TabSidebarPanel sidebar = new TabSidebarPanel();
        TextEditorPanel editorPanel = new TextEditorPanel();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sidebar, editorPanel);
        add(splitPane, BorderLayout.CENTER);


        // Menüleiste setzen
        MenuBarBuilder menuBarBuilder = new MenuBarBuilder();
        JMenuBar menuBar = menuBarBuilder.build(e -> handleMenuAction(e.getActionCommand()));
        setJMenuBar(menuBar);

        //test2

        setVisible(true);
    }

    private void handleMenuAction(String action) {
        switch (action) {
            case "NEW_FILE":
                System.out.println("Neue Datei erstellen");
                break;
            case "OPEN_FILE":
                System.out.println("Datei öffnen...");
                break;
            case "SAVE_FILE":
                System.out.println("Datei speichern");
                break;
            case "SAVE_AS_FILE":
                System.out.println("Speichern unter...");
                break;
            default:
                System.out.println("Unbekannte Aktion: " + action);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Editor::new);
    }
}
