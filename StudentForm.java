/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
import javax.swing.*;

class StudentForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Form");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50,50,100,30);

        JTextField t1 = new JTextField();
        t1.setBounds(150,50,150,30);

        JButton b = new JButton("Submit");
        b.setBounds(100,100,100,30);

        f.add(l1); f.add(t1); f.add(b);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
