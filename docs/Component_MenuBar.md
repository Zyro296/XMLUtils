# Component: MenuBar

## Zweck
Die `MenuBarBuilder`-Komponente erstellt die Menüleiste für die Anwendung `XMLUtils`. Sie beinhaltet zentrale Dateioperationen und ermöglicht eine einfache Erweiterung durch neue Menüpunkte.

## Aufbau

### Klasse: `MenuBarBuilder`
Paket: `gg.seraph.ui`

```java
public JMenuBar build(ActionListener fileActionListener)
```

Diese Methode erstellt eine neue Menüleiste (`JMenuBar`) mit dem Menü **Datei**, welches folgende Einträge enthält:

- **Neu** (`NEW_FILE`)
- **Öffnen...** (`OPEN_FILE`)
- **Speichern** (`SAVE_FILE`)
- **Speichern unter...** (`SAVE_AS_FILE`)

Jeder Menüeintrag wird mit einem `ActionListener` verknüpft, dessen Command-String im übergebenen `fileActionListener` gesetzt wird.

## Integration in `Editor`
In der Klasse `Editor` (die von `JFrame` erbt) wird `MenuBarBuilder` wie folgt verwendet:

```java
MenuBarBuilder menuBarBuilder = new MenuBarBuilder();
JMenuBar menuBar = menuBarBuilder.build(e -> handleMenuAction(e.getActionCommand()));
setJMenuBar(menuBar);
```

Die Aktion wird dann in der Methode `handleMenuAction(String action)` verarbeitet.

## Nächste Schritte
- [x] Menüstruktur erstellen
- [x] ActionListener anbinden
- [ ] XML-Funktionen einbauen (z. B. Datei öffnen/speichern)
- [ ] Tastenkürzel definieren
