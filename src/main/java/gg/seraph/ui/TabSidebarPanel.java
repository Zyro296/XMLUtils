package gg.seraph.ui;

import javax.swing.*;
import java.awt.*;

public class TabSidebarPanel extends JPanel {

    private final DefaultListModel<String> tabListModel;
    private final JList<String> tabList;

    public TabSidebarPanel() {
        setLayout(new BorderLayout());

        tabListModel = new DefaultListModel<>();
        tabList = new JList<>(tabListModel);
        tabList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(tabList), BorderLayout.CENTER);
    }

    public void addTab(String title) {
        tabListModel.addElement(title);
    }

    public JList<String> getTabList() {
        return tabList;
    }
}
