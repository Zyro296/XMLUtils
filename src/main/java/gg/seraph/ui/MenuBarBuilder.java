package gg.seraph.ui;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuBarBuilder {

    public JMenuBar build(ActionListener fileActionListener) {

        JMenuBar menuBar = new JMenuBar();

        //Datei Menü
        JMenu fileMenu = new JMenu("Datei");
        JMenuItem newItem = new JMenuItem("neu");
        newItem.setActionCommand("NEW_FILE");
        newItem.addActionListener(fileActionListener);

        JMenuItem openItem = new JMenuItem("öffnen");
        openItem.setActionCommand("OPEN_FILE");
        openItem.addActionListener(fileActionListener);

        JMenuItem saveItem = new JMenuItem("Speichern");
        saveItem.setActionCommand("SAVE_FILE");
        saveItem.addActionListener(fileActionListener);

        JMenuItem saveAsItem = new JMenuItem("Speichern unter");
        saveAsItem.setActionCommand("SAVE_AS_FILE");
        saveAsItem.addActionListener(fileActionListener);


        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);

        menuBar.add(fileMenu);

        return menuBar;
    }

}
