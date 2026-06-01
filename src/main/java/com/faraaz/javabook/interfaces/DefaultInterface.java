package com.faraaz.javabook.interfaces;

public interface DefaultInterface {
    //normal abstract method - no body
    void show();

    //method having default implementation
    //not necessary for the implementing class to override it
    default void greet() {
        System.out.println("This is the default implementation of greet()");
    }
}

class ApplyDefault implements DefaultInterface {
    //need to override
    public void show() {
        System.out.println("Show overriden");
    }
    //greet will be automatically inherited along with its default implementation
}
