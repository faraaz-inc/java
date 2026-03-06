package com.faraaz.javabook.classesBasics;

class Outer {
    int outer_x = 100;
    static int static_outer_x = 99;

    void test() {
        Inner inner = new Inner();
        inner.display();

        AnotherInner inner_v2 = new AnotherInner();
        inner_v2.display();
    }

    //"inner" type class has access to members of enclosing class
    class Inner {
        void display() {
            System.out.println("Display outer_x = " + outer_x);
        }
    }
    //static class cannot access non-static members of outer class directly
    static class AnotherInner {
        void display() {
            System.out.println("Display static outer x: " + static_outer_x);
            // System.out.println("Display outer x: " + outer_x);  -> non-static field cannot be accessed inside static element
        }
    }
}

public class NestedClasses {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
