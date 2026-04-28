
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
public class Array2 {
     public static void main(String[] args){  
      Matrix a= new Matrix();
      a.input();
      a.process();
      System.out.println("Entered 2D Array:");
      a.outputarr();
      System.out.println("Reversed 2D Array:");
      a.outputtranspose();
}
}
class Matrix{
    int arr[][];
    int transpose[][];
    void input(){
        arr= new int[3][3];
        Scanner sc= new Scanner (System.in);
        for( int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print("Enter an element:");
            arr[i][j] = sc.nextInt();
            }
        }
    }
        void outputarr(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print(arr[i][j]);
            }
            System.out.println();
    }
    }
        void outputtranspose(){
         for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
            System.out.print(transpose[i][j]);    
              }
              System.out.println();
        }
        }
       void process(){
            transpose= new int[3][3];
            for (int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    transpose[j][i]=arr[i][j];
                }
            }
        }
}