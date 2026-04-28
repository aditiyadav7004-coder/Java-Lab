public class Inheritance1 {

    public static void main(String[] args) {
        D obj1 = new D();
        AbstractClass obj2 = new D();

        obj1.fun1();
        obj1.fun2();
        obj1.fun3();

        obj2.fun1();
        obj2.fun2();
    }
}

abstract class AbstractClass {
    abstract void fun1();
    abstract void fun2();
}

class D extends AbstractClass {

    @Override
    public void fun1() {
        System.out.println("fun1() implemented in class D");
    }

    @Override
    public void fun2() {
        System.out.println("fun2() implemented in class D");
    }

    public void fun3() {
        System.out.println("fun3() is a method of class D itself");
    }
}