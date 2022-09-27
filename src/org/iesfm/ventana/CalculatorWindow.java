package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {


    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Calculadora");
        f.setBounds(50,50,500,120);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        BorderLayout borderLayout = new BorderLayout(10,10);
        panelPrincipal.setLayout(borderLayout);
        f.add(panelPrincipal);

        JPanel panelText= new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);
        panelText.setLayout(fl);
        panelPrincipal.add(panelText, BorderLayout.NORTH);

        JPanel panelGrid = new JPanel();
        GridLayout gl = new GridLayout(5,4,10,10);
        panelGrid.setLayout(gl);
        panelPrincipal.add(panelGrid, BorderLayout.CENTER);




        JTextField text = new JTextField(40);
        panelText.add(text);
        panelText.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));



        JButton boton1 = new JButton("Rtc");
        JButton boton2 = new JButton("CE");
        JButton boton3 = new JButton("CL");
        JButton boton4 = new JButton("+/-");
        JButton boton5 = new JButton("7");
        JButton boton6 = new JButton("8");
        JButton boton7 = new JButton("9");
        JButton boton8 = new JButton("/");
        JButton boton9 = new JButton("4");
        JButton boton10 = new JButton("5");
        JButton boton11 = new JButton("6");
        JButton boton12 = new JButton("x");
        JButton boton13 = new JButton("1");
        JButton boton14 = new JButton("2");
        JButton boton15 = new JButton("3");
        JButton boton16 = new JButton("-");
        JButton boton17 = new JButton("0");
        JButton boton18 = new JButton(".");
        JButton boton19 = new JButton("=");
        JButton boton20 = new JButton("+");


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
        panelGrid.add(boton17);
        panelGrid.add(boton18);
        panelGrid.add(boton19);
        panelGrid.add(boton20);




        f.repaint();
        f.revalidate();


    }
}
