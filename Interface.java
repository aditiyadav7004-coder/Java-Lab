/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditi Yadav
 */
public class Interface {

    public static void main(String[] args) {
        // Create objects
        C obj1 = new C();
        A obj2 = new C();
        B obj3 = new C();

        obj2.fun1();
        obj3.fun2();
    }
}

interface A {
    void fun1();
}

interface B {
    void fun2();
}

class C implements A, B {

    public void fun() {
        System.out.println("This is a normal method in class C");
    }

    @Override
    public void fun1() {
        System.out.println("fun1() implemented from Interface A");
    }

    @Override
    public void fun2() {
        System.out.println("fun2() implemented from Interface B");
    }
}