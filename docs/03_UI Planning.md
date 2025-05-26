## UI Layout

### Dialogs
- File open/save
- Preferences/settings
- XPath input/output

## Geplantes Layout

- Oben: klassische Menüleiste (`JMenuBar`)
- Links: vertikale Tab-Leiste mit geöffneten Dateien
- Rechts: Editorbereich (XML TextPane oder ähnlich)
- Aufbau orientiert sich am Zen Browser (vertikale Tabs statt horizontale)

## Komponenten

- MenuBarBuilder → erstellt obere Menüleiste
- FileTabManager → verwaltet vertikale Tabs
- EditorPanel → zeigt den Inhalt des aktiven Dokuments


### Technischer Aufbau
- `JSplitPane` zur Trennung von Sidebar und Editorbereich
