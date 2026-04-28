/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
import javax.swing.*;

class ButtonsUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Buttons");

        for(int i=0;i<10;i++){
            JButton b = new JButton("B"+i);
            b.setBounds(30 + (i*50), 50, 45, 45);
            f.add(b);
        }

        f.setSize(600,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
