/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
class BasicPrograms {
    public static void main(String[] args) {

        // Factorial
        int n = 5, fact = 1;
        for(int i=1;i<=n;i++) fact *= i;
        System.out.println("Factorial: " + fact);

        // Fibonacci
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for(int i=0;i<5;i++){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        // Armstrong
        int num = 153, sum = 0, temp = num;
        while(temp > 0){
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        System.out.println("\nArmstrong: " + (sum == num));

        // Palindrome
        int x = 121, rev = 0, t = x;
        while(t > 0){
            rev = rev * 10 + t % 10;
            t /= 10;
        }
        System.out.println("Palindrome: " + (rev == x));
    }
}
