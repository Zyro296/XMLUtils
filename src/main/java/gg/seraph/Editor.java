package gg.seraph;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Editor {
    public static void main(String[] args) {

        int width = 800;
        int height = 600;

        //create a window
        JFrame frame = new JFrame("XMLUtils");
        frame.setSize(width, height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}