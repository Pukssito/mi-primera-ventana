package org.example;

import javax.swing.*;
import java.awt.*;

public class MoveOptionsWindow extends JFrame {

    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    public MoveOptionsWindow() {

        setBounds(10, 10, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }

    private JPanel createMainPanel() {
        mainPanel = new JPanel(new BorderLayout());

        return mainPanel;
    }

    private JPanel createleftPanel() {
        leftPanel = new JPanel();
        DefaultListModel<String> nameList = new DefaultListModel<>();
        nameList.addElement("strSubjectName");
        nameList.addElement("strStandarName");
        nameList.addElement("strReferenceBook");
        return leftPanel;
    }

    private JPanel createRightPanel() {

        rightPanel = new JPanel();
        return rightPanel;
    }

    public static void main(String[] args) {


    }
}