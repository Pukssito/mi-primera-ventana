package org.federica;

import javax.swing.*;
import java.awt.*;


public class Tarea extends JFrame {

    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel westPanel;

    private JButton option1;

    private JButton option2;

    private JButton option3;

    private JPanel submenu;

    private JLabel label1;

    private JLabel label2;

    private JLabel label3;

    private JLabel label4;

    private JLabel label5;
    public Tarea()  {

        /*setBounds(10,10,500,300); //lo pongo solo para que lo veas */

        setTitle("My custom form");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(createMainPanel());
        pack();         //utilizamos pack en vez de setBounds
        repaint();
        revalidate();

    }

    private JPanel createMainPanel(){

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(topPanelMethod(),BorderLayout.NORTH);
        mainPanel.add(westPanelMethod(),BorderLayout.WEST);
        mainPanel.add(centerPanelMethod(),BorderLayout.CENTER);

        return mainPanel;
    }

    private JPanel topPanelMethod(){

        topPanel = new JPanel(new FlowLayout());
        topPanel.setBackground(Color.BLUE);
        topPanel.add(option1());
        topPanel.add(option2());
        topPanel.add(option3());
        return topPanel;

    }
    private JPanel westPanelMethod(){

        westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(5,1));
        westPanel.setBackground(Color.BLUE);
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        westPanel.add(label1());
        westPanel.add(label2());
        westPanel.add(label3());
        westPanel.add(label4());
        westPanel.add(label5());

        return westPanel;

    }
    private JPanel centerPanelMethod(){

        centerPanel = new JPanel();

        return centerPanel;
    }

    private JButton option1(){

        option1 = new JButton("opcion1");
        return option1;
    }
    private JButton option2(){

        option2 = new JButton("opcion2");
        return option2;
    }
    private JButton option3(){

        option3 = new JButton("opcion3");
        return option3;
    }



    private JLabel label1(){

        label1 = new JLabel("opcion 1");
        return label1;
    }

    private JLabel label2(){

        label2 = new JLabel("opcion 2");
        return label2;
    }

    private JLabel label3(){

        label3 = new JLabel("opcion 3");
        return label3;
    }

    private JLabel label4(){

        label4 = new JLabel("opcion 4");
        return label4;
    }

    private JLabel label5(){

        label5 = new JLabel("opcion 5");
        return label5;
    }



    public static void main(String[] args) {

        Tarea frame = new Tarea();

    }
}