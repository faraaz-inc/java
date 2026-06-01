package com.faraaz.javabook.interfaces;

abstract public class Incomplete implements Callback{
    //this incomplete class doesn't implement Callback interface fully,
    //hence it must be declared abstract

    void show() {
        System.out.println("Show");
    }
}
