package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(50,50,200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        f.setContentPane(mainPanel);

        mainPanel.add(
                new JLabel("Full Name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));mainPanel.add(
                new JLabel("Address"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        mainPanel.add(
                new JLabel("Phone"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        mainPanel.add(
                new JLabel("Description"),
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        4,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));

        mainPanel.add(
                new TextArea(),
                new GridBagConstraints(
                        1,
                        0,
                        4,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        mainPanel.add(
                new JLabel("Street"),
                new GridBagConstraints(
                        1,
                        1,
                        2,
                        1,
                        2,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        mainPanel.add(
                new JLabel("City"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        mainPanel.add(
                new JLabel("Zip Code"),
                new GridBagConstraints(
                        3,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        mainPanel.add(
                new TextArea(),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        mainPanel.add(
                new JLabel(),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));









        f.repaint();
        f.revalidate();
    }
}