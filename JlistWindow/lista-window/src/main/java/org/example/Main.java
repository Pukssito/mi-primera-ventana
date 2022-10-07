package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("CoDejaVu : Jlist");
        f.setBounds(200,200,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        f.add(mainPanel);

        JPanel panelNorth = new JPanel(new BorderLayout());
        mainPanel.add(panelNorth,BorderLayout.NORTH);

        JLabel labelJlist = new JLabel("JList");
        labelJlist.setBorder(BorderFactory.
                createTitledBorder(
                        BorderFactory.createBevelBorder(0)));

        panelNorth.add(labelJlist,BorderLayout.CENTER);

        JPanel panelSouth = new JPanel(new BorderLayout());
        mainPanel.add(panelSouth,BorderLayout.SOUTH);

        JLabel labelSouth = new JLabel("Se agregó un nuevo elemento");
        //labelSouth.setVisible(true);
        labelSouth.setBorder(BorderFactory.
                createTitledBorder(
                        BorderFactory.createEmptyBorder()));;
        panelSouth.add(labelJlist,BorderLayout.CENTER);


        JPanel panelCenter = new JPanel(new BorderLayout());
        mainPanel.add(panelCenter,BorderLayout.CENTER);

        JPanel panelCenterTop = new JPanel(new BorderLayout());
        panelCenter.add(panelCenterTop,BorderLayout.NORTH);
        JPanel panelCenterMid = new JPanel(new BorderLayout());
        panelCenter.add(panelCenterMid,BorderLayout.CENTER);
        JPanel panelCenterBot = new JPanel(new BorderLayout());
        panelCenter.add(panelCenterBot,BorderLayout.SOUTH);

        JTextField textField = new JTextField();
        panelCenterTop.add(textField);
        JButton addBotom = new JButton("Agregar");
        panelCenterTop.add(addBotom);



        f.repaint();
        f.revalidate();






    }
}