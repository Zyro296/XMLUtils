package gg.seraph.ui;

import javax.swing.*;
import java.awt.*;

public class TabSidebarPanel extends JPanel {

    public TabSidebarPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(150,0)); //fixed width sidebar

        //placeholder tabs
        add(createTabButton("file1.xml"));
        add(createTabButton("file.xml"));

    }

    private JButton createTabButton(String name){
        JButton button = new JButton(name);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        return button;
    }

}
