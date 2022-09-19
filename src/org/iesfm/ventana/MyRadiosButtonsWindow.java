package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadiosButtonsWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10,10,400,1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra la ventana

        JPanel mainPanel = new JPanel();

        ButtonGroup osBg = new ButtonGroup(); //crea un grupo de botones

        JRadioButton rb1 = new JRadioButton("linux");
        rb1.setActionCommand("linux");//establece el comando del boton
        JRadioButton rb2 = new JRadioButton("Windows");
        rb2.setActionCommand("windows");
        JRadioButton rb3 = new JRadioButton("Mac");
        rb3.setActionCommand("mac");
        JRadioButton rb4 = new JRadioButton("Android");
        rb4.setActionCommand("android");

        osBg.add(rb1);
        osBg.add(rb2);    //añade los botones al grupo
        osBg.add(rb3);
        osBg.add(rb4);

        mainPanel.add(rb1);
        mainPanel.add(rb2); //añade los botones al panel
        mainPanel.add(rb3);
        mainPanel.add(rb4);

        JLabel label = new JLabel("Elige tu sistema operativo");


        label.setIcon(new ImageIcon("linux.png"));


        mainPanel.add(label);

        JButton b = new JButton("ok");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            String selected = osBg.getSelection().getActionCommand();  //obtiene el comando del boton seleccionado
            JOptionPane.showMessageDialog(f, "Has elegido " + selected); //muestra un mensaje con el comando del boton seleccionado
            /*if (selected.equals("Lixux")) {
                label.setIcon(new ImageIcon("linux.png"));
            } else if (selected.equals("Windows")) {
                label.setIcon(new ImageIcon("windows.png"));
            } else if (selected.equals("Mac")) {
                label.setIcon(new ImageIcon("mac.png"));
            }*/
            label.setIcon(new ImageIcon(selected + ".png"));

            }
        });

        mainPanel.add(b);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();



    }
}
