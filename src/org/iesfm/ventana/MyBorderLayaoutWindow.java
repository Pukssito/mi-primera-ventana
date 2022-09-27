package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class MyBorderLayaoutWindow {

    public static void main(String[] args) {

        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setBounds(50,50,500,120);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        BorderLayout borderLayout = new BorderLayout(10,10);
        panelPrincipal.setLayout(borderLayout);

        ventanaPrincipal.add(panelPrincipal);

        JButton boton = new JButton("Norte");
        JButton boton2 = new JButton("Sur");
        JButton boton3 = new JButton("Este");
        JButton boton4 = new JButton("Oeste");
        JButton boton5 = new JButton("Centro");



        panelPrincipal.add(boton, BorderLayout.NORTH);
        boton.addActionListener(actionEvent -> {
            boton.setVisible(false);
        });

        panelPrincipal.add(boton2, BorderLayout.SOUTH);
        boton2.addActionListener(actionEvent -> {
            boton2.setVisible(false);
        });
        panelPrincipal.add(boton3, BorderLayout.EAST);
        boton3.addActionListener(actionEvent -> {
            boton3.setVisible(false);
        });
        panelPrincipal.add(boton4, BorderLayout.WEST);
        boton4.addActionListener(actionEvent -> {
            boton4.setVisible(false);
        });
        panelPrincipal.add(boton5, BorderLayout.CENTER);
        boton5.addActionListener(actionEvent -> {
            boton5.setVisible(false);
        });



        ventanaPrincipal.repaint();
        ventanaPrincipal.revalidate();

    }

}
