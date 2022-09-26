package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class MyBorderLayaoutWindow {

    public static void main(String[] args) {

        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setBounds(50,50,500,120);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();

        BorderLayout layout = (BorderLayout) panelPrincipal.getLayout();
        layout.setHgap(10);
        layout.setVgap(10);

        ventanaPrincipal.add(panelPrincipal);

        JButton boton = new JButton("Norte");
        JButton boton2 = new JButton("Sur");
        JButton boton3 = new JButton("Este");
        JButton boton4 = new JButton("Oeste");
        JButton boton5 = new JButton("Centro");



        panelPrincipal.add(boton, BorderLayout.NORTH);
        panelPrincipal.add(boton2, BorderLayout.SOUTH);
        panelPrincipal.add(boton3, BorderLayout.EAST);
        panelPrincipal.add(boton4, BorderLayout.WEST);
        panelPrincipal.add(boton5, BorderLayout.CENTER);



        ventanaPrincipal.repaint();
        ventanaPrincipal.revalidate();

    }

}
