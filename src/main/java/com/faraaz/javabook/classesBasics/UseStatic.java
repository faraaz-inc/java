package com.faraaz.javabook.classesBasics;

class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("Inside StaticDemo class");
        System.out.println("a = " + a);

    }
}

public class UseStatic {
    //All static blocks are executed once the class is loaded
    //First a is set to 3
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //2nd step: static block is executed, setting the value of b
    static {
        System.out.println("Static block initialised");
        b = a * 4;  //initialise static variables
    }

    public static void main(String args[]) {
        //3rd step: meth() is called and passes the value 42 to x
        meth(42);

        //StaticDemo class
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
