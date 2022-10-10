package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        JPanel panelNorth = new JPanel();
        mainPanel.add(panelNorth,BorderLayout.NORTH);

        JLabel labelJlist = new JLabel("JList");
        labelJlist.setBorder(BorderFactory.
                createTitledBorder(
                        BorderFactory.createLoweredBevelBorder()));
        labelJlist.setFont(new Font("Calibri",Font.PLAIN,20));
        panelNorth.add(labelJlist,BorderLayout.CENTER);
        labelJlist.setPreferredSize(new Dimension(120,50));
        labelJlist.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelSouth = new JPanel(new BorderLayout());
        mainPanel.add(panelSouth,BorderLayout.SOUTH);

        JLabel labelSouth = new JLabel("Se agregó un nuevo elemento");

        labelSouth.setBorder(BorderFactory.
                createTitledBorder(
                        BorderFactory.createEmptyBorder()));;
        panelSouth.add(labelSouth,BorderLayout.NORTH);


        JPanel panelCenter = new JPanel(new BorderLayout());
        mainPanel.add(panelCenter,BorderLayout.CENTER);

        JPanel panelCenterTop = new JPanel();
        panelCenter.add(panelCenterTop,BorderLayout.NORTH);
        JTextField textField = new JTextField(20);
        panelCenterTop.add(textField);
        JButton addBotom = new JButton("Agregar");
        addBotom.addActionListener(actionEvent -> {

        });
        panelCenterTop.add(addBotom);

        JPanel panelCenterMid = new JPanel(new BorderLayout());
        panelCenter.add(panelCenterMid,BorderLayout.CENTER);
        DefaultListModel<String> dlm = new DefaultListModel<>();
        JList<String> jlist = new JList<>();

        jlist.setModel(dlm);

        dlm.addElement("Cristian David");
        dlm.addElement("Ana Milena");
        dlm.addElement("Miguel Angel");
        dlm.addElement("CoDejaVu");
        panelCenterMid.add(new JScrollPane(jlist),BorderLayout.CENTER);

        JPanel panelCenterBot = new JPanel();
        panelCenter.add(panelCenterBot,BorderLayout.SOUTH);
        JButton eliminar = new JButton("Eliminar");
        JButton borrar = new JButton("Borrar");
        panelCenterBot.add(eliminar);
        panelCenterBot.add(borrar);







        f.repaint();
        f.revalidate();






    }
}