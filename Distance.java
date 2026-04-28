/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
class Distance {
    int meter;
    int cm;

    // Constructor
    Distance(int m, int c) {
        meter = m;
        cm = c;
    }

    // Method to add two distances
    void add(Distance d1, Distance d2) {
        this.cm = d1.cm + d2.cm;
        this.meter = d1.meter + d2.meter + (this.cm / 100);
        this.cm = this.cm % 100;
    }

    // Display result
    void display() {
        System.out.println("Distance: " + meter + " m " + cm + " cm");
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(2, 50);
        Distance d2 = new Distance(3, 80);
        Distance result = new Distance(0, 0);

        result.add(d1, d2);
        result.display();
    }
}
