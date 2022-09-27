package org.iesfm.ventana;
import javax.swing.*;
import java.awt.*;

public class MyFlowLayoutWindow {
    public static void main(String[] args) {


        JFrame ventana = new JFrame();
        ventana.setBounds(50,50,500,120);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);

        JButton boton = new JButton("Boton");
        JButton boton2 = new JButton("Boton2");
        JButton boton3 = new JButton("Boton3");
        JButton boton4 = new JButton("Boton4");
        JButton boton5 = new JButton("Boton5");


        panelPrincipal.add(boton);
        panelPrincipal.add(boton2);
        panelPrincipal.add(boton3);
        panelPrincipal.add(boton4);
        panelPrincipal.add(boton5);


        JRadioButton radioB = new JRadioButton("nombre");
        JRadioButton radioB2 = new JRadioButton("apellido");

        panelPrincipal.add(radioB);
        radioB.setSelected(true); //selecciona el boton por defecto
        panelPrincipal.add(radioB2);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioB);
        grupo.add(radioB2);

        JButton boton6 = new JButton("Boton6");

        panelPrincipal.add(boton6);

        boton6.addActionListener( //añade un listener al boton
                actionEvent -> {
                    FlowLayout layout = (FlowLayout) panelPrincipal.getLayout(); //obtiene el layout del panel
                    if (radioB.isSelected()) { //si el boton radioB esta seleccionado
                        layout.setAlignment(FlowLayout.RIGHT); //establece el layout a la derecha
                    } else {
                        layout.setAlignment(FlowLayout.LEFT); //establece el layout a la izquierda
                    }
                    panelPrincipal.repaint();
                    panelPrincipal.revalidate();
                }
        );



        FlowLayout layoutManager = (FlowLayout) panelPrincipal.getLayout();
        layoutManager.setAlignment(FlowLayout.RIGHT);






        panelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER));

        panelPrincipal.repaint();
        panelPrincipal.revalidate();

    }
}
