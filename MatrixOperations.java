/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
class MatrixOperations {
    public static void main(String[] args) {
        int a[][] = {{1,2},{3,4}};
        int b[][] = {{5,6},{7,8}};
        int result[][] = new int[2][2];

        // Addition
        System.out.println("Addition:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication
        System.out.println("Multiplication:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j] = 0;
                for(int k=0;k<2;k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose
        System.out.println("Transpose of A:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}