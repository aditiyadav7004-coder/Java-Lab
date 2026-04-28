/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
import javax.swing.*;
import java.awt.event.*;

class SwingCalc {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        t1.setBounds(50,50,150,30);

        JTextField t2 = new JTextField();
        t2.setBounds(50,100,150,30);

        JButton add = new JButton("+");
        add.setBounds(50,150,50,30);

        JLabel result = new JLabel("Result:");
        result.setBounds(50,200,200,30);

        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a+b));
        });

        f.add(t1); f.add(t2); f.add(add); f.add(result);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}