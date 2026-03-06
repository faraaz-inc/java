package com.faraaz.javabook.inheritance;

class A {
    public int i, j;
    private int l; //private to A

    void display() {
        System.out.println("i, j: " + i + "," + j);
    }
}

class B extends A {
    int k;
     void displayB() {
         System.out.println("k: " + k);
         // System.out.println(l); -> cannot access superclass' private member
     }
}

public class BasicExample {
    public static void main(String[] args) {
        //superclass may be used by itself
        A a = new A();
        a.display();

        //subclass has access to all the public (and protected) members of superclass
        B b = new B();
        b.display();
        b.displayB();
    }
}
