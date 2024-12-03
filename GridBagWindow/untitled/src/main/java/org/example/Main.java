package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setTitle("GridBagLayout");
        f.setBounds(100,100,1000,1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new GridBagLayout());
        f.setContentPane(p);


        p.add(
                new TextArea("Area Texto"),
                new GridBagConstraints(
                        0,
                        0,
                        2,
                        2,
                        5,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),0,0)
        );


        p.add(
                new TextField("Campo Texto"),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        2,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),0,0)
                );
       ;

        p.add(
                new JButton("Button 1"),
        new GridBagConstraints(
                2,
                0,
                1,
                1,
                1,
                1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),0,0));


        p.add(
                new JButton("Button 2"),
        new GridBagConstraints(
                2,
                1,
                1,
                1,
                1,
                1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),0,0));

        p.add(
                new JButton("Button 3"),
        new GridBagConstraints(
                0,
                2,
                1,
                1,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),0,0));

        p.add(
                new JButton("Button 4"),
        new GridBagConstraints(
                2,
                2,
                1,
                1,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),0,0));





        f.repaint();
        f.revalidate();
    }
}