/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
class Time {
    int hours, minutes;

    Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    void add(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours + (minutes / 60);
        minutes = minutes % 60;
    }

    void display() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 50);
        Time t2 = new Time(3, 30);
        Time result = new Time(0, 0);

        result.add(t1, t2);
        result.display();
    }
}
