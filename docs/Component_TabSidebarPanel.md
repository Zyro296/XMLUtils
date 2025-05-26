# Component: TabSidebarPanel

## Zweck
Das `TabSidebarPanel` dient als vertikale Seitenleiste zur Anzeige geöffneter Dateien („Tabs“) im Editor. Es bildet die Grundlage für ein tab-basiertes Arbeiten – ähnlich wie im Zen Browser oder in Obsidian – mit vertikal angeordneten Buttons von oben nach unten.

## Aufbau

### Klasse: `TabSidebarPanel`
Paket: `gg.seraph.xmlutils.ui`

### Struktur:
- `BoxLayout.Y_AXIS` – vertikale Ausrichtung der Tab-Buttons
- Fixe Breite mit `setPreferredSize(new Dimension(150, 0))`
- Platzhalter für erste Buttons („file1.xml“, „file2.xml“)

### Methoden:
```java
private JButton createTabButton(String name)
```
Erstellt einen einfachen JButton für den Tab mit zentraler Ausrichtung.

## Integration

Wird im `Editor` in ein `JSplitPane` eingebunden, z. B.:

```java
TabSidebarPanel sidebar = new TabSidebarPanel();
TextEditorPanel editorPanel = new TextEditorPanel();

JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sidebar, editorPanel);
splitPane.setDividerLocation(150);
add(splitPane, BorderLayout.CENTER);
```

## Nächste Schritte
- [x] Grundstruktur mit Platzhalter-Tabs
- [ ] Aktive Datei markieren
- [ ] Klick auf Tab → Datei anzeigen
- [ ] Rechtsklick-Menü (Schließen, Speichern unter)
- [ ] Tab-Hinzufügen und Entfernen dynamisch
