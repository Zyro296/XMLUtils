# Component: TextEditorPanel

## Zweck
Das `TextEditorPanel` ist die zentrale Komponente zum Anzeigen und Bearbeiten von XML-Dateien im Editor. Es basiert auf einem `JTextPane` und wird später um Funktionen wie Syntax-Highlighting, Formatierung und Validierung erweitert.

## Aufbau

### Klasse: `TextEditorPanel`
Paket: `gg.seraph.xmlutils.ui`

### Struktur:
- `JTextPane textPane` – Der eigentliche Editorbereich
- `JScrollPane` – Damit auch bei langen Dateien gescrollt werden kann

### Methoden:
```java
public String getText()            // Gibt aktuellen Textinhalt zurück
public void setText(String text)   // Setzt Textinhalt in das Panel
public JTextPane getTextPane()     // Gibt Zugriff auf das TextPane-Objekt
```

## Integration

In der Klasse `Editor` wird das Panel wie folgt verwendet:

```java
TextEditorPanel textEditorPanel = new TextEditorPanel();
add(textEditorPanel, BorderLayout.CENTER);
```

## Nächste Schritte
- [x] Grundstruktur mit `JTextPane` implementieren
- [ ] Dateiöffnungsfunktion → Text ins Panel laden
- [ ] Dateispeicherfunktion → Text auslesen
- [ ] Syntax-Highlighting für XML
- [ ] Fehleranzeige (rote Linien, Tooltips etc.)
