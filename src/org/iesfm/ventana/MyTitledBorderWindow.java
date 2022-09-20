package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class MyTitledBorderWindow {

    public static void main(String[] args) {
        JFrame ventana = new JFrame(); //crea una ventana
        ventana.setBounds(10,10,200,500); //establece las dimensiones de la ventana
        ventana.setVisible(true); //hace visible la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra la ventana

        JPanel mainPanel = new JPanel(); //crea un panel

        ventana.add(mainPanel); //añade el panel a la ventana

        JRadioButton radioB = new JRadioButton("By Name"); //crea un radiobutton
        JRadioButton radioB2 = new JRadioButton("By ID"); //crea un radiobutton


        ButtonGroup group = new ButtonGroup();//crea un grupo de botones
        group.add(radioB); //añade el radiobutton al grupo
        group.add(radioB2);//añade el radiobutton al grupo

        JPanel titlePanel = new JPanel();//crea un panel
        titlePanel.setBorder(BorderFactory.createTitledBorder("Search"));//añade un borde al panel

        mainPanel.add(titlePanel); //añade el panel al panel principal
        titlePanel.add(radioB);//añade el radiobutton al panel
        titlePanel.add(radioB2);//añade el radiobutton al panel


        ventana.revalidate(); //actualiza la ventana
        ventana.repaint(); //actualiza la ventana



    }
}
