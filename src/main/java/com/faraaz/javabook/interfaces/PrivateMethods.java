package com.faraaz.javabook.interfaces;

interface A {
    //private method
    //can be accessed via a default implementation
    // or another private method
    private void showMe() {
        System.out.println("Private showMe from A");
    }
    default void display() {
        //call private method
        showMe();
    }
}

class ApplyA implements A {
    //inherits default implementation of A
}

public class PrivateMethods {
    public static void main(String[] args) {
        ApplyA obj = new ApplyA();
        obj.display();
    }
}
