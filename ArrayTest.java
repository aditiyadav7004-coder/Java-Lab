import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {  
        Array a = new Array();
        a.input();
        a.process();
        
        System.out.println("\n--- Entered Array ---");
        a.outputarr();
        
        System.out.println("\n--- Reversed Array ---");
        a.outputrev();
    }
}

class Array {
    private int[] arr;
    private int[] rev;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();   
        }
    }

    void process() {
        // Initialize rev with the same length as arr
        rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // Logic: rev[last_index - i] = arr[i]
            rev[(arr.length - 1) - i] = arr[i];
        }
    }

    void outputarr() {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // New line for formatting
    }

    void outputrev() {
        for (int value : rev) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}