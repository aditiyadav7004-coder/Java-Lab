/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
import java.io.*;

class FileCopy {
    public static void main(String[] args) {

        try (
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt")
        ) {
            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }

            System.out.println("File copied successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
