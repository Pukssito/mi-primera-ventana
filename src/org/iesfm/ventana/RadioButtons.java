package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class RadioButtons {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("RadioButtons");
        f.setVisible(true);
        f.setBounds(10,10,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
        mainPanel.setBounds(10,10,200,200);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.gray);

        JRadioButton rb1 = new JRadioButton("Opcion 1");
        mainPanel.add(rb1);
        JRadioButton rb2 = new JRadioButton("Opcion 2");
        mainPanel.add(rb2);
        JRadioButton rb3 = new JRadioButton("Opcion 3");
        mainPanel.add(rb3);
        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
        f.pack();

    }
}
