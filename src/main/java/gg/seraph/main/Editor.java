package gg.seraph.main;

import gg.seraph.controller.EditorController;
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

        // Panels erstellen
        TabSidebarPanel sidebar = new TabSidebarPanel();
        TextEditorPanel editorPanel = new TextEditorPanel();

        // Controller initialisieren
        EditorController controller = new EditorController(editorPanel, sidebar);

        // SplitPane hinzufügen
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sidebar, editorPanel);
        splitPane.setDividerLocation(150); // Sidebar-Breite
        add(splitPane, BorderLayout.CENTER);

        // Menüleiste setzen
        MenuBarBuilder menuBarBuilder = new MenuBarBuilder();
        JMenuBar menuBar = menuBarBuilder.build(e -> controller.handleAction(e.getActionCommand()));
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Editor::new);
    }
}
