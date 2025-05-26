## Architecture

### Design
- MVC-style separation
- UI triggers controller actions
- Logic in separate classes (e.g., validator, formatter)

### Persistence
- XML files saved directly
- Settings in `.json` or `.properties`


### UI-Komposition
Die Komponenten werden im `Editor` mit einem `JSplitPane` zusammengesetzt:
- Linke Komponente: `TabSidebarPanel`
- Rechte Komponente: `TextEditorPanel`
