package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBoxWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame(); //crea una ventana
        f.setBounds(10,10,400,1000); //establece las dimensiones de la ventana
        f.setVisible(true); //hace visible la ventana
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra la ventana
        JPanel mainPanel = new JPanel(); //crea un panel
        mainPanel.add(new JLabel("elige lengaje de programación")); //añade un texto al panel
        JButton but = new JButton("show"); //crea un boton



        JComboBox<String> comboBox = new JComboBox<>(); //crea un combobox
        comboBox.addItem(" C"); //añade un elemento al combobox
        comboBox.addItem("C++");
        comboBox.addItem("C#");
        comboBox.addItem("Java");
        comboBox.addItem("PHP");
        mainPanel.add(comboBox); //añade el combobox al panel

        mainPanel.add(but); //añade el boton al panel
        f.setContentPane(mainPanel); //añade el panel a la ventana
        //añade un listener al boton
        but.addActionListener(
                actionEvent -> { //remplazado por lamba
            String selected = (String)comboBox.getSelectedItem(); //obtiene el elemento seleccionado del combobox
            JOptionPane.showMessageDialog(f, "Has elegido " + selected); //muestra un mensaje con el elemento seleccionado
        });
        f.revalidate();
        f.repaint();




    }
}
