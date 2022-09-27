package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Calculator2Window {

    public static void main(String[] args) {

        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setTitle("Calculadora");
        ventanaPrincipal.setBounds(50,50,500,120);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        BorderLayout borderLayout = new BorderLayout(10,10);
        panelPrincipal.setLayout(borderLayout);
        ventanaPrincipal.add(panelPrincipal);

        JPanel panelText= new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
        panelText.setLayout(fl);
        panelPrincipal.add(panelText, BorderLayout.NORTH);

        JPanel panelGrid = new JPanel();
        GridLayout gl = new GridLayout(5,4,10,10);
        panelGrid.setLayout(gl);
        panelPrincipal.add(panelGrid, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        FlowLayout fl2 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        panelBotones.setLayout(fl2);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);

        JPanel botonesInferiores = new JPanel();
        FlowLayout fl3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        botonesInferiores.setLayout(fl3);
        panelGrid.add(botonesInferiores, BorderLayout.SOUTH);

        ventanaPrincipal.repaint();
        ventanaPrincipal.revalidate();

    }
}
