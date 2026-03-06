package com.faraaz.javabook.inheritance;

class A3 {
    void callme() {
        System.out.println("Inside A3's callme()");
    }
}

class B3 extends A3 {
    void callme() {
        System.out.println("Inside B3's callme()");
    }
}

class C3 extends B3 {
    void callme() {
        System.out.println("Inside C3's callme()");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A3 a = new A3();
        B3 b = new B3();
        C3 c = new C3();

        A3 ref; //reference to superclasss

        ref = a;  //reference refers to A3
        ref.callme();

        ref = b; //reference refers to B3
        ref.callme();

        ref = c;  //reference refers to C3
        ref.callme();
    }
}
