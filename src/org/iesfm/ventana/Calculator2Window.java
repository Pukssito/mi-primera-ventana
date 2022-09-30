package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class Calculator2Window {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Calculadora");
        f.setBounds(50,50,600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        BorderLayout borderLayout = new BorderLayout(10,10);
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        panelPrincipal.setOpaque(false);
        panelPrincipal.setLayout(borderLayout);
        f.add(panelPrincipal);

        JPanel panelText = new JPanel();
        panelPrincipal.add(panelText, BorderLayout.NORTH);

        JTextField texto = new JTextField("0",50);
        texto.setHorizontalAlignment(JTextField.RIGHT);
        panelText.add(texto);
        panelText.setLayout(new FlowLayout(FlowLayout.CENTER));


        JPanel panelBotones = new JPanel();
        BorderLayout bl = new BorderLayout(10,10);
        panelBotones.setLayout(bl);
        panelBotones.setOpaque(false);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);

        JPanel panelGrid = new JPanel();
        GridLayout gl = new GridLayout(4,4,10,10);
        panelGrid.setLayout(gl);
        panelGrid.setOpaque(false);
        panelBotones.add(panelGrid,BorderLayout.CENTER);

        JButton boton1 = new JButton("7");
        JButton boton2 = new JButton("8");
        JButton boton3 = new JButton("9");
        JButton boton4 = new JButton("DEL");
        JButton boton5 = new JButton("4");
        JButton boton6 = new JButton("5");
        JButton boton7 = new JButton("6");
        JButton boton8 = new JButton("+");
        JButton boton9 = new JButton("1");
        JButton boton10 = new JButton("2");
        JButton boton11 = new JButton("3");
        JButton boton12 = new JButton("-");
        JButton boton13 = new JButton(".");
        JButton boton14 = new JButton("0");
        JButton boton15 = new JButton("/");
        JButton boton16 = new JButton("x");

        panelGrid.add(boton1);
        panelGrid.add(boton2);
        panelGrid.add(boton3);
        panelGrid.add(boton4);
        panelGrid.add(boton5);
        panelGrid.add(boton6);
        panelGrid.add(boton7);
        panelGrid.add(boton8);
        panelGrid.add(boton9);
        panelGrid.add(boton10);
        panelGrid.add(boton11);
        panelGrid.add(boton12);
        panelGrid.add(boton13);
        panelGrid.add(boton14);
        panelGrid.add(boton15);
        panelGrid.add(boton16);

        boton4.setForeground(white);
        boton4.setBackground(new Color(0,128,128));

        JPanel panelGrid2 = new JPanel();
        GridLayout gl2 = new GridLayout(1,0,10,10);
        panelGrid2.setLayout(gl2);
        panelGrid2.setOpaque(false);
        panelGrid2.setPreferredSize(new Dimension(0,75)); //para redimensionar el panel
        panelBotones.add(panelGrid2, BorderLayout.SOUTH);


        JButton botonReset = new JButton("RESET");
        JButton botonIgual = new JButton("=");

        botonReset.setForeground(white);
        botonReset.setBackground(new Color(0,128,128));

        botonIgual.setForeground(white);
        botonIgual.setBackground(red);

        panelGrid2.add(botonReset);
        panelGrid2.add(botonIgual);






        f.repaint();
        f.revalidate();

    }
}
