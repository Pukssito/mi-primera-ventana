package org.federica;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Formulario {
    private JPanel mainPanel;
    private JPanel formPanel;
    private JTextField tfId;
    private JComboBox comboBox;
    private JButton guardar;
    private JLabel idLabel;
    private JLabel labelName1;
    private JLabel labelName2;
    private JLabel labelSur1;
    private JLabel labelSur2;
    private JLabel labelSex;
    private JLabel labelDir;
    private JLabel labelTlf;
    private JTextField tfName1;
    private JTextField tfName2;
    private JTextField tfSur1;
    private JTextField tfSur2;
    private JTextField tfDir;
    private JTextField tfTlf;
    private JTable tableCustomer;
    private JButton deleteButton;
    private JScrollPane scroll;
    private JPanel surPanel;
    private CustomerTableModel ctm;


    public Formulario() {
        guardar.addActionListener(e -> {

            String id = tfId.getText();
            String name = tfName1.getText();
            String name2 = tfName2.getText();
            String surName = tfSur1.getText();
            String surName2 = tfSur2.getText();
            String sexo = comboBox.getSelectedItem().toString();
            String dir = tfDir.getText();
            String tlf = tfTlf.getText();

            Customer customer = new Customer(id, name, name2, surName, surName2, sexo, dir, tlf);

           List<Customer> customers = new ArrayList<>();
              customers.add(customer);

            ctm = new CustomerTableModel(customers);
            tableCustomer.setModel(ctm);
            




        });
        deleteButton.addActionListener(e -> {

            int row = tableCustomer.getSelectedRow();


        });
    }

    private void createUIComponents() {
        List lista = new ArrayList();
        lista.add("Hombre");
        lista.add("Mujer");
        comboBox = new JComboBox(lista.toArray());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Formulario form = new Formulario();
        frame.setContentPane(form.mainPanel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.repaint();
        frame.revalidate();
    }



}


