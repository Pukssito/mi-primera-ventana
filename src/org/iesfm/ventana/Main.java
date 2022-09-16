package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /*JFrame f = new JFrame(); // creating instance of JFrame
        f.setTitle("Panel Redondeado");
        f.setBounds(10,10,400,400); //establece el tamaño de la ventana
        f.setVisible(true); //hace visible la ventana
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra la ventana
        //este es el mainPanel que contiene los botones
        JPanel mainPanel = new JPanel();    //crea un mainPanel
        //mainPanel.setBackground(Color.RED); //establece el color de fondo del mainPanel
        JLabel label = new JLabel("Usuario"); // crea un label
        //label.setForeground(Color.white); //establece el color de las letras
        mainPanel.add(label); //añade el label al mainPanel
        f.setContentPane(mainPanel); //añade el mainPanel a la ventana

        JTextField tf = new JTextField(16); //crea un campo de texto
        JButton b = new JButton("Aceptar"); //crea un boton
        mainPanel.add(tf); //añade el campo de texto al mainPanel
        mainPanel.add(b); //añade el boton al mainPanel
        f.repaint(); //redibuja la ventana
        f.revalidate(); //revalida la ventana */


        JFrame f = new JFrame();
        f.setTitle("Panel Redondeado");
        f.setBounds(10,10,2000,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        mainPanel.setLayout(null);

        JPanel panel2 = new JPanel();
        mainPanel.setBounds(0,0,100,100);
        panel2.setBackground(Color.BLUE);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        mainPanel.setBounds(200,0,100,100);


        mainPanel.add(panel2);
        mainPanel.add(panel3);

        f.setContentPane(mainPanel);

        f.revalidate();
        f.repaint();


    }
}
