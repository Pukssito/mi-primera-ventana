package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class ConstraintsMalla {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("GridSetLayout");
        f.setBounds(50,50,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.add(
                new JButton("Boton 1"),
                new  GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),0,0));

        panelPrincipal.add(
                new JButton("Boton 2"),
                new  GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),0,0));

        panelPrincipal.add(
                new JButton("Boton 3"),
                new  GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),0,0));

        panelPrincipal.add(
                new JButton("Long-Named Button 4"),
                new  GridBagConstraints(
                        0,
                        1,
                        3,
                        1,
                        1,
                        4,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),0,0));

        panelPrincipal.add(
                new JButton("Boton 5"),
                new  GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),0,0));

        f.add(panelPrincipal);
        f.repaint();
        f.revalidate();


    }


}
