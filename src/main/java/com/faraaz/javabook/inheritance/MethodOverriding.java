package com.faraaz.javabook.inheritance;

class A2 {
    int i = 0;

    void show() {
        System.out.println("i = " + i);
    }

    void display() {
        System.out.println("Display of A2");
    }
}

class B2 extends A2 {
    int k = 5;

    // overridden method
    void show() {
        super.show();  // calls superclass' show()
        System.out.println("k = " + k);
    }

    //overloaded method, not overridden
    void display(String msg){
        System.out.print("B2's display: ");
        System.out.println(msg);
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        B2 b = new B2();
        b.show();
    }
}
