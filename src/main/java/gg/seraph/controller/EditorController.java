package gg.seraph.controller;

import gg.seraph.ui.TabSidebarPanel;
import gg.seraph.ui.TextEditorPanel;

import java.util.LinkedHashMap;
import java.util.Map;

public class EditorController {

    private final TextEditorPanel editorPanel;
    private final TabSidebarPanel sidebar;
    private final Map<String, String> tabContents = new LinkedHashMap<>();
    private int untitledCounter = 1;

    public EditorController(TextEditorPanel editorPanel, TabSidebarPanel sidebar) {
        this.editorPanel = editorPanel;
        this.sidebar = sidebar;

        sidebar.getTabList().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selected = sidebar.getTabList().getSelectedValue();
                if (selected != null && tabContents.containsKey(selected)) {
                    editorPanel.setText(tabContents.get(selected));
                }
            }
        });
    }

    public void handleAction(String action) {
        switch (action) {
            case "NEW_FILE" -> createNewFile();
            case "OPEN_FILE" -> System.out.println("Datei öffnen...");
            case "SAVE_FILE" -> saveCurrentFile();
            case "SAVE_AS_FILE" -> System.out.println("Speichern unter...");
            default -> System.out.println("Unbekannte Aktion: " + action);
        }
    }

    private void createNewFile() {
        String title = "Unbenannt " + untitledCounter++;
        tabContents.put(title, "");
        sidebar.addTab(title);
        sidebar.getTabList().setSelectedValue(title, true);
    }

    private void saveCurrentFile() {
        String current = sidebar.getTabList().getSelectedValue();
        if (current != null) {
            tabContents.put(current, editorPanel.getText());
            System.out.println("Gespeichert: " + current);
        }
    }
}
